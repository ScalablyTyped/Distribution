package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateEndpoint extends js.Object {
  var allow_merge_commit: js.UndefOr[Boolean] = js.undefined
  var allow_rebase_merge: js.UndefOr[Boolean] = js.undefined
  var allow_squash_merge: js.UndefOr[Boolean] = js.undefined
  var archived: js.UndefOr[Boolean] = js.undefined
  var default_branch: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var has_issues: js.UndefOr[Boolean] = js.undefined
  var has_projects: js.UndefOr[Boolean] = js.undefined
  var has_wiki: js.UndefOr[Boolean] = js.undefined
  var homepage: js.UndefOr[String] = js.undefined
  var is_template: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var owner: String
  var `private`: js.UndefOr[Boolean] = js.undefined
  var repo: String
}

object ReposUpdateEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    allow_merge_commit: js.UndefOr[Boolean] = js.undefined,
    allow_rebase_merge: js.UndefOr[Boolean] = js.undefined,
    allow_squash_merge: js.UndefOr[Boolean] = js.undefined,
    archived: js.UndefOr[Boolean] = js.undefined,
    default_branch: String = null,
    description: String = null,
    has_issues: js.UndefOr[Boolean] = js.undefined,
    has_projects: js.UndefOr[Boolean] = js.undefined,
    has_wiki: js.UndefOr[Boolean] = js.undefined,
    homepage: String = null,
    is_template: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    `private`: js.UndefOr[Boolean] = js.undefined
  ): ReposUpdateEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (!js.isUndefined(allow_merge_commit)) __obj.updateDynamic("allow_merge_commit")(allow_merge_commit)
    if (!js.isUndefined(allow_rebase_merge)) __obj.updateDynamic("allow_rebase_merge")(allow_rebase_merge)
    if (!js.isUndefined(allow_squash_merge)) __obj.updateDynamic("allow_squash_merge")(allow_squash_merge)
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived)
    if (default_branch != null) __obj.updateDynamic("default_branch")(default_branch)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(has_issues)) __obj.updateDynamic("has_issues")(has_issues)
    if (!js.isUndefined(has_projects)) __obj.updateDynamic("has_projects")(has_projects)
    if (!js.isUndefined(has_wiki)) __obj.updateDynamic("has_wiki")(has_wiki)
    if (homepage != null) __obj.updateDynamic("homepage")(homepage)
    if (!js.isUndefined(is_template)) __obj.updateDynamic("is_template")(is_template)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[ReposUpdateEndpoint]
  }
}

