package typings.officeUiFabricReact

import typings.officeUiFabricReact.messageBarTypesMod.IMessageBarStyleProps
import typings.officeUiFabricReact.messageBarTypesMod.IMessageBarStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageBarStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/MessageBar/MessageBar.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IMessageBarStyleProps): IMessageBarStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IMessageBarStyles]
}
