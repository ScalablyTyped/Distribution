package typings.ngxInfiniteScroll.eventTriggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDistanceRange extends js.Object {
  var down: Double = js.native
  var up: Double = js.native
}

object IDistanceRange {
  @scala.inline
  def apply(down: Double, up: Double): IDistanceRange = {
    val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDistanceRange]
  }
  @scala.inline
  implicit class IDistanceRangeOps[Self <: IDistanceRange] (val x: Self) extends AnyVal {
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
    def setDown(value: Double): Self = this.set("down", value.asInstanceOf[js.Any])
    @scala.inline
    def setUp(value: Double): Self = this.set("up", value.asInstanceOf[js.Any])
  }
  
}

