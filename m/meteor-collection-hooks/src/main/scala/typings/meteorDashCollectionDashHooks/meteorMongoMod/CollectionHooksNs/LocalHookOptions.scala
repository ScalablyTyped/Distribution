package typings.meteorDashCollectionDashHooks.meteorMongoMod.CollectionHooksNs

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
    if (all != null) __obj.updateDynamic("all")(all)
    if (find != null) __obj.updateDynamic("find")(find)
    if (findOne != null) __obj.updateDynamic("findOne")(findOne)
    if (insert != null) __obj.updateDynamic("insert")(insert)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (update != null) __obj.updateDynamic("update")(update)
    if (upsert != null) __obj.updateDynamic("upsert")(upsert)
    __obj.asInstanceOf[LocalHookOptions]
  }
}

