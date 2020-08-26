package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ConditionalRangeBorderIndex
import typings.officeJsPreview.Excel.ConditionalRangeBorderLineStyle
import typings.officeJsPreview.officeJsPreviewStrings.Continuous
import typings.officeJsPreview.officeJsPreviewStrings.Dash
import typings.officeJsPreview.officeJsPreviewStrings.DashDot
import typings.officeJsPreview.officeJsPreviewStrings.DashDotDot
import typings.officeJsPreview.officeJsPreviewStrings.Dot
import typings.officeJsPreview.officeJsPreviewStrings.EdgeBottom
import typings.officeJsPreview.officeJsPreviewStrings.EdgeLeft
import typings.officeJsPreview.officeJsPreviewStrings.EdgeRight
import typings.officeJsPreview.officeJsPreviewStrings.EdgeTop
import typings.officeJsPreview.officeJsPreviewStrings.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `conditionalRangeBorder.toJSON()`. */
@js.native
trait ConditionalRangeBorderData extends js.Object {
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var color: js.UndefOr[String] = js.native
  /**
    *
    * Constant value that indicates the specific side of the border. See Excel.ConditionalRangeBorderIndex for details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var sideIndex: js.UndefOr[ConditionalRangeBorderIndex | EdgeTop | EdgeBottom | EdgeLeft | EdgeRight] = js.native
  /**
    *
    * One of the constants of line style specifying the line style for the border. See Excel.BorderLineStyle for details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var style: js.UndefOr[
    ConditionalRangeBorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot
  ] = js.native
}

object ConditionalRangeBorderData {
  @scala.inline
  def apply(): ConditionalRangeBorderData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRangeBorderData]
  }
  @scala.inline
  implicit class ConditionalRangeBorderDataOps[Self <: ConditionalRangeBorderData] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setSideIndex(value: ConditionalRangeBorderIndex | EdgeTop | EdgeBottom | EdgeLeft | EdgeRight): Self = this.set("sideIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSideIndex: Self = this.set("sideIndex", js.undefined)
    @scala.inline
    def setStyle(value: ConditionalRangeBorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

