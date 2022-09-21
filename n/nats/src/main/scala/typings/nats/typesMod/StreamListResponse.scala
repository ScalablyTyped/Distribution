package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamListResponse
  extends StObject
     with ApiResponse
     with ApiPaged {
  
  var streams: js.Array[StreamInfo]
}
object StreamListResponse {
  
  inline def apply(limit: Double, offset: Double, streams: js.Array[StreamInfo], total: Double, `type`: String): StreamListResponse = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], streams = streams.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamListResponse]
  }
  
  extension [Self <: StreamListResponse](x: Self) {
    
    inline def setStreams(value: js.Array[StreamInfo]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
    
    inline def setStreamsVarargs(value: StreamInfo*): Self = StObject.set(x, "streams", js.Array(value*))
  }
}
