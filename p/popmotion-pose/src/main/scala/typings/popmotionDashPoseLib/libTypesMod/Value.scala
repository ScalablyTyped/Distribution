package typings
package popmotionDashPoseLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var raw: popmotionLib.popmotionMod.ValueReaction
  var `type`: js.UndefOr[styleDashValueDashTypesLib.libTypesMod.ValueType] = js.undefined
}

object Value {
  @scala.inline
  def apply(
    raw: popmotionLib.popmotionMod.ValueReaction,
    `type`: styleDashValueDashTypesLib.libTypesMod.ValueType = null
  ): Value = {
    val __obj = js.Dynamic.literal(raw = raw)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Value]
  }
}

