package typings.officeUiFabricReact.shimmerCircleTypesMod

import typings.uifabricMergeStyles.istyleMod.IRawStyle
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShimmerCircleStyleProps extends js.Object {
  /**
    * Styles to override borderStyles with custom ones.
    * @deprecated in favor of mergeStyles API.
    */
  var borderStyle: js.UndefOr[IRawStyle] = js.native
  /**
    * Needed to provide a height to the root of the control.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Theme values passed to the component.
    */
  var theme: ITheme = js.native
}

object IShimmerCircleStyleProps {
  @scala.inline
  def apply(theme: ITheme): IShimmerCircleStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerCircleStyleProps]
  }
  @scala.inline
  implicit class IShimmerCircleStylePropsOps[Self <: IShimmerCircleStyleProps] (val x: Self) extends AnyVal {
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
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderStyle(value: IRawStyle): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderStyle: Self = this.set("borderStyle", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
  }
  
}

