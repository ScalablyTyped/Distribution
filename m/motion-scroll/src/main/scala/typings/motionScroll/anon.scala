package typings.motionScroll

import typings.motionScroll.motionScrollStrings.x
import typings.motionScroll.motionScrollStrings.y
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Axis extends StObject {
    
    var axis: js.UndefOr[x | y] = js.native
    
    var callBack: js.UndefOr[js.Function0[Unit]] = js.native
    
    var delay: js.UndefOr[Double] = js.native
    
    var easing: js.UndefOr[js.Function0[Unit]] = js.native
    
    var element: js.UndefOr[HTMLElement] = js.native
    
    var force: js.UndefOr[Boolean] = js.native
    
    var maxScrollTime: js.UndefOr[Double] = js.native
    
    var minScrollTime: js.UndefOr[Double] = js.native
    
    var scrollTo: js.UndefOr[Double] = js.native
    
    var speed: js.UndefOr[Double] = js.native
  }
  object Axis {
    
    @scala.inline
    def apply(): Axis = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Axis]
    }
    
    @scala.inline
    implicit class AxisMutableBuilder[Self <: Axis] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: typings.motionScroll.motionScrollStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setCallBack(value: () => Unit): Self = StObject.set(x, "callBack", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCallBackUndefined: Self = StObject.set(x, "callBack", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setEasing(value: () => Unit): Self = StObject.set(x, "easing", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setMaxScrollTime(value: Double): Self = StObject.set(x, "maxScrollTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxScrollTimeUndefined: Self = StObject.set(x, "maxScrollTime", js.undefined)
      
      @scala.inline
      def setMinScrollTime(value: Double): Self = StObject.set(x, "minScrollTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinScrollTimeUndefined: Self = StObject.set(x, "minScrollTime", js.undefined)
      
      @scala.inline
      def setScrollTo(value: Double): Self = StObject.set(x, "scrollTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
}
