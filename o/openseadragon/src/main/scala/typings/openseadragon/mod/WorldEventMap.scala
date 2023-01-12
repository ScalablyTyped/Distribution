package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorldEventMap extends StObject {
  
  var `add-item`: AddItemWorldEvent
  
  var `item-index-change`: ItemIndexChangeWorldEvent
  
  var `metrics-change`: WorldEvent
  
  var `remove-item`: RemoveItemWorldEvent
}
object WorldEventMap {
  
  inline def apply(
    `add-item`: AddItemWorldEvent,
    `item-index-change`: ItemIndexChangeWorldEvent,
    `metrics-change`: WorldEvent,
    `remove-item`: RemoveItemWorldEvent
  ): WorldEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add-item")(`add-item`.asInstanceOf[js.Any])
    __obj.updateDynamic("item-index-change")(`item-index-change`.asInstanceOf[js.Any])
    __obj.updateDynamic("metrics-change")(`metrics-change`.asInstanceOf[js.Any])
    __obj.updateDynamic("remove-item")(`remove-item`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorldEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorldEventMap] (val x: Self) extends AnyVal {
    
    inline def `setAdd-item`(value: AddItemWorldEvent): Self = StObject.set(x, "add-item", value.asInstanceOf[js.Any])
    
    inline def `setItem-index-change`(value: ItemIndexChangeWorldEvent): Self = StObject.set(x, "item-index-change", value.asInstanceOf[js.Any])
    
    inline def `setMetrics-change`(value: WorldEvent): Self = StObject.set(x, "metrics-change", value.asInstanceOf[js.Any])
    
    inline def `setRemove-item`(value: RemoveItemWorldEvent): Self = StObject.set(x, "remove-item", value.asInstanceOf[js.Any])
  }
}
