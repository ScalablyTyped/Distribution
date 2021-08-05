package typings.officeUiFabricReact

import typings.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderStyleProps
import typings.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupHeaderStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupHeader.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IGroupHeaderStyleProps): IGroupHeaderStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IGroupHeaderStyles]
}
