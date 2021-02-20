package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delay extends StObject {
  
  var delay: js.UndefOr[String] = js.native
  
  var direction: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[String] = js.native
  
  var endMaxHeight: js.UndefOr[String] = js.native
  
  var endMaxWidth: js.UndefOr[String] = js.native
  
  var persist: js.UndefOr[String] = js.native
  
  var startMaxHeight: js.UndefOr[String] = js.native
  
  var startMaxWidth: js.UndefOr[String] = js.native
  
  var timingFunction: js.UndefOr[String] = js.native
}
object Delay {
  
  @scala.inline
  def apply(): Delay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delay]
  }
  
  @scala.inline
  implicit class DelayMutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: String): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEndMaxHeight(value: String): Self = StObject.set(x, "endMaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndMaxHeightUndefined: Self = StObject.set(x, "endMaxHeight", js.undefined)
    
    @scala.inline
    def setEndMaxWidth(value: String): Self = StObject.set(x, "endMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndMaxWidthUndefined: Self = StObject.set(x, "endMaxWidth", js.undefined)
    
    @scala.inline
    def setPersist(value: String): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    @scala.inline
    def setStartMaxHeight(value: String): Self = StObject.set(x, "startMaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMaxHeightUndefined: Self = StObject.set(x, "startMaxHeight", js.undefined)
    
    @scala.inline
    def setStartMaxWidth(value: String): Self = StObject.set(x, "startMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMaxWidthUndefined: Self = StObject.set(x, "startMaxWidth", js.undefined)
    
    @scala.inline
    def setTimingFunction(value: String): Self = StObject.set(x, "timingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingFunctionUndefined: Self = StObject.set(x, "timingFunction", js.undefined)
  }
}
