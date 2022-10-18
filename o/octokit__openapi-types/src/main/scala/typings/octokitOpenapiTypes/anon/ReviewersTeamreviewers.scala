package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReviewersTeamreviewers extends StObject {
  
  /** @description An array of user `login`s that will be removed. */
  var reviewers: js.Array[String]
  
  /** @description An array of team `slug`s that will be removed. */
  var team_reviewers: js.UndefOr[js.Array[String]] = js.undefined
}
object ReviewersTeamreviewers {
  
  inline def apply(reviewers: js.Array[String]): ReviewersTeamreviewers = {
    val __obj = js.Dynamic.literal(reviewers = reviewers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewersTeamreviewers]
  }
  
  extension [Self <: ReviewersTeamreviewers](x: Self) {
    
    inline def setReviewers(value: js.Array[String]): Self = StObject.set(x, "reviewers", value.asInstanceOf[js.Any])
    
    inline def setReviewersVarargs(value: String*): Self = StObject.set(x, "reviewers", js.Array(value*))
    
    inline def setTeam_reviewers(value: js.Array[String]): Self = StObject.set(x, "team_reviewers", value.asInstanceOf[js.Any])
    
    inline def setTeam_reviewersUndefined: Self = StObject.set(x, "team_reviewers", js.undefined)
    
    inline def setTeam_reviewersVarargs(value: String*): Self = StObject.set(x, "team_reviewers", js.Array(value*))
  }
}
