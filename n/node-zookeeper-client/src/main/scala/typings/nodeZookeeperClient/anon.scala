package typings.nodeZookeeperClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<node-zookeeper-client.node-zookeeper-client.Option> */
  trait PartialOption extends StObject {
    
    var retries: js.UndefOr[Double] = js.undefined
    
    var sessionTimeout: js.UndefOr[Double] = js.undefined
    
    var spinDelay: js.UndefOr[Double] = js.undefined
  }
  object PartialOption {
    
    inline def apply(): PartialOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOption]
    }
    
    extension [Self <: PartialOption](x: Self) {
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      inline def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
      
      inline def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
      
      inline def setSpinDelay(value: Double): Self = StObject.set(x, "spinDelay", value.asInstanceOf[js.Any])
      
      inline def setSpinDelayUndefined: Self = StObject.set(x, "spinDelay", js.undefined)
    }
  }
}
