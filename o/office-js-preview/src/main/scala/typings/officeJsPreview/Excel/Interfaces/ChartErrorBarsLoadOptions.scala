package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * This object represents the attributes for a chart's error bars.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ChartErrorBarsLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if error bars have an end style cap.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endStyleCap: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the formatting type of the error bars.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[ChartErrorBarsFormatLoadOptions] = js.native
  /**
    *
    * Specifies which parts of the error bars to include.
    *
    * [Api set: ExcelApi 1.9]
    */
  var include: js.UndefOr[Boolean] = js.native
  /**
    *
    * The type of range marked by the error bars.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether the error bars are displayed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object ChartErrorBarsLoadOptions {
  @scala.inline
  def apply(): ChartErrorBarsLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartErrorBarsLoadOptions]
  }
  @scala.inline
  implicit class ChartErrorBarsLoadOptionsOps[Self <: ChartErrorBarsLoadOptions] (val x: Self) extends AnyVal {
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
    def setEndStyleCap(value: Boolean): Self = this.set("endStyleCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndStyleCap: Self = this.set("endStyleCap", js.undefined)
    @scala.inline
    def setFormat(value: ChartErrorBarsFormatLoadOptions): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setInclude(value: Boolean): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setType(value: Boolean): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

