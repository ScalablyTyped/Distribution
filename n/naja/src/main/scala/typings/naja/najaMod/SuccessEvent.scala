package typings.naja.najaMod

import typings.std.Event
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuccessEvent[T /* <: js.Object */] extends Event {
  val options: NajaOptions = js.native
  val response: T = js.native
  val xhr: XMLHttpRequest = js.native
}

