package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscussionnumberOrg extends StObject {
  
  /** The number that identifies the discussion. */
  var discussion_number: Double
  
  /** The organization name. The name is not case sensitive. */
  @JSName("org")
  var org_ : String
  
  /** The unique identifier of the reaction. */
  var reaction_id: Double
  
  /** The slug of the team name. */
  var team_slug: String
}
object DiscussionnumberOrg {
  
  inline def apply(discussion_number: Double, org_ : String, reaction_id: Double, team_slug: String): DiscussionnumberOrg = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscussionnumberOrg]
  }
  
  extension [Self <: DiscussionnumberOrg](x: Self) {
    
    inline def setDiscussion_number(value: Double): Self = StObject.set(x, "discussion_number", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setReaction_id(value: Double): Self = StObject.set(x, "reaction_id", value.asInstanceOf[js.Any])
    
    inline def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
  }
}
