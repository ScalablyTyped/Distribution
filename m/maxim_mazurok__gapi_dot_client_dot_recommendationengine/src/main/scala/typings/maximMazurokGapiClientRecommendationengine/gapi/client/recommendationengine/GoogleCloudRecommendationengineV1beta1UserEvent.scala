package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1UserEvent extends js.Object {
  
  /** Optional. User event detailed information common across different recommendation types. */
  var eventDetail: js.UndefOr[GoogleCloudRecommendationengineV1beta1EventDetail] = js.native
  
  /** Optional. This field should *not* be set when using JavaScript pixel or the Recommendations AI Tag. Defaults to `EVENT_SOURCE_UNSPECIFIED`. */
  var eventSource: js.UndefOr[String] = js.native
  
  /** Optional. Only required for ImportUserEvents method. Timestamp of user event created. */
  var eventTime: js.UndefOr[String] = js.native
  
  /**
    * Required. User event type. Allowed values are: * `add-to-cart` Products being added to cart. * `add-to-list` Items being added to a list (shopping list, favorites etc). *
    * `category-page-view` Special pages such as sale or promotion pages viewed. * `checkout-start` User starting a checkout process. * `detail-page-view` Products detail page viewed. *
    * `home-page-view` Homepage viewed. * `page-visit` Generic page visits not included in the event types above. * `purchase-complete` User finishing a purchase. * `refund` Purchased
    * items being refunded or returned. * `remove-from-cart` Products being removed from cart. * `remove-from-list` Items being removed from a list. * `search` Product search. *
    * `shopping-cart-page-view` User viewing a shopping cart. * `impression` List of items displayed. Used by Google Tag Manager.
    */
  var eventType: js.UndefOr[String] = js.native
  
  /**
    * Optional. Retail product specific user event metadata. This field is required for the following event types: * `add-to-cart` * `add-to-list` * `category-page-view` *
    * `checkout-start` * `detail-page-view` * `purchase-complete` * `refund` * `remove-from-cart` * `remove-from-list` * `search` This field is optional for the following event types: *
    * `page-visit` * `shopping-cart-page-view` - note that 'product_event_detail' should be set for this unless the shopping cart is empty. This field is not allowed for the following
    * event types: * `home-page-view`
    */
  var productEventDetail: js.UndefOr[GoogleCloudRecommendationengineV1beta1ProductEventDetail] = js.native
  
  /** Required. User information. */
  var userInfo: js.UndefOr[GoogleCloudRecommendationengineV1beta1UserInfo] = js.native
}
object GoogleCloudRecommendationengineV1beta1UserEvent {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1UserEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1UserEvent]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1UserEventOps[Self <: GoogleCloudRecommendationengineV1beta1UserEvent] (val x: Self) extends AnyVal {
    
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
    def setEventDetail(value: GoogleCloudRecommendationengineV1beta1EventDetail): Self = this.set("eventDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventDetail: Self = this.set("eventDetail", js.undefined)
    
    @scala.inline
    def setEventSource(value: String): Self = this.set("eventSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSource: Self = this.set("eventSource", js.undefined)
    
    @scala.inline
    def setEventTime(value: String): Self = this.set("eventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTime: Self = this.set("eventTime", js.undefined)
    
    @scala.inline
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventType: Self = this.set("eventType", js.undefined)
    
    @scala.inline
    def setProductEventDetail(value: GoogleCloudRecommendationengineV1beta1ProductEventDetail): Self = this.set("productEventDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductEventDetail: Self = this.set("productEventDetail", js.undefined)
    
    @scala.inline
    def setUserInfo(value: GoogleCloudRecommendationengineV1beta1UserInfo): Self = this.set("userInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserInfo: Self = this.set("userInfo", js.undefined)
  }
}
