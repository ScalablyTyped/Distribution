package typings.newGithubIssueUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	You are required to either specify the `repoUrl` option or both the `user` and `repo` options.
	*/
/* Rewritten from type alias, can be one of: 
  - typings.newGithubIssueUrl.mod.RepoUrlOptions
  - typings.newGithubIssueUrl.mod.UserAndRepoOptions
*/
trait Options extends js.Object

object Options {
  @scala.inline
  def RepoUrlOptions(repoUrl: String): Options = {
    val __obj = js.Dynamic.literal(repoUrl = repoUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  def UserAndRepoOptions(repo: String, user: String): Options = {
    val __obj = js.Dynamic.literal(repo = repo.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

