package typings.ngxInfiniteScroll.eventTriggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollConfig extends js.Object {
  var alwaysCallback: Boolean = js.native
  var shouldFireScrollEvent: Boolean = js.native
}

object IScrollConfig {
  @scala.inline
  def apply(alwaysCallback: Boolean, shouldFireScrollEvent: Boolean): IScrollConfig = {
    val __obj = js.Dynamic.literal(alwaysCallback = alwaysCallback.asInstanceOf[js.Any], shouldFireScrollEvent = shouldFireScrollEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollConfig]
  }
  @scala.inline
  implicit class IScrollConfigOps[Self <: IScrollConfig] (val x: Self) extends AnyVal {
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
    def setAlwaysCallback(value: Boolean): Self = this.set("alwaysCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setShouldFireScrollEvent(value: Boolean): Self = this.set("shouldFireScrollEvent", value.asInstanceOf[js.Any])
  }
  
}

