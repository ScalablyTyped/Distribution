package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContext
import typings.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContextLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelLayoutPath extends StObject {
  
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
  implicit class LabelLayoutPathMutableBuilder[Self <: LabelLayoutPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelLayout(
      value: (DvtDiagramLayoutContext, DvtDiagramLayoutContextLink) => typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
    ): Self = StObject.set(x, "labelLayout", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPath(value: (DvtDiagramLayoutContext, DvtDiagramLayoutContextLink) => String): Self = StObject.set(x, "path", js.Any.fromFunction2(value))
  }
}
