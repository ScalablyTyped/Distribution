package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Clientid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OauthAuthorizationsGetOrCreateAuthorizationForAppResponse201Data extends StObject {
  
  var app: Clientid = js.native
  
  var created_at: String = js.native
  
  var fingerprint: String = js.native
  
  var hashed_token: String = js.native
  
  var id: Double = js.native
  
  var note: String = js.native
  
  var note_url: String = js.native
  
  var scopes: js.Array[String] = js.native
  
  var token: String = js.native
  
  var token_last_eight: String = js.native
  
  var updated_at: String = js.native
  
  var url: String = js.native
}
object OauthAuthorizationsGetOrCreateAuthorizationForAppResponse201Data {
  
  @scala.inline
  def apply(
    app: Clientid,
    created_at: String,
    fingerprint: String,
    hashed_token: String,
    id: Double,
    note: String,
    note_url: String,
    scopes: js.Array[String],
    token: String,
    token_last_eight: String,
    updated_at: String,
    url: String
  ): OauthAuthorizationsGetOrCreateAuthorizationForAppResponse201Data = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], hashed_token = hashed_token.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], note_url = note_url.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], token_last_eight = token_last_eight.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsGetOrCreateAuthorizationForAppResponse201Data]
  }
  
  @scala.inline
  implicit class OauthAuthorizationsGetOrCreateAuthorizationForAppResponse201DataMutableBuilder[Self <: OauthAuthorizationsGetOrCreateAuthorizationForAppResponse201Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: Clientid): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashed_token(value: String): Self = StObject.set(x, "hashed_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote_url(value: String): Self = StObject.set(x, "note_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken_last_eight(value: String): Self = StObject.set(x, "token_last_eight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
