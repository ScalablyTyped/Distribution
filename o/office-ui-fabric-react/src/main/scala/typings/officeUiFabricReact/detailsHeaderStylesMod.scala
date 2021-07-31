package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.CellStyleProps
import typings.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderStyleProps
import typings.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderStyles
import typings.uifabricMergeStyles.istyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detailsHeaderStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsHeader.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsHeader.styles", "HEADER_HEIGHT")
  @js.native
  val HEADER_HEIGHT: /* 42 */ Double = js.native
  
  @scala.inline
  def getCellStyles(props: CellStyleProps): IStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IStyle]
  
  @scala.inline
  def getStyles(props: IDetailsHeaderStyleProps): IDetailsHeaderStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDetailsHeaderStyles]
}
