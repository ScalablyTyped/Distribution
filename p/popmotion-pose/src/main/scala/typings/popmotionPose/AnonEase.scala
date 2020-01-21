package typings.popmotionPose

import org.scalablytyped.runtime.StringDictionary
import typings.popmotionEasing.mod.Easing
import typings.popmotionPose.typesMod.CubicBezierArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEase extends js.Object {
  var ease: js.UndefOr[Easing | js.Array[Easing] | StringDictionary[Easing] | String | CubicBezierArgs] = js.undefined
}

object AnonEase {
  @scala.inline
  def apply(ease: Easing | js.Array[Easing] | StringDictionary[Easing] | String | CubicBezierArgs = null): AnonEase = {
    val __obj = js.Dynamic.literal()
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEase]
  }
}

