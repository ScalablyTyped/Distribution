package typings.openlayers.mod.olx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameState extends StObject {
  
  var pixelRatio: Double = js.native
  
  var time: Double = js.native
  
  var viewState: ViewState = js.native
}
object FrameState {
  
  @scala.inline
  def apply(pixelRatio: Double, time: Double, viewState: ViewState): FrameState = {
    val __obj = js.Dynamic.literal(pixelRatio = pixelRatio.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], viewState = viewState.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameState]
  }
  
  @scala.inline
  implicit class FrameStateMutableBuilder[Self <: FrameState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewState(value: ViewState): Self = StObject.set(x, "viewState", value.asInstanceOf[js.Any])
  }
}
