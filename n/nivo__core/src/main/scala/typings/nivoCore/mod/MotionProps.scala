package typings.nivoCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  animate  :boolean,   motionDamping  :number,   motionStiffness  :number}> */
trait MotionProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var motionDamping: js.UndefOr[Double] = js.undefined
  var motionStiffness: js.UndefOr[Double] = js.undefined
}

object MotionProps {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    motionDamping: js.UndefOr[Double] = js.undefined,
    motionStiffness: js.UndefOr[Double] = js.undefined
  ): MotionProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(motionDamping)) __obj.updateDynamic("motionDamping")(motionDamping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(motionStiffness)) __obj.updateDynamic("motionStiffness")(motionStiffness.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotionProps]
  }
}

