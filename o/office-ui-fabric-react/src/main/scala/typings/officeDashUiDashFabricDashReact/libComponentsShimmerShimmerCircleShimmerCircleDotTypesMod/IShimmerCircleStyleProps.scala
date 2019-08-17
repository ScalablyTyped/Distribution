package typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerCircleShimmerCircleDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IRawStyle
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimmerCircleStyleProps extends js.Object {
  /**
    * Styles to override borderStyles with custom ones.
    * @deprecated in favor of mergeStyles API.
    */
  var borderStyle: js.UndefOr[IRawStyle] = js.undefined
  /**
    * Needed to provide a height to the root of the control.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Theme values passed to the component.
    */
  var theme: ITheme
}

object IShimmerCircleStyleProps {
  @scala.inline
  def apply(theme: ITheme, borderStyle: IRawStyle = null, height: Int | Double = null): IShimmerCircleStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme)
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerCircleStyleProps]
  }
}

