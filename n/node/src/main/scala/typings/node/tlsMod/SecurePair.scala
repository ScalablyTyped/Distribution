package typings.node.tlsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurePair extends StObject {
  
  var cleartext: TLSSocket
  
  var encrypted: TLSSocket
}
object SecurePair {
  
  inline def apply(cleartext: TLSSocket, encrypted: TLSSocket): SecurePair = {
    val __obj = js.Dynamic.literal(cleartext = cleartext.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurePair]
  }
  
  extension [Self <: SecurePair](x: Self) {
    
    inline def setCleartext(value: TLSSocket): Self = StObject.set(x, "cleartext", value.asInstanceOf[js.Any])
    
    inline def setEncrypted(value: TLSSocket): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
  }
}
