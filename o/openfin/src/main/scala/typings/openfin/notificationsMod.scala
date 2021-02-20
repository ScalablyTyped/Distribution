package typings.openfin

import typings.openfin.eventsBaseMod.BaseEventMap
import typings.openfin.eventsBaseMod.RuntimeEvent
import typings.openfin.openfinStrings.click
import typings.openfin.openfinStrings.close
import typings.openfin.openfinStrings.error
import typings.openfin.openfinStrings.message
import typings.openfin.openfinStrings.notification
import typings.openfin.openfinStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationsMod {
  
  @js.native
  trait NotificationEvents extends BaseEventMap {
    
    var click: RuntimeEvent[notification, typings.openfin.openfinStrings.click] = js.native
    
    var close: RuntimeEvent[notification, typings.openfin.openfinStrings.close] = js.native
    
    var error: RuntimeEvent[notification, typings.openfin.openfinStrings.error] = js.native
    
    var message: RuntimeEvent[notification, typings.openfin.openfinStrings.message] = js.native
    
    var show: RuntimeEvent[notification, typings.openfin.openfinStrings.show] = js.native
  }
  object NotificationEvents {
    
    @scala.inline
    def apply(
      click: RuntimeEvent[notification, click],
      close: RuntimeEvent[notification, close],
      error: RuntimeEvent[notification, error],
      listenerRemoved: String,
      message: RuntimeEvent[notification, message],
      newListener: String,
      show: RuntimeEvent[notification, show]
    ): NotificationEvents = {
      val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationEvents]
    }
    
    @scala.inline
    implicit class NotificationEventsMutableBuilder[Self <: NotificationEvents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClick(value: RuntimeEvent[notification, click]): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClose(value: RuntimeEvent[notification, close]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: RuntimeEvent[notification, error]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: RuntimeEvent[notification, message]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow(value: RuntimeEvent[notification, show]): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    }
  }
}
