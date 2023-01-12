package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Canencryptcomms extends StObject {
  
  /** @example true */
  var can_certify: Boolean
  
  var can_encrypt_comms: Boolean
  
  var can_encrypt_storage: Boolean
  
  /** @example true */
  var can_sign: Boolean
  
  /**
    * Format: date-time
    * @example 2016-03-24T11:31:04-06:00
    */
  var created_at: String
  
  /**
    * @example [
    *   {
    *     "email": "octocat@users.noreply.github.com",
    *     "verified": true
    *   }
    * ]
    */
  var emails: js.Array[EmailVerified]
  
  /** Format: date-time */
  var expires_at: String | Null
  
  /** @example 3 */
  var id: Double
  
  /** @example 3262EFF25BA0D270 */
  var key_id: String
  
  /** @example Octocat's GPG Key */
  var name: js.UndefOr[String | Null] = js.undefined
  
  var primary_key_id: Double | Null
  
  /** @example xsBNBFayYZ... */
  var public_key: String
  
  var raw_key: String | Null
  
  /** @example true */
  var revoked: Boolean
  
  /**
    * @example [
    *   {
    *     "id": 4,
    *     "primary_key_id": 3,
    *     "key_id": "4A595D4C72EE49C7",
    *     "public_key": "zsBNBFayYZ...",
    *     "emails": [],
    *     "subkeys": [],
    *     "can_sign": false,
    *     "can_encrypt_comms": true,
    *     "can_encrypt_storage": true,
    *     "can_certify": false,
    *     "created_at": "2016-03-24T11:31:04-06:00",
    *     "expires_at": null,
    *     "revoked": false
    *   }
    * ]
    */
  var subkeys: js.Array[Cancertify]
}
object Canencryptcomms {
  
  inline def apply(
    can_certify: Boolean,
    can_encrypt_comms: Boolean,
    can_encrypt_storage: Boolean,
    can_sign: Boolean,
    created_at: String,
    emails: js.Array[EmailVerified],
    id: Double,
    key_id: String,
    public_key: String,
    revoked: Boolean,
    subkeys: js.Array[Cancertify]
  ): Canencryptcomms = {
    val __obj = js.Dynamic.literal(can_certify = can_certify.asInstanceOf[js.Any], can_encrypt_comms = can_encrypt_comms.asInstanceOf[js.Any], can_encrypt_storage = can_encrypt_storage.asInstanceOf[js.Any], can_sign = can_sign.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key_id = key_id.asInstanceOf[js.Any], public_key = public_key.asInstanceOf[js.Any], revoked = revoked.asInstanceOf[js.Any], subkeys = subkeys.asInstanceOf[js.Any], expires_at = null, primary_key_id = null, raw_key = null)
    __obj.asInstanceOf[Canencryptcomms]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Canencryptcomms] (val x: Self) extends AnyVal {
    
    inline def setCan_certify(value: Boolean): Self = StObject.set(x, "can_certify", value.asInstanceOf[js.Any])
    
    inline def setCan_encrypt_comms(value: Boolean): Self = StObject.set(x, "can_encrypt_comms", value.asInstanceOf[js.Any])
    
    inline def setCan_encrypt_storage(value: Boolean): Self = StObject.set(x, "can_encrypt_storage", value.asInstanceOf[js.Any])
    
    inline def setCan_sign(value: Boolean): Self = StObject.set(x, "can_sign", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setEmails(value: js.Array[EmailVerified]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsVarargs(value: EmailVerified*): Self = StObject.set(x, "emails", js.Array(value*))
    
    inline def setExpires_at(value: String): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setExpires_atNull: Self = StObject.set(x, "expires_at", null)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKey_id(value: String): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrimary_key_id(value: Double): Self = StObject.set(x, "primary_key_id", value.asInstanceOf[js.Any])
    
    inline def setPrimary_key_idNull: Self = StObject.set(x, "primary_key_id", null)
    
    inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
    
    inline def setRaw_key(value: String): Self = StObject.set(x, "raw_key", value.asInstanceOf[js.Any])
    
    inline def setRaw_keyNull: Self = StObject.set(x, "raw_key", null)
    
    inline def setRevoked(value: Boolean): Self = StObject.set(x, "revoked", value.asInstanceOf[js.Any])
    
    inline def setSubkeys(value: js.Array[Cancertify]): Self = StObject.set(x, "subkeys", value.asInstanceOf[js.Any])
    
    inline def setSubkeysVarargs(value: Cancertify*): Self = StObject.set(x, "subkeys", js.Array(value*))
  }
}
