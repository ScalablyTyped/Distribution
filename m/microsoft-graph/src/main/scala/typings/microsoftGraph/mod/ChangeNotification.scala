package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeNotification extends StObject {
  
  /**
    * Indicates the type of change that will raise the change notification. The supported values are: created, updated,
    * deleted. Required.
    */
  var changeType: js.UndefOr[ChangeType] = js.undefined
  
  /**
    * Value of the clientState property sent in the subscription request (if any). The maximum length is 255 characters. The
    * client can check whether the change notification came from the service by comparing the values of the clientState
    * property. The value of the clientState property sent with the subscription is compared with the value of the
    * clientState property received with each change notification. Optional.
    */
  var clientState: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * (Preview) Encrypted content attached with the change notification. Only provided if encryptionCertificate and
    * includeResourceData were defined during the subscription request and if the resource supports it. Optional.
    */
  var encryptedContent: js.UndefOr[NullableOption[ChangeNotificationEncryptedContent]] = js.undefined
  
  // Unique ID for the notification. Optional.
  var id: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The type of lifecycle notification if the current notification is a lifecycle notification. Optional. Supported values
    * are missed, removed, reauthorizationRequired.
    */
  var lifecycleEvent: js.UndefOr[NullableOption[LifecycleEventType]] = js.undefined
  
  // The URI of the resource that emitted the change notification relative to https://graph.microsoft.com. Required.
  var resource: js.UndefOr[String] = js.undefined
  
  // The content of this property depends on the type of resource being subscribed to. Required.
  var resourceData: js.UndefOr[NullableOption[ResourceData]] = js.undefined
  
  // The expiration time for the subscription. Required.
  var subscriptionExpirationDateTime: js.UndefOr[String] = js.undefined
  
  // The unique identifier of the subscription that generated the notification.
  var subscriptionId: js.UndefOr[String] = js.undefined
  
  // The unique identifier of the tenant from which the change notification originated.
  var tenantId: js.UndefOr[String] = js.undefined
}
object ChangeNotification {
  
  inline def apply(): ChangeNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeNotification]
  }
  
  extension [Self <: ChangeNotification](x: Self) {
    
    inline def setChangeType(value: ChangeType): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
    
    inline def setClientState(value: NullableOption[String]): Self = StObject.set(x, "clientState", value.asInstanceOf[js.Any])
    
    inline def setClientStateNull: Self = StObject.set(x, "clientState", null)
    
    inline def setClientStateUndefined: Self = StObject.set(x, "clientState", js.undefined)
    
    inline def setEncryptedContent(value: NullableOption[ChangeNotificationEncryptedContent]): Self = StObject.set(x, "encryptedContent", value.asInstanceOf[js.Any])
    
    inline def setEncryptedContentNull: Self = StObject.set(x, "encryptedContent", null)
    
    inline def setEncryptedContentUndefined: Self = StObject.set(x, "encryptedContent", js.undefined)
    
    inline def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLifecycleEvent(value: NullableOption[LifecycleEventType]): Self = StObject.set(x, "lifecycleEvent", value.asInstanceOf[js.Any])
    
    inline def setLifecycleEventNull: Self = StObject.set(x, "lifecycleEvent", null)
    
    inline def setLifecycleEventUndefined: Self = StObject.set(x, "lifecycleEvent", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceData(value: NullableOption[ResourceData]): Self = StObject.set(x, "resourceData", value.asInstanceOf[js.Any])
    
    inline def setResourceDataNull: Self = StObject.set(x, "resourceData", null)
    
    inline def setResourceDataUndefined: Self = StObject.set(x, "resourceData", js.undefined)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setSubscriptionExpirationDateTime(value: String): Self = StObject.set(x, "subscriptionExpirationDateTime", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionExpirationDateTimeUndefined: Self = StObject.set(x, "subscriptionExpirationDateTime", js.undefined)
    
    inline def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
