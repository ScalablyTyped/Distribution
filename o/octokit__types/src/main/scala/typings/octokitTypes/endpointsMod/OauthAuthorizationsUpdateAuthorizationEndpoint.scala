package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OauthAuthorizationsUpdateAuthorizationEndpoint extends StObject {
  
  /**
    * A list of scopes to add to this authorization.
    */
  var add_scopes: js.UndefOr[js.Array[String]] = js.native
  
  var authorization_id: Double = js.native
  
  /**
    * A unique string to distinguish an authorization from others created for the same client ID and user.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * A note to remind you what the OAuth token is for. Tokens not associated with a specific OAuth application (i.e. personal access tokens) must have a unique note.
    */
  var note: js.UndefOr[String] = js.native
  
  /**
    * A URL to remind you what app the OAuth token is for.
    */
  var note_url: js.UndefOr[String] = js.native
  
  /**
    * A list of scopes to remove from this authorization.
    */
  var remove_scopes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Replaces the authorization scopes with these.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.native
}
object OauthAuthorizationsUpdateAuthorizationEndpoint {
  
  @scala.inline
  def apply(authorization_id: Double): OauthAuthorizationsUpdateAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(authorization_id = authorization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsUpdateAuthorizationEndpoint]
  }
  
  @scala.inline
  implicit class OauthAuthorizationsUpdateAuthorizationEndpointMutableBuilder[Self <: OauthAuthorizationsUpdateAuthorizationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd_scopes(value: js.Array[String]): Self = StObject.set(x, "add_scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdd_scopesUndefined: Self = StObject.set(x, "add_scopes", js.undefined)
    
    @scala.inline
    def setAdd_scopesVarargs(value: String*): Self = StObject.set(x, "add_scopes", js.Array(value :_*))
    
    @scala.inline
    def setAuthorization_id(value: Double): Self = StObject.set(x, "authorization_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNote_url(value: String): Self = StObject.set(x, "note_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote_urlUndefined: Self = StObject.set(x, "note_url", js.undefined)
    
    @scala.inline
    def setRemove_scopes(value: js.Array[String]): Self = StObject.set(x, "remove_scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove_scopesUndefined: Self = StObject.set(x, "remove_scopes", js.undefined)
    
    @scala.inline
    def setRemove_scopesVarargs(value: String*): Self = StObject.set(x, "remove_scopes", js.Array(value :_*))
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
  }
}
