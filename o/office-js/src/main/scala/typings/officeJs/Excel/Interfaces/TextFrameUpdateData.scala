package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ShapeAutoSize
import typings.officeJs.Excel.ShapeTextHorizontalAlignment
import typings.officeJs.Excel.ShapeTextHorizontalOverflow
import typings.officeJs.Excel.ShapeTextOrientation
import typings.officeJs.Excel.ShapeTextReadingOrder
import typings.officeJs.Excel.ShapeTextVerticalAlignment
import typings.officeJs.Excel.ShapeTextVerticalOverflow
import typings.officeJs.officeJsStrings.AutoSizeMixed
import typings.officeJs.officeJsStrings.AutoSizeNone
import typings.officeJs.officeJsStrings.AutoSizeShapeToFitText
import typings.officeJs.officeJsStrings.AutoSizeTextToFitShape
import typings.officeJs.officeJsStrings.Bottom
import typings.officeJs.officeJsStrings.Center
import typings.officeJs.officeJsStrings.Clip
import typings.officeJs.officeJsStrings.Distributed
import typings.officeJs.officeJsStrings.EastAsianVertical
import typings.officeJs.officeJsStrings.Ellipsis
import typings.officeJs.officeJsStrings.Horizontal
import typings.officeJs.officeJsStrings.Justified
import typings.officeJs.officeJsStrings.Justify
import typings.officeJs.officeJsStrings.JustifyLow
import typings.officeJs.officeJsStrings.Left
import typings.officeJs.officeJsStrings.LeftToRight
import typings.officeJs.officeJsStrings.Middle
import typings.officeJs.officeJsStrings.MongolianVertical
import typings.officeJs.officeJsStrings.Overflow
import typings.officeJs.officeJsStrings.Right
import typings.officeJs.officeJsStrings.RightToLeft
import typings.officeJs.officeJsStrings.ThaiDistributed
import typings.officeJs.officeJsStrings.Top
import typings.officeJs.officeJsStrings.Vertical
import typings.officeJs.officeJsStrings.Vertical270
import typings.officeJs.officeJsStrings.WordArtVertical
import typings.officeJs.officeJsStrings.WordArtVerticalRTL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TextFrame object, for use in `textFrame.set({ ... })`. */
@js.native
trait TextFrameUpdateData extends js.Object {
  /**
    *
    * The automatic sizing settings for the text frame. A text frame can be set to automatically fit the text to the text frame, to automatically fit the text frame to the text, or not perform any automatic sizing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoSizeSetting: js.UndefOr[
    ShapeAutoSize | AutoSizeNone | AutoSizeTextToFitShape | AutoSizeShapeToFitText | AutoSizeMixed
  ] = js.native
  /**
    *
    * Represents the bottom margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the horizontal alignment of the text frame. See Excel.ShapeTextHorizontalAlignment for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalAlignment: js.UndefOr[
    ShapeTextHorizontalAlignment | Left | Center | Right | Justify | JustifyLow | Distributed | ThaiDistributed
  ] = js.native
  /**
    *
    * Represents the horizontal overflow behavior of the text frame. See Excel.ShapeTextHorizontalOverflow for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalOverflow: js.UndefOr[ShapeTextHorizontalOverflow | Overflow | Clip] = js.native
  /**
    *
    * Represents the left margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the angle to which the text is oriented for the text frame. See Excel.ShapeTextOrientation for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var orientation: js.UndefOr[
    ShapeTextOrientation | Horizontal | Vertical | Vertical270 | WordArtVertical | EastAsianVertical | MongolianVertical | WordArtVerticalRTL
  ] = js.native
  /**
    *
    * Represents the reading order of the text frame, either left-to-right or right-to-left. See Excel.ShapeTextReadingOrder for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var readingOrder: js.UndefOr[ShapeTextReadingOrder | LeftToRight | RightToLeft] = js.native
  /**
    *
    * Represents the right margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the top margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the vertical alignment of the text frame. See Excel.ShapeTextVerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalAlignment: js.UndefOr[ShapeTextVerticalAlignment | Top | Middle | Bottom | Justified | Distributed] = js.native
  /**
    *
    * Represents the vertical overflow behavior of the text frame. See Excel.ShapeTextVerticalOverflow for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalOverflow: js.UndefOr[ShapeTextVerticalOverflow | Overflow | Ellipsis | Clip] = js.native
}

object TextFrameUpdateData {
  @scala.inline
  def apply(): TextFrameUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFrameUpdateData]
  }
  @scala.inline
  implicit class TextFrameUpdateDataOps[Self <: TextFrameUpdateData] (val x: Self) extends AnyVal {
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
    def setAutoSizeSetting(
      value: ShapeAutoSize | AutoSizeNone | AutoSizeTextToFitShape | AutoSizeShapeToFitText | AutoSizeMixed
    ): Self = this.set("autoSizeSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSizeSetting: Self = this.set("autoSizeSetting", js.undefined)
    @scala.inline
    def setBottomMargin(value: Double): Self = this.set("bottomMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomMargin: Self = this.set("bottomMargin", js.undefined)
    @scala.inline
    def setHorizontalAlignment(
      value: ShapeTextHorizontalAlignment | Left | Center | Right | Justify | JustifyLow | Distributed | ThaiDistributed
    ): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    @scala.inline
    def setHorizontalOverflow(value: ShapeTextHorizontalOverflow | Overflow | Clip): Self = this.set("horizontalOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalOverflow: Self = this.set("horizontalOverflow", js.undefined)
    @scala.inline
    def setLeftMargin(value: Double): Self = this.set("leftMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftMargin: Self = this.set("leftMargin", js.undefined)
    @scala.inline
    def setOrientation(
      value: ShapeTextOrientation | Horizontal | Vertical | Vertical270 | WordArtVertical | EastAsianVertical | MongolianVertical | WordArtVerticalRTL
    ): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setReadingOrder(value: ShapeTextReadingOrder | LeftToRight | RightToLeft): Self = this.set("readingOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadingOrder: Self = this.set("readingOrder", js.undefined)
    @scala.inline
    def setRightMargin(value: Double): Self = this.set("rightMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightMargin: Self = this.set("rightMargin", js.undefined)
    @scala.inline
    def setTopMargin(value: Double): Self = this.set("topMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopMargin: Self = this.set("topMargin", js.undefined)
    @scala.inline
    def setVerticalAlignment(value: ShapeTextVerticalAlignment | Top | Middle | Bottom | Justified | Distributed): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
    @scala.inline
    def setVerticalOverflow(value: ShapeTextVerticalOverflow | Overflow | Ellipsis | Clip): Self = this.set("verticalOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalOverflow: Self = this.set("verticalOverflow", js.undefined)
  }
  
}

