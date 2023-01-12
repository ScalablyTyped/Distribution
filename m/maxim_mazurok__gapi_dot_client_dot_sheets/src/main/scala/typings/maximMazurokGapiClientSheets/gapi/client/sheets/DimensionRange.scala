package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionRange extends StObject {
  
  /** The dimension of the span. */
  var dimension: js.UndefOr[String] = js.undefined
  
  /** The end (exclusive) of the span, or not set if unbounded. */
  var endIndex: js.UndefOr[Double] = js.undefined
  
  /** The sheet this span is on. */
  var sheetId: js.UndefOr[Double] = js.undefined
  
  /** The start (inclusive) of the span, or not set if unbounded. */
  var startIndex: js.UndefOr[Double] = js.undefined
}
object DimensionRange {
  
  inline def apply(): DimensionRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DimensionRange] (val x: Self) extends AnyVal {
    
    inline def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
