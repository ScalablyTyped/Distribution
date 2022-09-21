package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JetStreamUsageAccountLimits
  extends StObject
     with JetStreamUsage {
  
  var limits: AccountLimits
}
object JetStreamUsageAccountLimits {
  
  inline def apply(consumers: Double, limits: AccountLimits, memory: Double, storage: Double, streams: Double): JetStreamUsageAccountLimits = {
    val __obj = js.Dynamic.literal(consumers = consumers.asInstanceOf[js.Any], limits = limits.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], streams = streams.asInstanceOf[js.Any])
    __obj.asInstanceOf[JetStreamUsageAccountLimits]
  }
  
  extension [Self <: JetStreamUsageAccountLimits](x: Self) {
    
    inline def setLimits(value: AccountLimits): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
  }
}
