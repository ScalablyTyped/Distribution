package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsUpdateDiscussionInOrgEndpoint extends StObject {
  
  /**
    * The discussion post's body text.
    */
  var body: js.UndefOr[String] = js.undefined
  
  var discussion_number: Double
  
  @JSName("org")
  var org_ : String
  
  var team_slug: String
  
  /**
    * The discussion post's title.
    */
  var title: js.UndefOr[String] = js.undefined
}
object TeamsUpdateDiscussionInOrgEndpoint {
  
  inline def apply(discussion_number: Double, org_ : String, team_slug: String): TeamsUpdateDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsUpdateDiscussionInOrgEndpoint]
  }
  
  extension [Self <: TeamsUpdateDiscussionInOrgEndpoint](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDiscussion_number(value: Double): Self = StObject.set(x, "discussion_number", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
