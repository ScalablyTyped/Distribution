package typings.pageFlip

import typings.pageFlip.distPageFlipMod.PageFlip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEventEventObjectMod {
  
  /* note: abstract class */ @JSImport("page-flip/dist/Event/EventObject", "EventObject")
  @js.native
  open class EventObject () extends StObject {
    
    /* private */ var events: Any = js.native
    
    /**
      * Removing all handlers from an event
      */
    def off(event: String): Unit = js.native
    
    /**
      * Add new event handler
      */
    def on(eventName: String, callback: EventCallback): EventObject = js.native
    
    /* protected */ def trigger(eventName: String, app: PageFlip): Unit = js.native
    /* protected */ def trigger(eventName: String, app: PageFlip, data: DataType): Unit = js.native
  }
  
  type DataType = Double | String | Boolean | js.Object
  
  type EventCallback = js.Function1[/* e */ WidgetEvent, Unit]
  
  trait WidgetEvent extends StObject {
    
    var data: DataType
    
    var `object`: PageFlip
  }
  object WidgetEvent {
    
    inline def apply(data: DataType, `object`: PageFlip): WidgetEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WidgetEvent]
    }
    
    extension [Self <: WidgetEvent](x: Self) {
      
      inline def setData(value: DataType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setObject(value: PageFlip): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
}
