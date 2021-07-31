package typings.notyf

import typings.notyf.anon.DeepPartialINotyfNotifica
import typings.notyf.notyfOptionsMod.NotyfEvent
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notyfModelsMod {
  
  @JSImport("notyf/notyf.models", "NotyfArray")
  @js.native
  class NotyfArray[T] () extends StObject {
    
    def indexOf(elem: T): Double = js.native
    
    var notifications: js.Any = js.native
    
    def onUpdate(fn: NotyfArrayEventFn[T]): Unit = js.native
    
    def push(elem: T): Unit = js.native
    
    def splice(index: Double, num: Double): T = js.native
    
    var updateFn: js.Any = js.native
  }
  
  @js.native
  sealed trait NotyfArrayEvent extends StObject
  @JSImport("notyf/notyf.models", "NotyfArrayEvent")
  @js.native
  object NotyfArrayEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NotyfArrayEvent & Double] = js.native
    
    @js.native
    sealed trait Add
      extends StObject
         with NotyfArrayEvent
    /* 0 */ val Add: typings.notyf.notyfModelsMod.NotyfArrayEvent.Add & Double = js.native
    
    @js.native
    sealed trait Remove
      extends StObject
         with NotyfArrayEvent
    /* 1 */ val Remove: typings.notyf.notyfModelsMod.NotyfArrayEvent.Remove & Double = js.native
  }
  
  @JSImport("notyf/notyf.models", "NotyfNotification")
  @js.native
  class NotyfNotification protected () extends StObject {
    def this(options: DeepPartialINotyfNotifica) = this()
    
    var listeners: js.Any = js.native
    
    def on(eventType: NotyfEvent, cb: NotyfEventCallback): Unit = js.native
    
    var options: DeepPartialINotyfNotifica = js.native
    
    var triggerEvent: js.Any = js.native
  }
  
  trait INotyfEventPayload extends StObject {
    
    var event: js.UndefOr[Event] = js.undefined
    
    var target: NotyfNotification
  }
  object INotyfEventPayload {
    
    @scala.inline
    def apply(target: NotyfNotification): INotyfEventPayload = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[INotyfEventPayload]
    }
    
    @scala.inline
    implicit class INotyfEventPayloadMutableBuilder[Self <: INotyfEventPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setTarget(value: NotyfNotification): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRenderedNotification extends StObject {
    
    var node: HTMLElement
    
    var notification: NotyfNotification
  }
  object IRenderedNotification {
    
    @scala.inline
    def apply(node: HTMLElement, notification: NotyfNotification): IRenderedNotification = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRenderedNotification]
    }
    
    @scala.inline
    implicit class IRenderedNotificationMutableBuilder[Self <: IRenderedNotification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotification(value: NotyfNotification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    }
  }
  
  type NotyfArrayEventFn[T] = js.Function3[/* elem */ T, /* event */ NotyfArrayEvent, /* elems */ js.Array[T], Unit]
  
  type NotyfEventCallback = js.Function1[/* payload */ INotyfEventPayload, Unit]
}
