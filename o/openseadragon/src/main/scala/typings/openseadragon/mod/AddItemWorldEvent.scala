package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddItemWorldEvent
  extends StObject
     with OSDEvent[World] {
  
  var item: TiledImage
}
object AddItemWorldEvent {
  
  inline def apply(eventSource: World, item: TiledImage, userData: Any): AddItemWorldEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddItemWorldEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddItemWorldEvent] (val x: Self) extends AnyVal {
    
    inline def setItem(value: TiledImage): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
