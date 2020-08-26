package typings.nivoLine.mod

import typings.nivoCore.mod.MotionProps
import typings.nivoCore.mod.SvgDefsAndFill
import typings.nivoLine.anon.XFormatted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineSvgProps
  extends LineProps
     with MotionProps
     with SvgDefsAndFill[Datum] {
  var areaBlendMode: js.UndefOr[String] = js.native
  var enablePointLabel: js.UndefOr[Boolean] = js.native
  var pointLabel: js.UndefOr[String | AccessorFunc] = js.native
  var pointLabelYOffset: js.UndefOr[Double] = js.native
  var useMesh: js.UndefOr[Boolean] = js.native
}

object LineSvgProps {
  @scala.inline
  def apply(data: js.Array[Serie]): LineSvgProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineSvgProps]
  }
  @scala.inline
  implicit class LineSvgPropsOps[Self <: LineSvgProps] (val x: Self) extends AnyVal {
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
    def setAreaBlendMode(value: String): Self = this.set("areaBlendMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAreaBlendMode: Self = this.set("areaBlendMode", js.undefined)
    @scala.inline
    def setEnablePointLabel(value: Boolean): Self = this.set("enablePointLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePointLabel: Self = this.set("enablePointLabel", js.undefined)
    @scala.inline
    def setPointLabelFunction1(value: /* datum */ XFormatted => String): Self = this.set("pointLabel", js.Any.fromFunction1(value))
    @scala.inline
    def setPointLabel(value: String | AccessorFunc): Self = this.set("pointLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointLabel: Self = this.set("pointLabel", js.undefined)
    @scala.inline
    def setPointLabelYOffset(value: Double): Self = this.set("pointLabelYOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointLabelYOffset: Self = this.set("pointLabelYOffset", js.undefined)
    @scala.inline
    def setUseMesh(value: Boolean): Self = this.set("useMesh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMesh: Self = this.set("useMesh", js.undefined)
  }
  
}

