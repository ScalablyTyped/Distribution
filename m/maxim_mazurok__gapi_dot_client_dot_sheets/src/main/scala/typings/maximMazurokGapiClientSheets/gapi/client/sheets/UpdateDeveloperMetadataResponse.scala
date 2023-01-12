package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeveloperMetadataResponse extends StObject {
  
  /** The updated developer metadata. */
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.undefined
}
object UpdateDeveloperMetadataResponse {
  
  inline def apply(): UpdateDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeveloperMetadataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDeveloperMetadataResponse] (val x: Self) extends AnyVal {
    
    inline def setDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
    
    inline def setDeveloperMetadataVarargs(value: DeveloperMetadata*): Self = StObject.set(x, "developerMetadata", js.Array(value*))
  }
}
