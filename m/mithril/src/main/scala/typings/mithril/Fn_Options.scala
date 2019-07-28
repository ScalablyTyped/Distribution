package typings.mithril

import typings.mithril.mithrilMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Options extends js.Object {
  def apply[T](options: RequestOptions[T] with Anon_Url): js.Promise[T] = js.native
  def apply[T](url: String): js.Promise[T] = js.native
  def apply[T](url: String, options: RequestOptions[T]): js.Promise[T] = js.native
}

