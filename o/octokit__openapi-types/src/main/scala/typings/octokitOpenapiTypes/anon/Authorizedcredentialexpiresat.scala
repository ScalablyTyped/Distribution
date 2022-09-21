package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authorizedcredentialexpiresat extends StObject {
  
  /**
    * Format: date-time
    * @description The expiry for the token. This will only be present when the credential is a token.
    */
  var authorized_credential_expires_at: js.UndefOr[String | Null] = js.undefined
  
  /** @example 12345678 */
  var authorized_credential_id: Double | Null
  
  /**
    * @description The note given to the token. This will only be present when the credential is a token.
    * @example my token
    */
  var authorized_credential_note: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @description The title given to the ssh key. This will only be present when the credential is an ssh key.
    * @example my ssh key
    */
  var authorized_credential_title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Format: date-time
    * @description Date when the credential was last accessed. May be null if it was never accessed
    * @example 2011-01-26T19:06:43Z
    */
  var credential_accessed_at: String | Null
  
  /**
    * Format: date-time
    * @description Date when the credential was authorized for use.
    * @example 2011-01-26T19:06:43Z
    */
  var credential_authorized_at: String
  
  /**
    * @description Unique identifier for the credential.
    * @example 1
    */
  var credential_id: Double
  
  /**
    * @description Human-readable description of the credential type.
    * @example SSH Key
    */
  var credential_type: String
  
  /**
    * @description Unique string to distinguish the credential. Only included in responses with credential_type of SSH Key.
    * @example jklmnop12345678
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * @description User login that owns the underlying credential.
    * @example monalisa
    */
  var login: String
  
  /**
    * @description List of oauth scopes the token has been granted.
    * @example [
    *   "user",
    *   "repo"
    * ]
    */
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @description Last eight characters of the credential. Only included in responses with credential_type of personal access token.
    * @example 12345678
    */
  var token_last_eight: js.UndefOr[String] = js.undefined
}
object Authorizedcredentialexpiresat {
  
  inline def apply(credential_authorized_at: String, credential_id: Double, credential_type: String, login: String): Authorizedcredentialexpiresat = {
    val __obj = js.Dynamic.literal(credential_authorized_at = credential_authorized_at.asInstanceOf[js.Any], credential_id = credential_id.asInstanceOf[js.Any], credential_type = credential_type.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], authorized_credential_id = null, credential_accessed_at = null)
    __obj.asInstanceOf[Authorizedcredentialexpiresat]
  }
  
  extension [Self <: Authorizedcredentialexpiresat](x: Self) {
    
    inline def setAuthorized_credential_expires_at(value: String): Self = StObject.set(x, "authorized_credential_expires_at", value.asInstanceOf[js.Any])
    
    inline def setAuthorized_credential_expires_atNull: Self = StObject.set(x, "authorized_credential_expires_at", null)
    
    inline def setAuthorized_credential_expires_atUndefined: Self = StObject.set(x, "authorized_credential_expires_at", js.undefined)
    
    inline def setAuthorized_credential_id(value: Double): Self = StObject.set(x, "authorized_credential_id", value.asInstanceOf[js.Any])
    
    inline def setAuthorized_credential_idNull: Self = StObject.set(x, "authorized_credential_id", null)
    
    inline def setAuthorized_credential_note(value: String): Self = StObject.set(x, "authorized_credential_note", value.asInstanceOf[js.Any])
    
    inline def setAuthorized_credential_noteNull: Self = StObject.set(x, "authorized_credential_note", null)
    
    inline def setAuthorized_credential_noteUndefined: Self = StObject.set(x, "authorized_credential_note", js.undefined)
    
    inline def setAuthorized_credential_title(value: String): Self = StObject.set(x, "authorized_credential_title", value.asInstanceOf[js.Any])
    
    inline def setAuthorized_credential_titleNull: Self = StObject.set(x, "authorized_credential_title", null)
    
    inline def setAuthorized_credential_titleUndefined: Self = StObject.set(x, "authorized_credential_title", js.undefined)
    
    inline def setCredential_accessed_at(value: String): Self = StObject.set(x, "credential_accessed_at", value.asInstanceOf[js.Any])
    
    inline def setCredential_accessed_atNull: Self = StObject.set(x, "credential_accessed_at", null)
    
    inline def setCredential_authorized_at(value: String): Self = StObject.set(x, "credential_authorized_at", value.asInstanceOf[js.Any])
    
    inline def setCredential_id(value: Double): Self = StObject.set(x, "credential_id", value.asInstanceOf[js.Any])
    
    inline def setCredential_type(value: String): Self = StObject.set(x, "credential_type", value.asInstanceOf[js.Any])
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
    
    inline def setToken_last_eight(value: String): Self = StObject.set(x, "token_last_eight", value.asInstanceOf[js.Any])
    
    inline def setToken_last_eightUndefined: Self = StObject.set(x, "token_last_eight", js.undefined)
  }
}
