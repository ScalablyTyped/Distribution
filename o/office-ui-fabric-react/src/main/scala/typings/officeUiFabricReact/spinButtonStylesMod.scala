package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.anon.PartialIButtonStyles
import typings.officeUiFabricReact.anon.PartialISpinButtonStyles
import typings.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typings.officeUiFabricReact.spinButtonTypesMod.ISpinButtonStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spinButtonStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton.styles", "getArrowButtonStyles")
  @js.native
  def getArrowButtonStyles(theme: ITheme, isUpArrow: Boolean): IButtonStyles = js.native
  @JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton.styles", "getArrowButtonStyles")
  @js.native
  def getArrowButtonStyles(theme: ITheme, isUpArrow: Boolean, customSpecificArrowStyles: PartialIButtonStyles): IButtonStyles = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton.styles", "getStyles")
  @js.native
  def getStyles(theme: ITheme): ISpinButtonStyles = js.native
  @JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton.styles", "getStyles")
  @js.native
  def getStyles(theme: ITheme, customStyles: PartialISpinButtonStyles): ISpinButtonStyles = js.native
}
