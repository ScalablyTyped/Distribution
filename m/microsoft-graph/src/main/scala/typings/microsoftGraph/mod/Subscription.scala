package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription
  extends StObject
     with Entity {
  
  // Optional. Identifier of the application used to create the subscription. Read-only.
  var applicationId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Required. Indicates the type of change in the subscribed resource that will raise a change notification. The supported
    * values are: created, updated, deleted. Multiple values can be combined using a comma-separated list. Note: Drive root
    * item and list change notifications support only the updated changeType. User and group change notifications support
    * updated and deleted changeType.
    */
  var changeType: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Specifies the value of the clientState property sent by the service in each change notification. The maximum
    * length is 128 characters. The client can check that the change notification came from the service by comparing the
    * value of the clientState property sent with the subscription with the value of the clientState property received with
    * each change notification.
    */
  var clientState: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Optional. Identifier of the user or service principal that created the subscription. If the app used delegated
    * permissions to create the subscription, this field contains the id of the signed-in user the app called on behalf of.
    * If the app used application permissions, this field contains the id of the service principal corresponding to the app.
    * Read-only.
    */
  var creatorId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Optional. A base64-encoded representation of a certificate with a public key used to encrypt resource data in change
    * notifications. Optional but required when includeResourceData is true.
    */
  var encryptionCertificate: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Optional. A custom app-provided identifier to help identify the certificate needed to decrypt resource data.
  var encryptionCertificateId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Required. Specifies the date and time when the webhook subscription expires. The time is in UTC, and can be an amount
    * of time from subscription creation that varies for the resource subscribed to. For the maximum supported subscription
    * length of time, see the table below.
    */
  var expirationDateTime: js.UndefOr[String] = js.undefined
  
  // Optional. When set to true, change notifications include resource data (such as content of a chat message).
  var includeResourceData: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Optional. Specifies the latest version of Transport Layer Security (TLS) that the notification endpoint, specified by
    * notificationUrl, supports. The possible values are: v1_0, v1_1, v1_2, v1_3. For subscribers whose notification endpoint
    * supports a version lower than the currently recommended version (TLS 1.2), specifying this property by a set timeline
    * allows them to temporarily use their deprecated version of TLS before completing their upgrade to TLS 1.2. For these
    * subscribers, not setting this property per the timeline would result in subscription operations failing. For
    * subscribers whose notification endpoint already supports TLS 1.2, setting this property is optional. In such cases,
    * Microsoft Graph defaults the property to v1_2.
    */
  var latestSupportedTlsVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Optional. The URL of the endpoint that receives lifecycle notifications, including subscriptionRemoved and missed
    * notifications. This URL must make use of the HTTPS protocol.
    */
  var lifecycleNotificationUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Optional. OData query options for specifying value for the targeting resource. Clients receive notifications when
    * resource reaches the state matching the query options provided here. With this new property in the subscription
    * creation payload along with all existing properties, Webhooks will deliver notifications whenever a resource reaches
    * the desired state mentioned in the notificationQueryOptions property. For example, when the print job is completed or
    * when a print job resource isFetchable property value becomes true etc.
    */
  var notificationQueryOptions: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Required. The URL of the endpoint that will receive the change notifications. This URL must make use of the HTTPS
    * protocol.
    */
  var notificationUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The app ID that the subscription service can use to generate the validation token. This allows the client to
    * validate the authenticity of the notification received.
    */
  var notificationUrlAppId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Required. Specifies the resource that will be monitored for changes. Do not include the base URL
    * (https://graph.microsoft.com/v1.0/). See the possible resource path values for each supported resource.
    */
  var resource: js.UndefOr[String] = js.undefined
}
object Subscription {
  
  inline def apply(): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: NullableOption[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdNull: Self = StObject.set(x, "applicationId", null)
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
    
    inline def setChangeType(value: String): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
    
    inline def setClientState(value: NullableOption[String]): Self = StObject.set(x, "clientState", value.asInstanceOf[js.Any])
    
    inline def setClientStateNull: Self = StObject.set(x, "clientState", null)
    
    inline def setClientStateUndefined: Self = StObject.set(x, "clientState", js.undefined)
    
    inline def setCreatorId(value: NullableOption[String]): Self = StObject.set(x, "creatorId", value.asInstanceOf[js.Any])
    
    inline def setCreatorIdNull: Self = StObject.set(x, "creatorId", null)
    
    inline def setCreatorIdUndefined: Self = StObject.set(x, "creatorId", js.undefined)
    
    inline def setEncryptionCertificate(value: NullableOption[String]): Self = StObject.set(x, "encryptionCertificate", value.asInstanceOf[js.Any])
    
    inline def setEncryptionCertificateId(value: NullableOption[String]): Self = StObject.set(x, "encryptionCertificateId", value.asInstanceOf[js.Any])
    
    inline def setEncryptionCertificateIdNull: Self = StObject.set(x, "encryptionCertificateId", null)
    
    inline def setEncryptionCertificateIdUndefined: Self = StObject.set(x, "encryptionCertificateId", js.undefined)
    
    inline def setEncryptionCertificateNull: Self = StObject.set(x, "encryptionCertificate", null)
    
    inline def setEncryptionCertificateUndefined: Self = StObject.set(x, "encryptionCertificate", js.undefined)
    
    inline def setExpirationDateTime(value: String): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    inline def setIncludeResourceData(value: NullableOption[Boolean]): Self = StObject.set(x, "includeResourceData", value.asInstanceOf[js.Any])
    
    inline def setIncludeResourceDataNull: Self = StObject.set(x, "includeResourceData", null)
    
    inline def setIncludeResourceDataUndefined: Self = StObject.set(x, "includeResourceData", js.undefined)
    
    inline def setLatestSupportedTlsVersion(value: NullableOption[String]): Self = StObject.set(x, "latestSupportedTlsVersion", value.asInstanceOf[js.Any])
    
    inline def setLatestSupportedTlsVersionNull: Self = StObject.set(x, "latestSupportedTlsVersion", null)
    
    inline def setLatestSupportedTlsVersionUndefined: Self = StObject.set(x, "latestSupportedTlsVersion", js.undefined)
    
    inline def setLifecycleNotificationUrl(value: NullableOption[String]): Self = StObject.set(x, "lifecycleNotificationUrl", value.asInstanceOf[js.Any])
    
    inline def setLifecycleNotificationUrlNull: Self = StObject.set(x, "lifecycleNotificationUrl", null)
    
    inline def setLifecycleNotificationUrlUndefined: Self = StObject.set(x, "lifecycleNotificationUrl", js.undefined)
    
    inline def setNotificationQueryOptions(value: NullableOption[String]): Self = StObject.set(x, "notificationQueryOptions", value.asInstanceOf[js.Any])
    
    inline def setNotificationQueryOptionsNull: Self = StObject.set(x, "notificationQueryOptions", null)
    
    inline def setNotificationQueryOptionsUndefined: Self = StObject.set(x, "notificationQueryOptions", js.undefined)
    
    inline def setNotificationUrl(value: String): Self = StObject.set(x, "notificationUrl", value.asInstanceOf[js.Any])
    
    inline def setNotificationUrlAppId(value: NullableOption[String]): Self = StObject.set(x, "notificationUrlAppId", value.asInstanceOf[js.Any])
    
    inline def setNotificationUrlAppIdNull: Self = StObject.set(x, "notificationUrlAppId", null)
    
    inline def setNotificationUrlAppIdUndefined: Self = StObject.set(x, "notificationUrlAppId", js.undefined)
    
    inline def setNotificationUrlUndefined: Self = StObject.set(x, "notificationUrl", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
