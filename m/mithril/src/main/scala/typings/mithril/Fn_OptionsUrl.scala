package typings.mithril

import typings.mithril.mithrilMod.JsonpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_OptionsUrl extends js.Object {
  def apply[T](options: JsonpOptions with Anon_Url): js.Promise[T] = js.native
  def apply[T](url: String): js.Promise[T] = js.native
  def apply[T](url: String, options: JsonpOptions): js.Promise[T] = js.native
}

