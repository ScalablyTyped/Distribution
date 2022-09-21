package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JetStreamUsage extends StObject {
  
  var consumers: Double
  
  var memory: Double
  
  var storage: Double
  
  var streams: Double
}
object JetStreamUsage {
  
  inline def apply(consumers: Double, memory: Double, storage: Double, streams: Double): JetStreamUsage = {
    val __obj = js.Dynamic.literal(consumers = consumers.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], streams = streams.asInstanceOf[js.Any])
    __obj.asInstanceOf[JetStreamUsage]
  }
  
  extension [Self <: JetStreamUsage](x: Self) {
    
    inline def setConsumers(value: Double): Self = StObject.set(x, "consumers", value.asInstanceOf[js.Any])
    
    inline def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setStorage(value: Double): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStreams(value: Double): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
  }
}
