package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPatchJobInstanceDetailsResponse extends StObject {
  
  /** A pagination token that can be used to get the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A list of instance status. */
  var patchJobInstanceDetails: js.UndefOr[js.Array[PatchJobInstanceDetails]] = js.undefined
}
object ListPatchJobInstanceDetailsResponse {
  
  inline def apply(): ListPatchJobInstanceDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPatchJobInstanceDetailsResponse]
  }
  
  extension [Self <: ListPatchJobInstanceDetailsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPatchJobInstanceDetails(value: js.Array[PatchJobInstanceDetails]): Self = StObject.set(x, "patchJobInstanceDetails", value.asInstanceOf[js.Any])
    
    inline def setPatchJobInstanceDetailsUndefined: Self = StObject.set(x, "patchJobInstanceDetails", js.undefined)
    
    inline def setPatchJobInstanceDetailsVarargs(value: PatchJobInstanceDetails*): Self = StObject.set(x, "patchJobInstanceDetails", js.Array(value :_*))
  }
}
