package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupLifecyclePolicy extends Entity {
  /**
    * List of email address to send notifications for groups without owners. Multiple email address can be defined by
    * separating email address with a semicolon.
    */
  var alternateNotificationEmails: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of days before a group expires and needs to be renewed. Once renewed, the group expiration is extended by the
    * number of days defined.
    */
  var groupLifetimeInDays: js.UndefOr[scala.Double] = js.undefined
  // The group type for which the expiration policy applies. Possible values are All, Selected or None.
  var managedGroupTypes: js.UndefOr[java.lang.String] = js.undefined
}

object GroupLifecyclePolicy {
  @scala.inline
  def apply(
    alternateNotificationEmails: java.lang.String = null,
    groupLifetimeInDays: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    managedGroupTypes: java.lang.String = null
  ): GroupLifecyclePolicy = {
    val __obj = js.Dynamic.literal()
    if (alternateNotificationEmails != null) __obj.updateDynamic("alternateNotificationEmails")(alternateNotificationEmails)
    if (groupLifetimeInDays != null) __obj.updateDynamic("groupLifetimeInDays")(groupLifetimeInDays.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (managedGroupTypes != null) __obj.updateDynamic("managedGroupTypes")(managedGroupTypes)
    __obj.asInstanceOf[GroupLifecyclePolicy]
  }
}

