package typings.meteorDashCollectionDashHooks.CollectionHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalHookOptions extends js.Object {
  var all: js.UndefOr[HookOptionValue] = js.undefined
  var find: js.UndefOr[HookOptionValue] = js.undefined
  var findOne: js.UndefOr[HookOptionValue] = js.undefined
  var insert: js.UndefOr[HookOptionValue] = js.undefined
  var remove: js.UndefOr[HookOptionValue] = js.undefined
  var update: js.UndefOr[HookOptionValue] = js.undefined
  var upsert: js.UndefOr[HookOptionValue] = js.undefined
}

object LocalHookOptions {
  @scala.inline
  def apply(
    all: HookOptionValue = null,
    find: HookOptionValue = null,
    findOne: HookOptionValue = null,
    insert: HookOptionValue = null,
    remove: HookOptionValue = null,
    update: HookOptionValue = null,
    upsert: HookOptionValue = null
  ): LocalHookOptions = {
    val __obj = js.Dynamic.literal()
    if (all != null) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (find != null) __obj.updateDynamic("find")(find.asInstanceOf[js.Any])
    if (findOne != null) __obj.updateDynamic("findOne")(findOne.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(insert.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (upsert != null) __obj.updateDynamic("upsert")(upsert.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalHookOptions]
  }
}

