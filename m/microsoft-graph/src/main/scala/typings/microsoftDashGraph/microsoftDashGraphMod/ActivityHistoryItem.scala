package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityHistoryItem extends Entity {
  /**
    * Optional. The duration of active user engagement. if not supplied, this is calculated from the startedDateTime and
    * lastActiveDateTime.
    */
  var activeDurationSeconds: js.UndefOr[Double] = js.undefined
  // Optional. NavigationProperty/Containment; navigation property to the associated activity.
  var activity: js.UndefOr[UserActivity] = js.undefined
  // Set by the server. DateTime in UTC when the object was created on the server.
  var createdDateTime: js.UndefOr[String] = js.undefined
  // Optional. UTC DateTime when the historyItem will undergo hard-delete. Can be set by the client.
  var expirationDateTime: js.UndefOr[String] = js.undefined
  /**
    * Optional. UTC DateTime when the historyItem (activity session) was last understood as active or finished - if null,
    * historyItem status should be Ongoing.
    */
  var lastActiveDateTime: js.UndefOr[String] = js.undefined
  // Set by the server. DateTime in UTC when the object was modified on the server.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  // Required. UTC DateTime when the historyItem (activity session) was started. Required for timeline history.
  var startedDateTime: js.UndefOr[String] = js.undefined
  // Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored.
  var status: js.UndefOr[Status] = js.undefined
  /**
    * Optional. The timezone in which the user's device used to generate the activity was located at activity creation time.
    * Values supplied as Olson IDs in order to support cross-platform representation.
    */
  var userTimezone: js.UndefOr[String] = js.undefined
}

object ActivityHistoryItem {
  @scala.inline
  def apply(
    activeDurationSeconds: Int | Double = null,
    activity: UserActivity = null,
    createdDateTime: String = null,
    expirationDateTime: String = null,
    id: String = null,
    lastActiveDateTime: String = null,
    lastModifiedDateTime: String = null,
    startedDateTime: String = null,
    status: Status = null,
    userTimezone: String = null
  ): ActivityHistoryItem = {
    val __obj = js.Dynamic.literal()
    if (activeDurationSeconds != null) __obj.updateDynamic("activeDurationSeconds")(activeDurationSeconds.asInstanceOf[js.Any])
    if (activity != null) __obj.updateDynamic("activity")(activity)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (expirationDateTime != null) __obj.updateDynamic("expirationDateTime")(expirationDateTime)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastActiveDateTime != null) __obj.updateDynamic("lastActiveDateTime")(lastActiveDateTime)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (startedDateTime != null) __obj.updateDynamic("startedDateTime")(startedDateTime)
    if (status != null) __obj.updateDynamic("status")(status)
    if (userTimezone != null) __obj.updateDynamic("userTimezone")(userTimezone)
    __obj.asInstanceOf[ActivityHistoryItem]
  }
}

