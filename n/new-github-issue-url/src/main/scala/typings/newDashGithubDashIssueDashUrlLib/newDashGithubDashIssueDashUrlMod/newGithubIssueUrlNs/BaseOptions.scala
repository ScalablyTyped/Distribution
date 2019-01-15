package typings
package newDashGithubDashIssueDashUrlLib.newDashGithubDashIssueDashUrlMod.newGithubIssueUrlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  /**
    * The user to assign to the issue.
    *
    * *Requires the user to have the permission to add assignee.*
    */
  var assignee: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The issue body.
    */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The labels for the issue.
    *
    * *Requires the user to have the permission to add labels.*
    */
  var labels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The milestone for the issue.
    *
    * *Requires the user to have the permission to add milestone.*
    */
  var milestone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The projects to add the issue to.
    *
    * The project reference format is `user/<project-number>`, for example, if the URL to the project
    * is `https://github.com/sindresorhus/some-repo/projects/3`, the project reference would be `some-repo/3`.
    *
    * *Requires the user to have the permission to add projects.*
    */
  var projects: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Use an [issue template](https://help.github.com/articles/manually-creating-a-single-issue-template-for-your-repository).
    *
    * For example, if you want to use a template at `ISSUE_TEMPLATE/unicorn.md`, you would specify `unicorn.md` here.
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The issue title.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

