package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.anon.ColumnGap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Stack/StackUtils", JSImport.Namespace)
@js.native
object stackUtilsMod extends js.Object {
  
  def parseGap(gap: js.UndefOr[scala.Nothing], theme: ITheme): ColumnGap = js.native
  def parseGap(gap: String, theme: ITheme): ColumnGap = js.native
  def parseGap(gap: Double, theme: ITheme): ColumnGap = js.native
  
  def parsePadding(padding: js.UndefOr[scala.Nothing], theme: ITheme): js.UndefOr[String | Double] = js.native
  def parsePadding(padding: String, theme: ITheme): js.UndefOr[String | Double] = js.native
  def parsePadding(padding: Double, theme: ITheme): js.UndefOr[String | Double] = js.native
}
