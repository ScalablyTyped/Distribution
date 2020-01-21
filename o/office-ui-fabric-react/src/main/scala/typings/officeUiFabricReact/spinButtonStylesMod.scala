package typings.officeUiFabricReact

import typings.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typings.officeUiFabricReact.spinButtonTypesMod.ISpinButtonStyles
import typings.std.Partial
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton.styles", JSImport.Namespace)
@js.native
object spinButtonStylesMod extends js.Object {
  def getArrowButtonStyles(theme: ITheme, isUpArrow: Boolean): IButtonStyles = js.native
  def getArrowButtonStyles(theme: ITheme, isUpArrow: Boolean, customSpecificArrowStyles: Partial[IButtonStyles]): IButtonStyles = js.native
  def getStyles(theme: ITheme): ISpinButtonStyles = js.native
  def getStyles(theme: ITheme, customStyles: Partial[ISpinButtonStyles]): ISpinButtonStyles = js.native
}

