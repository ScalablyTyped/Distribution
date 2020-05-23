package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.ColumnGap
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Stack/StackUtils", JSImport.Namespace)
@js.native
object stackUtilsMod extends js.Object {
  def parseGap(gap: js.UndefOr[Double | String], theme: ITheme): ColumnGap = js.native
  def parsePadding(padding: js.UndefOr[Double | String], theme: ITheme): js.UndefOr[String | Double] = js.native
}

