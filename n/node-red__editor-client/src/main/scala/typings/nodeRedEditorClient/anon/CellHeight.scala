package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellHeight extends StObject {
  
  var cellHeight: js.UndefOr[Double] = js.native
  
  var cellMargin: js.UndefOr[Double] = js.native
  
  var cellPerRow: js.UndefOr[Double] = js.native
  
  var cellWidth: js.UndefOr[Double] = js.native
  
  var id: String = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var palette: js.UndefOr[js.Array[js.Any]] = js.native
  
  var value: String = js.native
}
object CellHeight {
  
  @scala.inline
  def apply(id: String, value: String): CellHeight = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellHeight]
  }
  
  @scala.inline
  implicit class CellHeightMutableBuilder[Self <: CellHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
    
    @scala.inline
    def setCellMargin(value: Double): Self = StObject.set(x, "cellMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellMarginUndefined: Self = StObject.set(x, "cellMargin", js.undefined)
    
    @scala.inline
    def setCellPerRow(value: Double): Self = StObject.set(x, "cellPerRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellPerRowUndefined: Self = StObject.set(x, "cellPerRow", js.undefined)
    
    @scala.inline
    def setCellWidth(value: Double): Self = StObject.set(x, "cellWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellWidthUndefined: Self = StObject.set(x, "cellWidth", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPalette(value: js.Array[js.Any]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    @scala.inline
    def setPaletteVarargs(value: js.Any*): Self = StObject.set(x, "palette", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
