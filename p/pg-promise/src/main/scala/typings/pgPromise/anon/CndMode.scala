package typings.pgPromise.anon

import typings.pgPromise.mod.TransactionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CndMode extends js.Object {
  var cnd: js.UndefOr[js.Any] = js.undefined
  var mode: js.UndefOr[TransactionMode | Null] = js.undefined
  var tag: js.UndefOr[js.Any] = js.undefined
}

object CndMode {
  @scala.inline
  def apply(cnd: js.Any = null, mode: js.UndefOr[Null | TransactionMode] = js.undefined, tag: js.Any = null): CndMode = {
    val __obj = js.Dynamic.literal()
    if (cnd != null) __obj.updateDynamic("cnd")(cnd.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CndMode]
  }
}

