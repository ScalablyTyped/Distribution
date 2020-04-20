package typings.overlayscrollbars

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandle extends js.Object {
  var handle: HTMLElement
  var scrollbar: HTMLElement
  var track: HTMLElement
}

object AnonHandle {
  @scala.inline
  def apply(handle: HTMLElement, scrollbar: HTMLElement, track: HTMLElement): AnonHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], scrollbar = scrollbar.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHandle]
  }
}

