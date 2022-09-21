package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteQueryResponse extends StObject {
  
  /** Results of the matching job/company candidates. */
  var completionResults: js.UndefOr[js.Array[CompletionResult]] = js.undefined
  
  /** Additional information for the API invocation, such as the request tracking id. */
  var metadata: js.UndefOr[ResponseMetadata] = js.undefined
}
object CompleteQueryResponse {
  
  inline def apply(): CompleteQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompleteQueryResponse]
  }
  
  extension [Self <: CompleteQueryResponse](x: Self) {
    
    inline def setCompletionResults(value: js.Array[CompletionResult]): Self = StObject.set(x, "completionResults", value.asInstanceOf[js.Any])
    
    inline def setCompletionResultsUndefined: Self = StObject.set(x, "completionResults", js.undefined)
    
    inline def setCompletionResultsVarargs(value: CompletionResult*): Self = StObject.set(x, "completionResults", js.Array(value*))
    
    inline def setMetadata(value: ResponseMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
