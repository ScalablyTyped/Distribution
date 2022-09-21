package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddItemWorldEvent
  extends StObject
     with OSDEvent[World] {
  
  var item: js.UndefOr[TiledImage] = js.undefined
}
object AddItemWorldEvent {
  
  inline def apply(eventSource: World, userData: Any): AddItemWorldEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddItemWorldEvent]
  }
  
  extension [Self <: AddItemWorldEvent](x: Self) {
    
    inline def setItem(value: TiledImage): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
