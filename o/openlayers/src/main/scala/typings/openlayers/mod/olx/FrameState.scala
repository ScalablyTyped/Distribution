package typings.openlayers.mod.olx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameState extends StObject {
  
  var pixelRatio: Double
  
  var time: Double
  
  var viewState: ViewState
}
object FrameState {
  
  inline def apply(pixelRatio: Double, time: Double, viewState: ViewState): FrameState = {
    val __obj = js.Dynamic.literal(pixelRatio = pixelRatio.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], viewState = viewState.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameState]
  }
  
  extension [Self <: FrameState](x: Self) {
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setViewState(value: ViewState): Self = StObject.set(x, "viewState", value.asInstanceOf[js.Any])
  }
}
