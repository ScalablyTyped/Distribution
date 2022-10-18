package typings.oidcProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Claims extends StObject {
  
  var claims: js.UndefOr[js.Array[String]] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
}
object Claims {
  
  inline def apply(): Claims = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Claims]
  }
  
  extension [Self <: Claims](x: Self) {
    
    inline def setClaims(value: js.Array[String]): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
    
    inline def setClaimsVarargs(value: String*): Self = StObject.set(x, "claims", js.Array(value*))
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
