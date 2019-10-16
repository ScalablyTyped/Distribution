package typings.naja.najaMod

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnippetUpdateEvent extends Event {
  val content: String = js.native
  val snippet: HTMLElement = js.native
}

