package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullsRemoveRequestedReviewersEndpoint extends StObject {
  
  var owner: String = js.native
  
  var pull_number: Double = js.native
  
  var repo: String = js.native
  
  /**
    * An array of user `login`s that will be removed.
    */
  var reviewers: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An array of team `slug`s that will be removed.
    */
  var team_reviewers: js.UndefOr[js.Array[String]] = js.native
}
object PullsRemoveRequestedReviewersEndpoint {
  
  @scala.inline
  def apply(owner: String, pull_number: Double, repo: String): PullsRemoveRequestedReviewersEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsRemoveRequestedReviewersEndpoint]
  }
  
  @scala.inline
  implicit class PullsRemoveRequestedReviewersEndpointMutableBuilder[Self <: PullsRemoveRequestedReviewersEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull_number(value: Double): Self = StObject.set(x, "pull_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewers(value: js.Array[String]): Self = StObject.set(x, "reviewers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewersUndefined: Self = StObject.set(x, "reviewers", js.undefined)
    
    @scala.inline
    def setReviewersVarargs(value: String*): Self = StObject.set(x, "reviewers", js.Array(value :_*))
    
    @scala.inline
    def setTeam_reviewers(value: js.Array[String]): Self = StObject.set(x, "team_reviewers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_reviewersUndefined: Self = StObject.set(x, "team_reviewers", js.undefined)
    
    @scala.inline
    def setTeam_reviewersVarargs(value: String*): Self = StObject.set(x, "team_reviewers", js.Array(value :_*))
  }
}
