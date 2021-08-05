package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credentialauthorizedat extends StObject {
  
  var credential_authorized_at: String
  
  var credential_id: String
  
  var credential_type: String
  
  var login: String
  
  var scopes: js.Array[String]
  
  var token_last_eight: String
}
object Credentialauthorizedat {
  
  inline def apply(
    credential_authorized_at: String,
    credential_id: String,
    credential_type: String,
    login: String,
    scopes: js.Array[String],
    token_last_eight: String
  ): Credentialauthorizedat = {
    val __obj = js.Dynamic.literal(credential_authorized_at = credential_authorized_at.asInstanceOf[js.Any], credential_id = credential_id.asInstanceOf[js.Any], credential_type = credential_type.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], token_last_eight = token_last_eight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentialauthorizedat]
  }
  
  extension [Self <: Credentialauthorizedat](x: Self) {
    
    inline def setCredential_authorized_at(value: String): Self = StObject.set(x, "credential_authorized_at", value.asInstanceOf[js.Any])
    
    inline def setCredential_id(value: String): Self = StObject.set(x, "credential_id", value.asInstanceOf[js.Any])
    
    inline def setCredential_type(value: String): Self = StObject.set(x, "credential_type", value.asInstanceOf[js.Any])
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
    
    inline def setToken_last_eight(value: String): Self = StObject.set(x, "token_last_eight", value.asInstanceOf[js.Any])
  }
}
