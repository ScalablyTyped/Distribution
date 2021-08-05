package typings.openlayers.mod.olx.interaction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleClickZoomOptions extends StObject {
  
  var delta: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
}
object DoubleClickZoomOptions {
  
  inline def apply(): DoubleClickZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleClickZoomOptions]
  }
  
  extension [Self <: DoubleClickZoomOptions](x: Self) {
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
