package typings.openlayers.mod.olx

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.OverlayPositioning
import typings.openlayers.mod.olx.animation.PanOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object literal with config options for the overlay.
  */
trait OverlayOptions extends StObject {
  
  var autoPan: js.UndefOr[Boolean] = js.undefined
  
  var autoPanAnimation: js.UndefOr[PanOptions] = js.undefined
  
  var autoPanMargin: js.UndefOr[Double] = js.undefined
  
  var element: js.UndefOr[Element] = js.undefined
  
  var id: js.UndefOr[Double | String] = js.undefined
  
  var insertFirst: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[js.Array[Double]] = js.undefined
  
  var position: js.UndefOr[Coordinate_] = js.undefined
  
  var positioning: js.UndefOr[OverlayPositioning | String] = js.undefined
  
  var stopEvent: js.UndefOr[Boolean] = js.undefined
}
object OverlayOptions {
  
  inline def apply(): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverlayOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoPan(value: Boolean): Self = StObject.set(x, "autoPan", value.asInstanceOf[js.Any])
    
    inline def setAutoPanAnimation(value: PanOptions): Self = StObject.set(x, "autoPanAnimation", value.asInstanceOf[js.Any])
    
    inline def setAutoPanAnimationUndefined: Self = StObject.set(x, "autoPanAnimation", js.undefined)
    
    inline def setAutoPanMargin(value: Double): Self = StObject.set(x, "autoPanMargin", value.asInstanceOf[js.Any])
    
    inline def setAutoPanMarginUndefined: Self = StObject.set(x, "autoPanMargin", js.undefined)
    
    inline def setAutoPanUndefined: Self = StObject.set(x, "autoPan", js.undefined)
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInsertFirst(value: Boolean): Self = StObject.set(x, "insertFirst", value.asInstanceOf[js.Any])
    
    inline def setInsertFirstUndefined: Self = StObject.set(x, "insertFirst", js.undefined)
    
    inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
    
    inline def setPosition(value: Coordinate_): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPositioning(value: OverlayPositioning | String): Self = StObject.set(x, "positioning", value.asInstanceOf[js.Any])
    
    inline def setPositioningUndefined: Self = StObject.set(x, "positioning", js.undefined)
    
    inline def setStopEvent(value: Boolean): Self = StObject.set(x, "stopEvent", value.asInstanceOf[js.Any])
    
    inline def setStopEventUndefined: Self = StObject.set(x, "stopEvent", js.undefined)
  }
}
