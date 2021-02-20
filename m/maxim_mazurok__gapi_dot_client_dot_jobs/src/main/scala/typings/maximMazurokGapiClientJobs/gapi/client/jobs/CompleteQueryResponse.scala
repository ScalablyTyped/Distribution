package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompleteQueryResponse extends StObject {
  
  /** Results of the matching job/company candidates. */
  var completionResults: js.UndefOr[js.Array[CompletionResult]] = js.native
  
  /** Additional information for the API invocation, such as the request tracking id. */
  var metadata: js.UndefOr[ResponseMetadata] = js.native
}
object CompleteQueryResponse {
  
  @scala.inline
  def apply(): CompleteQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompleteQueryResponse]
  }
  
  @scala.inline
  implicit class CompleteQueryResponseMutableBuilder[Self <: CompleteQueryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletionResults(value: js.Array[CompletionResult]): Self = StObject.set(x, "completionResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionResultsUndefined: Self = StObject.set(x, "completionResults", js.undefined)
    
    @scala.inline
    def setCompletionResultsVarargs(value: CompletionResult*): Self = StObject.set(x, "completionResults", js.Array(value :_*))
    
    @scala.inline
    def setMetadata(value: ResponseMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
