package typings.pgPromise

import typings.pgPromise.mod.TransactionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCndMode extends js.Object {
  var cnd: js.UndefOr[js.Any] = js.undefined
  var mode: js.UndefOr[TransactionMode | Null] = js.undefined
  var tag: js.UndefOr[js.Any] = js.undefined
}

object AnonCndMode {
  @scala.inline
  def apply(cnd: js.Any = null, mode: TransactionMode = null, tag: js.Any = null): AnonCndMode = {
    val __obj = js.Dynamic.literal()
    if (cnd != null) __obj.updateDynamic("cnd")(cnd.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCndMode]
  }
}

