package typings.nats.typesMod

import typings.nats.anon.PartialConsumerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConsumerRequest extends StObject {
  
  var config: PartialConsumerConfig
  
  var stream_name: String
}
object CreateConsumerRequest {
  
  inline def apply(config: PartialConsumerConfig, stream_name: String): CreateConsumerRequest = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], stream_name = stream_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConsumerRequest]
  }
  
  extension [Self <: CreateConsumerRequest](x: Self) {
    
    inline def setConfig(value: PartialConsumerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setStream_name(value: String): Self = StObject.set(x, "stream_name", value.asInstanceOf[js.Any])
  }
}
