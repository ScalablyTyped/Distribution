package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowmergecommitAllowrebasemergeAllowsquashmerge extends js.Object {
  var allow_merge_commit: AnonType
  var allow_rebase_merge: AnonType
  var allow_squash_merge: AnonType
  var archived: AnonType
  var default_branch: AnonType
  var delete_branch_on_merge: AnonType
  var description: AnonType
  var has_issues: AnonType
  var has_projects: AnonType
  var has_wiki: AnonType
  var homepage: AnonType
  var is_template: AnonType
  var name: AnonType
  var owner: AnonRequired
  var `private`: AnonType
  var repo: AnonRequired
  var visibility: AnonEnum
}

object AnonAllowmergecommitAllowrebasemergeAllowsquashmerge {
  @scala.inline
  def apply(
    allow_merge_commit: AnonType,
    allow_rebase_merge: AnonType,
    allow_squash_merge: AnonType,
    archived: AnonType,
    default_branch: AnonType,
    delete_branch_on_merge: AnonType,
    description: AnonType,
    has_issues: AnonType,
    has_projects: AnonType,
    has_wiki: AnonType,
    homepage: AnonType,
    is_template: AnonType,
    name: AnonType,
    owner: AnonRequired,
    `private`: AnonType,
    repo: AnonRequired,
    visibility: AnonEnum
  ): AnonAllowmergecommitAllowrebasemergeAllowsquashmerge = {
    val __obj = js.Dynamic.literal(allow_merge_commit = allow_merge_commit.asInstanceOf[js.Any], allow_rebase_merge = allow_rebase_merge.asInstanceOf[js.Any], allow_squash_merge = allow_squash_merge.asInstanceOf[js.Any], archived = archived.asInstanceOf[js.Any], default_branch = default_branch.asInstanceOf[js.Any], delete_branch_on_merge = delete_branch_on_merge.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], has_issues = has_issues.asInstanceOf[js.Any], has_projects = has_projects.asInstanceOf[js.Any], has_wiki = has_wiki.asInstanceOf[js.Any], homepage = homepage.asInstanceOf[js.Any], is_template = is_template.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowmergecommitAllowrebasemergeAllowsquashmerge]
  }
}

