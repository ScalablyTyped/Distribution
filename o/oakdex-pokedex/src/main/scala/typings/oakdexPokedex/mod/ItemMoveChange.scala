package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemMoveChange extends StObject {
  
  var change_by: js.UndefOr[Double] = js.undefined
  
  var change_by_max: js.UndefOr[Double] = js.undefined
  
  var change_by_percent: js.UndefOr[Double] = js.undefined
  
  var field: String
}
object ItemMoveChange {
  
  inline def apply(field: String): ItemMoveChange = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMoveChange]
  }
  
  extension [Self <: ItemMoveChange](x: Self) {
    
    inline def setChange_by(value: Double): Self = StObject.set(x, "change_by", value.asInstanceOf[js.Any])
    
    inline def setChange_byUndefined: Self = StObject.set(x, "change_by", js.undefined)
    
    inline def setChange_by_max(value: Double): Self = StObject.set(x, "change_by_max", value.asInstanceOf[js.Any])
    
    inline def setChange_by_maxUndefined: Self = StObject.set(x, "change_by_max", js.undefined)
    
    inline def setChange_by_percent(value: Double): Self = StObject.set(x, "change_by_percent", value.asInstanceOf[js.Any])
    
    inline def setChange_by_percentUndefined: Self = StObject.set(x, "change_by_percent", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
