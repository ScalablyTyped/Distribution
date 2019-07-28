package typings.newDashGithubDashIssueDashUrl.newDashGithubDashIssueDashUrlMod

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
    val __obj = js.Dynamic.literal(repoUrl = repoUrl)
    if (assignee != null) __obj.updateDynamic("assignee")(assignee)
    if (body != null) __obj.updateDynamic("body")(body)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (milestone != null) __obj.updateDynamic("milestone")(milestone)
    if (projects != null) __obj.updateDynamic("projects")(projects)
    if (template != null) __obj.updateDynamic("template")(template)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[RepoUrlOptions]
  }
}

