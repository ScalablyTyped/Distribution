package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConverterTooltipDisplay extends js.Object {
  var converter: js.UndefOr[typings.oracleOraclejet.ojvalidationBaseMod.Converter[String]] = js.native
  var tooltipDisplay: js.UndefOr[off | auto] = js.native
  var tooltipLabel: js.UndefOr[String] = js.native
}

object ConverterTooltipDisplay {
  @scala.inline
  def apply(): ConverterTooltipDisplay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConverterTooltipDisplay]
  }
  @scala.inline
  implicit class ConverterTooltipDisplayOps[Self <: ConverterTooltipDisplay] (val x: Self) extends AnyVal {
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
    def setConverter(value: typings.oracleOraclejet.ojvalidationBaseMod.Converter[String]): Self = this.set("converter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConverter: Self = this.set("converter", js.undefined)
    @scala.inline
    def setTooltipDisplay(value: off | auto): Self = this.set("tooltipDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipDisplay: Self = this.set("tooltipDisplay", js.undefined)
    @scala.inline
    def setTooltipLabel(value: String): Self = this.set("tooltipLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipLabel: Self = this.set("tooltipLabel", js.undefined)
  }
  
}

