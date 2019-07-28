package typings.newDashGithubDashIssueDashUrl.newDashGithubDashIssueDashUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAndRepoOptions
  extends CommonOptions
     with Options {
  /**
  		GitHub repo.
  		*/
  val repo: String
  /**
  		GitHub username or organization.
  		*/
  val user: String
}

object UserAndRepoOptions {
  @scala.inline
  def apply(
    repo: String,
    user: String,
    assignee: String = null,
    body: String = null,
    labels: js.Array[String] = null,
    milestone: String = null,
    projects: js.Array[String] = null,
    template: String = null,
    title: String = null
  ): UserAndRepoOptions = {
    val __obj = js.Dynamic.literal(repo = repo, user = user)
    if (assignee != null) __obj.updateDynamic("assignee")(assignee)
    if (body != null) __obj.updateDynamic("body")(body)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (milestone != null) __obj.updateDynamic("milestone")(milestone)
    if (projects != null) __obj.updateDynamic("projects")(projects)
    if (template != null) __obj.updateDynamic("template")(template)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[UserAndRepoOptions]
  }
}

