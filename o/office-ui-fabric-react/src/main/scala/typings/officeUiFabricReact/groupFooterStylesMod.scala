package typings.officeUiFabricReact

import typings.officeUiFabricReact.groupFooterTypesMod.IGroupFooterStyleProps
import typings.officeUiFabricReact.groupFooterTypesMod.IGroupFooterStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupFooterStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupFooter.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IGroupFooterStyleProps): IGroupFooterStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IGroupFooterStyles]
}
