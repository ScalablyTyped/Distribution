package typings.popmotionDashPose

import org.scalablytyped.runtime.StringDictionary
import typings.atPopmotionEasing.atPopmotionEasingMod.Easing
import typings.popmotionDashPose.libTypesMod.CubicBezierArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ease extends js.Object {
  var ease: js.UndefOr[Easing | js.Array[Easing] | StringDictionary[Easing] | String | CubicBezierArgs] = js.undefined
}

object Anon_Ease {
  @scala.inline
  def apply(ease: Easing | js.Array[Easing] | StringDictionary[Easing] | String | CubicBezierArgs = null): Anon_Ease = {
    val __obj = js.Dynamic.literal()
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Ease]
  }
}

