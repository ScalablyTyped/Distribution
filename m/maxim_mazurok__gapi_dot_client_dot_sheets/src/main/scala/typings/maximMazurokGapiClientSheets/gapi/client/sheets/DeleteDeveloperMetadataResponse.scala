package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDeveloperMetadataResponse extends StObject {
  
  /** The metadata that was deleted. */
  var deletedDeveloperMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.undefined
}
object DeleteDeveloperMetadataResponse {
  
  @scala.inline
  def apply(): DeleteDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDeveloperMetadataResponse]
  }
  
  @scala.inline
  implicit class DeleteDeveloperMetadataResponseMutableBuilder[Self <: DeleteDeveloperMetadataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletedDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = StObject.set(x, "deletedDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedDeveloperMetadataUndefined: Self = StObject.set(x, "deletedDeveloperMetadata", js.undefined)
    
    @scala.inline
    def setDeletedDeveloperMetadataVarargs(value: DeveloperMetadata*): Self = StObject.set(x, "deletedDeveloperMetadata", js.Array(value :_*))
  }
}
