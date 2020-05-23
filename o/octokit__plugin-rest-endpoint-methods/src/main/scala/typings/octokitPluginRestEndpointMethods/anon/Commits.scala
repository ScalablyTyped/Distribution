package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commits extends js.Object {
  var code: `1015`
  var commits: `1016`
  var issuesAndPullRequests: `1017`
  var labels: `1018`
  var repos: `1019`
  var topics: `1020`
  var users: `1021`
}

object Commits {
  @scala.inline
  def apply(
    code: `1015`,
    commits: `1016`,
    issuesAndPullRequests: `1017`,
    labels: `1018`,
    repos: `1019`,
    topics: `1020`,
    users: `1021`
  ): Commits = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], issuesAndPullRequests = issuesAndPullRequests.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commits]
  }
}

