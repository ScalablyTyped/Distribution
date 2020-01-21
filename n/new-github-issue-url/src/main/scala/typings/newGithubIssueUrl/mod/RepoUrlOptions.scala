package typings.newGithubIssueUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepoUrlOptions
  extends CommonOptions
     with Options {
  /**
  		The full URL to the repo.
  		*/
  val repoUrl: String
}

object RepoUrlOptions {
  @scala.inline
  def apply(
    repoUrl: String,
    assignee: String = null,
    body: String = null,
    labels: js.Array[String] = null,
    milestone: String = null,
    projects: js.Array[String] = null,
    template: String = null,
    title: String = null
  ): RepoUrlOptions = {
    val __obj = js.Dynamic.literal(repoUrl = repoUrl.asInstanceOf[js.Any])
    if (assignee != null) __obj.updateDynamic("assignee")(assignee.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (milestone != null) __obj.updateDynamic("milestone")(milestone.asInstanceOf[js.Any])
    if (projects != null) __obj.updateDynamic("projects")(projects.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoUrlOptions]
  }
}

