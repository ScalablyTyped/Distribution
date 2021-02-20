package typings.openlayers.mod.olx.interaction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoubleClickZoomOptions extends StObject {
  
  var delta: js.UndefOr[Double] = js.native
  
  var duration: js.UndefOr[Double] = js.native
}
object DoubleClickZoomOptions {
  
  @scala.inline
  def apply(): DoubleClickZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleClickZoomOptions]
  }
  
  @scala.inline
  implicit class DoubleClickZoomOptionsMutableBuilder[Self <: DoubleClickZoomOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
