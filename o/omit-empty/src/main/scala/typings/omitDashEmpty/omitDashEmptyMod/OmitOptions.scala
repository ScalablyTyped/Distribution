package typings.omitDashEmpty.omitDashEmptyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OmitOptions extends js.Object {
  var omitZero: js.UndefOr[Boolean] = js.undefined
}

object OmitOptions {
  @scala.inline
  def apply(omitZero: js.UndefOr[Boolean] = js.undefined): OmitOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(omitZero)) __obj.updateDynamic("omitZero")(omitZero.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitOptions]
  }
}

