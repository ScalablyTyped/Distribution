package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemIndexChangeWorldEvent
  extends StObject
     with OSDEvent[World] {
  
  var item: TiledImage
  
  var newIndex: Double
  
  var previousIndex: Double
}
object ItemIndexChangeWorldEvent {
  
  inline def apply(eventSource: World, item: TiledImage, newIndex: Double, previousIndex: Double, userData: Any): ItemIndexChangeWorldEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], previousIndex = previousIndex.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemIndexChangeWorldEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemIndexChangeWorldEvent] (val x: Self) extends AnyVal {
    
    inline def setItem(value: TiledImage): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
    
    inline def setPreviousIndex(value: Double): Self = StObject.set(x, "previousIndex", value.asInstanceOf[js.Any])
  }
}
