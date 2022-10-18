package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Teamslug extends StObject {
  
  /** The organization name. The name is not case sensitive. */
  @JSName("org")
  var org_ : String
  
  /** The slug of the team name. */
  var team_slug: String
}
object Teamslug {
  
  inline def apply(org_ : String, team_slug: String): Teamslug = {
    val __obj = js.Dynamic.literal(team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Teamslug]
  }
  
  extension [Self <: Teamslug](x: Self) {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
  }
}
