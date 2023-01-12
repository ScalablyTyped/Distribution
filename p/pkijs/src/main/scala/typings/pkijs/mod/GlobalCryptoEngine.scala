package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalCryptoEngine extends StObject {
  
  var crypto: ICryptoEngine | Null
  
  var name: String
}
object GlobalCryptoEngine {
  
  inline def apply(name: String): GlobalCryptoEngine = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], crypto = null)
    __obj.asInstanceOf[GlobalCryptoEngine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalCryptoEngine] (val x: Self) extends AnyVal {
    
    inline def setCrypto(value: ICryptoEngine): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
    
    inline def setCryptoNull: Self = StObject.set(x, "crypto", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
