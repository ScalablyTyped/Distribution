package typings.oidcProvider.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JWKS extends StObject {
  
  var keys: js.Array[JWK]
}
object JWKS {
  
  inline def apply(keys: js.Array[JWK]): JWKS = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWKS]
  }
  
  extension [Self <: JWKS](x: Self) {
    
    inline def setKeys(value: js.Array[JWK]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: JWK*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
