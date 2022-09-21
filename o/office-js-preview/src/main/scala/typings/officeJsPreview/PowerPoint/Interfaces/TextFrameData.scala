package typings.officeJsPreview.PowerPoint.Interfaces

import typings.officeJsPreview.PowerPoint.ShapeAutoSize
import typings.officeJsPreview.PowerPoint.TextVerticalAlignment
import typings.officeJsPreview.officeJsPreviewStrings.AutoSizeMixed
import typings.officeJsPreview.officeJsPreviewStrings.AutoSizeNone
import typings.officeJsPreview.officeJsPreviewStrings.AutoSizeShapeToFitText
import typings.officeJsPreview.officeJsPreviewStrings.AutoSizeTextToFitShape
import typings.officeJsPreview.officeJsPreviewStrings.Bottom
import typings.officeJsPreview.officeJsPreviewStrings.BottomCentered
import typings.officeJsPreview.officeJsPreviewStrings.Middle
import typings.officeJsPreview.officeJsPreviewStrings.MiddleCentered
import typings.officeJsPreview.officeJsPreviewStrings.Top
import typings.officeJsPreview.officeJsPreviewStrings.TopCentered
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `textFrame.toJSON()`. */
trait TextFrameData extends StObject {
  
  /**
    * The automatic sizing settings for the text frame. A text frame can be set to automatically fit the text to the text frame, to automatically fit the text frame to the text, or not perform any automatic sizing.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var autoSizeSetting: js.UndefOr[
    ShapeAutoSize | AutoSizeNone | AutoSizeTextToFitShape | AutoSizeShapeToFitText | AutoSizeMixed
  ] = js.undefined
  
  /**
    * Represents the bottom margin, in points, of the text frame.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var bottomMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies if the text frame contains text.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var hasText: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the left margin, in points, of the text frame.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var leftMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the right margin, in points, of the text frame.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var rightMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the top margin, in points, of the text frame.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var topMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the vertical alignment of the text frame. See {@link PowerPoint.TextVerticalAlignment} for details.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var verticalAlignment: js.UndefOr[
    TextVerticalAlignment | Top | Middle | Bottom | TopCentered | MiddleCentered | BottomCentered
  ] = js.undefined
  
  /**
    * Determines whether lines break automatically to fit text inside the shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var wordWrap: js.UndefOr[Boolean] = js.undefined
}
object TextFrameData {
  
  inline def apply(): TextFrameData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFrameData]
  }
  
  extension [Self <: TextFrameData](x: Self) {
    
    inline def setAutoSizeSetting(
      value: ShapeAutoSize | AutoSizeNone | AutoSizeTextToFitShape | AutoSizeShapeToFitText | AutoSizeMixed
    ): Self = StObject.set(x, "autoSizeSetting", value.asInstanceOf[js.Any])
    
    inline def setAutoSizeSettingUndefined: Self = StObject.set(x, "autoSizeSetting", js.undefined)
    
    inline def setBottomMargin(value: Double): Self = StObject.set(x, "bottomMargin", value.asInstanceOf[js.Any])
    
    inline def setBottomMarginUndefined: Self = StObject.set(x, "bottomMargin", js.undefined)
    
    inline def setHasText(value: Boolean): Self = StObject.set(x, "hasText", value.asInstanceOf[js.Any])
    
    inline def setHasTextUndefined: Self = StObject.set(x, "hasText", js.undefined)
    
    inline def setLeftMargin(value: Double): Self = StObject.set(x, "leftMargin", value.asInstanceOf[js.Any])
    
    inline def setLeftMarginUndefined: Self = StObject.set(x, "leftMargin", js.undefined)
    
    inline def setRightMargin(value: Double): Self = StObject.set(x, "rightMargin", value.asInstanceOf[js.Any])
    
    inline def setRightMarginUndefined: Self = StObject.set(x, "rightMargin", js.undefined)
    
    inline def setTopMargin(value: Double): Self = StObject.set(x, "topMargin", value.asInstanceOf[js.Any])
    
    inline def setTopMarginUndefined: Self = StObject.set(x, "topMargin", js.undefined)
    
    inline def setVerticalAlignment(
      value: TextVerticalAlignment | Top | Middle | Bottom | TopCentered | MiddleCentered | BottomCentered
    ): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    inline def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
  }
}
