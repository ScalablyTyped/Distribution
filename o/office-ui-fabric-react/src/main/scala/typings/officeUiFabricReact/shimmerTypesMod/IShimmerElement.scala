package typings.officeUiFabricReact.shimmerTypesMod

import typings.officeUiFabricReact.officeUiFabricReactStrings.bottom
import typings.officeUiFabricReact.officeUiFabricReactStrings.center
import typings.officeUiFabricReact.officeUiFabricReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShimmerElement extends js.Object {
  /**
    * Sets the height of the element (ICircle, ILine, IGap) in pixels.
    * Read more details for each specific element.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Represents the possible type of the shimmer elements: Gap, Circle, Line.
    * Required for every element you intend to use.
    */
  var `type`: ShimmerElementType = js.native
  /**
    * Sets vertical alignment of the element (ICircle, ILine).
    * @defaultvalue center
    */
  var verticalAlign: js.UndefOr[top | center | bottom] = js.native
  /**
    * Sets the width value of the element (ILine, IGap) in pixels.
    * Read more details for each specific element.
    */
  var width: js.UndefOr[Double | String] = js.native
}

object IShimmerElement {
  @scala.inline
  def apply(`type`: ShimmerElementType): IShimmerElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerElement]
  }
  @scala.inline
  implicit class IShimmerElementOps[Self <: IShimmerElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: ShimmerElementType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setVerticalAlign(value: top | center | bottom): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

