package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgTeamslug extends StObject {
  
  /** The organization name. The name is not case sensitive. */
  @JSName("org")
  var org_ : String
  
  /** The slug of the team name. */
  var team_slug: String
  
  /** The handle for the GitHub user account. */
  var username: String
}
object OrgTeamslug {
  
  inline def apply(org_ : String, team_slug: String, username: String): OrgTeamslug = {
    val __obj = js.Dynamic.literal(team_slug = team_slug.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgTeamslug]
  }
  
  extension [Self <: OrgTeamslug](x: Self) {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
