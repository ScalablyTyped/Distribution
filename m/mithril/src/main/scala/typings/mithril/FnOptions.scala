package typings.mithril

import typings.mithril.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnOptions extends js.Object {
  def apply[T](options: RequestOptions[T] with AnonUrl): js.Promise[T] = js.native
  def apply[T](url: String): js.Promise[T] = js.native
  def apply[T](url: String, options: RequestOptions[T]): js.Promise[T] = js.native
}

