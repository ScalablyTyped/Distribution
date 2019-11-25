package typings.pgDashPromise

import typings.pgDashPromise.pgDashPromiseMod.isolationLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Deferrable extends js.Object {
  var deferrable: js.UndefOr[Boolean] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var tiLevel: js.UndefOr[isolationLevel] = js.undefined
}

object Anon_Deferrable {
  @scala.inline
  def apply(
    deferrable: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    tiLevel: isolationLevel = null
  ): Anon_Deferrable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deferrable)) __obj.updateDynamic("deferrable")(deferrable.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (tiLevel != null) __obj.updateDynamic("tiLevel")(tiLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Deferrable]
  }
}

