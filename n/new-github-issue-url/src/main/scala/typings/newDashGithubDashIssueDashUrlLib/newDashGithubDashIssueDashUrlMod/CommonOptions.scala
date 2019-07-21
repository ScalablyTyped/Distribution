package typings
package newDashGithubDashIssueDashUrlLib.newDashGithubDashIssueDashUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends js.Object {
  /**
  		The user to assign to the issue.
  		_Requires the user to have the permission to add assignee._
  		*/
  val assignee: js.UndefOr[java.lang.String] = js.undefined
  /**
  		The issue body.
  		*/
  val body: js.UndefOr[java.lang.String] = js.undefined
  /**
  		The labels for the issue.
  		_Requires the user to have the permission to add labels._
  		*/
  val labels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  		The milestone for the issue.
  		_Requires the user to have the permission to add milestone._
  		*/
  val milestone: js.UndefOr[java.lang.String] = js.undefined
  /**
  		The projects to add the issue to.
  		The project reference format is `user/<project-number>`, for example, if the URL to the project is `https://github.com/sindresorhus/some-repo/projects/3`, the project reference would be `some-repo/3`.
  		_Requires the user to have the permission to add projects._
  		*/
  val projects: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  		Use an [issue template](https://help.github.com/articles/manually-creating-a-single-issue-template-for-your-repository/).
  		@example
  		```
  		'unicorn.md' // If you want to use a template at `ISSUE_TEMPLATE/unicorn.md`.
  		```
  		*/
  val template: js.UndefOr[java.lang.String] = js.undefined
  /**
  		The issue title.
  		*/
  val title: js.UndefOr[java.lang.String] = js.undefined
}

object CommonOptions {
  @scala.inline
  def apply(
    assignee: java.lang.String = null,
    body: java.lang.String = null,
    labels: js.Array[java.lang.String] = null,
    milestone: java.lang.String = null,
    projects: js.Array[java.lang.String] = null,
    template: java.lang.String = null,
    title: java.lang.String = null
  ): CommonOptions = {
    val __obj = js.Dynamic.literal()
    if (assignee != null) __obj.updateDynamic("assignee")(assignee)
    if (body != null) __obj.updateDynamic("body")(body)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (milestone != null) __obj.updateDynamic("milestone")(milestone)
    if (projects != null) __obj.updateDynamic("projects")(projects)
    if (template != null) __obj.updateDynamic("template")(template)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[CommonOptions]
  }
}

