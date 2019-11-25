package typings.newDashGithubDashIssueDashUrl.newDashGithubDashIssueDashUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends js.Object {
  /**
  		The user to assign to the issue.
  		_Requires the user to have the permission to add assignee._
  		*/
  val assignee: js.UndefOr[String] = js.undefined
  /**
  		The issue body.
  		*/
  val body: js.UndefOr[String] = js.undefined
  /**
  		The labels for the issue.
  		_Requires the user to have the permission to add labels._
  		*/
  val labels: js.UndefOr[js.Array[String]] = js.undefined
  /**
  		The milestone for the issue.
  		_Requires the user to have the permission to add milestone._
  		*/
  val milestone: js.UndefOr[String] = js.undefined
  /**
  		The projects to add the issue to.
  		The project reference format is `user/<project-number>`, for example, if the URL to the project is `https://github.com/sindresorhus/some-repo/projects/3`, the project reference would be `some-repo/3`.
  		_Requires the user to have the permission to add projects._
  		*/
  val projects: js.UndefOr[js.Array[String]] = js.undefined
  /**
  		Use an [issue template](https://help.github.com/articles/manually-creating-a-single-issue-template-for-your-repository/).
  		@example
  		```
  		'unicorn.md' // If you want to use a template at `ISSUE_TEMPLATE/unicorn.md`.
  		```
  		*/
  val template: js.UndefOr[String] = js.undefined
  /**
  		The issue title.
  		*/
  val title: js.UndefOr[String] = js.undefined
}

object CommonOptions {
  @scala.inline
  def apply(
    assignee: String = null,
    body: String = null,
    labels: js.Array[String] = null,
    milestone: String = null,
    projects: js.Array[String] = null,
    template: String = null,
    title: String = null
  ): CommonOptions = {
    val __obj = js.Dynamic.literal()
    if (assignee != null) __obj.updateDynamic("assignee")(assignee.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (milestone != null) __obj.updateDynamic("milestone")(milestone.asInstanceOf[js.Any])
    if (projects != null) __obj.updateDynamic("projects")(projects.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonOptions]
  }
}

