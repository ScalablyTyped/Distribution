package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fingerprint extends StObject {
  
  var app: ClientidName
  
  /** Format: date-time */
  var created_at: String
  
  /** Format: date-time */
  var expires_at: String | Null
  
  var fingerprint: String | Null
  
  var hashed_token: String | Null
  
  var id: Double
  
  var installation: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-scoped-installation'] */ js.Any
  ] = js.undefined
  
  var note: String | Null
  
  /** Format: uri */
  var note_url: String | Null
  
  /** @description A list of scopes that this authorization is in. */
  var scopes: js.Array[String] | Null
  
  var token: String
  
  var token_last_eight: String | Null
  
  /** Format: date-time */
  var updated_at: String
  
  /** Format: uri */
  var url: String
  
  var user: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
  ] = js.undefined
}
object Fingerprint {
  
  inline def apply(app: ClientidName, created_at: String, id: Double, token: String, updated_at: String, url: String): Fingerprint = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], expires_at = null, fingerprint = null, hashed_token = null, note = null, note_url = null, scopes = null, token_last_eight = null)
    __obj.asInstanceOf[Fingerprint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fingerprint] (val x: Self) extends AnyVal {
    
    inline def setApp(value: ClientidName): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setExpires_at(value: String): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setExpires_atNull: Self = StObject.set(x, "expires_at", null)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintNull: Self = StObject.set(x, "fingerprint", null)
    
    inline def setHashed_token(value: String): Self = StObject.set(x, "hashed_token", value.asInstanceOf[js.Any])
    
    inline def setHashed_tokenNull: Self = StObject.set(x, "hashed_token", null)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInstallation(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-scoped-installation'] */ js.Any
    ): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteNull: Self = StObject.set(x, "note", null)
    
    inline def setNote_url(value: String): Self = StObject.set(x, "note_url", value.asInstanceOf[js.Any])
    
    inline def setNote_urlNull: Self = StObject.set(x, "note_url", null)
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesNull: Self = StObject.set(x, "scopes", null)
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setToken_last_eight(value: String): Self = StObject.set(x, "token_last_eight", value.asInstanceOf[js.Any])
    
    inline def setToken_last_eightNull: Self = StObject.set(x, "token_last_eight", null)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUser(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
    ): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
