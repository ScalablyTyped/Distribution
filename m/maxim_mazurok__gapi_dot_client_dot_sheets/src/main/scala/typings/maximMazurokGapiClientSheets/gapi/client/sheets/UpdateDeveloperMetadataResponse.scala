package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeveloperMetadataResponse extends StObject {
  
  /** The updated developer metadata. */
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.undefined
}
object UpdateDeveloperMetadataResponse {
  
  @scala.inline
  def apply(): UpdateDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeveloperMetadataResponse]
  }
  
  @scala.inline
  implicit class UpdateDeveloperMetadataResponseMutableBuilder[Self <: UpdateDeveloperMetadataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
    
    @scala.inline
    def setDeveloperMetadataVarargs(value: DeveloperMetadata*): Self = StObject.set(x, "developerMetadata", js.Array(value :_*))
  }
}
