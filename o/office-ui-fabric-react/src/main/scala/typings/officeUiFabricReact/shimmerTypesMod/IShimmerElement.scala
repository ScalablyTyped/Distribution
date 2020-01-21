package typings.officeUiFabricReact.shimmerTypesMod

import typings.officeUiFabricReact.officeUiFabricReactStrings.bottom
import typings.officeUiFabricReact.officeUiFabricReactStrings.center
import typings.officeUiFabricReact.officeUiFabricReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimmerElement extends js.Object {
  /**
    * Sets the height of the element (ICircle, ILine, IGap) in pixels.
    * Read more details for each specific element.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Represents the possible type of the shimmer elements: Gap, Circle, Line.
    * Required for every element you intend to use.
    */
  var `type`: ShimmerElementType
  /**
    * Sets vertical alignment of the element (ICircle, ILine).
    * @defaultvalue center
    */
  var verticalAlign: js.UndefOr[top | center | bottom] = js.undefined
  /**
    * Sets the width value of the element (ILine, IGap) in pixels.
    * Read more details for each specific element.
    */
  var width: js.UndefOr[Double | String] = js.undefined
}

object IShimmerElement {
  @scala.inline
  def apply(
    `type`: ShimmerElementType,
    height: Int | Double = null,
    verticalAlign: top | center | bottom = null,
    width: Double | String = null
  ): IShimmerElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerElement]
  }
}

