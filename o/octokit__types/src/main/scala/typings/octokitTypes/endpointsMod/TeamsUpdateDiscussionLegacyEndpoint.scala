package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsUpdateDiscussionLegacyEndpoint extends StObject {
  
  /**
    * The discussion post's body text.
    */
  var body: js.UndefOr[String] = js.undefined
  
  var discussion_number: Double
  
  var team_id: Double
  
  /**
    * The discussion post's title.
    */
  var title: js.UndefOr[String] = js.undefined
}
object TeamsUpdateDiscussionLegacyEndpoint {
  
  inline def apply(discussion_number: Double, team_id: Double): TeamsUpdateDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsUpdateDiscussionLegacyEndpoint]
  }
  
  extension [Self <: TeamsUpdateDiscussionLegacyEndpoint](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDiscussion_number(value: Double): Self = StObject.set(x, "discussion_number", value.asInstanceOf[js.Any])
    
    inline def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
