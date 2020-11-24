package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1EventDetail extends js.Object {
  
  /**
    * Optional. Extra user event features to include in the recommendation model. For product recommendation, an example of extra user information is traffic_channel, i.e. how user
    * arrives at the site. Users can arrive at the site by coming to the site directly, or coming through Google search, and etc.
    */
  var eventAttributes: js.UndefOr[GoogleCloudRecommendationengineV1beta1FeatureMap] = js.native
  
  /**
    * Optional. A list of identifiers for the independent experiment groups this user event belongs to. This is used to distinguish between user events associated with different
    * experiment setups (e.g. using Recommendation Engine system, using different recommendation models).
    */
  var experimentIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. A unique id of a web page view. This should be kept the same for all user events triggered from the same pageview. For example, an item detail page view could trigger
    * multiple events as the user is browsing the page. The `pageViewId` property should be kept the same for all these events so that they can be grouped together properly. This
    * `pageViewId` will be automatically generated if using the JavaScript pixel.
    */
  var pageViewId: js.UndefOr[String] = js.native
  
  /**
    * Optional. Recommendation token included in the recommendation prediction response. This field enables accurate attribution of recommendation model performance. This token enables us
    * to accurately attribute page view or purchase back to the event and the particular predict response containing this clicked/purchased item. If user clicks on product K in the
    * recommendation results, pass the `PredictResponse.recommendationToken` property as a url parameter to product K's page. When recording events on product K's page, log the
    * PredictResponse.recommendation_token to this field. Optional, but highly encouraged for user events that are the result of a recommendation prediction query.
    */
  var recommendationToken: js.UndefOr[String] = js.native
  
  /** Optional. The referrer url of the current page. When using the JavaScript pixel, this value is filled in automatically. */
  var referrerUri: js.UndefOr[String] = js.native
  
  /** Optional. Complete url (window.location.href) of the user's current page. When using the JavaScript pixel, this value is filled in automatically. Maximum length 5KB. */
  var uri: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1EventDetail {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1EventDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1EventDetail]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1EventDetailOps[Self <: GoogleCloudRecommendationengineV1beta1EventDetail] (val x: Self) extends AnyVal {
    
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
    def setEventAttributes(value: GoogleCloudRecommendationengineV1beta1FeatureMap): Self = this.set("eventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventAttributes: Self = this.set("eventAttributes", js.undefined)
    
    @scala.inline
    def setExperimentIdsVarargs(value: String*): Self = this.set("experimentIds", js.Array(value :_*))
    
    @scala.inline
    def setExperimentIds(value: js.Array[String]): Self = this.set("experimentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimentIds: Self = this.set("experimentIds", js.undefined)
    
    @scala.inline
    def setPageViewId(value: String): Self = this.set("pageViewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageViewId: Self = this.set("pageViewId", js.undefined)
    
    @scala.inline
    def setRecommendationToken(value: String): Self = this.set("recommendationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendationToken: Self = this.set("recommendationToken", js.undefined)
    
    @scala.inline
    def setReferrerUri(value: String): Self = this.set("referrerUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferrerUri: Self = this.set("referrerUri", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
