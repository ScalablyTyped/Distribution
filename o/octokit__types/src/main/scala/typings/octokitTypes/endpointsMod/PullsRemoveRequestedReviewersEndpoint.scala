package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsRemoveRequestedReviewersEndpoint extends js.Object {
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
  implicit class PullsRemoveRequestedReviewersEndpointOps[Self <: PullsRemoveRequestedReviewersEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setPull_number(value: Double): Self = this.set("pull_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setReviewersVarargs(value: String*): Self = this.set("reviewers", js.Array(value :_*))
    @scala.inline
    def setReviewers(value: js.Array[String]): Self = this.set("reviewers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReviewers: Self = this.set("reviewers", js.undefined)
    @scala.inline
    def setTeam_reviewersVarargs(value: String*): Self = this.set("team_reviewers", js.Array(value :_*))
    @scala.inline
    def setTeam_reviewers(value: js.Array[String]): Self = this.set("team_reviewers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeam_reviewers: Self = this.set("team_reviewers", js.undefined)
  }
  
}

