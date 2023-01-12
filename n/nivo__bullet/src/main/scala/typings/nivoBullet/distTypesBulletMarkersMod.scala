package typings.nivoBullet

import typings.nivoBullet.distTypesTypesMod.BulletMarkersProps
import typings.nivoBullet.distTypesTypesMod.ComputedMarkersDatum
import typings.react.mod.global.JSX.Element
import typings.std.MouseEvent
import typings.std.SVGLineElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBulletMarkersMod {
  
  @JSImport("@nivo/bullet/dist/types/BulletMarkers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BulletMarkers(param0: BulletMarkersProps & EventHandlers): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("BulletMarkers")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined std.Record<'onMouseEnter' | 'onMouseLeave' | 'onClick', @nivo/bullet.@nivo/bullet/dist/types/BulletMarkers.MouseEventWithDatum> */
  trait EventHandlers extends StObject {
    
    var onClick: MouseEventWithDatum
    
    var onMouseEnter: MouseEventWithDatum
    
    var onMouseLeave: MouseEventWithDatum
  }
  object EventHandlers {
    
    inline def apply(
      onClick: (/* datum */ ComputedMarkersDatum, /* event */ typings.react.mod.MouseEvent[SVGLineElement, MouseEvent]) => Unit,
      onMouseEnter: (/* datum */ ComputedMarkersDatum, /* event */ typings.react.mod.MouseEvent[SVGLineElement, MouseEvent]) => Unit,
      onMouseLeave: (/* datum */ ComputedMarkersDatum, /* event */ typings.react.mod.MouseEvent[SVGLineElement, MouseEvent]) => Unit
    ): EventHandlers = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction2(onClick), onMouseEnter = js.Any.fromFunction2(onMouseEnter), onMouseLeave = js.Any.fromFunction2(onMouseLeave))
      __obj.asInstanceOf[EventHandlers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventHandlers] (val x: Self) extends AnyVal {
      
      inline def setOnClick(
        value: (/* datum */ ComputedMarkersDatum, /* event */ typings.react.mod.MouseEvent[SVGLineElement, MouseEvent]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnter(
        value: (/* datum */ ComputedMarkersDatum, /* event */ typings.react.mod.MouseEvent[SVGLineElement, MouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeave(
        value: (/* datum */ ComputedMarkersDatum, /* event */ typings.react.mod.MouseEvent[SVGLineElement, MouseEvent]) => Unit
      ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
    }
  }
  
  type MouseEventWithDatum = js.Function2[
    /* datum */ ComputedMarkersDatum, 
    /* event */ typings.react.mod.MouseEvent[SVGLineElement, MouseEvent], 
    Unit
  ]
}
