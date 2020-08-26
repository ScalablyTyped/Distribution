package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeightfieldOptions extends SharedShapeOptions {
  var elementWidth: js.UndefOr[Double] = js.native
  var heights: js.UndefOr[js.Array[Double]] = js.native
  var maxValue: js.UndefOr[Double] = js.native
  var minValue: js.UndefOr[Double] = js.native
}

object HeightfieldOptions {
  @scala.inline
  def apply(): HeightfieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeightfieldOptions]
  }
  @scala.inline
  implicit class HeightfieldOptionsOps[Self <: HeightfieldOptions] (val x: Self) extends AnyVal {
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
    def setElementWidth(value: Double): Self = this.set("elementWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementWidth: Self = this.set("elementWidth", js.undefined)
    @scala.inline
    def setHeightsVarargs(value: Double*): Self = this.set("heights", js.Array(value :_*))
    @scala.inline
    def setHeights(value: js.Array[Double]): Self = this.set("heights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeights: Self = this.set("heights", js.undefined)
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
  }
  
}

