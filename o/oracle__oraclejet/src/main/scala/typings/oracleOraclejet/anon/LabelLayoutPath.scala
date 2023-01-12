package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContext
import typings.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContextLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelLayoutPath extends StObject {
  
  def labelLayout(context: DvtDiagramLayoutContext, link: DvtDiagramLayoutContextLink): typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
  
  def path(context: DvtDiagramLayoutContext, link: DvtDiagramLayoutContextLink): String
}
object LabelLayoutPath {
  
  inline def apply(
    labelLayout: (DvtDiagramLayoutContext, DvtDiagramLayoutContextLink) => typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout,
    path: (DvtDiagramLayoutContext, DvtDiagramLayoutContextLink) => String
  ): LabelLayoutPath = {
    val __obj = js.Dynamic.literal(labelLayout = js.Any.fromFunction2(labelLayout), path = js.Any.fromFunction2(path))
    __obj.asInstanceOf[LabelLayoutPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelLayoutPath] (val x: Self) extends AnyVal {
    
    inline def setLabelLayout(
      value: (DvtDiagramLayoutContext, DvtDiagramLayoutContextLink) => typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
    ): Self = StObject.set(x, "labelLayout", js.Any.fromFunction2(value))
    
    inline def setPath(value: (DvtDiagramLayoutContext, DvtDiagramLayoutContextLink) => String): Self = StObject.set(x, "path", js.Any.fromFunction2(value))
  }
}
