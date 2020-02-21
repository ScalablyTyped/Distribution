package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowmergecommit extends js.Object {
  var allow_merge_commit: AnonType
  var allow_rebase_merge: AnonType
  var allow_squash_merge: AnonType
  var auto_init: AnonType
  var delete_branch_on_merge: AnonType
  var description: AnonType
  var gitignore_template: AnonType
  var has_issues: AnonType
  var has_projects: AnonType
  var has_wiki: AnonType
  var homepage: AnonType
  var is_template: AnonType
  var license_template: AnonType
  var name: AnonRequired
  var `private`: AnonType
  var team_id: AnonType
  var visibility: AnonEnum
}

object AnonAllowmergecommit {
  @scala.inline
  def apply(
    allow_merge_commit: AnonType,
    allow_rebase_merge: AnonType,
    allow_squash_merge: AnonType,
    auto_init: AnonType,
    delete_branch_on_merge: AnonType,
    description: AnonType,
    gitignore_template: AnonType,
    has_issues: AnonType,
    has_projects: AnonType,
    has_wiki: AnonType,
    homepage: AnonType,
    is_template: AnonType,
    license_template: AnonType,
    name: AnonRequired,
    `private`: AnonType,
    team_id: AnonType,
    visibility: AnonEnum
  ): AnonAllowmergecommit = {
    val __obj = js.Dynamic.literal(allow_merge_commit = allow_merge_commit.asInstanceOf[js.Any], allow_rebase_merge = allow_rebase_merge.asInstanceOf[js.Any], allow_squash_merge = allow_squash_merge.asInstanceOf[js.Any], auto_init = auto_init.asInstanceOf[js.Any], delete_branch_on_merge = delete_branch_on_merge.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], gitignore_template = gitignore_template.asInstanceOf[js.Any], has_issues = has_issues.asInstanceOf[js.Any], has_projects = has_projects.asInstanceOf[js.Any], has_wiki = has_wiki.asInstanceOf[js.Any], homepage = homepage.asInstanceOf[js.Any], is_template = is_template.asInstanceOf[js.Any], license_template = license_template.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowmergecommit]
  }
}

