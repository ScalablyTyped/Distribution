package typings.officeUiFabricReact

import typings.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typings.officeUiFabricReact.commandBarTypesMod.ICommandBarStyleProps
import typings.officeUiFabricReact.commandBarTypesMod.ICommandBarStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandBarStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/CommandBar/CommandBar.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getCommandButtonStyles(): IButtonStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommandButtonStyles")().asInstanceOf[IButtonStyles]
  @scala.inline
  def getCommandButtonStyles(customStyles: IButtonStyles): IButtonStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommandButtonStyles")(customStyles.asInstanceOf[js.Any]).asInstanceOf[IButtonStyles]
  
  @scala.inline
  def getStyles(props: ICommandBarStyleProps): ICommandBarStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ICommandBarStyles]
}
