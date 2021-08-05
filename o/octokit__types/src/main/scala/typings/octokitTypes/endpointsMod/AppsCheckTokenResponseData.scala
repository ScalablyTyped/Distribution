package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import typings.octokitTypes.anon.Clientid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsCheckTokenResponseData extends StObject {
  
  var app: Clientid
  
  var created_at: String
  
  var fingerprint: String
  
  var hashed_token: String
  
  var id: Double
  
  var note: String
  
  var note_url: String
  
  var scopes: js.Array[String]
  
  var token: String
  
  var token_last_eight: String
  
  var updated_at: String
  
  var url: String
  
  var user: Avatarurl
}
object AppsCheckTokenResponseData {
  
  inline def apply(
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
    url: String,
    user: Avatarurl
  ): AppsCheckTokenResponseData = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], hashed_token = hashed_token.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], note_url = note_url.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], token_last_eight = token_last_eight.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCheckTokenResponseData]
  }
  
  extension [Self <: AppsCheckTokenResponseData](x: Self) {
    
    inline def setApp(value: Clientid): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setHashed_token(value: String): Self = StObject.set(x, "hashed_token", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNote_url(value: String): Self = StObject.set(x, "note_url", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setToken_last_eight(value: String): Self = StObject.set(x, "token_last_eight", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Avatarurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
