package typings.officeUiFabricReact.shimmerCircleTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShimmerCircleStyles extends js.Object {
  /**
    * Root of the ShimmerCircle component.
    */
  var root: js.UndefOr[IStyle] = js.native
  /**
    * Style for the circle SVG of the ShimmerCircle component.
    */
  var svg: js.UndefOr[IStyle] = js.native
}

object IShimmerCircleStyles {
  @scala.inline
  def apply(): IShimmerCircleStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShimmerCircleStyles]
  }
  @scala.inline
  implicit class IShimmerCircleStylesOps[Self <: IShimmerCircleStyles] (val x: Self) extends AnyVal {
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
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setSvg(value: IStyle): Self = this.set("svg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvg: Self = this.set("svg", js.undefined)
    @scala.inline
    def setSvgNull: Self = this.set("svg", null)
  }
  
}

