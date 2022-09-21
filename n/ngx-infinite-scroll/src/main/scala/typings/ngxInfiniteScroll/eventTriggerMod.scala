package typings.ngxInfiniteScroll

import typings.ngxInfiniteScroll.modelsMod.IPositionStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventTriggerMod {
  
  @JSImport("ngx-infinite-scroll/lib/services/event-trigger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shouldTriggerEvents(alwaysCallback: Boolean, shouldFireScrollEvent: Boolean, isTriggeredCurrentTotal: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldTriggerEvents")(alwaysCallback.asInstanceOf[js.Any], shouldFireScrollEvent.asInstanceOf[js.Any], isTriggeredCurrentTotal.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait IDistanceRange extends StObject {
    
    var down: Double
    
    var up: Double
  }
  object IDistanceRange {
    
    inline def apply(down: Double, up: Double): IDistanceRange = {
      val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDistanceRange]
    }
    
    extension [Self <: IDistanceRange](x: Self) {
      
      inline def setDown(value: Double): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      inline def setUp(value: Double): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    }
  }
  
  trait IScrollConfig extends StObject {
    
    var alwaysCallback: Boolean
    
    var shouldFireScrollEvent: Boolean
  }
  object IScrollConfig {
    
    inline def apply(alwaysCallback: Boolean, shouldFireScrollEvent: Boolean): IScrollConfig = {
      val __obj = js.Dynamic.literal(alwaysCallback = alwaysCallback.asInstanceOf[js.Any], shouldFireScrollEvent = shouldFireScrollEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScrollConfig]
    }
    
    extension [Self <: IScrollConfig](x: Self) {
      
      inline def setAlwaysCallback(value: Boolean): Self = StObject.set(x, "alwaysCallback", value.asInstanceOf[js.Any])
      
      inline def setShouldFireScrollEvent(value: Boolean): Self = StObject.set(x, "shouldFireScrollEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait IScrollerProps
    extends StObject
       with IDistanceRange {
    
    var alwaysCallback: Boolean
    
    var container: IPositionStats
    
    var disabled: Boolean
  }
  object IScrollerProps {
    
    inline def apply(alwaysCallback: Boolean, container: IPositionStats, disabled: Boolean, down: Double, up: Double): IScrollerProps = {
      val __obj = js.Dynamic.literal(alwaysCallback = alwaysCallback.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], down = down.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScrollerProps]
    }
    
    extension [Self <: IScrollerProps](x: Self) {
      
      inline def setAlwaysCallback(value: Boolean): Self = StObject.set(x, "alwaysCallback", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: IPositionStats): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITriggerEvents extends StObject {
    
    def down(event: Any): Any
    
    def up(event: Any): Any
  }
  object ITriggerEvents {
    
    inline def apply(down: Any => Any, up: Any => Any): ITriggerEvents = {
      val __obj = js.Dynamic.literal(down = js.Any.fromFunction1(down), up = js.Any.fromFunction1(up))
      __obj.asInstanceOf[ITriggerEvents]
    }
    
    extension [Self <: ITriggerEvents](x: Self) {
      
      inline def setDown(value: Any => Any): Self = StObject.set(x, "down", js.Any.fromFunction1(value))
      
      inline def setUp(value: Any => Any): Self = StObject.set(x, "up", js.Any.fromFunction1(value))
    }
  }
}
