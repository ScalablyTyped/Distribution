package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineWidth extends js.Object {
  var lineColor: String = js.native
  var lineWidth: Double = js.native
  var rendered: off | on = js.native
}

object LineWidth {
  @scala.inline
  def apply(lineColor: String, lineWidth: Double, rendered: off | on): LineWidth = {
    val __obj = js.Dynamic.literal(lineColor = lineColor.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineWidth]
  }
  @scala.inline
  implicit class LineWidthOps[Self <: LineWidth] (val x: Self) extends AnyVal {
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
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setRendered(value: off | on): Self = this.set("rendered", value.asInstanceOf[js.Any])
  }
  
}

