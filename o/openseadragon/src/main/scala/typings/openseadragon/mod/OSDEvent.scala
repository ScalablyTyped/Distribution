package typings.openseadragon.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OSDEvent[T] extends Event {
  var eventSource: js.UndefOr[T] = js.native
  var userData: js.Any = js.native
}

