package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an Excel Conditional Data Bar Type.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait DataBarConditionalFormatLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * HTML color code representing the color of the Axis line, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    "" (empty string) if no axis is present or set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var axisColor: js.UndefOr[Boolean] = js.native
  /**
    *
    * Representation of how the axis is determined for an Excel data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var axisFormat: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the direction that the data bar graphic should be based on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var barDirection: js.UndefOr[Boolean] = js.native
  /**
    *
    * The rule for what consistutes the lower bound (and how to calculate it, if applicable) for a data bar.
    The `ConditionalDataBarRule` object must be set as a JSON object (use `x.lowerBoundRule = {...}` instead of `x.lowerBoundRule.formula = ...`).
    *
    * [Api set: ExcelApi 1.6]
    */
  var lowerBoundRule: js.UndefOr[Boolean] = js.native
  /**
    *
    * Representation of all values to the left of the axis in an Excel data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var negativeFormat: js.UndefOr[ConditionalDataBarNegativeFormatLoadOptions] = js.native
  /**
    *
    * Representation of all values to the right of the axis in an Excel data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var positiveFormat: js.UndefOr[ConditionalDataBarPositiveFormatLoadOptions] = js.native
  /**
    *
    * If true, hides the values from the cells where the data bar is applied.
    *
    * [Api set: ExcelApi 1.6]
    */
  var showDataBarOnly: js.UndefOr[Boolean] = js.native
  /**
    *
    * The rule for what constitutes the upper bound (and how to calculate it, if applicable) for a data bar.
    The `ConditionalDataBarRule` object must be set as a JSON object (use `x.upperBoundRule = {...}` instead of `x.upperBoundRule.formula = ...`).
    *
    * [Api set: ExcelApi 1.6]
    */
  var upperBoundRule: js.UndefOr[Boolean] = js.native
}

object DataBarConditionalFormatLoadOptions {
  @scala.inline
  def apply(): DataBarConditionalFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataBarConditionalFormatLoadOptions]
  }
  @scala.inline
  implicit class DataBarConditionalFormatLoadOptionsOps[Self <: DataBarConditionalFormatLoadOptions] (val x: Self) extends AnyVal {
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
    def setAxisColor(value: Boolean): Self = this.set("axisColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisColor: Self = this.set("axisColor", js.undefined)
    @scala.inline
    def setAxisFormat(value: Boolean): Self = this.set("axisFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisFormat: Self = this.set("axisFormat", js.undefined)
    @scala.inline
    def setBarDirection(value: Boolean): Self = this.set("barDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarDirection: Self = this.set("barDirection", js.undefined)
    @scala.inline
    def setLowerBoundRule(value: Boolean): Self = this.set("lowerBoundRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowerBoundRule: Self = this.set("lowerBoundRule", js.undefined)
    @scala.inline
    def setNegativeFormat(value: ConditionalDataBarNegativeFormatLoadOptions): Self = this.set("negativeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeFormat: Self = this.set("negativeFormat", js.undefined)
    @scala.inline
    def setPositiveFormat(value: ConditionalDataBarPositiveFormatLoadOptions): Self = this.set("positiveFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositiveFormat: Self = this.set("positiveFormat", js.undefined)
    @scala.inline
    def setShowDataBarOnly(value: Boolean): Self = this.set("showDataBarOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDataBarOnly: Self = this.set("showDataBarOnly", js.undefined)
    @scala.inline
    def setUpperBoundRule(value: Boolean): Self = this.set("upperBoundRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpperBoundRule: Self = this.set("upperBoundRule", js.undefined)
  }
  
}

