package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeNotification extends StObject {
  
  /**
    * Indicates the type of change that will raise the change notification. The supported values are: created, updated,
    * deleted. Required.
    */
  var changeType: js.UndefOr[ChangeType] = js.native
  
  /**
    * Value of the clientState property sent in the subscription request (if any). The maximum length is 255 characters. The
    * client can check whether the change notification came from the service by comparing the values of the clientState
    * property. The value of the clientState property sent with the subscription is compared with the value of the
    * clientState property received with each change notification. Optional.
    */
  var clientState: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * (Preview) Encrypted content attached with the change notification. Only provided if encryptionCertificate and
    * includeResourceData were defined during the subscription request and if the resource supports it. Optional.
    */
  var encryptedContent: js.UndefOr[NullableOption[ChangeNotificationEncryptedContent]] = js.native
  
  // Unique ID for the notification. Optional.
  var id: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The type of lifecycle notification if the current notification is a lifecycle notification. Optional. Supported values
    * are missed, removed, reauthorizationRequired.
    */
  var lifecycleEvent: js.UndefOr[NullableOption[LifecycleEventType]] = js.native
  
  // The URI of the resource that emitted the change notification relative to https://graph.microsoft.com. Required.
  var resource: js.UndefOr[String] = js.native
  
  // The content of this property depends on the type of resource being subscribed to. Required.
  var resourceData: js.UndefOr[NullableOption[ResourceData]] = js.native
  
  // The expiration time for the subscription. Required.
  var subscriptionExpirationDateTime: js.UndefOr[String] = js.native
  
  // The unique identifier of the subscription that generated the notification.
  var subscriptionId: js.UndefOr[String] = js.native
  
  // The unique identifier of the tenant from which the change notification originated.
  var tenantId: js.UndefOr[String] = js.native
}
object ChangeNotification {
  
  @scala.inline
  def apply(): ChangeNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeNotification]
  }
  
  @scala.inline
  implicit class ChangeNotificationMutableBuilder[Self <: ChangeNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeType(value: ChangeType): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
    
    @scala.inline
    def setClientState(value: NullableOption[String]): Self = StObject.set(x, "clientState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientStateNull: Self = StObject.set(x, "clientState", null)
    
    @scala.inline
    def setClientStateUndefined: Self = StObject.set(x, "clientState", js.undefined)
    
    @scala.inline
    def setEncryptedContent(value: NullableOption[ChangeNotificationEncryptedContent]): Self = StObject.set(x, "encryptedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedContentNull: Self = StObject.set(x, "encryptedContent", null)
    
    @scala.inline
    def setEncryptedContentUndefined: Self = StObject.set(x, "encryptedContent", js.undefined)
    
    @scala.inline
    def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLifecycleEvent(value: NullableOption[LifecycleEventType]): Self = StObject.set(x, "lifecycleEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleEventNull: Self = StObject.set(x, "lifecycleEvent", null)
    
    @scala.inline
    def setLifecycleEventUndefined: Self = StObject.set(x, "lifecycleEvent", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceData(value: NullableOption[ResourceData]): Self = StObject.set(x, "resourceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceDataNull: Self = StObject.set(x, "resourceData", null)
    
    @scala.inline
    def setResourceDataUndefined: Self = StObject.set(x, "resourceData", js.undefined)
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setSubscriptionExpirationDateTime(value: String): Self = StObject.set(x, "subscriptionExpirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionExpirationDateTimeUndefined: Self = StObject.set(x, "subscriptionExpirationDateTime", js.undefined)
    
    @scala.inline
    def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
    
    @scala.inline
    def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
