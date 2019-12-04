package typings.officeDashUiDashFabricDashReact

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.IButtonStyles
import typings.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonDotTypesMod.ISpinButtonStyles
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton.styles", JSImport.Namespace)
@js.native
object libComponentsSpinButtonSpinButtonDotStylesMod extends js.Object {
  def getArrowButtonStyles(theme: ITheme, isUpArrow: Boolean): IButtonStyles = js.native
  def getArrowButtonStyles(theme: ITheme, isUpArrow: Boolean, customSpecificArrowStyles: Partial[IButtonStyles]): IButtonStyles = js.native
  def getStyles(theme: ITheme): ISpinButtonStyles = js.native
  def getStyles(theme: ITheme, customStyles: Partial[ISpinButtonStyles]): ISpinButtonStyles = js.native
}

