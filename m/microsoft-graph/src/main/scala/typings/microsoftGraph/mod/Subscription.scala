package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscription extends Entity {
  // Identifier of the application used to create the subscription. Read-only.
  var applicationId: js.UndefOr[String] = js.native
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
  var clientState: js.UndefOr[String] = js.native
  /**
    * Identifier of the user or service principal that created the subscription. If the app used delegated permissions to
    * create the subscription, this field contains the id of the signed-in user the app called on behalf of. If the app used
    * application permissions, this field contains the id of the service principal corresponding to the app. Read-only.
    */
  var creatorId: js.UndefOr[String] = js.native
  /**
    * Required. Specifies the date and time when the webhook subscription expires. The time is in UTC, and can be an amount
    * of time from subscription creation that varies for the resource subscribed to. See the table below for maximum
    * supported subscription length of time.
    */
  var expirationDateTime: js.UndefOr[String] = js.native
  /**
    * Specifies the latest version of Transport Layer Security (TLS) that the notification endpoint, specified by
    * notificationUrl, supports. The possible values are: v1_0, v1_1, v1_2, v1_3. For subscribers whose notification endpoint
    * supports a version lower than the currently recommended version (TLS 1.2), specifying this property by a set timeline
    * allows them to temporarily use their deprecated version of TLS before completing their upgrade to TLS 1.2. For these
    * subscribers, not setting this property per the timeline would result in subscription operations failing. For
    * subscribers whose notification endpoint already supports TLS 1.2, setting this property is optional. In such cases,
    * Microsoft Graph defaults the property to v1_2.
    */
  var latestSupportedTlsVersion: js.UndefOr[String] = js.native
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
    def setApplicationId(value: String): Self = this.set("applicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationId: Self = this.set("applicationId", js.undefined)
    @scala.inline
    def setChangeType(value: String): Self = this.set("changeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeType: Self = this.set("changeType", js.undefined)
    @scala.inline
    def setClientState(value: String): Self = this.set("clientState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientState: Self = this.set("clientState", js.undefined)
    @scala.inline
    def setCreatorId(value: String): Self = this.set("creatorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatorId: Self = this.set("creatorId", js.undefined)
    @scala.inline
    def setExpirationDateTime(value: String): Self = this.set("expirationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationDateTime: Self = this.set("expirationDateTime", js.undefined)
    @scala.inline
    def setLatestSupportedTlsVersion(value: String): Self = this.set("latestSupportedTlsVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestSupportedTlsVersion: Self = this.set("latestSupportedTlsVersion", js.undefined)
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

