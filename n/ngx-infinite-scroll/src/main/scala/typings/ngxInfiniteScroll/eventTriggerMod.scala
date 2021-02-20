package typings.ngxInfiniteScroll

import typings.ngxInfiniteScroll.modelsMod.IPositionStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventTriggerMod {
  
  @JSImport("ngx-infinite-scroll/src/services/event-trigger", "shouldTriggerEvents")
  @js.native
  def shouldTriggerEvents(alwaysCallback: Boolean, shouldFireScrollEvent: Boolean, isTriggeredCurrentTotal: Boolean): Boolean = js.native
  
  @js.native
  trait IDistanceRange extends StObject {
    
    var down: Double = js.native
    
    var up: Double = js.native
  }
  object IDistanceRange {
    
    @scala.inline
    def apply(down: Double, up: Double): IDistanceRange = {
      val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDistanceRange]
    }
    
    @scala.inline
    implicit class IDistanceRangeMutableBuilder[Self <: IDistanceRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDown(value: Double): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUp(value: Double): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IScrollConfig extends StObject {
    
    var alwaysCallback: Boolean = js.native
    
    var shouldFireScrollEvent: Boolean = js.native
  }
  object IScrollConfig {
    
    @scala.inline
    def apply(alwaysCallback: Boolean, shouldFireScrollEvent: Boolean): IScrollConfig = {
      val __obj = js.Dynamic.literal(alwaysCallback = alwaysCallback.asInstanceOf[js.Any], shouldFireScrollEvent = shouldFireScrollEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScrollConfig]
    }
    
    @scala.inline
    implicit class IScrollConfigMutableBuilder[Self <: IScrollConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysCallback(value: Boolean): Self = StObject.set(x, "alwaysCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldFireScrollEvent(value: Boolean): Self = StObject.set(x, "shouldFireScrollEvent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IScrollerProps extends IDistanceRange {
    
    var alwaysCallback: Boolean = js.native
    
    var container: IPositionStats = js.native
    
    var disabled: Boolean = js.native
  }
  object IScrollerProps {
    
    @scala.inline
    def apply(alwaysCallback: Boolean, container: IPositionStats, disabled: Boolean, down: Double, up: Double): IScrollerProps = {
      val __obj = js.Dynamic.literal(alwaysCallback = alwaysCallback.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], down = down.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScrollerProps]
    }
    
    @scala.inline
    implicit class IScrollerPropsMutableBuilder[Self <: IScrollerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysCallback(value: Boolean): Self = StObject.set(x, "alwaysCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: IPositionStats): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITriggerEvents extends StObject {
    
    def down(event: js.Any): js.Any = js.native
    
    def up(event: js.Any): js.Any = js.native
  }
  object ITriggerEvents {
    
    @scala.inline
    def apply(down: js.Any => js.Any, up: js.Any => js.Any): ITriggerEvents = {
      val __obj = js.Dynamic.literal(down = js.Any.fromFunction1(down), up = js.Any.fromFunction1(up))
      __obj.asInstanceOf[ITriggerEvents]
    }
    
    @scala.inline
    implicit class ITriggerEventsMutableBuilder[Self <: ITriggerEvents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDown(value: js.Any => js.Any): Self = StObject.set(x, "down", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUp(value: js.Any => js.Any): Self = StObject.set(x, "up", js.Any.fromFunction1(value))
    }
  }
}
