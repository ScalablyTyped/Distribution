package typings.newDashGithubDashIssueDashUrl.newDashGithubDashIssueDashUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	You are required to either specify the `repoUrl` option or both the `user` and `repo` options.
	*/
/* Rewritten from type alias, can be one of: 
  - typings.newDashGithubDashIssueDashUrl.newDashGithubDashIssueDashUrlMod.RepoUrlOptions
  - typings.newDashGithubDashIssueDashUrl.newDashGithubDashIssueDashUrlMod.UserAndRepoOptions
*/
trait Options extends js.Object

object Options {
  @scala.inline
  def RepoUrlOptions(
    repoUrl: String,
    assignee: String = null,
    body: String = null,
    labels: js.Array[String] = null,
    milestone: String = null,
    projects: js.Array[String] = null,
    template: String = null,
    title: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(repoUrl = repoUrl.asInstanceOf[js.Any])
    if (assignee != null) __obj.updateDynamic("assignee")(assignee.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (milestone != null) __obj.updateDynamic("milestone")(milestone.asInstanceOf[js.Any])
    if (projects != null) __obj.updateDynamic("projects")(projects.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  def UserAndRepoOptions(
    repo: String,
    user: String,
    assignee: String = null,
    body: String = null,
    labels: js.Array[String] = null,
    milestone: String = null,
    projects: js.Array[String] = null,
    template: String = null,
    title: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(repo = repo.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (assignee != null) __obj.updateDynamic("assignee")(assignee.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (milestone != null) __obj.updateDynamic("milestone")(milestone.asInstanceOf[js.Any])
    if (projects != null) __obj.updateDynamic("projects")(projects.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

