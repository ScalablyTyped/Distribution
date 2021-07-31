package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint extends StObject {
  
  var client_id: String
  
  /**
    * The 40 character OAuth app client secret associated with the client ID specified in the URL.
    */
  var client_secret: String
  
  var fingerprint: String
  
  /**
    * A note to remind you what the OAuth token is for.
    */
  var note: js.UndefOr[String] = js.undefined
  
  /**
    * A URL to remind you what app the OAuth token is for.
    */
  var note_url: js.UndefOr[String] = js.undefined
  
  /**
    * A list of scopes that this authorization is in.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}
object OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint {
  
  @scala.inline
  def apply(client_id: String, client_secret: String, fingerprint: String): OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint]
  }
  
  @scala.inline
  implicit class OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpointMutableBuilder[Self <: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNote_url(value: String): Self = StObject.set(x, "note_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote_urlUndefined: Self = StObject.set(x, "note_url", js.undefined)
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
  }
}
