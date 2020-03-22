package typings.oracleOraclejet

import typings.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContext
import typings.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContextLink
import typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelLayoutPath extends js.Object {
  def labelLayout(context: DvtDiagramLayoutContext, link: DvtDiagramLayoutContextLink): LabelLayout
  def path(context: DvtDiagramLayoutContext, link: DvtDiagramLayoutContextLink): String
}

object AnonLabelLayoutPath {
  @scala.inline
  def apply(
    labelLayout: (DvtDiagramLayoutContext, DvtDiagramLayoutContextLink) => LabelLayout,
    path: (DvtDiagramLayoutContext, DvtDiagramLayoutContextLink) => String
  ): AnonLabelLayoutPath = {
    val __obj = js.Dynamic.literal(labelLayout = js.Any.fromFunction2(labelLayout), path = js.Any.fromFunction2(path))
  
    __obj.asInstanceOf[AnonLabelLayoutPath]
  }
}

