package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeNotification extends js.Object {
  
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
  implicit class ChangeNotificationOps[Self <: ChangeNotification] (val x: Self) extends AnyVal {
    
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
    def setChangeType(value: ChangeType): Self = this.set("changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeType: Self = this.set("changeType", js.undefined)
    
    @scala.inline
    def setClientState(value: NullableOption[String]): Self = this.set("clientState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientState: Self = this.set("clientState", js.undefined)
    
    @scala.inline
    def setClientStateNull: Self = this.set("clientState", null)
    
    @scala.inline
    def setEncryptedContent(value: NullableOption[ChangeNotificationEncryptedContent]): Self = this.set("encryptedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptedContent: Self = this.set("encryptedContent", js.undefined)
    
    @scala.inline
    def setEncryptedContentNull: Self = this.set("encryptedContent", null)
    
    @scala.inline
    def setId(value: NullableOption[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setLifecycleEvent(value: NullableOption[LifecycleEventType]): Self = this.set("lifecycleEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecycleEvent: Self = this.set("lifecycleEvent", js.undefined)
    
    @scala.inline
    def setLifecycleEventNull: Self = this.set("lifecycleEvent", null)
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setResourceData(value: NullableOption[ResourceData]): Self = this.set("resourceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceData: Self = this.set("resourceData", js.undefined)
    
    @scala.inline
    def setResourceDataNull: Self = this.set("resourceData", null)
    
    @scala.inline
    def setSubscriptionExpirationDateTime(value: String): Self = this.set("subscriptionExpirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionExpirationDateTime: Self = this.set("subscriptionExpirationDateTime", js.undefined)
    
    @scala.inline
    def setSubscriptionId(value: String): Self = this.set("subscriptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionId: Self = this.set("subscriptionId", js.undefined)
    
    @scala.inline
    def setTenantId(value: String): Self = this.set("tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenantId: Self = this.set("tenantId", js.undefined)
  }
}
