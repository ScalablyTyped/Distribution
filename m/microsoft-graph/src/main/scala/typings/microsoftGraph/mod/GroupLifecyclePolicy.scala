package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupLifecyclePolicy extends Entity {
  /**
    * List of email address to send notifications for groups without owners. Multiple email address can be defined by
    * separating email address with a semicolon.
    */
  var alternateNotificationEmails: js.UndefOr[String] = js.undefined
  /**
    * Number of days before a group expires and needs to be renewed. Once renewed, the group expiration is extended by the
    * number of days defined.
    */
  var groupLifetimeInDays: js.UndefOr[Double] = js.undefined
  // The group type for which the expiration policy applies. Possible values are All, Selected or None.
  var managedGroupTypes: js.UndefOr[String] = js.undefined
}

object GroupLifecyclePolicy {
  @scala.inline
  def apply(
    alternateNotificationEmails: String = null,
    groupLifetimeInDays: js.UndefOr[Double] = js.undefined,
    id: String = null,
    managedGroupTypes: String = null
  ): GroupLifecyclePolicy = {
    val __obj = js.Dynamic.literal()
    if (alternateNotificationEmails != null) __obj.updateDynamic("alternateNotificationEmails")(alternateNotificationEmails.asInstanceOf[js.Any])
    if (!js.isUndefined(groupLifetimeInDays)) __obj.updateDynamic("groupLifetimeInDays")(groupLifetimeInDays.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (managedGroupTypes != null) __obj.updateDynamic("managedGroupTypes")(managedGroupTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupLifecyclePolicy]
  }
}

