package typings.officeUiFabricReact.stickyStickyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStickyState extends js.Object {
  var distanceFromTop: js.UndefOr[Double] = js.native
  var isStickyBottom: Boolean = js.native
  var isStickyTop: Boolean = js.native
}

object IStickyState {
  @scala.inline
  def apply(isStickyBottom: Boolean, isStickyTop: Boolean): IStickyState = {
    val __obj = js.Dynamic.literal(isStickyBottom = isStickyBottom.asInstanceOf[js.Any], isStickyTop = isStickyTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStickyState]
  }
  @scala.inline
  implicit class IStickyStateOps[Self <: IStickyState] (val x: Self) extends AnyVal {
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
    def setIsStickyBottom(value: Boolean): Self = this.set("isStickyBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsStickyTop(value: Boolean): Self = this.set("isStickyTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistanceFromTop(value: Double): Self = this.set("distanceFromTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistanceFromTop: Self = this.set("distanceFromTop", js.undefined)
  }
  
}

