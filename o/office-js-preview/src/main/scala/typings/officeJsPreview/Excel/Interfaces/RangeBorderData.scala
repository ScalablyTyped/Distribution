package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.BorderIndex
import typings.officeJsPreview.Excel.BorderLineStyle
import typings.officeJsPreview.Excel.BorderWeight
import typings.officeJsPreview.officeJsPreviewStrings.Continuous
import typings.officeJsPreview.officeJsPreviewStrings.Dash
import typings.officeJsPreview.officeJsPreviewStrings.DashDot
import typings.officeJsPreview.officeJsPreviewStrings.DashDotDot
import typings.officeJsPreview.officeJsPreviewStrings.DiagonalDown
import typings.officeJsPreview.officeJsPreviewStrings.DiagonalUp
import typings.officeJsPreview.officeJsPreviewStrings.Dot
import typings.officeJsPreview.officeJsPreviewStrings.Double
import typings.officeJsPreview.officeJsPreviewStrings.EdgeBottom
import typings.officeJsPreview.officeJsPreviewStrings.EdgeLeft
import typings.officeJsPreview.officeJsPreviewStrings.EdgeRight
import typings.officeJsPreview.officeJsPreviewStrings.EdgeTop
import typings.officeJsPreview.officeJsPreviewStrings.Hairline
import typings.officeJsPreview.officeJsPreviewStrings.InsideHorizontal
import typings.officeJsPreview.officeJsPreviewStrings.InsideVertical
import typings.officeJsPreview.officeJsPreviewStrings.Medium
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.SlantDashDot
import typings.officeJsPreview.officeJsPreviewStrings.Thick
import typings.officeJsPreview.officeJsPreviewStrings.Thin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `rangeBorder.toJSON()`. */
@js.native
trait RangeBorderData extends js.Object {
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[String] = js.native
  /**
    *
    * Constant value that indicates the specific side of the border. See Excel.BorderIndex for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var sideIndex: js.UndefOr[
    BorderIndex | EdgeTop | EdgeBottom | EdgeLeft | EdgeRight | InsideVertical | InsideHorizontal | DiagonalDown | DiagonalUp
  ] = js.native
  /**
    *
    * One of the constants of line style specifying the line style for the border. See Excel.BorderLineStyle for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var style: js.UndefOr[
    BorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Double | SlantDashDot
  ] = js.native
  /**
    *
    * Specifies a double that lightens or darkens a color for Range Border, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A null value indicates that the border doesn't have uniform tintAndShade setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[scala.Double] = js.native
  /**
    *
    * Specifies the weight of the border around a range. See Excel.BorderWeight for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var weight: js.UndefOr[BorderWeight | Hairline | Thin | Medium | Thick] = js.native
}

object RangeBorderData {
  @scala.inline
  def apply(): RangeBorderData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeBorderData]
  }
  @scala.inline
  implicit class RangeBorderDataOps[Self <: RangeBorderData] (val x: Self) extends AnyVal {
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
    def setSideIndex(
      value: BorderIndex | EdgeTop | EdgeBottom | EdgeLeft | EdgeRight | InsideVertical | InsideHorizontal | DiagonalDown | DiagonalUp
    ): Self = this.set("sideIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSideIndex: Self = this.set("sideIndex", js.undefined)
    @scala.inline
    def setStyle(
      value: BorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Double | SlantDashDot
    ): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTintAndShade(value: scala.Double): Self = this.set("tintAndShade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTintAndShade: Self = this.set("tintAndShade", js.undefined)
    @scala.inline
    def setWeight(value: BorderWeight | Hairline | Thin | Medium | Thick): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

