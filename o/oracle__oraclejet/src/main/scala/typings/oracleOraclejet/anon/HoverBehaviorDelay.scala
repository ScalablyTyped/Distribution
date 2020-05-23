package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoverBehaviorDelay extends js.Object {
  var animationDuration: js.UndefOr[Double] = js.undefined
  var hoverBehaviorDelay: js.UndefOr[Double] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
}

object HoverBehaviorDelay {
  @scala.inline
  def apply(
    animationDuration: js.UndefOr[Double] = js.undefined,
    hoverBehaviorDelay: js.UndefOr[Double] = js.undefined,
    svgStyle: js.Object = null
  ): HoverBehaviorDelay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverBehaviorDelay)) __obj.updateDynamic("hoverBehaviorDelay")(hoverBehaviorDelay.get.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverBehaviorDelay]
  }
}

