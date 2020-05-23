package typings.officeUiFabricReact.shimmerTypesMod

import typings.officeUiFabricReact.officeUiFabricReactStrings.bottom
import typings.officeUiFabricReact.officeUiFabricReactStrings.center
import typings.officeUiFabricReact.officeUiFabricReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGap extends IShimmerElement

object IGap {
  @scala.inline
  def apply(
    `type`: ShimmerElementType,
    height: js.UndefOr[Double] = js.undefined,
    verticalAlign: top | center | bottom = null,
    width: Double | String = null
  ): IGap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGap]
  }
}

