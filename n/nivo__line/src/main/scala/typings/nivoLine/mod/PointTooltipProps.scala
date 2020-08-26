package typings.nivoLine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointTooltipProps extends js.Object {
  var point: Point = js.native
}

object PointTooltipProps {
  @scala.inline
  def apply(point: Point): PointTooltipProps = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointTooltipProps]
  }
  @scala.inline
  implicit class PointTooltipPropsOps[Self <: PointTooltipProps] (val x: Self) extends AnyVal {
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
    def setPoint(value: Point): Self = this.set("point", value.asInstanceOf[js.Any])
  }
  
}

