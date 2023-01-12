package typings.nivoHeatmap.distTypesTypesMod

import typings.nivoCore.mod.CompleteTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellCanvasRendererProps[Datum /* <: HeatMapDatum */] extends StObject {
  
  var borderWidth: Double
  
  var cell: ComputedCell[Datum]
  
  var enableLabels: Boolean
  
  var theme: CompleteTheme
}
object CellCanvasRendererProps {
  
  inline def apply[Datum /* <: HeatMapDatum */](borderWidth: Double, cell: ComputedCell[Datum], enableLabels: Boolean, theme: CompleteTheme): CellCanvasRendererProps[Datum] = {
    val __obj = js.Dynamic.literal(borderWidth = borderWidth.asInstanceOf[js.Any], cell = cell.asInstanceOf[js.Any], enableLabels = enableLabels.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellCanvasRendererProps[Datum]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellCanvasRendererProps[?], Datum /* <: HeatMapDatum */] (val x: Self & CellCanvasRendererProps[Datum]) extends AnyVal {
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setCell(value: ComputedCell[Datum]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setEnableLabels(value: Boolean): Self = StObject.set(x, "enableLabels", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: CompleteTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
