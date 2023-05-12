package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancertify extends StObject {
  
  var can_certify: js.UndefOr[Boolean] = js.undefined
  
  var can_encrypt_comms: js.UndefOr[Boolean] = js.undefined
  
  var can_encrypt_storage: js.UndefOr[Boolean] = js.undefined
  
  var can_sign: js.UndefOr[Boolean] = js.undefined
  
  var created_at: js.UndefOr[String] = js.undefined
  
  var emails: js.UndefOr[js.Array[EmailVerified]] = js.undefined
  
  var expires_at: js.UndefOr[String | Null] = js.undefined
  
  var id: js.UndefOr[Double] = js.undefined
  
  var key_id: js.UndefOr[String] = js.undefined
  
  var primary_key_id: js.UndefOr[Double] = js.undefined
  
  var public_key: js.UndefOr[String] = js.undefined
  
  var raw_key: js.UndefOr[String | Null] = js.undefined
  
  var revoked: js.UndefOr[Boolean] = js.undefined
  
  var subkeys: js.UndefOr[js.Array[Any]] = js.undefined
}
object Cancertify {
  
  inline def apply(): Cancertify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cancertify]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cancertify] (val x: Self) extends AnyVal {
    
    inline def setCan_certify(value: Boolean): Self = StObject.set(x, "can_certify", value.asInstanceOf[js.Any])
    
    inline def setCan_certifyUndefined: Self = StObject.set(x, "can_certify", js.undefined)
    
    inline def setCan_encrypt_comms(value: Boolean): Self = StObject.set(x, "can_encrypt_comms", value.asInstanceOf[js.Any])
    
    inline def setCan_encrypt_commsUndefined: Self = StObject.set(x, "can_encrypt_comms", js.undefined)
    
    inline def setCan_encrypt_storage(value: Boolean): Self = StObject.set(x, "can_encrypt_storage", value.asInstanceOf[js.Any])
    
    inline def setCan_encrypt_storageUndefined: Self = StObject.set(x, "can_encrypt_storage", js.undefined)
    
    inline def setCan_sign(value: Boolean): Self = StObject.set(x, "can_sign", value.asInstanceOf[js.Any])
    
    inline def setCan_signUndefined: Self = StObject.set(x, "can_sign", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setEmails(value: js.Array[EmailVerified]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    inline def setEmailsVarargs(value: EmailVerified*): Self = StObject.set(x, "emails", js.Array(value*))
    
    inline def setExpires_at(value: String): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setExpires_atNull: Self = StObject.set(x, "expires_at", null)
    
    inline def setExpires_atUndefined: Self = StObject.set(x, "expires_at", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKey_id(value: String): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
    
    inline def setKey_idUndefined: Self = StObject.set(x, "key_id", js.undefined)
    
    inline def setPrimary_key_id(value: Double): Self = StObject.set(x, "primary_key_id", value.asInstanceOf[js.Any])
    
    inline def setPrimary_key_idUndefined: Self = StObject.set(x, "primary_key_id", js.undefined)
    
    inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
    
    inline def setPublic_keyUndefined: Self = StObject.set(x, "public_key", js.undefined)
    
    inline def setRaw_key(value: String): Self = StObject.set(x, "raw_key", value.asInstanceOf[js.Any])
    
    inline def setRaw_keyNull: Self = StObject.set(x, "raw_key", null)
    
    inline def setRaw_keyUndefined: Self = StObject.set(x, "raw_key", js.undefined)
    
    inline def setRevoked(value: Boolean): Self = StObject.set(x, "revoked", value.asInstanceOf[js.Any])
    
    inline def setRevokedUndefined: Self = StObject.set(x, "revoked", js.undefined)
    
    inline def setSubkeys(value: js.Array[Any]): Self = StObject.set(x, "subkeys", value.asInstanceOf[js.Any])
    
    inline def setSubkeysUndefined: Self = StObject.set(x, "subkeys", js.undefined)
    
    inline def setSubkeysVarargs(value: Any*): Self = StObject.set(x, "subkeys", js.Array(value*))
  }
}
