package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojdiagramDashUtilsMod.LabelLayout
import typings.atOracleOraclejet.ojdiagramMod.DvtDiagramLayoutContext
import typings.atOracleOraclejet.ojdiagramMod.DvtDiagramLayoutContextLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextLabelLayoutLink extends js.Object {
  def labelLayout(context: DvtDiagramLayoutContext, link: DvtDiagramLayoutContextLink): LabelLayout
  def path(context: DvtDiagramLayoutContext, link: DvtDiagramLayoutContextLink): String
}

object Anon_ContextLabelLayoutLink {
  @scala.inline
  def apply(
    labelLayout: (DvtDiagramLayoutContext, DvtDiagramLayoutContextLink) => LabelLayout,
    path: (DvtDiagramLayoutContext, DvtDiagramLayoutContextLink) => String
  ): Anon_ContextLabelLayoutLink = {
    val __obj = js.Dynamic.literal(labelLayout = js.Any.fromFunction2(labelLayout), path = js.Any.fromFunction2(path))
  
    __obj.asInstanceOf[Anon_ContextLabelLayoutLink]
  }
}

