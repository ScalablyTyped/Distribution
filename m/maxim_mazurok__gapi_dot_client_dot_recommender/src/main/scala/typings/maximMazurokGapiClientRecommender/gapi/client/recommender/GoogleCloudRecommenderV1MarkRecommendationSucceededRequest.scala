package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommenderV1MarkRecommendationSucceededRequest extends js.Object {
  
  /** Required. Fingerprint of the Recommendation. Provides optimistic locking. */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * State properties to include with this state. Overwrites any existing `state_metadata`. Keys must match the regex /^a-z0-9{0,62}$/. Values must match the regex
    * /^[a-zA-Z0-9_./-]{0,255}$/.
    */
  var stateMetadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1MarkRecommendationSucceededRequest with TopLevel[js.Any]
  ] = js.native
}
object GoogleCloudRecommenderV1MarkRecommendationSucceededRequest {
  
  @scala.inline
  def apply(): GoogleCloudRecommenderV1MarkRecommendationSucceededRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1MarkRecommendationSucceededRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommenderV1MarkRecommendationSucceededRequestOps[Self <: GoogleCloudRecommenderV1MarkRecommendationSucceededRequest] (val x: Self) extends AnyVal {
    
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setStateMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1MarkRecommendationSucceededRequest with TopLevel[js.Any]
    ): Self = this.set("stateMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateMetadata: Self = this.set("stateMetadata", js.undefined)
  }
}
