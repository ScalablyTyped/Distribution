package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Failedreason extends StObject {
  
  /** Format: date-time */
  var created_at: String
  
  var email: String | Null
  
  /** Format: date-time */
  var failed_at: String | Null
  
  var failed_reason: String | Null
  
  var id: Double
  
  var invitation_source: js.UndefOr[String] = js.undefined
  
  /** Format: uri */
  var invitation_teams_url: String
  
  /** User */
  var inviter: Deleted | Null
  
  var login: String | Null
  
  var node_id: String
  
  var role: String
  
  var team_count: Double
}
object Failedreason {
  
  inline def apply(
    created_at: String,
    id: Double,
    invitation_teams_url: String,
    node_id: String,
    role: String,
    team_count: Double
  ): Failedreason = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invitation_teams_url = invitation_teams_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], team_count = team_count.asInstanceOf[js.Any], email = null, failed_at = null, failed_reason = null, inviter = null, login = null)
    __obj.asInstanceOf[Failedreason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Failedreason] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setFailed_at(value: String): Self = StObject.set(x, "failed_at", value.asInstanceOf[js.Any])
    
    inline def setFailed_atNull: Self = StObject.set(x, "failed_at", null)
    
    inline def setFailed_reason(value: String): Self = StObject.set(x, "failed_reason", value.asInstanceOf[js.Any])
    
    inline def setFailed_reasonNull: Self = StObject.set(x, "failed_reason", null)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvitation_source(value: String): Self = StObject.set(x, "invitation_source", value.asInstanceOf[js.Any])
    
    inline def setInvitation_sourceUndefined: Self = StObject.set(x, "invitation_source", js.undefined)
    
    inline def setInvitation_teams_url(value: String): Self = StObject.set(x, "invitation_teams_url", value.asInstanceOf[js.Any])
    
    inline def setInviter(value: Deleted): Self = StObject.set(x, "inviter", value.asInstanceOf[js.Any])
    
    inline def setInviterNull: Self = StObject.set(x, "inviter", null)
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setLoginNull: Self = StObject.set(x, "login", null)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setTeam_count(value: Double): Self = StObject.set(x, "team_count", value.asInstanceOf[js.Any])
  }
}
