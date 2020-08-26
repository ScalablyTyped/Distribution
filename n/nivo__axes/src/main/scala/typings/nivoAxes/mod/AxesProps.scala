package typings.nivoAxes.mod

import typings.nivoCore.mod.Dimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxesProps
  extends Dimensions
     with AxisPositions
     with Scales

object AxesProps {
  @scala.inline
  def apply(
    bottom: AxisProps,
    height: Double,
    left: AxisProps,
    right: AxisProps,
    top: AxisProps,
    width: Double
  ): AxesProps = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxesProps]
  }
}

