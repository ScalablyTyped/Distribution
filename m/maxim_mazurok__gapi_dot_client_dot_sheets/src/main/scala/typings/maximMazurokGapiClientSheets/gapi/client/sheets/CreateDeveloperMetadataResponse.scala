package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeveloperMetadataResponse extends StObject {
  
  /** The developer metadata that was created. */
  var developerMetadata: js.UndefOr[DeveloperMetadata] = js.undefined
}
object CreateDeveloperMetadataResponse {
  
  inline def apply(): CreateDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeveloperMetadataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDeveloperMetadataResponse] (val x: Self) extends AnyVal {
    
    inline def setDeveloperMetadata(value: DeveloperMetadata): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
  }
}
