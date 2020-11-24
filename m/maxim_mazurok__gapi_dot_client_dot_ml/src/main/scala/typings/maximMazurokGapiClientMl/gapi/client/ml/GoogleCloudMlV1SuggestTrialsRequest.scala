package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1SuggestTrialsRequest extends js.Object {
  
  /**
    * Required. The identifier of the client that is requesting the suggestion. If multiple SuggestTrialsRequests have the same `client_id`, the service will return the identical
    * suggested trial if the trial is pending, and provide a new trial if the last suggested trial was completed.
    */
  var clientId: js.UndefOr[String] = js.native
  
  /** Required. The number of suggestions requested. */
  var suggestionCount: js.UndefOr[Double] = js.native
}
object GoogleCloudMlV1SuggestTrialsRequest {
  
  @scala.inline
  def apply(): GoogleCloudMlV1SuggestTrialsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1SuggestTrialsRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1SuggestTrialsRequestOps[Self <: GoogleCloudMlV1SuggestTrialsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setSuggestionCount(value: Double): Self = this.set("suggestionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestionCount: Self = this.set("suggestionCount", js.undefined)
  }
}
