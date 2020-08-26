package typings.popmotion.listenTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventListenerOptions extends js.Object {
  var capture: js.UndefOr[Boolean] = js.native
  var once: js.UndefOr[Boolean] = js.native
  var passive: js.UndefOr[Boolean] = js.native
}

object EventListenerOptions {
  @scala.inline
  def apply(): EventListenerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventListenerOptions]
  }
  @scala.inline
  implicit class EventListenerOptionsOps[Self <: EventListenerOptions] (val x: Self) extends AnyVal {
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
    def setCapture(value: Boolean): Self = this.set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    @scala.inline
    def setOnce(value: Boolean): Self = this.set("once", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
    @scala.inline
    def setPassive(value: Boolean): Self = this.set("passive", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassive: Self = this.set("passive", js.undefined)
  }
  
}

