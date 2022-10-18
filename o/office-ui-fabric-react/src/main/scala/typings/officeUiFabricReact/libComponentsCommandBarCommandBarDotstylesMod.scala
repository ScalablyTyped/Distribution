package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButtonStyles
import typings.officeUiFabricReact.libComponentsCommandBarCommandBarDottypesMod.ICommandBarStyleProps
import typings.officeUiFabricReact.libComponentsCommandBarCommandBarDottypesMod.ICommandBarStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCommandBarCommandBarDotstylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/CommandBar/CommandBar.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCommandButtonStyles(): IButtonStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommandButtonStyles")().asInstanceOf[IButtonStyles]
  inline def getCommandButtonStyles(customStyles: IButtonStyles): IButtonStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommandButtonStyles")(customStyles.asInstanceOf[js.Any]).asInstanceOf[IButtonStyles]
  
  inline def getStyles(props: ICommandBarStyleProps): ICommandBarStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ICommandBarStyles]
}
