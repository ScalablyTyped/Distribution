package typings.nats.typesMod

import typings.nats.anon.R1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JetStreamAccountStats
  extends StObject
     with JetStreamUsageAccountLimits {
  
  var api: JetStreamApiStats
  
  var domain: js.UndefOr[String] = js.undefined
  
  var tiers: js.UndefOr[R1] = js.undefined
}
object JetStreamAccountStats {
  
  inline def apply(
    api: JetStreamApiStats,
    consumers: Double,
    limits: AccountLimits,
    memory: Double,
    storage: Double,
    streams: Double
  ): JetStreamAccountStats = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], consumers = consumers.asInstanceOf[js.Any], limits = limits.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], streams = streams.asInstanceOf[js.Any])
    __obj.asInstanceOf[JetStreamAccountStats]
  }
  
  extension [Self <: JetStreamAccountStats](x: Self) {
    
    inline def setApi(value: JetStreamApiStats): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setTiers(value: R1): Self = StObject.set(x, "tiers", value.asInstanceOf[js.Any])
    
    inline def setTiersUndefined: Self = StObject.set(x, "tiers", js.undefined)
  }
}
