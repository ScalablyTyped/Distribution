package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupLifecyclePolicy extends Entity {
  /**
    * List of email address to send notifications for groups without owners. Multiple email address can be defined by
    * separating email address with a semicolon.
    */
  var alternateNotificationEmails: js.UndefOr[String] = js.native
  /**
    * Number of days before a group expires and needs to be renewed. Once renewed, the group expiration is extended by the
    * number of days defined.
    */
  var groupLifetimeInDays: js.UndefOr[Double] = js.native
  // The group type for which the expiration policy applies. Possible values are All, Selected or None.
  var managedGroupTypes: js.UndefOr[String] = js.native
}

object GroupLifecyclePolicy {
  @scala.inline
  def apply(): GroupLifecyclePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupLifecyclePolicy]
  }
  @scala.inline
  implicit class GroupLifecyclePolicyOps[Self <: GroupLifecyclePolicy] (val x: Self) extends AnyVal {
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
    def setAlternateNotificationEmails(value: String): Self = this.set("alternateNotificationEmails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternateNotificationEmails: Self = this.set("alternateNotificationEmails", js.undefined)
    @scala.inline
    def setGroupLifetimeInDays(value: Double): Self = this.set("groupLifetimeInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupLifetimeInDays: Self = this.set("groupLifetimeInDays", js.undefined)
    @scala.inline
    def setManagedGroupTypes(value: String): Self = this.set("managedGroupTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedGroupTypes: Self = this.set("managedGroupTypes", js.undefined)
  }
  
}

