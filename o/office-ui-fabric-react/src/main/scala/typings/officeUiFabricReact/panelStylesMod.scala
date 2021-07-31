package typings.officeUiFabricReact

import typings.officeUiFabricReact.panelTypesMod.IPanelStyleProps
import typings.officeUiFabricReact.panelTypesMod.IPanelStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Panel/Panel.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IPanelStyleProps): IPanelStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IPanelStyles]
}
