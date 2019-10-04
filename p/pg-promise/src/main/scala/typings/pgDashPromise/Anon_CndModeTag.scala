package typings.pgDashPromise

import typings.pgDashPromise.pgDashPromiseMod.TransactionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CndModeTag extends js.Object {
  var cnd: js.UndefOr[js.Any] = js.undefined
  var mode: js.UndefOr[TransactionMode | Null] = js.undefined
  var tag: js.UndefOr[js.Any] = js.undefined
}

object Anon_CndModeTag {
  @scala.inline
  def apply(cnd: js.Any = null, mode: TransactionMode = null, tag: js.Any = null): Anon_CndModeTag = {
    val __obj = js.Dynamic.literal()
    if (cnd != null) __obj.updateDynamic("cnd")(cnd)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[Anon_CndModeTag]
  }
}

