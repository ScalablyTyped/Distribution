package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceAndDestination extends StObject {
  
  /** The dimension that data should be filled into. */
  var dimension: js.UndefOr[String] = js.undefined
  
  /**
    * The number of rows or columns that data should be filled into. Positive numbers expand beyond the last row or last column of the source. Negative numbers expand before the first row
    * or first column of the source.
    */
  var fillLength: js.UndefOr[Double] = js.undefined
  
  /** The location of the data to use as the source of the autofill. */
  var source: js.UndefOr[GridRange] = js.undefined
}
object SourceAndDestination {
  
  inline def apply(): SourceAndDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceAndDestination]
  }
  
  extension [Self <: SourceAndDestination](x: Self) {
    
    inline def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setFillLength(value: Double): Self = StObject.set(x, "fillLength", value.asInstanceOf[js.Any])
    
    inline def setFillLengthUndefined: Self = StObject.set(x, "fillLength", js.undefined)
    
    inline def setSource(value: GridRange): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
