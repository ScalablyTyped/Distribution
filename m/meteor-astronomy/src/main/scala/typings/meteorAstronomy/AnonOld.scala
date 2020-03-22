package typings.meteorAstronomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOld extends js.Object {
  var old: js.UndefOr[Boolean] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
}

object AnonOld {
  @scala.inline
  def apply(old: js.UndefOr[Boolean] = js.undefined, raw: js.UndefOr[Boolean] = js.undefined): AnonOld = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(old)) __obj.updateDynamic("old")(old.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOld]
  }
}

