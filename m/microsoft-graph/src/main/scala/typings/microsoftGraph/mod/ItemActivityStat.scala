package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemActivityStat extends Entity {
  // Statistics about the access actions in this interval. Read-only.
  var access: js.UndefOr[ItemActionStat] = js.undefined
  // Exposes the itemActivities represented in this itemActivityStat resource.
  var activities: js.UndefOr[js.Array[ItemActivity]] = js.undefined
  // Statistics about the create actions in this interval. Read-only.
  var create: js.UndefOr[ItemActionStat] = js.undefined
  // Statistics about the delete actions in this interval. Read-only.
  var delete: js.UndefOr[ItemActionStat] = js.undefined
  // Statistics about the edit actions in this interval. Read-only.
  var edit: js.UndefOr[ItemActionStat] = js.undefined
  // When the interval ends. Read-only.
  var endDateTime: js.UndefOr[String] = js.undefined
  // Indicates that the statistics in this interval are based on incomplete data. Read-only.
  var incompleteData: js.UndefOr[IncompleteData] = js.undefined
  // Indicates whether the item is 'trending.' Read-only.
  var isTrending: js.UndefOr[Boolean] = js.undefined
  // Statistics about the move actions in this interval. Read-only.
  var move: js.UndefOr[ItemActionStat] = js.undefined
  // When the interval starts. Read-only.
  var startDateTime: js.UndefOr[String] = js.undefined
}

object ItemActivityStat {
  @scala.inline
  def apply(
    access: ItemActionStat = null,
    activities: js.Array[ItemActivity] = null,
    create: ItemActionStat = null,
    delete: ItemActionStat = null,
    edit: ItemActionStat = null,
    endDateTime: String = null,
    id: String = null,
    incompleteData: IncompleteData = null,
    isTrending: js.UndefOr[Boolean] = js.undefined,
    move: ItemActionStat = null,
    startDateTime: String = null
  ): ItemActivityStat = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (activities != null) __obj.updateDynamic("activities")(activities.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (edit != null) __obj.updateDynamic("edit")(edit.asInstanceOf[js.Any])
    if (endDateTime != null) __obj.updateDynamic("endDateTime")(endDateTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (incompleteData != null) __obj.updateDynamic("incompleteData")(incompleteData.asInstanceOf[js.Any])
    if (!js.isUndefined(isTrending)) __obj.updateDynamic("isTrending")(isTrending.asInstanceOf[js.Any])
    if (move != null) __obj.updateDynamic("move")(move.asInstanceOf[js.Any])
    if (startDateTime != null) __obj.updateDynamic("startDateTime")(startDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemActivityStat]
  }
}

