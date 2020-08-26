package typings.overlayscrollbars.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handle extends js.Object {
  var handle: HTMLElement = js.native
  var scrollbar: HTMLElement = js.native
  var track: HTMLElement = js.native
}

object Handle {
  @scala.inline
  def apply(handle: HTMLElement, scrollbar: HTMLElement, track: HTMLElement): Handle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], scrollbar = scrollbar.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handle]
  }
  @scala.inline
  implicit class HandleOps[Self <: Handle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHandle(value: HTMLElement): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollbar(value: HTMLElement): Self = this.set("scrollbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrack(value: HTMLElement): Self = this.set("track", value.asInstanceOf[js.Any])
  }
  
}

