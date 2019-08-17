package typings.officeDashUiDashFabricDashReact.libComponentsFabricFabricDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFabricStyleProps extends IFabricProps {
  var isFocusVisible: Boolean
  @JSName("theme")
  var theme_IFabricStyleProps: ITheme
}

object IFabricStyleProps {
  @scala.inline
  def apply(isFocusVisible: Boolean, theme: ITheme, IFabricProps: IFabricProps = null): IFabricStyleProps = {
    val __obj = js.Dynamic.literal(isFocusVisible = isFocusVisible, theme = theme)
    js.Dynamic.global.Object.assign(__obj, IFabricProps)
    __obj.asInstanceOf[IFabricStyleProps]
  }
}

