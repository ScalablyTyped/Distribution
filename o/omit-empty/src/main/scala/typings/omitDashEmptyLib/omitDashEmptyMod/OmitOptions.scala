package typings
package omitDashEmptyLib.omitDashEmptyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OmitOptions extends js.Object {
  var omitZero: js.UndefOr[scala.Boolean] = js.undefined
}

object OmitOptions {
  @scala.inline
  def apply(omitZero: js.UndefOr[scala.Boolean] = js.undefined): OmitOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(omitZero)) __obj.updateDynamic("omitZero")(omitZero)
    __obj.asInstanceOf[OmitOptions]
  }
}

