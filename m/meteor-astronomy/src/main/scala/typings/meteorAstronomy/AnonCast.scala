package typings.meteorAstronomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCast extends js.Object {
  var cast: js.UndefOr[Boolean] = js.undefined
  @JSName("clone")
  var clone_FAnonCast: js.UndefOr[Boolean] = js.undefined
  var merge: js.UndefOr[Boolean] = js.undefined
}

object AnonCast {
  @scala.inline
  def apply(
    cast: js.UndefOr[Boolean] = js.undefined,
    clone: js.UndefOr[Boolean] = js.undefined,
    merge: js.UndefOr[Boolean] = js.undefined
  ): AnonCast = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cast)) __obj.updateDynamic("cast")(cast.asInstanceOf[js.Any])
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone.asInstanceOf[js.Any])
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCast]
  }
}

