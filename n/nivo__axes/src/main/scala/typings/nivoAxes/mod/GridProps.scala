package typings.nivoAxes.mod

import typings.nivoCore.mod.Dimensions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridProps
  extends Dimensions
     with Scales {
  var xValues: js.UndefOr[GridValues[Double | String | Date]] = js.native
  var yValues: js.UndefOr[GridValues[Double | String | Date]] = js.native
}

object GridProps {
  @scala.inline
  def apply(height: Double, width: Double): GridProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps]
  }
  @scala.inline
  implicit class GridPropsOps[Self <: GridProps] (val x: Self) extends AnyVal {
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
    def setXValuesVarargs(value: (Date | Double | String)*): Self = this.set("xValues", js.Array(value :_*))
    @scala.inline
    def setXValues(value: GridValues[Double | String | Date]): Self = this.set("xValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXValues: Self = this.set("xValues", js.undefined)
    @scala.inline
    def setYValuesVarargs(value: (Date | Double | String)*): Self = this.set("yValues", js.Array(value :_*))
    @scala.inline
    def setYValues(value: GridValues[Double | String | Date]): Self = this.set("yValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYValues: Self = this.set("yValues", js.undefined)
  }
  
}

