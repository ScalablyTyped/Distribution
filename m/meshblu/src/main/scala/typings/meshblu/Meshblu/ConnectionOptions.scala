package typings.meshblu.Meshblu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the primary means of identifying a device.
  */
trait ConnectionOptions extends StObject {
  
  var token: String
  
  var uuid: String
}
object ConnectionOptions {
  
  inline def apply(token: String, uuid: String): ConnectionOptions = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  extension [Self <: ConnectionOptions](x: Self) {
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
