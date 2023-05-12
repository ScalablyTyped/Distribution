package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invitationteamsurl extends StObject {
  
  var created_at: String
  
  var email: String | Null
  
  var failed_at: js.UndefOr[String | Null] = js.undefined
  
  var failed_reason: js.UndefOr[String | Null] = js.undefined
  
  var id: Double
  
  /** @example "member" */
  var invitation_source: js.UndefOr[String] = js.undefined
  
  /** @example "https://api.github.com/organizations/16/invitations/1/teams" */
  var invitation_teams_url: String
  
  var inviter: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
  
  var login: String | Null
  
  /** @example "MDIyOk9yZ2FuaXphdGlvbkludml0YXRpb24x" */
  var node_id: String
  
  var role: String
  
  var team_count: Double
}
object Invitationteamsurl {
  
  inline def apply(
    created_at: String,
    id: Double,
    invitation_teams_url: String,
    inviter: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any,
    node_id: String,
    role: String,
    team_count: Double
  ): Invitationteamsurl = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invitation_teams_url = invitation_teams_url.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], team_count = team_count.asInstanceOf[js.Any], email = null, login = null)
    __obj.asInstanceOf[Invitationteamsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Invitationteamsurl] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setFailed_at(value: String): Self = StObject.set(x, "failed_at", value.asInstanceOf[js.Any])
    
    inline def setFailed_atNull: Self = StObject.set(x, "failed_at", null)
    
    inline def setFailed_atUndefined: Self = StObject.set(x, "failed_at", js.undefined)
    
    inline def setFailed_reason(value: String): Self = StObject.set(x, "failed_reason", value.asInstanceOf[js.Any])
    
    inline def setFailed_reasonNull: Self = StObject.set(x, "failed_reason", null)
    
    inline def setFailed_reasonUndefined: Self = StObject.set(x, "failed_reason", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvitation_source(value: String): Self = StObject.set(x, "invitation_source", value.asInstanceOf[js.Any])
    
    inline def setInvitation_sourceUndefined: Self = StObject.set(x, "invitation_source", js.undefined)
    
    inline def setInvitation_teams_url(value: String): Self = StObject.set(x, "invitation_teams_url", value.asInstanceOf[js.Any])
    
    inline def setInviter(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
    ): Self = StObject.set(x, "inviter", value.asInstanceOf[js.Any])
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setLoginNull: Self = StObject.set(x, "login", null)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setTeam_count(value: Double): Self = StObject.set(x, "team_count", value.asInstanceOf[js.Any])
  }
}
