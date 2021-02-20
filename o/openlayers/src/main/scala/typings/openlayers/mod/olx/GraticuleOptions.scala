package typings.openlayers.mod.olx

import typings.openlayers.mod.Map
import typings.openlayers.mod.style.Stroke
import typings.openlayers.mod.style.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraticuleOptions extends StObject {
  
  var latLabelFormatter: js.UndefOr[js.Function1[/* lat */ Double, String]] = js.native
  
  var latLabelPosition: js.UndefOr[Double] = js.native
  
  var latLabelStyle: js.UndefOr[Text] = js.native
  
  var lonLabelFormatter: js.UndefOr[js.Function1[/* lon */ Double, String]] = js.native
  
  var lonLabelPosition: js.UndefOr[Double] = js.native
  
  var lonLabelStyle: js.UndefOr[Text] = js.native
  
  var map: js.UndefOr[Map] = js.native
  
  var maxLines: js.UndefOr[Double] = js.native
  
  var showLabels: js.UndefOr[Boolean] = js.native
  
  var strokeStyle: js.UndefOr[Stroke] = js.native
  
  var targetSize: js.UndefOr[Double] = js.native
}
object GraticuleOptions {
  
  @scala.inline
  def apply(): GraticuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraticuleOptions]
  }
  
  @scala.inline
  implicit class GraticuleOptionsMutableBuilder[Self <: GraticuleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatLabelFormatter(value: /* lat */ Double => String): Self = StObject.set(x, "latLabelFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLatLabelFormatterUndefined: Self = StObject.set(x, "latLabelFormatter", js.undefined)
    
    @scala.inline
    def setLatLabelPosition(value: Double): Self = StObject.set(x, "latLabelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatLabelPositionUndefined: Self = StObject.set(x, "latLabelPosition", js.undefined)
    
    @scala.inline
    def setLatLabelStyle(value: Text): Self = StObject.set(x, "latLabelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatLabelStyleUndefined: Self = StObject.set(x, "latLabelStyle", js.undefined)
    
    @scala.inline
    def setLonLabelFormatter(value: /* lon */ Double => String): Self = StObject.set(x, "lonLabelFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLonLabelFormatterUndefined: Self = StObject.set(x, "lonLabelFormatter", js.undefined)
    
    @scala.inline
    def setLonLabelPosition(value: Double): Self = StObject.set(x, "lonLabelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLonLabelPositionUndefined: Self = StObject.set(x, "lonLabelPosition", js.undefined)
    
    @scala.inline
    def setLonLabelStyle(value: Text): Self = StObject.set(x, "lonLabelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLonLabelStyleUndefined: Self = StObject.set(x, "lonLabelStyle", js.undefined)
    
    @scala.inline
    def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
    
    @scala.inline
    def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
    
    @scala.inline
    def setStrokeStyle(value: Stroke): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
    
    @scala.inline
    def setTargetSize(value: Double): Self = StObject.set(x, "targetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSizeUndefined: Self = StObject.set(x, "targetSize", js.undefined)
  }
}
