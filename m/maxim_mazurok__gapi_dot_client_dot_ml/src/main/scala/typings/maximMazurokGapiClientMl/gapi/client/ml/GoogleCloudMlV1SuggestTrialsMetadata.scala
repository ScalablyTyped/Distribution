package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1SuggestTrialsMetadata extends StObject {
  
  /** The identifier of the client that is requesting the suggestion. */
  var clientId: js.UndefOr[String] = js.undefined
  
  /** The time operation was submitted. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The name of the study that the trial belongs to. */
  var study: js.UndefOr[String] = js.undefined
  
  /** The number of suggestions requested. */
  var suggestionCount: js.UndefOr[Double] = js.undefined
}
object GoogleCloudMlV1SuggestTrialsMetadata {
  
  @scala.inline
  def apply(): GoogleCloudMlV1SuggestTrialsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1SuggestTrialsMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1SuggestTrialsMetadataMutableBuilder[Self <: GoogleCloudMlV1SuggestTrialsMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setStudy(value: String): Self = StObject.set(x, "study", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudyUndefined: Self = StObject.set(x, "study", js.undefined)
    
    @scala.inline
    def setSuggestionCount(value: Double): Self = StObject.set(x, "suggestionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionCountUndefined: Self = StObject.set(x, "suggestionCount", js.undefined)
  }
}
