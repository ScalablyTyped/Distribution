package typings.officeUiFabricReact

import typings.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneStyleProps
import typings.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollablePaneStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ScrollablePane/ScrollablePane.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IScrollablePaneStyleProps): IScrollablePaneStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IScrollablePaneStyles]
}
