package typings.motionScroll.anon

import typings.motionScroll.motionScrollStrings.x
import typings.motionScroll.motionScrollStrings.y
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axis extends js.Object {
  var axis: js.UndefOr[x | y] = js.native
  var callBack: js.UndefOr[js.Function0[Unit]] = js.native
  var delay: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[js.Function0[Unit]] = js.native
  var element: js.UndefOr[HTMLElement] = js.native
  var force: js.UndefOr[Boolean] = js.native
  var maxScrollTime: js.UndefOr[Double] = js.native
  var minScrollTime: js.UndefOr[Double] = js.native
  var scrollTo: js.UndefOr[Double] = js.native
  var speed: js.UndefOr[Double] = js.native
}

object Axis {
  @scala.inline
  def apply(): Axis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Axis]
  }
  @scala.inline
  implicit class AxisOps[Self <: Axis] (val x: Self) extends AnyVal {
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
    def setAxis(value: typings.motionScroll.motionScrollStrings.x | y): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setCallBack(value: () => Unit): Self = this.set("callBack", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCallBack: Self = this.set("callBack", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setEasing(value: () => Unit): Self = this.set("easing", js.Any.fromFunction0(value))
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setMaxScrollTime(value: Double): Self = this.set("maxScrollTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxScrollTime: Self = this.set("maxScrollTime", js.undefined)
    @scala.inline
    def setMinScrollTime(value: Double): Self = this.set("minScrollTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinScrollTime: Self = this.set("minScrollTime", js.undefined)
    @scala.inline
    def setScrollTo(value: Double): Self = this.set("scrollTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollTo: Self = this.set("scrollTo", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
  }
  
}

