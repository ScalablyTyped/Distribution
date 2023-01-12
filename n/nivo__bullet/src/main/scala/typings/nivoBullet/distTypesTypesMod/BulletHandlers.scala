package typings.nivoBullet.distTypesTypesMod

import typings.nivoBullet.anon.WithDatumIdComputedMarker
import typings.nivoBullet.anon.WithDatumIdComputedRangeD
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.SVGLineElement
import typings.std.SVGRectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulletHandlers extends StObject {
  
  var onMarkerClick: js.UndefOr[MouseEventHandler[WithDatumIdComputedMarker, SVGLineElement]] = js.undefined
  
  var onMeasureClick: js.UndefOr[MouseEventHandler[WithDatumIdComputedRangeD, SVGRectElement]] = js.undefined
  
  var onRangeClick: js.UndefOr[MouseEventHandler[WithDatumIdComputedRangeD, SVGRectElement]] = js.undefined
}
object BulletHandlers {
  
  inline def apply(): BulletHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulletHandlers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BulletHandlers] (val x: Self) extends AnyVal {
    
    inline def setOnMarkerClick(
      value: (WithDatumIdComputedMarker, /* event */ MouseEvent[SVGLineElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMarkerClick", js.Any.fromFunction2(value))
    
    inline def setOnMarkerClickUndefined: Self = StObject.set(x, "onMarkerClick", js.undefined)
    
    inline def setOnMeasureClick(
      value: (WithDatumIdComputedRangeD, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMeasureClick", js.Any.fromFunction2(value))
    
    inline def setOnMeasureClickUndefined: Self = StObject.set(x, "onMeasureClick", js.undefined)
    
    inline def setOnRangeClick(
      value: (WithDatumIdComputedRangeD, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onRangeClick", js.Any.fromFunction2(value))
    
    inline def setOnRangeClickUndefined: Self = StObject.set(x, "onRangeClick", js.undefined)
  }
}
