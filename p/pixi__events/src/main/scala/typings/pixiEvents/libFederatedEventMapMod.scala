package typings.pixiEvents

import typings.pixiEvents.libFederatedPointerEventMod.FederatedPointerEvent
import typings.pixiEvents.libFederatedWheelEventMod.FederatedWheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFederatedEventMapMod {
  
  /* Inlined {[ K in keyof @pixi/events.@pixi/events/lib/FederatedEventMap.FederatedEventMap ]: [@pixi/events.@pixi/events/lib/FederatedEventMap.FederatedEventMap[K]]} */
  trait FederatedEventEmitterTypes extends StObject {
    
    var click: js.Array[FederatedPointerEvent]
    
    var mousedown: js.Array[FederatedPointerEvent]
    
    var mouseenter: js.Array[FederatedPointerEvent]
    
    var mouseleave: js.Array[FederatedPointerEvent]
    
    var mousemove: js.Array[FederatedPointerEvent]
    
    var mouseout: js.Array[FederatedPointerEvent]
    
    var mouseover: js.Array[FederatedPointerEvent]
    
    var mouseup: js.Array[FederatedPointerEvent]
    
    var mouseupoutside: js.Array[FederatedPointerEvent]
    
    var pointercancel: js.Array[FederatedPointerEvent]
    
    var pointerdown: js.Array[FederatedPointerEvent]
    
    var pointerenter: js.Array[FederatedPointerEvent]
    
    var pointerleave: js.Array[FederatedPointerEvent]
    
    var pointermove: js.Array[FederatedPointerEvent]
    
    var pointerout: js.Array[FederatedPointerEvent]
    
    var pointerover: js.Array[FederatedPointerEvent]
    
    var pointertap: js.Array[FederatedPointerEvent]
    
    var pointerup: js.Array[FederatedPointerEvent]
    
    var pointerupoutside: js.Array[FederatedPointerEvent]
    
    var rightclick: js.Array[FederatedPointerEvent]
    
    var rightdown: js.Array[FederatedPointerEvent]
    
    var rightup: js.Array[FederatedPointerEvent]
    
    var rightupoutside: js.Array[FederatedPointerEvent]
    
    var tap: js.Array[FederatedPointerEvent]
    
    var touchcancel: js.Array[FederatedPointerEvent]
    
    var touchend: js.Array[FederatedPointerEvent]
    
    var touchendoutside: js.Array[FederatedPointerEvent]
    
    var touchmove: js.Array[FederatedPointerEvent]
    
    var touchstart: js.Array[FederatedPointerEvent]
    
    var wheel: js.Array[FederatedWheelEvent]
  }
  object FederatedEventEmitterTypes {
    
    inline def apply(
      click: js.Array[FederatedPointerEvent],
      mousedown: js.Array[FederatedPointerEvent],
      mouseenter: js.Array[FederatedPointerEvent],
      mouseleave: js.Array[FederatedPointerEvent],
      mousemove: js.Array[FederatedPointerEvent],
      mouseout: js.Array[FederatedPointerEvent],
      mouseover: js.Array[FederatedPointerEvent],
      mouseup: js.Array[FederatedPointerEvent],
      mouseupoutside: js.Array[FederatedPointerEvent],
      pointercancel: js.Array[FederatedPointerEvent],
      pointerdown: js.Array[FederatedPointerEvent],
      pointerenter: js.Array[FederatedPointerEvent],
      pointerleave: js.Array[FederatedPointerEvent],
      pointermove: js.Array[FederatedPointerEvent],
      pointerout: js.Array[FederatedPointerEvent],
      pointerover: js.Array[FederatedPointerEvent],
      pointertap: js.Array[FederatedPointerEvent],
      pointerup: js.Array[FederatedPointerEvent],
      pointerupoutside: js.Array[FederatedPointerEvent],
      rightclick: js.Array[FederatedPointerEvent],
      rightdown: js.Array[FederatedPointerEvent],
      rightup: js.Array[FederatedPointerEvent],
      rightupoutside: js.Array[FederatedPointerEvent],
      tap: js.Array[FederatedPointerEvent],
      touchcancel: js.Array[FederatedPointerEvent],
      touchend: js.Array[FederatedPointerEvent],
      touchendoutside: js.Array[FederatedPointerEvent],
      touchmove: js.Array[FederatedPointerEvent],
      touchstart: js.Array[FederatedPointerEvent],
      wheel: js.Array[FederatedWheelEvent]
    ): FederatedEventEmitterTypes = {
      val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], mouseupoutside = mouseupoutside.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointertap = pointertap.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], pointerupoutside = pointerupoutside.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], rightdown = rightdown.asInstanceOf[js.Any], rightup = rightup.asInstanceOf[js.Any], rightupoutside = rightupoutside.asInstanceOf[js.Any], tap = tap.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchendoutside = touchendoutside.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[FederatedEventEmitterTypes]
    }
    
    extension [Self <: FederatedEventEmitterTypes](x: Self) {
      
      inline def setClick(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setClickVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "click", js.Array(value*))
      
      inline def setMousedown(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
      
      inline def setMousedownVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "mousedown", js.Array(value*))
      
      inline def setMouseenter(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "mouseenter", value.asInstanceOf[js.Any])
      
      inline def setMouseenterVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "mouseenter", js.Array(value*))
      
      inline def setMouseleave(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "mouseleave", value.asInstanceOf[js.Any])
      
      inline def setMouseleaveVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "mouseleave", js.Array(value*))
      
      inline def setMousemove(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
      
      inline def setMousemoveVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "mousemove", js.Array(value*))
      
      inline def setMouseout(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
      
      inline def setMouseoutVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "mouseout", js.Array(value*))
      
      inline def setMouseover(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
      
      inline def setMouseoverVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "mouseover", js.Array(value*))
      
      inline def setMouseup(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
      
      inline def setMouseupVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "mouseup", js.Array(value*))
      
      inline def setMouseupoutside(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "mouseupoutside", value.asInstanceOf[js.Any])
      
      inline def setMouseupoutsideVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "mouseupoutside", js.Array(value*))
      
      inline def setPointercancel(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "pointercancel", value.asInstanceOf[js.Any])
      
      inline def setPointercancelVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "pointercancel", js.Array(value*))
      
      inline def setPointerdown(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "pointerdown", value.asInstanceOf[js.Any])
      
      inline def setPointerdownVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "pointerdown", js.Array(value*))
      
      inline def setPointerenter(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "pointerenter", value.asInstanceOf[js.Any])
      
      inline def setPointerenterVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "pointerenter", js.Array(value*))
      
      inline def setPointerleave(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "pointerleave", value.asInstanceOf[js.Any])
      
      inline def setPointerleaveVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "pointerleave", js.Array(value*))
      
      inline def setPointermove(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "pointermove", value.asInstanceOf[js.Any])
      
      inline def setPointermoveVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "pointermove", js.Array(value*))
      
      inline def setPointerout(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "pointerout", value.asInstanceOf[js.Any])
      
      inline def setPointeroutVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "pointerout", js.Array(value*))
      
      inline def setPointerover(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "pointerover", value.asInstanceOf[js.Any])
      
      inline def setPointeroverVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "pointerover", js.Array(value*))
      
      inline def setPointertap(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "pointertap", value.asInstanceOf[js.Any])
      
      inline def setPointertapVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "pointertap", js.Array(value*))
      
      inline def setPointerup(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "pointerup", value.asInstanceOf[js.Any])
      
      inline def setPointerupVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "pointerup", js.Array(value*))
      
      inline def setPointerupoutside(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "pointerupoutside", value.asInstanceOf[js.Any])
      
      inline def setPointerupoutsideVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "pointerupoutside", js.Array(value*))
      
      inline def setRightclick(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "rightclick", value.asInstanceOf[js.Any])
      
      inline def setRightclickVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "rightclick", js.Array(value*))
      
      inline def setRightdown(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "rightdown", value.asInstanceOf[js.Any])
      
      inline def setRightdownVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "rightdown", js.Array(value*))
      
      inline def setRightup(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "rightup", value.asInstanceOf[js.Any])
      
      inline def setRightupVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "rightup", js.Array(value*))
      
      inline def setRightupoutside(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "rightupoutside", value.asInstanceOf[js.Any])
      
      inline def setRightupoutsideVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "rightupoutside", js.Array(value*))
      
      inline def setTap(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "tap", value.asInstanceOf[js.Any])
      
      inline def setTapVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "tap", js.Array(value*))
      
      inline def setTouchcancel(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
      
      inline def setTouchcancelVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "touchcancel", js.Array(value*))
      
      inline def setTouchend(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
      
      inline def setTouchendVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "touchend", js.Array(value*))
      
      inline def setTouchendoutside(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "touchendoutside", value.asInstanceOf[js.Any])
      
      inline def setTouchendoutsideVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "touchendoutside", js.Array(value*))
      
      inline def setTouchmove(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
      
      inline def setTouchmoveVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "touchmove", js.Array(value*))
      
      inline def setTouchstart(value: js.Array[FederatedPointerEvent]): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
      
      inline def setTouchstartVarargs(value: FederatedPointerEvent*): Self = StObject.set(x, "touchstart", js.Array(value*))
      
      inline def setWheel(value: js.Array[FederatedWheelEvent]): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
      
      inline def setWheelVarargs(value: FederatedWheelEvent*): Self = StObject.set(x, "wheel", js.Array(value*))
    }
  }
  
  trait FederatedEventMap extends StObject {
    
    var click: FederatedPointerEvent
    
    var mousedown: FederatedPointerEvent
    
    var mouseenter: FederatedPointerEvent
    
    var mouseleave: FederatedPointerEvent
    
    var mousemove: FederatedPointerEvent
    
    var mouseout: FederatedPointerEvent
    
    var mouseover: FederatedPointerEvent
    
    var mouseup: FederatedPointerEvent
    
    var mouseupoutside: FederatedPointerEvent
    
    var pointercancel: FederatedPointerEvent
    
    var pointerdown: FederatedPointerEvent
    
    var pointerenter: FederatedPointerEvent
    
    var pointerleave: FederatedPointerEvent
    
    var pointermove: FederatedPointerEvent
    
    var pointerout: FederatedPointerEvent
    
    var pointerover: FederatedPointerEvent
    
    var pointertap: FederatedPointerEvent
    
    var pointerup: FederatedPointerEvent
    
    var pointerupoutside: FederatedPointerEvent
    
    var rightclick: FederatedPointerEvent
    
    var rightdown: FederatedPointerEvent
    
    var rightup: FederatedPointerEvent
    
    var rightupoutside: FederatedPointerEvent
    
    var tap: FederatedPointerEvent
    
    var touchcancel: FederatedPointerEvent
    
    var touchend: FederatedPointerEvent
    
    var touchendoutside: FederatedPointerEvent
    
    var touchmove: FederatedPointerEvent
    
    var touchstart: FederatedPointerEvent
    
    var wheel: FederatedWheelEvent
  }
  object FederatedEventMap {
    
    inline def apply(
      click: FederatedPointerEvent,
      mousedown: FederatedPointerEvent,
      mouseenter: FederatedPointerEvent,
      mouseleave: FederatedPointerEvent,
      mousemove: FederatedPointerEvent,
      mouseout: FederatedPointerEvent,
      mouseover: FederatedPointerEvent,
      mouseup: FederatedPointerEvent,
      mouseupoutside: FederatedPointerEvent,
      pointercancel: FederatedPointerEvent,
      pointerdown: FederatedPointerEvent,
      pointerenter: FederatedPointerEvent,
      pointerleave: FederatedPointerEvent,
      pointermove: FederatedPointerEvent,
      pointerout: FederatedPointerEvent,
      pointerover: FederatedPointerEvent,
      pointertap: FederatedPointerEvent,
      pointerup: FederatedPointerEvent,
      pointerupoutside: FederatedPointerEvent,
      rightclick: FederatedPointerEvent,
      rightdown: FederatedPointerEvent,
      rightup: FederatedPointerEvent,
      rightupoutside: FederatedPointerEvent,
      tap: FederatedPointerEvent,
      touchcancel: FederatedPointerEvent,
      touchend: FederatedPointerEvent,
      touchendoutside: FederatedPointerEvent,
      touchmove: FederatedPointerEvent,
      touchstart: FederatedPointerEvent,
      wheel: FederatedWheelEvent
    ): FederatedEventMap = {
      val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], mouseupoutside = mouseupoutside.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointertap = pointertap.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], pointerupoutside = pointerupoutside.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], rightdown = rightdown.asInstanceOf[js.Any], rightup = rightup.asInstanceOf[js.Any], rightupoutside = rightupoutside.asInstanceOf[js.Any], tap = tap.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchendoutside = touchendoutside.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[FederatedEventMap]
    }
    
    extension [Self <: FederatedEventMap](x: Self) {
      
      inline def setClick(value: FederatedPointerEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setMousedown(value: FederatedPointerEvent): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
      
      inline def setMouseenter(value: FederatedPointerEvent): Self = StObject.set(x, "mouseenter", value.asInstanceOf[js.Any])
      
      inline def setMouseleave(value: FederatedPointerEvent): Self = StObject.set(x, "mouseleave", value.asInstanceOf[js.Any])
      
      inline def setMousemove(value: FederatedPointerEvent): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
      
      inline def setMouseout(value: FederatedPointerEvent): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
      
      inline def setMouseover(value: FederatedPointerEvent): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
      
      inline def setMouseup(value: FederatedPointerEvent): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
      
      inline def setMouseupoutside(value: FederatedPointerEvent): Self = StObject.set(x, "mouseupoutside", value.asInstanceOf[js.Any])
      
      inline def setPointercancel(value: FederatedPointerEvent): Self = StObject.set(x, "pointercancel", value.asInstanceOf[js.Any])
      
      inline def setPointerdown(value: FederatedPointerEvent): Self = StObject.set(x, "pointerdown", value.asInstanceOf[js.Any])
      
      inline def setPointerenter(value: FederatedPointerEvent): Self = StObject.set(x, "pointerenter", value.asInstanceOf[js.Any])
      
      inline def setPointerleave(value: FederatedPointerEvent): Self = StObject.set(x, "pointerleave", value.asInstanceOf[js.Any])
      
      inline def setPointermove(value: FederatedPointerEvent): Self = StObject.set(x, "pointermove", value.asInstanceOf[js.Any])
      
      inline def setPointerout(value: FederatedPointerEvent): Self = StObject.set(x, "pointerout", value.asInstanceOf[js.Any])
      
      inline def setPointerover(value: FederatedPointerEvent): Self = StObject.set(x, "pointerover", value.asInstanceOf[js.Any])
      
      inline def setPointertap(value: FederatedPointerEvent): Self = StObject.set(x, "pointertap", value.asInstanceOf[js.Any])
      
      inline def setPointerup(value: FederatedPointerEvent): Self = StObject.set(x, "pointerup", value.asInstanceOf[js.Any])
      
      inline def setPointerupoutside(value: FederatedPointerEvent): Self = StObject.set(x, "pointerupoutside", value.asInstanceOf[js.Any])
      
      inline def setRightclick(value: FederatedPointerEvent): Self = StObject.set(x, "rightclick", value.asInstanceOf[js.Any])
      
      inline def setRightdown(value: FederatedPointerEvent): Self = StObject.set(x, "rightdown", value.asInstanceOf[js.Any])
      
      inline def setRightup(value: FederatedPointerEvent): Self = StObject.set(x, "rightup", value.asInstanceOf[js.Any])
      
      inline def setRightupoutside(value: FederatedPointerEvent): Self = StObject.set(x, "rightupoutside", value.asInstanceOf[js.Any])
      
      inline def setTap(value: FederatedPointerEvent): Self = StObject.set(x, "tap", value.asInstanceOf[js.Any])
      
      inline def setTouchcancel(value: FederatedPointerEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
      
      inline def setTouchend(value: FederatedPointerEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
      
      inline def setTouchendoutside(value: FederatedPointerEvent): Self = StObject.set(x, "touchendoutside", value.asInstanceOf[js.Any])
      
      inline def setTouchmove(value: FederatedPointerEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
      
      inline def setTouchstart(value: FederatedPointerEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
      
      inline def setWheel(value: FederatedWheelEvent): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
    }
  }
}
