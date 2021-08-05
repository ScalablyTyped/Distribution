package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bulkloadedcursorinsertcalls extends StObject {
  
  var `bulk-loaded cursor-insert calls`: Double
  
  var `create calls`: Double
  
  var `cursor-insert key and value bytes inserted`: Double
  
  var `cursor-remove key bytes removed`: Double
  
  var `cursor-update value bytes updated`: Double
  
  var `insert calls`: Double
  
  var `next calls`: Double
  
  var `prev calls`: Double
  
  var `remove calls`: Double
  
  var `reset calls`: Double
  
  var `restarted searches`: Double
  
  var `search calls`: Double
  
  var `search near calls`: Double
  
  var `truncate calls`: Double
  
  var `update calls`: Double
}
object Bulkloadedcursorinsertcalls {
  
  inline def apply(
    `bulk-loaded cursor-insert calls`: Double,
    `create calls`: Double,
    `cursor-insert key and value bytes inserted`: Double,
    `cursor-remove key bytes removed`: Double,
    `cursor-update value bytes updated`: Double,
    `insert calls`: Double,
    `next calls`: Double,
    `prev calls`: Double,
    `remove calls`: Double,
    `reset calls`: Double,
    `restarted searches`: Double,
    `search calls`: Double,
    `search near calls`: Double,
    `truncate calls`: Double,
    `update calls`: Double
  ): Bulkloadedcursorinsertcalls = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bulk-loaded cursor-insert calls")((`bulk-loaded cursor-insert calls`).asInstanceOf[js.Any])
    __obj.updateDynamic("create calls")((`create calls`).asInstanceOf[js.Any])
    __obj.updateDynamic("cursor-insert key and value bytes inserted")((`cursor-insert key and value bytes inserted`).asInstanceOf[js.Any])
    __obj.updateDynamic("cursor-remove key bytes removed")((`cursor-remove key bytes removed`).asInstanceOf[js.Any])
    __obj.updateDynamic("cursor-update value bytes updated")((`cursor-update value bytes updated`).asInstanceOf[js.Any])
    __obj.updateDynamic("insert calls")((`insert calls`).asInstanceOf[js.Any])
    __obj.updateDynamic("next calls")((`next calls`).asInstanceOf[js.Any])
    __obj.updateDynamic("prev calls")((`prev calls`).asInstanceOf[js.Any])
    __obj.updateDynamic("remove calls")((`remove calls`).asInstanceOf[js.Any])
    __obj.updateDynamic("reset calls")((`reset calls`).asInstanceOf[js.Any])
    __obj.updateDynamic("restarted searches")((`restarted searches`).asInstanceOf[js.Any])
    __obj.updateDynamic("search calls")((`search calls`).asInstanceOf[js.Any])
    __obj.updateDynamic("search near calls")((`search near calls`).asInstanceOf[js.Any])
    __obj.updateDynamic("truncate calls")((`truncate calls`).asInstanceOf[js.Any])
    __obj.updateDynamic("update calls")((`update calls`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Bulkloadedcursorinsertcalls]
  }
  
  extension [Self <: Bulkloadedcursorinsertcalls](x: Self) {
    
    inline def `setBulk-loaded cursor-insert calls`(value: Double): Self = StObject.set(x, "bulk-loaded cursor-insert calls", value.asInstanceOf[js.Any])
    
    inline def `setCreate calls`(value: Double): Self = StObject.set(x, "create calls", value.asInstanceOf[js.Any])
    
    inline def `setCursor-insert key and value bytes inserted`(value: Double): Self = StObject.set(x, "cursor-insert key and value bytes inserted", value.asInstanceOf[js.Any])
    
    inline def `setCursor-remove key bytes removed`(value: Double): Self = StObject.set(x, "cursor-remove key bytes removed", value.asInstanceOf[js.Any])
    
    inline def `setCursor-update value bytes updated`(value: Double): Self = StObject.set(x, "cursor-update value bytes updated", value.asInstanceOf[js.Any])
    
    inline def `setInsert calls`(value: Double): Self = StObject.set(x, "insert calls", value.asInstanceOf[js.Any])
    
    inline def `setNext calls`(value: Double): Self = StObject.set(x, "next calls", value.asInstanceOf[js.Any])
    
    inline def `setPrev calls`(value: Double): Self = StObject.set(x, "prev calls", value.asInstanceOf[js.Any])
    
    inline def `setRemove calls`(value: Double): Self = StObject.set(x, "remove calls", value.asInstanceOf[js.Any])
    
    inline def `setReset calls`(value: Double): Self = StObject.set(x, "reset calls", value.asInstanceOf[js.Any])
    
    inline def `setRestarted searches`(value: Double): Self = StObject.set(x, "restarted searches", value.asInstanceOf[js.Any])
    
    inline def `setSearch calls`(value: Double): Self = StObject.set(x, "search calls", value.asInstanceOf[js.Any])
    
    inline def `setSearch near calls`(value: Double): Self = StObject.set(x, "search near calls", value.asInstanceOf[js.Any])
    
    inline def `setTruncate calls`(value: Double): Self = StObject.set(x, "truncate calls", value.asInstanceOf[js.Any])
    
    inline def `setUpdate calls`(value: Double): Self = StObject.set(x, "update calls", value.asInstanceOf[js.Any])
  }
}
