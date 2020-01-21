package typings.mithril

import typings.mithril.mod.JsonpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnOptionsUrl extends js.Object {
  def apply[T](options: JsonpOptions with AnonUrl): js.Promise[T] = js.native
  def apply[T](url: String): js.Promise[T] = js.native
  def apply[T](url: String, options: JsonpOptions): js.Promise[T] = js.native
}

