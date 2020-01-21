package typings.officeUiFabricReact.shimmerTypesMod

import typings.officeUiFabricReact.officeUiFabricReactStrings.bottom
import typings.officeUiFabricReact.officeUiFabricReactStrings.center
import typings.officeUiFabricReact.officeUiFabricReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICircle extends IShimmerElement

object ICircle {
  @scala.inline
  def apply(
    `type`: ShimmerElementType,
    height: Int | Double = null,
    verticalAlign: top | center | bottom = null,
    width: Double | String = null
  ): ICircle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICircle]
  }
}

