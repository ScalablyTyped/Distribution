package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateDefaultLineItemRequest extends StObject {
  
  /** Required. The display name of the line item. Must be UTF-8 encoded with a maximum size of 240 bytes. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Required. The unique ID of the insertion order that the line item belongs to. */
  var insertionOrderId: js.UndefOr[String] = js.undefined
  
  /** Required. The type of the line item. */
  var lineItemType: js.UndefOr[String] = js.undefined
  
  /**
    * The mobile app promoted by the line item. This is applicable only when line_item_type is either `LINE_ITEM_TYPE_DISPLAY_MOBILE_APP_INSTALL` or
    * `LINE_ITEM_TYPE_VIDEO_MOBILE_APP_INSTALL`.
    */
  var mobileApp: js.UndefOr[MobileApp] = js.undefined
}
object GenerateDefaultLineItemRequest {
  
  inline def apply(): GenerateDefaultLineItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateDefaultLineItemRequest]
  }
  
  extension [Self <: GenerateDefaultLineItemRequest](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setInsertionOrderId(value: String): Self = StObject.set(x, "insertionOrderId", value.asInstanceOf[js.Any])
    
    inline def setInsertionOrderIdUndefined: Self = StObject.set(x, "insertionOrderId", js.undefined)
    
    inline def setLineItemType(value: String): Self = StObject.set(x, "lineItemType", value.asInstanceOf[js.Any])
    
    inline def setLineItemTypeUndefined: Self = StObject.set(x, "lineItemType", js.undefined)
    
    inline def setMobileApp(value: MobileApp): Self = StObject.set(x, "mobileApp", value.asInstanceOf[js.Any])
    
    inline def setMobileAppUndefined: Self = StObject.set(x, "mobileApp", js.undefined)
  }
}
