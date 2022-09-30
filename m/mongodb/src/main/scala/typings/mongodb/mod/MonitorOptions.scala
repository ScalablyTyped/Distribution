package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof mongodb.mongodb.ConnectionOptions, 'id' | 'generation' | 'hostAddress'> ]: mongodb.mongodb.ConnectionOptions[P]} */ trait MonitorOptions extends StObject {
  
  var connectTimeoutMS: scala.Double
  
  var heartbeatFrequencyMS: scala.Double
  
  var minHeartbeatFrequencyMS: scala.Double
}
object MonitorOptions {
  
  inline def apply(
    connectTimeoutMS: scala.Double,
    heartbeatFrequencyMS: scala.Double,
    minHeartbeatFrequencyMS: scala.Double
  ): MonitorOptions = {
    val __obj = js.Dynamic.literal(connectTimeoutMS = connectTimeoutMS.asInstanceOf[js.Any], heartbeatFrequencyMS = heartbeatFrequencyMS.asInstanceOf[js.Any], minHeartbeatFrequencyMS = minHeartbeatFrequencyMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorOptions]
  }
  
  extension [Self <: MonitorOptions](x: Self) {
    
    inline def setConnectTimeoutMS(value: scala.Double): Self = StObject.set(x, "connectTimeoutMS", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatFrequencyMS(value: scala.Double): Self = StObject.set(x, "heartbeatFrequencyMS", value.asInstanceOf[js.Any])
    
    inline def setMinHeartbeatFrequencyMS(value: scala.Double): Self = StObject.set(x, "minHeartbeatFrequencyMS", value.asInstanceOf[js.Any])
  }
}
