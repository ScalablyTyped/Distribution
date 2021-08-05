package typings.officeUiFabricReact

import typings.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsRowCheckStyleProps
import typings.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsRowCheckStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detailsRowCheckStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsRowCheck.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsRowCheck.styles", "CHECK_CELL_WIDTH")
  @js.native
  val CHECK_CELL_WIDTH: /* 48 */ Double = js.native
  
  inline def getStyles(props: IDetailsRowCheckStyleProps): IDetailsRowCheckStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDetailsRowCheckStyles]
}
