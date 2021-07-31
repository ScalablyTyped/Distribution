package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchDeveloperMetadataResponse extends StObject {
  
  /** The metadata matching the criteria of the search request. */
  var matchedDeveloperMetadata: js.UndefOr[js.Array[MatchedDeveloperMetadata]] = js.undefined
}
object SearchDeveloperMetadataResponse {
  
  @scala.inline
  def apply(): SearchDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchDeveloperMetadataResponse]
  }
  
  @scala.inline
  implicit class SearchDeveloperMetadataResponseMutableBuilder[Self <: SearchDeveloperMetadataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatchedDeveloperMetadata(value: js.Array[MatchedDeveloperMetadata]): Self = StObject.set(x, "matchedDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedDeveloperMetadataUndefined: Self = StObject.set(x, "matchedDeveloperMetadata", js.undefined)
    
    @scala.inline
    def setMatchedDeveloperMetadataVarargs(value: MatchedDeveloperMetadata*): Self = StObject.set(x, "matchedDeveloperMetadata", js.Array(value :_*))
  }
}
