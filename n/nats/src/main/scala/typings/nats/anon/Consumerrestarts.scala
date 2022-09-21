package typings.nats.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Consumerrestarts extends StObject {
  
  var consumer_restarts: Double
  
  var fc_count: Double
  
  var heartbeat_count: Double
}
object Consumerrestarts {
  
  inline def apply(consumer_restarts: Double, fc_count: Double, heartbeat_count: Double): Consumerrestarts = {
    val __obj = js.Dynamic.literal(consumer_restarts = consumer_restarts.asInstanceOf[js.Any], fc_count = fc_count.asInstanceOf[js.Any], heartbeat_count = heartbeat_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consumerrestarts]
  }
  
  extension [Self <: Consumerrestarts](x: Self) {
    
    inline def setConsumer_restarts(value: Double): Self = StObject.set(x, "consumer_restarts", value.asInstanceOf[js.Any])
    
    inline def setFc_count(value: Double): Self = StObject.set(x, "fc_count", value.asInstanceOf[js.Any])
    
    inline def setHeartbeat_count(value: Double): Self = StObject.set(x, "heartbeat_count", value.asInstanceOf[js.Any])
  }
}
