package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Consumer extends StObject {
  
  var config: ConsumerConfig
  
  var stream_name: String
}
object Consumer {
  
  inline def apply(config: ConsumerConfig, stream_name: String): Consumer = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], stream_name = stream_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consumer]
  }
  
  extension [Self <: Consumer](x: Self) {
    
    inline def setConfig(value: ConsumerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setStream_name(value: String): Self = StObject.set(x, "stream_name", value.asInstanceOf[js.Any])
  }
}
