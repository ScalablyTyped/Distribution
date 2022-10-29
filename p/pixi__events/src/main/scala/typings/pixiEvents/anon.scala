package typings.pixiEvents

import org.scalablytyped.runtime.Instantiable1
import typings.pixiEvents.libEventBoundaryMod.EventBoundary
import typings.pixiEvents.libFederatedEventMod.FederatedEvent
import typings.pixiEvents.libFederatedEventTargetMod.FederatedEventTarget
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClickCount extends StObject {
    
    var clickCount: Double
    
    var target: FederatedEventTarget
    
    var timeStamp: Double
  }
  object ClickCount {
    
    inline def apply(clickCount: Double, target: FederatedEventTarget, timeStamp: Double): ClickCount = {
      val __obj = js.Dynamic.literal(clickCount = clickCount.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClickCount]
    }
    
    extension [Self <: ClickCount](x: Self) {
      
      inline def setClickCount(value: Double): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: FederatedEventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fn extends StObject {
    
    def fn(e: FederatedEvent[UIEvent]): Unit
    
    var priority: Double
  }
  object Fn {
    
    inline def apply(fn: FederatedEvent[UIEvent] => Unit, priority: Double): Fn = {
      val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fn]
    }
    
    extension [Self <: Fn](x: Self) {
      
      inline def setFn(value: FederatedEvent[UIEvent] => Unit): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable[T /* <: FederatedEvent[UIEvent] */]
    extends StObject
       with Instantiable1[/* boundary */ EventBoundary, T]
}
