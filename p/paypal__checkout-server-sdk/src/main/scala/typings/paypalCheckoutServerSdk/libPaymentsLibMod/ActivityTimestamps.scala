package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityTimestamps extends StObject {
  
  var create_time: String
  
  var update_time: String
}
object ActivityTimestamps {
  
  inline def apply(create_time: String, update_time: String): ActivityTimestamps = {
    val __obj = js.Dynamic.literal(create_time = create_time.asInstanceOf[js.Any], update_time = update_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTimestamps]
  }
  
  extension [Self <: ActivityTimestamps](x: Self) {
    
    inline def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
    
    inline def setUpdate_time(value: String): Self = StObject.set(x, "update_time", value.asInstanceOf[js.Any])
  }
}
