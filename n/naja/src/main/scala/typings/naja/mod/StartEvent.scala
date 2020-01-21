package typings.naja.mod

import typings.std.Event_
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartEvent extends Event_ {
  val request: js.Promise[Unit] = js.native
  val xhr: XMLHttpRequest = js.native
}

