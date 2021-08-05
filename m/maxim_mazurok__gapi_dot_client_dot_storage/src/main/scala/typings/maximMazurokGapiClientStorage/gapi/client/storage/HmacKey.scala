package typings.maximMazurokGapiClientStorage.gapi.client.storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HmacKey extends StObject {
  
  /** The kind of item this is. For HMAC keys, this is always storage#hmacKey. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Key metadata. */
  var metadata: js.UndefOr[HmacKeyMetadata] = js.undefined
  
  /** HMAC secret key material. */
  var secret: js.UndefOr[String] = js.undefined
}
object HmacKey {
  
  inline def apply(): HmacKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HmacKey]
  }
  
  extension [Self <: HmacKey](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetadata(value: HmacKeyMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
