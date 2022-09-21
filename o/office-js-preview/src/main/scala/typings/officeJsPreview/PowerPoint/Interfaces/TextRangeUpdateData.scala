package typings.officeJsPreview.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TextRange object, for use in `textRange.set({ ... })`. */
trait TextRangeUpdateData extends StObject {
  
  /**
    * Gets or sets the length of the range that this `TextRange` represents.
    Throws an `InvalidArgument` exception when set with a negative value or if the value is greater than the length of the available text from the starting point.
    *
    * @remarks
    * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets zero-based index, relative to the parent text frame, for the starting position of the range that this `TextRange` represents.
    Throws an `InvalidArgument` exception when set with a negative value or if the value is greater than the length of the text.
    *
    * @remarks
    * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var start: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the plain text content of the text range.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var text: js.UndefOr[String] = js.undefined
}
object TextRangeUpdateData {
  
  inline def apply(): TextRangeUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextRangeUpdateData]
  }
  
  extension [Self <: TextRangeUpdateData](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
