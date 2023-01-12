package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataFilter extends StObject {
  
  /** Selects data that matches the specified A1 range. */
  var a1Range: js.UndefOr[String] = js.undefined
  
  /** Selects data associated with the developer metadata matching the criteria described by this DeveloperMetadataLookup. */
  var developerMetadataLookup: js.UndefOr[DeveloperMetadataLookup] = js.undefined
  
  /** Selects data that matches the range described by the GridRange. */
  var gridRange: js.UndefOr[GridRange] = js.undefined
}
object DataFilter {
  
  inline def apply(): DataFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataFilter] (val x: Self) extends AnyVal {
    
    inline def setA1Range(value: String): Self = StObject.set(x, "a1Range", value.asInstanceOf[js.Any])
    
    inline def setA1RangeUndefined: Self = StObject.set(x, "a1Range", js.undefined)
    
    inline def setDeveloperMetadataLookup(value: DeveloperMetadataLookup): Self = StObject.set(x, "developerMetadataLookup", value.asInstanceOf[js.Any])
    
    inline def setDeveloperMetadataLookupUndefined: Self = StObject.set(x, "developerMetadataLookup", js.undefined)
    
    inline def setGridRange(value: GridRange): Self = StObject.set(x, "gridRange", value.asInstanceOf[js.Any])
    
    inline def setGridRangeUndefined: Self = StObject.set(x, "gridRange", js.undefined)
  }
}
