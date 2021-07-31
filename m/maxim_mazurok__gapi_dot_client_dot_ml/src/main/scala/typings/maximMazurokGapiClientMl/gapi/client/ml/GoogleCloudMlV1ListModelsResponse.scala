package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1ListModelsResponse extends StObject {
  
  /** The list of models. */
  var models: js.UndefOr[js.Array[GoogleCloudMlV1Model]] = js.undefined
  
  /** Optional. Pass this token as the `page_token` field of the request for a subsequent call. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1ListModelsResponse {
  
  @scala.inline
  def apply(): GoogleCloudMlV1ListModelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1ListModelsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1ListModelsResponseMutableBuilder[Self <: GoogleCloudMlV1ListModelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModels(value: js.Array[GoogleCloudMlV1Model]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
    
    @scala.inline
    def setModelsVarargs(value: GoogleCloudMlV1Model*): Self = StObject.set(x, "models", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
