package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Persist extends StObject {
  
  var axis: js.UndefOr[String] = js.native
  
  var delay: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[String] = js.native
  
  var persist: js.UndefOr[String] = js.native
  
  var timingFunction: js.UndefOr[String] = js.native
  
  var transformOrigin: js.UndefOr[String] = js.native
}
object Persist {
  
  @scala.inline
  def apply(): Persist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Persist]
  }
  
  @scala.inline
  implicit class PersistMutableBuilder[Self <: Persist] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setDelay(value: String): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setPersist(value: String): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    @scala.inline
    def setTimingFunction(value: String): Self = StObject.set(x, "timingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingFunctionUndefined: Self = StObject.set(x, "timingFunction", js.undefined)
    
    @scala.inline
    def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
  }
}
