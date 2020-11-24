package typings.parse.mod.global.Parse.Cloud

import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Parse.Cloud.run")
@js.native
object run extends js.Object {
  
  def apply(name: String): js.Promise[_] = js.native
  def apply(name: String, data: js.UndefOr[scala.Nothing], options: RunOptions): js.Promise[_] = js.native
  def apply(name: String, data: Params): js.Promise[_] = js.native
  def apply(name: String, data: Params, options: RunOptions): js.Promise[_] = js.native
  def apply[T /* <: js.Function0[_] */](name: String, data: Null, options: RunOptions): js.Promise[ReturnType[T]] = js.native
}
