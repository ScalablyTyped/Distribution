package typings.oracleOraclejet.ojchartMod.ojSparkChart

import typings.oracleOraclejet.oracleOraclejetStrings.area
import typings.oracleOraclejet.oracleOraclejetStrings.back
import typings.oracleOraclejet.oracleOraclejetStrings.dashed
import typings.oracleOraclejet.oracleOraclejetStrings.dotted
import typings.oracleOraclejet.oracleOraclejetStrings.front
import typings.oracleOraclejet.oracleOraclejetStrings.line
import typings.oracleOraclejet.oracleOraclejetStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ReferenceObject extends js.Object {
  var color: js.UndefOr[String] = js.native
  var high: js.UndefOr[Double] = js.native
  var lineStyle: dotted | dashed | solid = js.native
  var lineWidth: js.UndefOr[Double] = js.native
  var location: front | back = js.native
  var low: js.UndefOr[Double] = js.native
  var svgClassName: js.UndefOr[String] = js.native
  var svgStyle: js.UndefOr[js.Object] = js.native
  var `type`: area | line = js.native
  var value: js.UndefOr[Double] = js.native
}

object ReferenceObject {
  @scala.inline
  def apply(lineStyle: dotted | dashed | solid, location: front | back, `type`: area | line): ReferenceObject = {
    val __obj = js.Dynamic.literal(lineStyle = lineStyle.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceObject]
  }
  @scala.inline
  implicit class ReferenceObjectOps[Self <: ReferenceObject] (val x: Self) extends AnyVal {
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
    def setLineStyle(value: dotted | dashed | solid): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: front | back): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: area | line): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setHigh(value: Double): Self = this.set("high", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHigh: Self = this.set("high", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setLow(value: Double): Self = this.set("low", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLow: Self = this.set("low", js.undefined)
    @scala.inline
    def setSvgClassName(value: String): Self = this.set("svgClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgClassName: Self = this.set("svgClassName", js.undefined)
    @scala.inline
    def setSvgStyle(value: js.Object): Self = this.set("svgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgStyle: Self = this.set("svgStyle", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

