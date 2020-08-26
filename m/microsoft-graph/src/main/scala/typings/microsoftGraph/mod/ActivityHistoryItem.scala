package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityHistoryItem extends Entity {
  /**
    * Optional. The duration of active user engagement. if not supplied, this is calculated from the startedDateTime and
    * lastActiveDateTime.
    */
  var activeDurationSeconds: js.UndefOr[Double] = js.native
  // Optional. NavigationProperty/Containment; navigation property to the associated activity.
  var activity: js.UndefOr[UserActivity] = js.native
  // Set by the server. DateTime in UTC when the object was created on the server.
  var createdDateTime: js.UndefOr[String] = js.native
  // Optional. UTC DateTime when the historyItem will undergo hard-delete. Can be set by the client.
  var expirationDateTime: js.UndefOr[String] = js.native
  /**
    * Optional. UTC DateTime when the historyItem (activity session) was last understood as active or finished - if null,
    * historyItem status should be Ongoing.
    */
  var lastActiveDateTime: js.UndefOr[String] = js.native
  // Set by the server. DateTime in UTC when the object was modified on the server.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // Required. UTC DateTime when the historyItem (activity session) was started. Required for timeline history.
  var startedDateTime: js.UndefOr[String] = js.native
  // Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored.
  var status: js.UndefOr[Status] = js.native
  /**
    * Optional. The timezone in which the user's device used to generate the activity was located at activity creation time.
    * Values supplied as Olson IDs in order to support cross-platform representation.
    */
  var userTimezone: js.UndefOr[String] = js.native
}

object ActivityHistoryItem {
  @scala.inline
  def apply(): ActivityHistoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityHistoryItem]
  }
  @scala.inline
  implicit class ActivityHistoryItemOps[Self <: ActivityHistoryItem] (val x: Self) extends AnyVal {
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
    def setActiveDurationSeconds(value: Double): Self = this.set("activeDurationSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveDurationSeconds: Self = this.set("activeDurationSeconds", js.undefined)
    @scala.inline
    def setActivity(value: UserActivity): Self = this.set("activity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivity: Self = this.set("activity", js.undefined)
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    @scala.inline
    def setExpirationDateTime(value: String): Self = this.set("expirationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationDateTime: Self = this.set("expirationDateTime", js.undefined)
    @scala.inline
    def setLastActiveDateTime(value: String): Self = this.set("lastActiveDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastActiveDateTime: Self = this.set("lastActiveDateTime", js.undefined)
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    @scala.inline
    def setStartedDateTime(value: String): Self = this.set("startedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartedDateTime: Self = this.set("startedDateTime", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setUserTimezone(value: String): Self = this.set("userTimezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserTimezone: Self = this.set("userTimezone", js.undefined)
  }
  
}

