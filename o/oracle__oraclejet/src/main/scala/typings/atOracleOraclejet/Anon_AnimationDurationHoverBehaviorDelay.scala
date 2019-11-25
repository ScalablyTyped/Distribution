package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationDurationHoverBehaviorDelay extends js.Object {
  var animationDuration: js.UndefOr[Double] = js.undefined
  var hoverBehaviorDelay: js.UndefOr[Double] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
}

object Anon_AnimationDurationHoverBehaviorDelay {
  @scala.inline
  def apply(
    animationDuration: Int | Double = null,
    hoverBehaviorDelay: Int | Double = null,
    svgStyle: js.Object = null
  ): Anon_AnimationDurationHoverBehaviorDelay = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (hoverBehaviorDelay != null) __obj.updateDynamic("hoverBehaviorDelay")(hoverBehaviorDelay.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnimationDurationHoverBehaviorDelay]
  }
}

