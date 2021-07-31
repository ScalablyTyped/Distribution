package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Cancertify
import typings.octokitTypes.anon.EmailVerified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersGetGpgKeyForAuthenticatedResponseData extends StObject {
  
  var can_certify: Boolean
  
  var can_encrypt_comms: Boolean
  
  var can_encrypt_storage: Boolean
  
  var can_sign: Boolean
  
  var created_at: String
  
  var emails: js.Array[EmailVerified]
  
  var expires_at: String
  
  var id: Double
  
  var key_id: String
  
  var primary_key_id: String
  
  var public_key: String
  
  var subkeys: js.Array[Cancertify]
}
object UsersGetGpgKeyForAuthenticatedResponseData {
  
  @scala.inline
  def apply(
    can_certify: Boolean,
    can_encrypt_comms: Boolean,
    can_encrypt_storage: Boolean,
    can_sign: Boolean,
    created_at: String,
    emails: js.Array[EmailVerified],
    expires_at: String,
    id: Double,
    key_id: String,
    primary_key_id: String,
    public_key: String,
    subkeys: js.Array[Cancertify]
  ): UsersGetGpgKeyForAuthenticatedResponseData = {
    val __obj = js.Dynamic.literal(can_certify = can_certify.asInstanceOf[js.Any], can_encrypt_comms = can_encrypt_comms.asInstanceOf[js.Any], can_encrypt_storage = can_encrypt_storage.asInstanceOf[js.Any], can_sign = can_sign.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key_id = key_id.asInstanceOf[js.Any], primary_key_id = primary_key_id.asInstanceOf[js.Any], public_key = public_key.asInstanceOf[js.Any], subkeys = subkeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetGpgKeyForAuthenticatedResponseData]
  }
  
  @scala.inline
  implicit class UsersGetGpgKeyForAuthenticatedResponseDataMutableBuilder[Self <: UsersGetGpgKeyForAuthenticatedResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCan_certify(value: Boolean): Self = StObject.set(x, "can_certify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_encrypt_comms(value: Boolean): Self = StObject.set(x, "can_encrypt_comms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_encrypt_storage(value: Boolean): Self = StObject.set(x, "can_encrypt_storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_sign(value: Boolean): Self = StObject.set(x, "can_sign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmails(value: js.Array[EmailVerified]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsVarargs(value: EmailVerified*): Self = StObject.set(x, "emails", js.Array(value :_*))
    
    @scala.inline
    def setExpires_at(value: String): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey_id(value: String): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary_key_id(value: String): Self = StObject.set(x, "primary_key_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubkeys(value: js.Array[Cancertify]): Self = StObject.set(x, "subkeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubkeysVarargs(value: Cancertify*): Self = StObject.set(x, "subkeys", js.Array(value :_*))
  }
}
