package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellHeight extends StObject {
  
  var cellHeight: js.UndefOr[Double] = js.undefined
  
  var cellMargin: js.UndefOr[Double] = js.undefined
  
  var cellPerRow: js.UndefOr[Double] = js.undefined
  
  var cellWidth: js.UndefOr[Double] = js.undefined
  
  var id: String
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var palette: js.UndefOr[js.Array[Any]] = js.undefined
  
  var value: String
}
object CellHeight {
  
  inline def apply(id: String, value: String): CellHeight = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellHeight]
  }
  
  extension [Self <: CellHeight](x: Self) {
    
    inline def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
    
    inline def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
    
    inline def setCellMargin(value: Double): Self = StObject.set(x, "cellMargin", value.asInstanceOf[js.Any])
    
    inline def setCellMarginUndefined: Self = StObject.set(x, "cellMargin", js.undefined)
    
    inline def setCellPerRow(value: Double): Self = StObject.set(x, "cellPerRow", value.asInstanceOf[js.Any])
    
    inline def setCellPerRowUndefined: Self = StObject.set(x, "cellPerRow", js.undefined)
    
    inline def setCellWidth(value: Double): Self = StObject.set(x, "cellWidth", value.asInstanceOf[js.Any])
    
    inline def setCellWidthUndefined: Self = StObject.set(x, "cellWidth", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPalette(value: js.Array[Any]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    inline def setPaletteVarargs(value: Any*): Self = StObject.set(x, "palette", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
