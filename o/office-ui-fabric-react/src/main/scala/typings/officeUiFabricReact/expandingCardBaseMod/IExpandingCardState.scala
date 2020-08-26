package typings.officeUiFabricReact.expandingCardBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExpandingCardState extends js.Object {
  var firstFrameRendered: Boolean = js.native
  var needsScroll: Boolean = js.native
}

object IExpandingCardState {
  @scala.inline
  def apply(firstFrameRendered: Boolean, needsScroll: Boolean): IExpandingCardState = {
    val __obj = js.Dynamic.literal(firstFrameRendered = firstFrameRendered.asInstanceOf[js.Any], needsScroll = needsScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExpandingCardState]
  }
  @scala.inline
  implicit class IExpandingCardStateOps[Self <: IExpandingCardState] (val x: Self) extends AnyVal {
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
    def setFirstFrameRendered(value: Boolean): Self = this.set("firstFrameRendered", value.asInstanceOf[js.Any])
    @scala.inline
    def setNeedsScroll(value: Boolean): Self = this.set("needsScroll", value.asInstanceOf[js.Any])
  }
  
}

