package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveItemWorldEvent
  extends StObject
     with OSDEvent[World] {
  
  var item: TiledImage
}
object RemoveItemWorldEvent {
  
  inline def apply(eventSource: World, item: TiledImage, userData: Any): RemoveItemWorldEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveItemWorldEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveItemWorldEvent] (val x: Self) extends AnyVal {
    
    inline def setItem(value: TiledImage): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
