package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCodeCommits extends js.Object {
  var code: AnonMethodParamsUrlAnonOrder
  var commits: AnonHeadersMethodParamsUrlAnonAcceptAnonOrder
  var issues: AnonDeprecatedMethodParamsUrlAnonOrder
  var issuesAndPullRequests: AnonMethodParamsUrlAnonOrder
  var labels: AnonMethodParamsUrlAnonOrderQ
  var repos: AnonMethodParamsUrlAnonOrder
  var topics: AnonMethodParamsUrlAnonQ
  var users: AnonMethodParamsUrlAnonOrder
}

object AnonCodeCommits {
  @scala.inline
  def apply(
    code: AnonMethodParamsUrlAnonOrder,
    commits: AnonHeadersMethodParamsUrlAnonAcceptAnonOrder,
    issues: AnonDeprecatedMethodParamsUrlAnonOrder,
    issuesAndPullRequests: AnonMethodParamsUrlAnonOrder,
    labels: AnonMethodParamsUrlAnonOrderQ,
    repos: AnonMethodParamsUrlAnonOrder,
    topics: AnonMethodParamsUrlAnonQ,
    users: AnonMethodParamsUrlAnonOrder
  ): AnonCodeCommits = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], issuesAndPullRequests = issuesAndPullRequests.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCodeCommits]
  }
}

