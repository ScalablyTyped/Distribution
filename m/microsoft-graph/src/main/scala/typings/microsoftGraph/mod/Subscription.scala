package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscription extends Entity {
  
  // Identifier of the application used to create the subscription. Read-only.
  var applicationId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Required. Indicates the type of change in the subscribed resource that will raise a change notification. The supported
    * values are: created, updated, deleted. Multiple values can be combined using a comma-separated list.Note: Drive root
    * item and list change notifications support only the updated changeType. User and group change notifications support
    * updated and deleted changeType.
    */
  var changeType: js.UndefOr[String] = js.native
  
  /**
    * Optional. Specifies the value of the clientState property sent by the service in each change notification. The maximum
    * length is 128 characters. The client can check that the change notification came from the service by comparing the
    * value of the clientState property sent with the subscription with the value of the clientState property received with
    * each change notification.
    */
  var clientState: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Identifier of the user or service principal that created the subscription. If the app used delegated permissions to
    * create the subscription, this field contains the id of the signed-in user the app called on behalf of. If the app used
    * application permissions, this field contains the id of the service principal corresponding to the app. Read-only.
    */
  var creatorId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * A base64-encoded representation of a certificate with a public key used to encrypt resource data in change
    * notifications. Optional. Required when includeResourceData is true.
    */
  var encryptionCertificate: js.UndefOr[NullableOption[String]] = js.native
  
  // A custom app-provided identifier to help identify the certificate needed to decrypt resource data. Optional.
  var encryptionCertificateId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Required. Specifies the date and time when the webhook subscription expires. The time is in UTC, and can be an amount
    * of time from subscription creation that varies for the resource subscribed to. See the table below for maximum
    * supported subscription length of time.
    */
  var expirationDateTime: js.UndefOr[String] = js.native
  
  // When set to true, change notifications include resource data (such as content of a chat message). Optional.
  var includeResourceData: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Specifies the latest version of Transport Layer Security (TLS) that the notification endpoint, specified by
    * notificationUrl, supports. The possible values are: v1_0, v1_1, v1_2, v1_3. For subscribers whose notification endpoint
    * supports a version lower than the currently recommended version (TLS 1.2), specifying this property by a set timeline
    * allows them to temporarily use their deprecated version of TLS before completing their upgrade to TLS 1.2. For these
    * subscribers, not setting this property per the timeline would result in subscription operations failing. For
    * subscribers whose notification endpoint already supports TLS 1.2, setting this property is optional. In such cases,
    * Microsoft Graph defaults the property to v1_2.
    */
  var latestSupportedTlsVersion: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The URL of the endpoint that receives lifecycle notifications, including subscriptionRemoved and missed notifications.
    * This URL must make use of the HTTPS protocol. Optional. Read more about how Outlook resources use lifecycle
    * notifications.
    */
  var lifecycleNotificationUrl: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Required. The URL of the endpoint that will receive the change notifications. This URL must make use of the HTTPS
    * protocol.
    */
  var notificationUrl: js.UndefOr[String] = js.native
  
  /**
    * Required. Specifies the resource that will be monitored for changes. Do not include the base URL
    * (https://graph.microsoft.com/v1.0/). See the possible resource path values for each supported resource.
    */
  var resource: js.UndefOr[String] = js.native
}
object Subscription {
  
  @scala.inline
  def apply(): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
    
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
    def setApplicationId(value: NullableOption[String]): Self = this.set("applicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationId: Self = this.set("applicationId", js.undefined)
    
    @scala.inline
    def setApplicationIdNull: Self = this.set("applicationId", null)
    
    @scala.inline
    def setChangeType(value: String): Self = this.set("changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeType: Self = this.set("changeType", js.undefined)
    
    @scala.inline
    def setClientState(value: NullableOption[String]): Self = this.set("clientState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientState: Self = this.set("clientState", js.undefined)
    
    @scala.inline
    def setClientStateNull: Self = this.set("clientState", null)
    
    @scala.inline
    def setCreatorId(value: NullableOption[String]): Self = this.set("creatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatorId: Self = this.set("creatorId", js.undefined)
    
    @scala.inline
    def setCreatorIdNull: Self = this.set("creatorId", null)
    
    @scala.inline
    def setEncryptionCertificate(value: NullableOption[String]): Self = this.set("encryptionCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionCertificate: Self = this.set("encryptionCertificate", js.undefined)
    
    @scala.inline
    def setEncryptionCertificateNull: Self = this.set("encryptionCertificate", null)
    
    @scala.inline
    def setEncryptionCertificateId(value: NullableOption[String]): Self = this.set("encryptionCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionCertificateId: Self = this.set("encryptionCertificateId", js.undefined)
    
    @scala.inline
    def setEncryptionCertificateIdNull: Self = this.set("encryptionCertificateId", null)
    
    @scala.inline
    def setExpirationDateTime(value: String): Self = this.set("expirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDateTime: Self = this.set("expirationDateTime", js.undefined)
    
    @scala.inline
    def setIncludeResourceData(value: NullableOption[Boolean]): Self = this.set("includeResourceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeResourceData: Self = this.set("includeResourceData", js.undefined)
    
    @scala.inline
    def setIncludeResourceDataNull: Self = this.set("includeResourceData", null)
    
    @scala.inline
    def setLatestSupportedTlsVersion(value: NullableOption[String]): Self = this.set("latestSupportedTlsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestSupportedTlsVersion: Self = this.set("latestSupportedTlsVersion", js.undefined)
    
    @scala.inline
    def setLatestSupportedTlsVersionNull: Self = this.set("latestSupportedTlsVersion", null)
    
    @scala.inline
    def setLifecycleNotificationUrl(value: NullableOption[String]): Self = this.set("lifecycleNotificationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecycleNotificationUrl: Self = this.set("lifecycleNotificationUrl", js.undefined)
    
    @scala.inline
    def setLifecycleNotificationUrlNull: Self = this.set("lifecycleNotificationUrl", null)
    
    @scala.inline
    def setNotificationUrl(value: String): Self = this.set("notificationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationUrl: Self = this.set("notificationUrl", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
}
