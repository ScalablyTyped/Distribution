package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyId extends StObject {
  
  /** Optional. The value of this KeyId encoded in lowercase hexadecimal. This is most likely the 160 bit SHA-1 hash of the public key. */
  var keyId: js.UndefOr[String] = js.undefined
}
object KeyId {
  
  inline def apply(): KeyId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyId]
  }
  
  extension [Self <: KeyId](x: Self) {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
  }
}
