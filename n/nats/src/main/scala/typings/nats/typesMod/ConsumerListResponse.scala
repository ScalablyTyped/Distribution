package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumerListResponse
  extends StObject
     with ApiResponse
     with ApiPaged {
  
  var consumers: js.Array[ConsumerInfo]
}
object ConsumerListResponse {
  
  inline def apply(consumers: js.Array[ConsumerInfo], limit: Double, offset: Double, total: Double, `type`: String): ConsumerListResponse = {
    val __obj = js.Dynamic.literal(consumers = consumers.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerListResponse]
  }
  
  extension [Self <: ConsumerListResponse](x: Self) {
    
    inline def setConsumers(value: js.Array[ConsumerInfo]): Self = StObject.set(x, "consumers", value.asInstanceOf[js.Any])
    
    inline def setConsumersVarargs(value: ConsumerInfo*): Self = StObject.set(x, "consumers", js.Array(value*))
  }
}
