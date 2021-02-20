package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Duration extends StObject {
  
  var delay: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[String] = js.native
  
  var endOpacity: js.UndefOr[Double] = js.native
  
  var persist: js.UndefOr[String] = js.native
  
  var startOpacity: js.UndefOr[Double] = js.native
  
  var timingFunction: js.UndefOr[String] = js.native
}
object Duration {
  
  @scala.inline
  def apply(): Duration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Duration]
  }
  
  @scala.inline
  implicit class DurationMutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: String): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEndOpacity(value: Double): Self = StObject.set(x, "endOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOpacityUndefined: Self = StObject.set(x, "endOpacity", js.undefined)
    
    @scala.inline
    def setPersist(value: String): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    @scala.inline
    def setStartOpacity(value: Double): Self = StObject.set(x, "startOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOpacityUndefined: Self = StObject.set(x, "startOpacity", js.undefined)
    
    @scala.inline
    def setTimingFunction(value: String): Self = StObject.set(x, "timingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingFunctionUndefined: Self = StObject.set(x, "timingFunction", js.undefined)
  }
}
