package typings.naja.mod

import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnippetUpdateEvent extends Event_ {
  val content: String = js.native
  val snippet: HTMLElement = js.native
}

