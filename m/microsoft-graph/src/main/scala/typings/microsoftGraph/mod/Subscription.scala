package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends Entity {
  // Identifier of the application used to create the subscription. Read-only.
  var applicationId: js.UndefOr[String] = js.undefined
  /**
    * Required. Indicates the type of change in the subscribed resource that will raise a notification. The supported values
    * are: created, updated, deleted. Multiple values can be combined using a comma-separated list.Note: Drive root item
    * notifications support only the updated changeType. User and group notifications support updated and deleted changeType.
    */
  var changeType: js.UndefOr[String] = js.undefined
  /**
    * Optional. Specifies the value of the clientState property sent by the service in each notification. The maximum length
    * is 128 characters. The client can check that the notification came from the service by comparing the value of the
    * clientState property sent with the subscription with the value of the clientState property received with each
    * notification.
    */
  var clientState: js.UndefOr[String] = js.undefined
  /**
    * Identifier of the user or service principal that created the subscription. If the app used delegated permissions to
    * create the subscription, this field contains the id of the signed-in user the app called on behalf of. If the app used
    * application permissions, this field contains the id of the service principal corresponding to the app. Read-only.
    */
  var creatorId: js.UndefOr[String] = js.undefined
  /**
    * Required. Specifies the date and time when the webhook subscription expires. The time is in UTC, and can be an amount
    * of time from subscription creation that varies for the resource subscribed to. See the table below for maximum
    * supported subscription length of time.
    */
  var expirationDateTime: js.UndefOr[String] = js.undefined
  // Required. The URL of the endpoint that will receive the notifications. This URL must make use of the HTTPS protocol.
  var notificationUrl: js.UndefOr[String] = js.undefined
  /**
    * Required. Specifies the resource that will be monitored for changes. Do not include the base URL
    * (https://graph.microsoft.com/v1.0/).
    */
  var resource: js.UndefOr[String] = js.undefined
}

object Subscription {
  @scala.inline
  def apply(
    applicationId: String = null,
    changeType: String = null,
    clientState: String = null,
    creatorId: String = null,
    expirationDateTime: String = null,
    id: String = null,
    notificationUrl: String = null,
    resource: String = null
  ): Subscription = {
    val __obj = js.Dynamic.literal()
    if (applicationId != null) __obj.updateDynamic("applicationId")(applicationId.asInstanceOf[js.Any])
    if (changeType != null) __obj.updateDynamic("changeType")(changeType.asInstanceOf[js.Any])
    if (clientState != null) __obj.updateDynamic("clientState")(clientState.asInstanceOf[js.Any])
    if (creatorId != null) __obj.updateDynamic("creatorId")(creatorId.asInstanceOf[js.Any])
    if (expirationDateTime != null) __obj.updateDynamic("expirationDateTime")(expirationDateTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (notificationUrl != null) __obj.updateDynamic("notificationUrl")(notificationUrl.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
}

