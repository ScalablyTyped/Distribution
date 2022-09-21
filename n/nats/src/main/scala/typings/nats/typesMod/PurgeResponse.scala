package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurgeResponse
  extends StObject
     with Success {
  
  var purged: Double
}
object PurgeResponse {
  
  inline def apply(purged: Double, success: Boolean): PurgeResponse = {
    val __obj = js.Dynamic.literal(purged = purged.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurgeResponse]
  }
  
  extension [Self <: PurgeResponse](x: Self) {
    
    inline def setPurged(value: Double): Self = StObject.set(x, "purged", value.asInstanceOf[js.Any])
  }
}
