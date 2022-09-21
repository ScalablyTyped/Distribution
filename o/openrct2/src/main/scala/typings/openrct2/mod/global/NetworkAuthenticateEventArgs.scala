package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkAuthenticateEventArgs extends StObject {
  
  var cancel: Boolean
  
  val ipAddress: String
  
  val name: Double
  
  val publicKeyHash: String
}
object NetworkAuthenticateEventArgs {
  
  inline def apply(cancel: Boolean, ipAddress: String, name: Double, publicKeyHash: String): NetworkAuthenticateEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicKeyHash = publicKeyHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAuthenticateEventArgs]
  }
  
  extension [Self <: NetworkAuthenticateEventArgs](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setName(value: Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyHash(value: String): Self = StObject.set(x, "publicKeyHash", value.asInstanceOf[js.Any])
  }
}
