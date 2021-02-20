package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptureAudioOptions extends StObject {
  
  var duration: js.UndefOr[Double] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[Double] = js.native
}
object CaptureAudioOptions {
  
  @scala.inline
  def apply(): CaptureAudioOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureAudioOptions]
  }
  
  @scala.inline
  implicit class CaptureAudioOptionsMutableBuilder[Self <: CaptureAudioOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
