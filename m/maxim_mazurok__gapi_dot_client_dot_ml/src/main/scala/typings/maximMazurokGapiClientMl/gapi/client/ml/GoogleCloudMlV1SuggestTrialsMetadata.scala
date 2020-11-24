package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1SuggestTrialsMetadata extends js.Object {
  
  /** The identifier of the client that is requesting the suggestion. */
  var clientId: js.UndefOr[String] = js.native
  
  /** The time operation was submitted. */
  var createTime: js.UndefOr[String] = js.native
  
  /** The name of the study that the trial belongs to. */
  var study: js.UndefOr[String] = js.native
  
  /** The number of suggestions requested. */
  var suggestionCount: js.UndefOr[Double] = js.native
}
object GoogleCloudMlV1SuggestTrialsMetadata {
  
  @scala.inline
  def apply(): GoogleCloudMlV1SuggestTrialsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1SuggestTrialsMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1SuggestTrialsMetadataOps[Self <: GoogleCloudMlV1SuggestTrialsMetadata] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setStudy(value: String): Self = this.set("study", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStudy: Self = this.set("study", js.undefined)
    
    @scala.inline
    def setSuggestionCount(value: Double): Self = this.set("suggestionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestionCount: Self = this.set("suggestionCount", js.undefined)
  }
}
