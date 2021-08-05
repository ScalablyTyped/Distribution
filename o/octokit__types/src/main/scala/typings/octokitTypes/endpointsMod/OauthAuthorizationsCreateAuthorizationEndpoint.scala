package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OauthAuthorizationsCreateAuthorizationEndpoint extends StObject {
  
  /**
    * The 20 character OAuth app client key for which to create the token.
    */
  var client_id: js.UndefOr[String] = js.undefined
  
  /**
    * The 40 character OAuth app client secret for which to create the token.
    */
  var client_secret: js.UndefOr[String] = js.undefined
  
  /**
    * A unique string to distinguish an authorization from others created for the same client ID and user.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * A note to remind you what the OAuth token is for. Tokens not associated with a specific OAuth application (i.e. personal access tokens) must have a unique note.
    */
  var note: String
  
  /**
    * A URL to remind you what app the OAuth token is for.
    */
  var note_url: js.UndefOr[String] = js.undefined
  
  /**
    * A list of scopes that this authorization is in.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}
object OauthAuthorizationsCreateAuthorizationEndpoint {
  
  inline def apply(note: String): OauthAuthorizationsCreateAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(note = note.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsCreateAuthorizationEndpoint]
  }
  
  extension [Self <: OauthAuthorizationsCreateAuthorizationEndpoint](x: Self) {
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
    
    inline def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNote_url(value: String): Self = StObject.set(x, "note_url", value.asInstanceOf[js.Any])
    
    inline def setNote_urlUndefined: Self = StObject.set(x, "note_url", js.undefined)
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
  }
}
