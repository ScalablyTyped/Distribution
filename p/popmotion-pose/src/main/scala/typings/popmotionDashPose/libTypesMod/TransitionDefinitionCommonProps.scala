package typings.popmotionDashPose.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionDefinitionCommonProps extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var round: js.UndefOr[Boolean] = js.undefined
}

object TransitionDefinitionCommonProps {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    round: js.UndefOr[Boolean] = js.undefined
  ): TransitionDefinitionCommonProps = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinitionCommonProps]
  }
}

