package typings.maximMazurokGapiClientStorage.gapi.client.storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HmacKey extends StObject {
  
  /** The kind of item this is. For HMAC keys, this is always storage#hmacKey. */
  var kind: js.UndefOr[String] = js.native
  
  /** Key metadata. */
  var metadata: js.UndefOr[HmacKeyMetadata] = js.native
  
  /** HMAC secret key material. */
  var secret: js.UndefOr[String] = js.native
}
object HmacKey {
  
  @scala.inline
  def apply(): HmacKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HmacKey]
  }
  
  @scala.inline
  implicit class HmacKeyMutableBuilder[Self <: HmacKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMetadata(value: HmacKeyMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
