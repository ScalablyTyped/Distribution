package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1UserEvent extends StObject {
  
  /** Optional. User event detailed information common across different recommendation types. */
  var eventDetail: js.UndefOr[GoogleCloudRecommendationengineV1beta1EventDetail] = js.undefined
  
  /** Optional. This field should *not* be set when using JavaScript pixel or the Recommendations AI Tag. Defaults to `EVENT_SOURCE_UNSPECIFIED`. */
  var eventSource: js.UndefOr[String] = js.undefined
  
  /** Optional. Only required for ImportUserEvents method. Timestamp of user event created. */
  var eventTime: js.UndefOr[String] = js.undefined
  
  /**
    * Required. User event type. Allowed values are: * `add-to-cart` Products being added to cart. * `add-to-list` Items being added to a list (shopping list, favorites etc). *
    * `category-page-view` Special pages such as sale or promotion pages viewed. * `checkout-start` User starting a checkout process. * `detail-page-view` Products detail page viewed. *
    * `home-page-view` Homepage viewed. * `page-visit` Generic page visits not included in the event types above. * `purchase-complete` User finishing a purchase. * `refund` Purchased
    * items being refunded or returned. * `remove-from-cart` Products being removed from cart. * `remove-from-list` Items being removed from a list. * `search` Product search. *
    * `shopping-cart-page-view` User viewing a shopping cart. * `impression` List of items displayed. Used by Google Tag Manager.
    */
  var eventType: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Retail product specific user event metadata. This field is required for the following event types: * `add-to-cart` * `add-to-list` * `category-page-view` *
    * `checkout-start` * `detail-page-view` * `purchase-complete` * `refund` * `remove-from-cart` * `remove-from-list` * `search` This field is optional for the following event types: *
    * `page-visit` * `shopping-cart-page-view` - note that 'product_event_detail' should be set for this unless the shopping cart is empty. This field is not allowed for the following
    * event types: * `home-page-view`
    */
  var productEventDetail: js.UndefOr[GoogleCloudRecommendationengineV1beta1ProductEventDetail] = js.undefined
  
  /** Required. User information. */
  var userInfo: js.UndefOr[GoogleCloudRecommendationengineV1beta1UserInfo] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1UserEvent {
  
  inline def apply(): GoogleCloudRecommendationengineV1beta1UserEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1UserEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1UserEvent] (val x: Self) extends AnyVal {
    
    inline def setEventDetail(value: GoogleCloudRecommendationengineV1beta1EventDetail): Self = StObject.set(x, "eventDetail", value.asInstanceOf[js.Any])
    
    inline def setEventDetailUndefined: Self = StObject.set(x, "eventDetail", js.undefined)
    
    inline def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
    
    inline def setEventSourceUndefined: Self = StObject.set(x, "eventSource", js.undefined)
    
    inline def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    inline def setProductEventDetail(value: GoogleCloudRecommendationengineV1beta1ProductEventDetail): Self = StObject.set(x, "productEventDetail", value.asInstanceOf[js.Any])
    
    inline def setProductEventDetailUndefined: Self = StObject.set(x, "productEventDetail", js.undefined)
    
    inline def setUserInfo(value: GoogleCloudRecommendationengineV1beta1UserInfo): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    inline def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
  }
}
