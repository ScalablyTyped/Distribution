package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.dashed
import typings.oracleOraclejet.oracleOraclejetStrings.dotted
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineColor extends js.Object {
  var lineColor: String = js.native
  var lineStyle: dotted | dashed | solid = js.native
  var lineWidth: Double = js.native
  var markerColor: String = js.native
  var markerDisplayed: off | on = js.native
  var markerSize: Double = js.native
}

object LineColor {
  @scala.inline
  def apply(
    lineColor: String,
    lineStyle: dotted | dashed | solid,
    lineWidth: Double,
    markerColor: String,
    markerDisplayed: off | on,
    markerSize: Double
  ): LineColor = {
    val __obj = js.Dynamic.literal(lineColor = lineColor.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], markerColor = markerColor.asInstanceOf[js.Any], markerDisplayed = markerDisplayed.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineColor]
  }
  @scala.inline
  implicit class LineColorOps[Self <: LineColor] (val x: Self) extends AnyVal {
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
    def setLineColor(value: String): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineStyle(value: dotted | dashed | solid): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerColor(value: String): Self = this.set("markerColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerDisplayed(value: off | on): Self = this.set("markerDisplayed", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerSize(value: Double): Self = this.set("markerSize", value.asInstanceOf[js.Any])
  }
  
}

