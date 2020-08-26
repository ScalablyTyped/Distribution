package typings.newGithubIssueUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonOptions extends js.Object {
  /**
  		The user to assign to the issue.
  		_Requires the user to have the permission to add assignee._
  		*/
  val assignee: js.UndefOr[String] = js.native
  /**
  		The issue body.
  		*/
  val body: js.UndefOr[String] = js.native
  /**
  		The labels for the issue.
  		_Requires the user to have the permission to add labels._
  		*/
  val labels: js.UndefOr[js.Array[String]] = js.native
  /**
  		The milestone for the issue.
  		_Requires the user to have the permission to add milestone._
  		*/
  val milestone: js.UndefOr[String] = js.native
  /**
  		The projects to add the issue to.
  		The project reference format is `user/<project-number>`, for example, if the URL to the project is `https://github.com/sindresorhus/some-repo/projects/3`, the project reference would be `some-repo/3`.
  		_Requires the user to have the permission to add projects._
  		*/
  val projects: js.UndefOr[js.Array[String]] = js.native
  /**
  		Use an [issue template](https://help.github.com/articles/manually-creating-a-single-issue-template-for-your-repository/).
  		@example
  		```
  		'unicorn.md' // If you want to use a template at `ISSUE_TEMPLATE/unicorn.md`.
  		```
  		*/
  val template: js.UndefOr[String] = js.native
  /**
  		The issue title.
  		*/
  val title: js.UndefOr[String] = js.native
}

object CommonOptions {
  @scala.inline
  def apply(): CommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptions]
  }
  @scala.inline
  implicit class CommonOptionsOps[Self <: CommonOptions] (val x: Self) extends AnyVal {
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
    def setAssignee(value: String): Self = this.set("assignee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignee: Self = this.set("assignee", js.undefined)
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: String*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setMilestone(value: String): Self = this.set("milestone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMilestone: Self = this.set("milestone", js.undefined)
    @scala.inline
    def setProjectsVarargs(value: String*): Self = this.set("projects", js.Array(value :_*))
    @scala.inline
    def setProjects(value: js.Array[String]): Self = this.set("projects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjects: Self = this.set("projects", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

