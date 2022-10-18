package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.anon.ColumnGap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsStackStackUtilsMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Stack/StackUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseGap(gap: String, theme: ITheme): ColumnGap = (^.asInstanceOf[js.Dynamic].applyDynamic("parseGap")(gap.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[ColumnGap]
  inline def parseGap(gap: Double, theme: ITheme): ColumnGap = (^.asInstanceOf[js.Dynamic].applyDynamic("parseGap")(gap.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[ColumnGap]
  inline def parseGap(gap: Unit, theme: ITheme): ColumnGap = (^.asInstanceOf[js.Dynamic].applyDynamic("parseGap")(gap.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[ColumnGap]
  
  inline def parsePadding(padding: String, theme: ITheme): js.UndefOr[String | Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePadding")(padding.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Double]]
  inline def parsePadding(padding: Double, theme: ITheme): js.UndefOr[String | Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePadding")(padding.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Double]]
  inline def parsePadding(padding: Unit, theme: ITheme): js.UndefOr[String | Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePadding")(padding.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Double]]
}
