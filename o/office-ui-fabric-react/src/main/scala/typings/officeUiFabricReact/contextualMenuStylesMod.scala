package typings.officeUiFabricReact

import typings.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuStyleProps
import typings.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextualMenuStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IContextualMenuStyleProps): IContextualMenuStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IContextualMenuStyles]
}
