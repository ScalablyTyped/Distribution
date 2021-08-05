package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MongosOptions
  extends StObject
     with SSLOptions
     with HighAvailabilityOptions {
  
  /**
    * Default: 15; Cutoff latency point in MS for MongoS proxy selection
    */
  var acceptableLatencyMS: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Socket Options
    */
  var socketOptions: js.UndefOr[SocketOptions] = js.undefined
}
object MongosOptions {
  
  inline def apply(): MongosOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongosOptions]
  }
  
  extension [Self <: MongosOptions](x: Self) {
    
    inline def setAcceptableLatencyMS(value: scala.Double): Self = StObject.set(x, "acceptableLatencyMS", value.asInstanceOf[js.Any])
    
    inline def setAcceptableLatencyMSUndefined: Self = StObject.set(x, "acceptableLatencyMS", js.undefined)
    
    inline def setSocketOptions(value: SocketOptions): Self = StObject.set(x, "socketOptions", value.asInstanceOf[js.Any])
    
    inline def setSocketOptionsUndefined: Self = StObject.set(x, "socketOptions", js.undefined)
  }
}
