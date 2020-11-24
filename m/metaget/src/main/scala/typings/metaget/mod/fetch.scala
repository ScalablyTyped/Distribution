package typings.metaget.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("metaget", "fetch")
@js.native
object fetch extends js.Object {
  
  def apply(uri: String): js.Promise[Result] = js.native
  def apply(uri: String, userArgs: Options): js.Promise[Result] = js.native
  def apply[T](uri: String, callback: Callback[T]): js.Promise[T] = js.native
  def apply[T](uri: String, userArgs: Options, callback: Callback[T]): js.Promise[T] = js.native
}
