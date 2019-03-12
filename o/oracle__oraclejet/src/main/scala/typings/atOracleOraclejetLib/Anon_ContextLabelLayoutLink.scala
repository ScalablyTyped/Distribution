package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextLabelLayoutLink extends js.Object {
  def labelLayout(
    context: atOracleOraclejetLib.ojdiagramMod.DvtDiagramLayoutContext,
    link: atOracleOraclejetLib.ojdiagramMod.DvtDiagramLayoutContextLink
  ): atOracleOraclejetLib.ojdiagramDashUtilsMod.LabelLayout
  def path(
    context: atOracleOraclejetLib.ojdiagramMod.DvtDiagramLayoutContext,
    link: atOracleOraclejetLib.ojdiagramMod.DvtDiagramLayoutContextLink
  ): java.lang.String
}

object Anon_ContextLabelLayoutLink {
  @scala.inline
  def apply(
    labelLayout: (atOracleOraclejetLib.ojdiagramMod.DvtDiagramLayoutContext, atOracleOraclejetLib.ojdiagramMod.DvtDiagramLayoutContextLink) => atOracleOraclejetLib.ojdiagramDashUtilsMod.LabelLayout,
    path: (atOracleOraclejetLib.ojdiagramMod.DvtDiagramLayoutContext, atOracleOraclejetLib.ojdiagramMod.DvtDiagramLayoutContextLink) => java.lang.String
  ): Anon_ContextLabelLayoutLink = {
    val __obj = js.Dynamic.literal(labelLayout = js.Any.fromFunction2(labelLayout), path = js.Any.fromFunction2(path))
  
    __obj.asInstanceOf[Anon_ContextLabelLayoutLink]
  }
}

