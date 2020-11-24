package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the text frame of a shape object.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait TextFrameLoadOptions extends js.Object {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The automatic sizing settings for the text frame. A text frame can be set to automatically fit the text to the text frame, to automatically fit the text frame to the text, or not perform any automatic sizing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoSizeSetting: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the bottom margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the text frame contains text.
    *
    * [Api set: ExcelApi 1.9]
    */
  var hasText: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the horizontal alignment of the text frame. See Excel.ShapeTextHorizontalAlignment for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the horizontal overflow behavior of the text frame. See Excel.ShapeTextHorizontalOverflow for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalOverflow: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the left margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the angle to which the text is oriented for the text frame. See Excel.ShapeTextOrientation for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var orientation: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the reading order of the text frame, either left-to-right or right-to-left. See Excel.ShapeTextReadingOrder for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var readingOrder: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the right margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the text that is attached to a shape in the text frame, and properties and methods for manipulating the text. See Excel.TextRange for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var textRange: js.UndefOr[TextRangeLoadOptions] = js.native
  
  /**
    *
    * Represents the top margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the vertical alignment of the text frame. See Excel.ShapeTextVerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the vertical overflow behavior of the text frame. See Excel.ShapeTextVerticalOverflow for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalOverflow: js.UndefOr[Boolean] = js.native
}
object TextFrameLoadOptions {
  
  @scala.inline
  def apply(): TextFrameLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFrameLoadOptions]
  }
  
  @scala.inline
  implicit class TextFrameLoadOptionsOps[Self <: TextFrameLoadOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoSizeSetting(value: Boolean): Self = this.set("autoSizeSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSizeSetting: Self = this.set("autoSizeSetting", js.undefined)
    
    @scala.inline
    def setBottomMargin(value: Boolean): Self = this.set("bottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomMargin: Self = this.set("bottomMargin", js.undefined)
    
    @scala.inline
    def setHasText(value: Boolean): Self = this.set("hasText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasText: Self = this.set("hasText", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: Boolean): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    
    @scala.inline
    def setHorizontalOverflow(value: Boolean): Self = this.set("horizontalOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalOverflow: Self = this.set("horizontalOverflow", js.undefined)
    
    @scala.inline
    def setLeftMargin(value: Boolean): Self = this.set("leftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftMargin: Self = this.set("leftMargin", js.undefined)
    
    @scala.inline
    def setOrientation(value: Boolean): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setReadingOrder(value: Boolean): Self = this.set("readingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadingOrder: Self = this.set("readingOrder", js.undefined)
    
    @scala.inline
    def setRightMargin(value: Boolean): Self = this.set("rightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightMargin: Self = this.set("rightMargin", js.undefined)
    
    @scala.inline
    def setTextRange(value: TextRangeLoadOptions): Self = this.set("textRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextRange: Self = this.set("textRange", js.undefined)
    
    @scala.inline
    def setTopMargin(value: Boolean): Self = this.set("topMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopMargin: Self = this.set("topMargin", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: Boolean): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
    
    @scala.inline
    def setVerticalOverflow(value: Boolean): Self = this.set("verticalOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalOverflow: Self = this.set("verticalOverflow", js.undefined)
  }
}
