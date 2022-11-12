package typings.officeJsPreview.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the text that is attached to a shape, in addition to properties and methods for manipulating the text.
  *
  * @remarks
  * [Api set: PowerPointApi 1.4]
  */
trait TextRangeLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns a `ShapeFont` object that represents the font attributes for the text range.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var font: js.UndefOr[ShapeFontLoadOptions] = js.undefined
  
  /**
    * Gets or sets the length of the range that this `TextRange` represents.
    Throws an `InvalidArgument` exception when set with a negative value or if the value is greater than the length of the available text from the starting point.
    *
    * @remarks
    * [Api set: PowerPointApi 1.5]
    */
  var length: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the paragraph format of the text range. See {@link PowerPoint.ParagraphFormat} for details.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var paragraphFormat: js.UndefOr[ParagraphFormatLoadOptions] = js.undefined
  
  /**
    * Gets or sets zero-based index, relative to the parent text frame, for the starting position of the range that this `TextRange` represents.
    Throws an `InvalidArgument` exception when set with a negative value or if the value is greater than the length of the text.
    *
    * @remarks
    * [Api set: PowerPointApi 1.5]
    */
  var start: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the plain text content of the text range.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var text: js.UndefOr[Boolean] = js.undefined
}
object TextRangeLoadOptions {
  
  inline def apply(): TextRangeLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextRangeLoadOptions]
  }
  
  extension [Self <: TextRangeLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setFont(value: ShapeFontLoadOptions): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setLength(value: Boolean): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setParagraphFormat(value: ParagraphFormatLoadOptions): Self = StObject.set(x, "paragraphFormat", value.asInstanceOf[js.Any])
    
    inline def setParagraphFormatUndefined: Self = StObject.set(x, "paragraphFormat", js.undefined)
    
    inline def setStart(value: Boolean): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
