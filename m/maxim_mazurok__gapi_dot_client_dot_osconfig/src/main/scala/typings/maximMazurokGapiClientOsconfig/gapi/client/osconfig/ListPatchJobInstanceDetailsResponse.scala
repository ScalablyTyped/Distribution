package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPatchJobInstanceDetailsResponse extends StObject {
  
  /** A pagination token that can be used to get the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** A list of instance status. */
  var patchJobInstanceDetails: js.UndefOr[js.Array[PatchJobInstanceDetails]] = js.native
}
object ListPatchJobInstanceDetailsResponse {
  
  @scala.inline
  def apply(): ListPatchJobInstanceDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPatchJobInstanceDetailsResponse]
  }
  
  @scala.inline
  implicit class ListPatchJobInstanceDetailsResponseMutableBuilder[Self <: ListPatchJobInstanceDetailsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPatchJobInstanceDetails(value: js.Array[PatchJobInstanceDetails]): Self = StObject.set(x, "patchJobInstanceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchJobInstanceDetailsUndefined: Self = StObject.set(x, "patchJobInstanceDetails", js.undefined)
    
    @scala.inline
    def setPatchJobInstanceDetailsVarargs(value: PatchJobInstanceDetails*): Self = StObject.set(x, "patchJobInstanceDetails", js.Array(value :_*))
  }
}
