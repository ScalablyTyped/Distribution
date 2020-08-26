package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a cell value conditional format.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait CellValueConditionalFormatLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
    *
    * [Api set: ExcelApi 1.6]
    */
  var format: js.UndefOr[ConditionalRangeFormatLoadOptions] = js.native
  /**
    *
    * Specifies the Rule object on this conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rule: js.UndefOr[Boolean] = js.native
}

object CellValueConditionalFormatLoadOptions {
  @scala.inline
  def apply(): CellValueConditionalFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellValueConditionalFormatLoadOptions]
  }
  @scala.inline
  implicit class CellValueConditionalFormatLoadOptionsOps[Self <: CellValueConditionalFormatLoadOptions] (val x: Self) extends AnyVal {
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setFormat(value: ConditionalRangeFormatLoadOptions): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setRule(value: Boolean): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
  }
  
}

