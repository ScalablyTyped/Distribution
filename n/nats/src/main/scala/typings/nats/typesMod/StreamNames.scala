package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamNames extends StObject {
  
  var streams: js.Array[String]
}
object StreamNames {
  
  inline def apply(streams: js.Array[String]): StreamNames = {
    val __obj = js.Dynamic.literal(streams = streams.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamNames]
  }
  
  extension [Self <: StreamNames](x: Self) {
    
    inline def setStreams(value: js.Array[String]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
    
    inline def setStreamsVarargs(value: String*): Self = StObject.set(x, "streams", js.Array(value*))
  }
}
