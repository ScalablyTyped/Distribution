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
    labelLayout: js.Function2[
      atOracleOraclejetLib.ojdiagramMod.DvtDiagramLayoutContext, 
      atOracleOraclejetLib.ojdiagramMod.DvtDiagramLayoutContextLink, 
      atOracleOraclejetLib.ojdiagramDashUtilsMod.LabelLayout
    ],
    path: js.Function2[
      atOracleOraclejetLib.ojdiagramMod.DvtDiagramLayoutContext, 
      atOracleOraclejetLib.ojdiagramMod.DvtDiagramLayoutContextLink, 
      java.lang.String
    ]
  ): Anon_ContextLabelLayoutLink = {
    val __obj = js.Dynamic.literal(labelLayout = labelLayout, path = path)
  
    __obj.asInstanceOf[Anon_ContextLabelLayoutLink]
  }
}

