package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContext
import typings.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContextLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelLayoutPath extends js.Object {
  def labelLayout(context: DvtDiagramLayoutContext, link: DvtDiagramLayoutContextLink): typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
  def path(context: DvtDiagramLayoutContext, link: DvtDiagramLayoutContextLink): String
}

object LabelLayoutPath {
  @scala.inline
  def apply(
    labelLayout: (DvtDiagramLayoutContext, DvtDiagramLayoutContextLink) => typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout,
    path: (DvtDiagramLayoutContext, DvtDiagramLayoutContextLink) => String
  ): LabelLayoutPath = {
    val __obj = js.Dynamic.literal(labelLayout = js.Any.fromFunction2(labelLayout), path = js.Any.fromFunction2(path))
    __obj.asInstanceOf[LabelLayoutPath]
  }
}

