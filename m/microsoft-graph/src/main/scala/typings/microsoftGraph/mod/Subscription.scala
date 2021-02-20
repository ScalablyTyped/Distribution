package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: NullableOption[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationIdNull: Self = StObject.set(x, "applicationId", null)
    
    @scala.inline
    def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
    
    @scala.inline
    def setChangeType(value: String): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
    
    @scala.inline
    def setClientState(value: NullableOption[String]): Self = StObject.set(x, "clientState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientStateNull: Self = StObject.set(x, "clientState", null)
    
    @scala.inline
    def setClientStateUndefined: Self = StObject.set(x, "clientState", js.undefined)
    
    @scala.inline
    def setCreatorId(value: NullableOption[String]): Self = StObject.set(x, "creatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorIdNull: Self = StObject.set(x, "creatorId", null)
    
    @scala.inline
    def setCreatorIdUndefined: Self = StObject.set(x, "creatorId", js.undefined)
    
    @scala.inline
    def setEncryptionCertificate(value: NullableOption[String]): Self = StObject.set(x, "encryptionCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionCertificateId(value: NullableOption[String]): Self = StObject.set(x, "encryptionCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionCertificateIdNull: Self = StObject.set(x, "encryptionCertificateId", null)
    
    @scala.inline
    def setEncryptionCertificateIdUndefined: Self = StObject.set(x, "encryptionCertificateId", js.undefined)
    
    @scala.inline
    def setEncryptionCertificateNull: Self = StObject.set(x, "encryptionCertificate", null)
    
    @scala.inline
    def setEncryptionCertificateUndefined: Self = StObject.set(x, "encryptionCertificate", js.undefined)
    
    @scala.inline
    def setExpirationDateTime(value: String): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    @scala.inline
    def setIncludeResourceData(value: NullableOption[Boolean]): Self = StObject.set(x, "includeResourceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeResourceDataNull: Self = StObject.set(x, "includeResourceData", null)
    
    @scala.inline
    def setIncludeResourceDataUndefined: Self = StObject.set(x, "includeResourceData", js.undefined)
    
    @scala.inline
    def setLatestSupportedTlsVersion(value: NullableOption[String]): Self = StObject.set(x, "latestSupportedTlsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestSupportedTlsVersionNull: Self = StObject.set(x, "latestSupportedTlsVersion", null)
    
    @scala.inline
    def setLatestSupportedTlsVersionUndefined: Self = StObject.set(x, "latestSupportedTlsVersion", js.undefined)
    
    @scala.inline
    def setLifecycleNotificationUrl(value: NullableOption[String]): Self = StObject.set(x, "lifecycleNotificationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleNotificationUrlNull: Self = StObject.set(x, "lifecycleNotificationUrl", null)
    
    @scala.inline
    def setLifecycleNotificationUrlUndefined: Self = StObject.set(x, "lifecycleNotificationUrl", js.undefined)
    
    @scala.inline
    def setNotificationUrl(value: String): Self = StObject.set(x, "notificationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationUrlUndefined: Self = StObject.set(x, "notificationUrl", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
