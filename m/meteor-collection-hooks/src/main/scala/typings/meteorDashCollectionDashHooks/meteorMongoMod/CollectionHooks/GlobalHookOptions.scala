package typings.meteorDashCollectionDashHooks.meteorMongoMod.CollectionHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalHookOptions extends js.Object {
  var after: js.UndefOr[LocalHookOptions] = js.undefined
  var all: js.UndefOr[LocalHookOptions] = js.undefined
  var before: js.UndefOr[LocalHookOptions] = js.undefined
}

object GlobalHookOptions {
  @scala.inline
  def apply(after: LocalHookOptions = null, all: LocalHookOptions = null, before: LocalHookOptions = null): GlobalHookOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (all != null) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalHookOptions]
  }
}

