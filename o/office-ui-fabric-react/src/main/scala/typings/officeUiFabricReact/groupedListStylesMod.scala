package typings.officeUiFabricReact

import typings.officeUiFabricReact.groupedListTypesMod.IGroupedListStyleProps
import typings.officeUiFabricReact.groupedListTypesMod.IGroupedListStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupedListStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedList.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IGroupedListStyleProps): IGroupedListStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IGroupedListStyles]
}
