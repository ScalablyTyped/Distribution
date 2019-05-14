package typings
package popmotionDashPoseLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoEase extends js.Object {
  var ease: js.UndefOr[scala.Nothing] = js.undefined
}

object NoEase {
  @scala.inline
  def apply(ease: js.UndefOr[scala.Nothing] = js.undefined): NoEase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ease)) __obj.updateDynamic("ease")(ease)
    __obj.asInstanceOf[NoEase]
  }
}

