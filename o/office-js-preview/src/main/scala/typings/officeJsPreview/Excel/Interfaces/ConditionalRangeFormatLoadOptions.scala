package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A format object encapsulating the conditional formats range's font, fill, borders, and other properties.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalRangeFormatLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Collection of border objects that apply to the overall conditional format range.
    *
    * [Api set: ExcelApi 1.6]
    */
  var borders: js.UndefOr[ConditionalRangeBorderCollectionLoadOptions] = js.native
  /**
    *
    * Returns the fill object defined on the overall conditional format range.
    *
    * [Api set: ExcelApi 1.6]
    */
  var fill: js.UndefOr[ConditionalRangeFillLoadOptions] = js.native
  /**
    *
    * Returns the font object defined on the overall conditional format range.
    *
    * [Api set: ExcelApi 1.6]
    */
  var font: js.UndefOr[ConditionalRangeFontLoadOptions] = js.native
  /**
    *
    * Represents Excel's number format code for the given range. Cleared if null is passed in.
    *
    * [Api set: ExcelApi 1.6]
    */
  var numberFormat: js.UndefOr[Boolean] = js.native
}

object ConditionalRangeFormatLoadOptions {
  @scala.inline
  def apply(): ConditionalRangeFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRangeFormatLoadOptions]
  }
  @scala.inline
  implicit class ConditionalRangeFormatLoadOptionsOps[Self <: ConditionalRangeFormatLoadOptions] (val x: Self) extends AnyVal {
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
    def setBorders(value: ConditionalRangeBorderCollectionLoadOptions): Self = this.set("borders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorders: Self = this.set("borders", js.undefined)
    @scala.inline
    def setFill(value: ConditionalRangeFillLoadOptions): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFont(value: ConditionalRangeFontLoadOptions): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setNumberFormat(value: Boolean): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
  }
  
}

