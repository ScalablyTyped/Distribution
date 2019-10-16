package typings.naja.najaMod

import typings.std.Event
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortEvent extends Event {
  val xhr: XMLHttpRequest = js.native
}

