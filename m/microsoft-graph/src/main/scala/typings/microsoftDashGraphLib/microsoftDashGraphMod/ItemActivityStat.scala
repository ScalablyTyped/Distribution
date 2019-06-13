package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemActivityStat extends Entity {
  var access: js.UndefOr[ItemActionStat] = js.undefined
  var activities: js.UndefOr[js.Array[ItemActivity]] = js.undefined
  var create: js.UndefOr[ItemActionStat] = js.undefined
  var delete: js.UndefOr[ItemActionStat] = js.undefined
  var edit: js.UndefOr[ItemActionStat] = js.undefined
  var endDateTime: js.UndefOr[java.lang.String] = js.undefined
  var incompleteData: js.UndefOr[IncompleteData] = js.undefined
  var isTrending: js.UndefOr[scala.Boolean] = js.undefined
  var move: js.UndefOr[ItemActionStat] = js.undefined
  var startDateTime: js.UndefOr[java.lang.String] = js.undefined
}

object ItemActivityStat {
  @scala.inline
  def apply(
    access: ItemActionStat = null,
    activities: js.Array[ItemActivity] = null,
    create: ItemActionStat = null,
    delete: ItemActionStat = null,
    edit: ItemActionStat = null,
    endDateTime: java.lang.String = null,
    id: java.lang.String = null,
    incompleteData: IncompleteData = null,
    isTrending: js.UndefOr[scala.Boolean] = js.undefined,
    move: ItemActionStat = null,
    startDateTime: java.lang.String = null
  ): ItemActivityStat = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access)
    if (activities != null) __obj.updateDynamic("activities")(activities)
    if (create != null) __obj.updateDynamic("create")(create)
    if (delete != null) __obj.updateDynamic("delete")(delete)
    if (edit != null) __obj.updateDynamic("edit")(edit)
    if (endDateTime != null) __obj.updateDynamic("endDateTime")(endDateTime)
    if (id != null) __obj.updateDynamic("id")(id)
    if (incompleteData != null) __obj.updateDynamic("incompleteData")(incompleteData)
    if (!js.isUndefined(isTrending)) __obj.updateDynamic("isTrending")(isTrending)
    if (move != null) __obj.updateDynamic("move")(move)
    if (startDateTime != null) __obj.updateDynamic("startDateTime")(startDateTime)
    __obj.asInstanceOf[ItemActivityStat]
  }
}

