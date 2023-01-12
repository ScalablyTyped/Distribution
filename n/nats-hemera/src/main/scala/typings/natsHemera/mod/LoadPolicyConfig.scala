package typings.natsHemera.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadPolicyConfig extends StObject {
  
  var maxEventLoopDelay: js.UndefOr[Double] = js.undefined
  
  var maxHeapUsedBytes: js.UndefOr[Double] = js.undefined
  
  var maxRssBytes: js.UndefOr[Double] = js.undefined
}
object LoadPolicyConfig {
  
  inline def apply(): LoadPolicyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadPolicyConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadPolicyConfig] (val x: Self) extends AnyVal {
    
    inline def setMaxEventLoopDelay(value: Double): Self = StObject.set(x, "maxEventLoopDelay", value.asInstanceOf[js.Any])
    
    inline def setMaxEventLoopDelayUndefined: Self = StObject.set(x, "maxEventLoopDelay", js.undefined)
    
    inline def setMaxHeapUsedBytes(value: Double): Self = StObject.set(x, "maxHeapUsedBytes", value.asInstanceOf[js.Any])
    
    inline def setMaxHeapUsedBytesUndefined: Self = StObject.set(x, "maxHeapUsedBytes", js.undefined)
    
    inline def setMaxRssBytes(value: Double): Self = StObject.set(x, "maxRssBytes", value.asInstanceOf[js.Any])
    
    inline def setMaxRssBytesUndefined: Self = StObject.set(x, "maxRssBytes", js.undefined)
  }
}
