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
  
  @scala.inline
  def apply(field: String): ItemMoveChange = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMoveChange]
  }
  
  @scala.inline
  implicit class ItemMoveChangeMutableBuilder[Self <: ItemMoveChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange_by(value: Double): Self = StObject.set(x, "change_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChange_byUndefined: Self = StObject.set(x, "change_by", js.undefined)
    
    @scala.inline
    def setChange_by_max(value: Double): Self = StObject.set(x, "change_by_max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChange_by_maxUndefined: Self = StObject.set(x, "change_by_max", js.undefined)
    
    @scala.inline
    def setChange_by_percent(value: Double): Self = StObject.set(x, "change_by_percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChange_by_percentUndefined: Self = StObject.set(x, "change_by_percent", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
