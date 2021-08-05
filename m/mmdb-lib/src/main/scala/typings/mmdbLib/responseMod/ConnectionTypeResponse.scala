package typings.mmdbLib.responseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionTypeResponse
  extends StObject
     with Response {
  
  val connection_type: String
  
  var ip_address: js.UndefOr[String] = js.undefined
}
object ConnectionTypeResponse {
  
  inline def apply(connection_type: String): ConnectionTypeResponse = {
    val __obj = js.Dynamic.literal(connection_type = connection_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionTypeResponse]
  }
  
  extension [Self <: ConnectionTypeResponse](x: Self) {
    
    inline def setConnection_type(value: String): Self = StObject.set(x, "connection_type", value.asInstanceOf[js.Any])
    
    inline def setIp_address(value: String): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
    
    inline def setIp_addressUndefined: Self = StObject.set(x, "ip_address", js.undefined)
  }
}
