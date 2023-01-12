package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeveloperMetadataRequest extends StObject {
  
  /** The developer metadata to create. */
  var developerMetadata: js.UndefOr[DeveloperMetadata] = js.undefined
}
object CreateDeveloperMetadataRequest {
  
  inline def apply(): CreateDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeveloperMetadataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDeveloperMetadataRequest] (val x: Self) extends AnyVal {
    
    inline def setDeveloperMetadata(value: DeveloperMetadata): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
  }
}
