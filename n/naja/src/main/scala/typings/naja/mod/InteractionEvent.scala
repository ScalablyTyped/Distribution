package typings.naja.mod

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractionEvent extends Event {
  val element: HTMLElement = js.native
  val options: RequestOptions = js.native
  val originalEvent: js.UndefOr[SnippetUpdateEvent] = js.native
}

