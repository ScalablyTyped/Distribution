package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends Entity {
  /** Identifier of the application used to create the subscription. Read-only. */
  var applicationId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Required. Indicates the type of change in the subscribed resource that will raise a notification. The supported values are: created, updated, deleted.
    * Multiple values can be combined using a comma-separated list.Note: Drive root item notifications support only the updated changeType.
    * User and group notifications support updated and deleted changeType.
    */
  var changeType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional. Specifies the value of the clientState property sent by the service in each notification. The maximum length is 128 characters.
    * The client can check that the notification came from the service by comparing the value of the clientState property sent with the subscription with the
    * value of the clientState property received with each notification.
    */
  var clientState: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifier of the user or service principal that created the subscription. If the app used delegated permissions to create the subscription,
    * this field contains the id of the signed-in user the app called on behalf of.
    * If the app used application permissions, this field contains the id of the service principal corresponding to the app. Read-only.
    */
  var creatorId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Required. Specifies the date and time when the webhook subscription expires.
    * The time is in UTC, and can be an amount of time from subscription creation that varies for the resource subscribed to.
    * See the table below for maximum supported subscription length of time.
    */
  var expirationDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Required. The URL of the endpoint that will receive the notifications. This URL must make use of the HTTPS protocol. */
  var notificationUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Required. Specifies the resource that will be monitored for changes. Do not include the base URL (https://graph.microsoft.com/v1.0/). */
  var resource: js.UndefOr[java.lang.String] = js.undefined
}

object Subscription {
  @scala.inline
  def apply(
    applicationId: java.lang.String = null,
    changeType: java.lang.String = null,
    clientState: java.lang.String = null,
    creatorId: java.lang.String = null,
    expirationDateTime: java.lang.String = null,
    id: java.lang.String = null,
    notificationUrl: java.lang.String = null,
    resource: java.lang.String = null
  ): Subscription = {
    val __obj = js.Dynamic.literal()
    if (applicationId != null) __obj.updateDynamic("applicationId")(applicationId)
    if (changeType != null) __obj.updateDynamic("changeType")(changeType)
    if (clientState != null) __obj.updateDynamic("clientState")(clientState)
    if (creatorId != null) __obj.updateDynamic("creatorId")(creatorId)
    if (expirationDateTime != null) __obj.updateDynamic("expirationDateTime")(expirationDateTime)
    if (id != null) __obj.updateDynamic("id")(id)
    if (notificationUrl != null) __obj.updateDynamic("notificationUrl")(notificationUrl)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[Subscription]
  }
}

