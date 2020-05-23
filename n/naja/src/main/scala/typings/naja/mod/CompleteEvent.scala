package typings.naja.mod

import typings.std.Error
import typings.std.Event
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompleteEvent[T /* <: js.Object */] extends Event {
  val error: js.UndefOr[Error] = js.native
  val options: NajaOptions = js.native
  val response: js.UndefOr[T] = js.native
  val xhr: XMLHttpRequest = js.native
}

