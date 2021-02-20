package typings.openseadragon.anon

import typings.openseadragon.openseadragonStrings.horizontal
import typings.openseadragon.openseadragonStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Columns extends StObject {
  
  var columns: js.UndefOr[Double] = js.native
  
  var immediately: js.UndefOr[Boolean] = js.native
  
  var layout: js.UndefOr[horizontal | vertical] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  var tileMargin: js.UndefOr[Double] = js.native
  
  var tileSize: js.UndefOr[Double] = js.native
}
object Columns {
  
  @scala.inline
  def apply(): Columns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Columns]
  }
  
  @scala.inline
  implicit class ColumnsMutableBuilder[Self <: Columns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setImmediately(value: Boolean): Self = StObject.set(x, "immediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmediatelyUndefined: Self = StObject.set(x, "immediately", js.undefined)
    
    @scala.inline
    def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setTileMargin(value: Double): Self = StObject.set(x, "tileMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileMarginUndefined: Self = StObject.set(x, "tileMargin", js.undefined)
    
    @scala.inline
    def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
  }
}
