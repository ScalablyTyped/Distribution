package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.`squirrel-girl`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactionsDeleteForIssueEndpoint
  extends StObject
     with RequiredPreview[`squirrel-girl`] {
  
  var issue_number: Double
  
  var owner: String
  
  var reaction_id: Double
  
  var repo: String
}
object ReactionsDeleteForIssueEndpoint {
  
  inline def apply(
    issue_number: Double,
    mediaType: `0`[`squirrel-girl`],
    owner: String,
    reaction_id: Double,
    repo: String
  ): ReactionsDeleteForIssueEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsDeleteForIssueEndpoint]
  }
  
  extension [Self <: ReactionsDeleteForIssueEndpoint](x: Self) {
    
    inline def setIssue_number(value: Double): Self = StObject.set(x, "issue_number", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setReaction_id(value: Double): Self = StObject.set(x, "reaction_id", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
