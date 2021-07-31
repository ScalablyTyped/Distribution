package typings.officeUiFabricReact

import typings.officeUiFabricReact.detailsListTypesMod.IDetailsListStyleProps
import typings.officeUiFabricReact.detailsListTypesMod.IDetailsListStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detailsListStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IDetailsListStyleProps): IDetailsListStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDetailsListStyles]
}
