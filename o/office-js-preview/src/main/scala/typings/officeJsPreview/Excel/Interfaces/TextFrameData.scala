package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ShapeAutoSize
import typings.officeJsPreview.Excel.ShapeTextHorizontalAlignment
import typings.officeJsPreview.Excel.ShapeTextHorizontalOverflow
import typings.officeJsPreview.Excel.ShapeTextOrientation
import typings.officeJsPreview.Excel.ShapeTextReadingOrder
import typings.officeJsPreview.Excel.ShapeTextVerticalAlignment
import typings.officeJsPreview.Excel.ShapeTextVerticalOverflow
import typings.officeJsPreview.officeJsPreviewStrings.AutoSizeMixed
import typings.officeJsPreview.officeJsPreviewStrings.AutoSizeNone
import typings.officeJsPreview.officeJsPreviewStrings.AutoSizeShapeToFitText
import typings.officeJsPreview.officeJsPreviewStrings.AutoSizeTextToFitShape
import typings.officeJsPreview.officeJsPreviewStrings.Bottom
import typings.officeJsPreview.officeJsPreviewStrings.Center
import typings.officeJsPreview.officeJsPreviewStrings.Clip
import typings.officeJsPreview.officeJsPreviewStrings.Distributed
import typings.officeJsPreview.officeJsPreviewStrings.EastAsianVertical
import typings.officeJsPreview.officeJsPreviewStrings.Ellipsis
import typings.officeJsPreview.officeJsPreviewStrings.Horizontal
import typings.officeJsPreview.officeJsPreviewStrings.Justified
import typings.officeJsPreview.officeJsPreviewStrings.Justify
import typings.officeJsPreview.officeJsPreviewStrings.JustifyLow
import typings.officeJsPreview.officeJsPreviewStrings.Left
import typings.officeJsPreview.officeJsPreviewStrings.LeftToRight
import typings.officeJsPreview.officeJsPreviewStrings.Middle
import typings.officeJsPreview.officeJsPreviewStrings.MongolianVertical
import typings.officeJsPreview.officeJsPreviewStrings.Overflow
import typings.officeJsPreview.officeJsPreviewStrings.Right
import typings.officeJsPreview.officeJsPreviewStrings.RightToLeft
import typings.officeJsPreview.officeJsPreviewStrings.ThaiDistributed
import typings.officeJsPreview.officeJsPreviewStrings.Top
import typings.officeJsPreview.officeJsPreviewStrings.Vertical
import typings.officeJsPreview.officeJsPreviewStrings.Vertical270
import typings.officeJsPreview.officeJsPreviewStrings.WordArtVertical
import typings.officeJsPreview.officeJsPreviewStrings.WordArtVerticalRTL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `textFrame.toJSON()`. */
trait TextFrameData extends StObject {
  
  /**
    *
    * The automatic sizing settings for the text frame. A text frame can be set to automatically fit the text to the text frame, to automatically fit the text frame to the text, or not perform any automatic sizing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoSizeSetting: js.UndefOr[
    ShapeAutoSize | AutoSizeNone | AutoSizeTextToFitShape | AutoSizeShapeToFitText | AutoSizeMixed
  ] = js.undefined
  
  /**
    *
    * Represents the bottom margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies if the text frame contains text.
    *
    * [Api set: ExcelApi 1.9]
    */
  var hasText: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the horizontal alignment of the text frame. See Excel.ShapeTextHorizontalAlignment for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalAlignment: js.UndefOr[
    ShapeTextHorizontalAlignment | Left | Center | Right | Justify | JustifyLow | Distributed | ThaiDistributed
  ] = js.undefined
  
  /**
    *
    * Represents the horizontal overflow behavior of the text frame. See Excel.ShapeTextHorizontalOverflow for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalOverflow: js.UndefOr[ShapeTextHorizontalOverflow | Overflow | Clip] = js.undefined
  
  /**
    *
    * Represents the left margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents the angle to which the text is oriented for the text frame. See Excel.ShapeTextOrientation for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var orientation: js.UndefOr[
    ShapeTextOrientation | Horizontal | Vertical | Vertical270 | WordArtVertical | EastAsianVertical | MongolianVertical | WordArtVerticalRTL
  ] = js.undefined
  
  /**
    *
    * Represents the reading order of the text frame, either left-to-right or right-to-left. See Excel.ShapeTextReadingOrder for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var readingOrder: js.UndefOr[ShapeTextReadingOrder | LeftToRight | RightToLeft] = js.undefined
  
  /**
    *
    * Represents the right margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents the top margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents the vertical alignment of the text frame. See Excel.ShapeTextVerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalAlignment: js.UndefOr[ShapeTextVerticalAlignment | Top | Middle | Bottom | Justified | Distributed] = js.undefined
  
  /**
    *
    * Represents the vertical overflow behavior of the text frame. See Excel.ShapeTextVerticalOverflow for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalOverflow: js.UndefOr[ShapeTextVerticalOverflow | Overflow | Ellipsis | Clip] = js.undefined
}
object TextFrameData {
  
  @scala.inline
  def apply(): TextFrameData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFrameData]
  }
  
  @scala.inline
  implicit class TextFrameDataMutableBuilder[Self <: TextFrameData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoSizeSetting(
      value: ShapeAutoSize | AutoSizeNone | AutoSizeTextToFitShape | AutoSizeShapeToFitText | AutoSizeMixed
    ): Self = StObject.set(x, "autoSizeSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSizeSettingUndefined: Self = StObject.set(x, "autoSizeSetting", js.undefined)
    
    @scala.inline
    def setBottomMargin(value: Double): Self = StObject.set(x, "bottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomMarginUndefined: Self = StObject.set(x, "bottomMargin", js.undefined)
    
    @scala.inline
    def setHasText(value: Boolean): Self = StObject.set(x, "hasText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasTextUndefined: Self = StObject.set(x, "hasText", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(
      value: ShapeTextHorizontalAlignment | Left | Center | Right | Justify | JustifyLow | Distributed | ThaiDistributed
    ): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    @scala.inline
    def setHorizontalOverflow(value: ShapeTextHorizontalOverflow | Overflow | Clip): Self = StObject.set(x, "horizontalOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalOverflowUndefined: Self = StObject.set(x, "horizontalOverflow", js.undefined)
    
    @scala.inline
    def setLeftMargin(value: Double): Self = StObject.set(x, "leftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftMarginUndefined: Self = StObject.set(x, "leftMargin", js.undefined)
    
    @scala.inline
    def setOrientation(
      value: ShapeTextOrientation | Horizontal | Vertical | Vertical270 | WordArtVertical | EastAsianVertical | MongolianVertical | WordArtVerticalRTL
    ): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setReadingOrder(value: ShapeTextReadingOrder | LeftToRight | RightToLeft): Self = StObject.set(x, "readingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadingOrderUndefined: Self = StObject.set(x, "readingOrder", js.undefined)
    
    @scala.inline
    def setRightMargin(value: Double): Self = StObject.set(x, "rightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightMarginUndefined: Self = StObject.set(x, "rightMargin", js.undefined)
    
    @scala.inline
    def setTopMargin(value: Double): Self = StObject.set(x, "topMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopMarginUndefined: Self = StObject.set(x, "topMargin", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: ShapeTextVerticalAlignment | Top | Middle | Bottom | Justified | Distributed): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    @scala.inline
    def setVerticalOverflow(value: ShapeTextVerticalOverflow | Overflow | Ellipsis | Clip): Self = StObject.set(x, "verticalOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalOverflowUndefined: Self = StObject.set(x, "verticalOverflow", js.undefined)
  }
}
