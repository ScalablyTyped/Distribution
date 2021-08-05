package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchedDeveloperMetadata extends StObject {
  
  /** All filters matching the returned developer metadata. */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.undefined
  
  /** The developer metadata matching the specified filters. */
  var developerMetadata: js.UndefOr[DeveloperMetadata] = js.undefined
}
object MatchedDeveloperMetadata {
  
  inline def apply(): MatchedDeveloperMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchedDeveloperMetadata]
  }
  
  extension [Self <: MatchedDeveloperMetadata](x: Self) {
    
    inline def setDataFilters(value: js.Array[DataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
    
    inline def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
    
    inline def setDataFiltersVarargs(value: DataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
    
    inline def setDeveloperMetadata(value: DeveloperMetadata): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
  }
}
