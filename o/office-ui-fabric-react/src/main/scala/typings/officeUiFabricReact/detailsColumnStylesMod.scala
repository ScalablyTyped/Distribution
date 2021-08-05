package typings.officeUiFabricReact

import typings.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnStyleProps
import typings.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detailsColumnStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsColumn.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IDetailsColumnStyleProps): IDetailsColumnStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDetailsColumnStyles]
}
