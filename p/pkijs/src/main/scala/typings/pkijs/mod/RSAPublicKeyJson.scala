package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RSAPublicKeyJson extends StObject {
  
  var e: String
  
  var n: String
}
object RSAPublicKeyJson {
  
  inline def apply(e: String, n: String): RSAPublicKeyJson = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAPublicKeyJson]
  }
  
  extension [Self <: RSAPublicKeyJson](x: Self) {
    
    inline def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
  }
}
