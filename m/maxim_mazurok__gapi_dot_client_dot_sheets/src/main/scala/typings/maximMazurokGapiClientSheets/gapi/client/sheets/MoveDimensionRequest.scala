package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveDimensionRequest extends StObject {
  
  /**
    * The zero-based start index of where to move the source data to, based on the coordinates *before* the source data is removed from the grid. Existing data will be shifted down or
    * right (depending on the dimension) to make room for the moved dimensions. The source dimensions are removed from the grid, so the the data may end up in a different index than
    * specified. For example, given `A1..A5` of `0, 1, 2, 3, 4` and wanting to move `"1"` and `"2"` to between `"3"` and `"4"`, the source would be `ROWS [1..3)`,and the destination index
    * would be `"4"` (the zero-based index of row 5). The end result would be `A1..A5` of `0, 3, 1, 2, 4`.
    */
  var destinationIndex: js.UndefOr[Double] = js.undefined
  
  /** The source dimensions to move. */
  var source: js.UndefOr[DimensionRange] = js.undefined
}
object MoveDimensionRequest {
  
  inline def apply(): MoveDimensionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveDimensionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoveDimensionRequest] (val x: Self) extends AnyVal {
    
    inline def setDestinationIndex(value: Double): Self = StObject.set(x, "destinationIndex", value.asInstanceOf[js.Any])
    
    inline def setDestinationIndexUndefined: Self = StObject.set(x, "destinationIndex", js.undefined)
    
    inline def setSource(value: DimensionRange): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
