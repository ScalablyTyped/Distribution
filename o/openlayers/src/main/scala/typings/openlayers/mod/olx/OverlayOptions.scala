package typings.openlayers.mod.olx

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.OverlayPositioning
import typings.openlayers.mod.olx.animation.PanOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object literal with config options for the overlay.
  */
@js.native
trait OverlayOptions extends StObject {
  
  var autoPan: js.UndefOr[Boolean] = js.native
  
  var autoPanAnimation: js.UndefOr[PanOptions] = js.native
  
  var autoPanMargin: js.UndefOr[Double] = js.native
  
  var element: js.UndefOr[Element] = js.native
  
  var id: js.UndefOr[Double | String] = js.native
  
  var insertFirst: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[js.Array[Double]] = js.native
  
  var position: js.UndefOr[Coordinate_] = js.native
  
  var positioning: js.UndefOr[OverlayPositioning | String] = js.native
  
  var stopEvent: js.UndefOr[Boolean] = js.native
}
object OverlayOptions {
  
  @scala.inline
  def apply(): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayOptions]
  }
  
  @scala.inline
  implicit class OverlayOptionsMutableBuilder[Self <: OverlayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoPan(value: Boolean): Self = StObject.set(x, "autoPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPanAnimation(value: PanOptions): Self = StObject.set(x, "autoPanAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPanAnimationUndefined: Self = StObject.set(x, "autoPanAnimation", js.undefined)
    
    @scala.inline
    def setAutoPanMargin(value: Double): Self = StObject.set(x, "autoPanMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPanMarginUndefined: Self = StObject.set(x, "autoPanMargin", js.undefined)
    
    @scala.inline
    def setAutoPanUndefined: Self = StObject.set(x, "autoPan", js.undefined)
    
    @scala.inline
    def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInsertFirst(value: Boolean): Self = StObject.set(x, "insertFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertFirstUndefined: Self = StObject.set(x, "insertFirst", js.undefined)
    
    @scala.inline
    def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: Coordinate_): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setPositioning(value: OverlayPositioning | String): Self = StObject.set(x, "positioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositioningUndefined: Self = StObject.set(x, "positioning", js.undefined)
    
    @scala.inline
    def setStopEvent(value: Boolean): Self = StObject.set(x, "stopEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopEventUndefined: Self = StObject.set(x, "stopEvent", js.undefined)
  }
}
