package typings.naja.mod

import typings.std.Event_
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuccessEvent[T /* <: js.Object */] extends Event_ {
  val options: NajaOptions = js.native
  val response: T = js.native
  val xhr: XMLHttpRequest = js.native
}

