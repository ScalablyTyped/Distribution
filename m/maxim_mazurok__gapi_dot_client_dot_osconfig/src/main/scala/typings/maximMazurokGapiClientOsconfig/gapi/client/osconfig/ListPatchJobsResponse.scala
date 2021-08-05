package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPatchJobsResponse extends StObject {
  
  /** A pagination token that can be used to get the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of patch jobs. */
  var patchJobs: js.UndefOr[js.Array[PatchJob]] = js.undefined
}
object ListPatchJobsResponse {
  
  inline def apply(): ListPatchJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPatchJobsResponse]
  }
  
  extension [Self <: ListPatchJobsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPatchJobs(value: js.Array[PatchJob]): Self = StObject.set(x, "patchJobs", value.asInstanceOf[js.Any])
    
    inline def setPatchJobsUndefined: Self = StObject.set(x, "patchJobs", js.undefined)
    
    inline def setPatchJobsVarargs(value: PatchJob*): Self = StObject.set(x, "patchJobs", js.Array(value :_*))
  }
}
