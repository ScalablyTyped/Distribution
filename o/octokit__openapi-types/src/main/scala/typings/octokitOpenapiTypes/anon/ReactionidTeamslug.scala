package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactionidTeamslug extends StObject {
  
  var discussion_number: Double
  
  @JSName("org")
  var org_ : String
  
  var reaction_id: Double
  
  var team_slug: String
}
object ReactionidTeamslug {
  
  inline def apply(discussion_number: Double, org_ : String, reaction_id: Double, team_slug: String): ReactionidTeamslug = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionidTeamslug]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReactionidTeamslug] (val x: Self) extends AnyVal {
    
    inline def setDiscussion_number(value: Double): Self = StObject.set(x, "discussion_number", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setReaction_id(value: Double): Self = StObject.set(x, "reaction_id", value.asInstanceOf[js.Any])
    
    inline def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
  }
}
