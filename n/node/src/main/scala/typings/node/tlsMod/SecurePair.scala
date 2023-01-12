package typings.node.tlsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated since v0.11.3 Use `tls.TLSSocket` instead.
  */
trait SecurePair extends StObject {
  
  var cleartext: TLSSocket
  
  var encrypted: TLSSocket
}
object SecurePair {
  
  inline def apply(cleartext: TLSSocket, encrypted: TLSSocket): SecurePair = {
    val __obj = js.Dynamic.literal(cleartext = cleartext.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurePair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurePair] (val x: Self) extends AnyVal {
    
    inline def setCleartext(value: TLSSocket): Self = StObject.set(x, "cleartext", value.asInstanceOf[js.Any])
    
    inline def setEncrypted(value: TLSSocket): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
  }
}
