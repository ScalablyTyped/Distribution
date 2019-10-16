package typings.naja.najaMod

import typings.std.Event
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartEvent extends Event {
  val request: js.Promise[Unit] = js.native
  val xhr: XMLHttpRequest = js.native
}

