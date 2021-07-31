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
  
  @scala.inline
  def apply(): LoadPolicyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadPolicyConfig]
  }
  
  @scala.inline
  implicit class LoadPolicyConfigMutableBuilder[Self <: LoadPolicyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxEventLoopDelay(value: Double): Self = StObject.set(x, "maxEventLoopDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxEventLoopDelayUndefined: Self = StObject.set(x, "maxEventLoopDelay", js.undefined)
    
    @scala.inline
    def setMaxHeapUsedBytes(value: Double): Self = StObject.set(x, "maxHeapUsedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeapUsedBytesUndefined: Self = StObject.set(x, "maxHeapUsedBytes", js.undefined)
    
    @scala.inline
    def setMaxRssBytes(value: Double): Self = StObject.set(x, "maxRssBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRssBytesUndefined: Self = StObject.set(x, "maxRssBytes", js.undefined)
  }
}
