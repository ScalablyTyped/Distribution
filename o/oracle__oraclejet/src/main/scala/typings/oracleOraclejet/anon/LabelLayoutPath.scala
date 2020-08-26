package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContext
import typings.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContextLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelLayoutPath extends js.Object {
  def labelLayout(context: DvtDiagramLayoutContext, link: DvtDiagramLayoutContextLink): typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout = js.native
  def path(context: DvtDiagramLayoutContext, link: DvtDiagramLayoutContextLink): String = js.native
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
  @scala.inline
  implicit class LabelLayoutPathOps[Self <: LabelLayoutPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLabelLayout(
      value: (DvtDiagramLayoutContext, DvtDiagramLayoutContextLink) => typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
    ): Self = this.set("labelLayout", js.Any.fromFunction2(value))
    @scala.inline
    def setPath(value: (DvtDiagramLayoutContext, DvtDiagramLayoutContextLink) => String): Self = this.set("path", js.Any.fromFunction2(value))
  }
  
}

