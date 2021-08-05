package typings.nextAuth.providersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderEmailAuth extends StObject {
  
  var pass: String
  
  var user: String
}
object ProviderEmailAuth {
  
  inline def apply(pass: String, user: String): ProviderEmailAuth = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderEmailAuth]
  }
  
  extension [Self <: ProviderEmailAuth](x: Self) {
    
    inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
