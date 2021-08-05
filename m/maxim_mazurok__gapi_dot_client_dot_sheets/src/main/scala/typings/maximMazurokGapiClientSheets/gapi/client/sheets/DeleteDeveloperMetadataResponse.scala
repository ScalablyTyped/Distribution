package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDeveloperMetadataResponse extends StObject {
  
  /** The metadata that was deleted. */
  var deletedDeveloperMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.undefined
}
object DeleteDeveloperMetadataResponse {
  
  inline def apply(): DeleteDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDeveloperMetadataResponse]
  }
  
  extension [Self <: DeleteDeveloperMetadataResponse](x: Self) {
    
    inline def setDeletedDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = StObject.set(x, "deletedDeveloperMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeletedDeveloperMetadataUndefined: Self = StObject.set(x, "deletedDeveloperMetadata", js.undefined)
    
    inline def setDeletedDeveloperMetadataVarargs(value: DeveloperMetadata*): Self = StObject.set(x, "deletedDeveloperMetadata", js.Array(value :_*))
  }
}
