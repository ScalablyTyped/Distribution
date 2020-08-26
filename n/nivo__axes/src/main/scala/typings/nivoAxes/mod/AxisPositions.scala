package typings.nivoAxes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in @nivo/axes.@nivo/axes.Orient ]: @nivo/axes.@nivo/axes.AxisProps} */
@js.native
trait AxisPositions extends js.Object {
  var bottom: AxisProps = js.native
  var left: AxisProps = js.native
  var right: AxisProps = js.native
  var top: AxisProps = js.native
}

object AxisPositions {
  @scala.inline
  def apply(bottom: AxisProps, left: AxisProps, right: AxisProps, top: AxisProps): AxisPositions = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisPositions]
  }
  @scala.inline
  implicit class AxisPositionsOps[Self <: AxisPositions] (val x: Self) extends AnyVal {
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
    def setBottom(value: AxisProps): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: AxisProps): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: AxisProps): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: AxisProps): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}

