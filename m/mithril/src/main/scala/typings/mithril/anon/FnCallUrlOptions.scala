package typings.mithril.anon

import typings.mithril.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallUrlOptions extends js.Object {
  
  def apply[T](options: RequestOptions[T] with Url): js.Promise[T] = js.native
  def apply[T](url: String): js.Promise[T] = js.native
  def apply[T](url: String, options: RequestOptions[T]): js.Promise[T] = js.native
}
