package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateInOrgEndpoint extends js.Object {
  var allow_merge_commit: js.UndefOr[Boolean] = js.undefined
  var allow_rebase_merge: js.UndefOr[Boolean] = js.undefined
  var allow_squash_merge: js.UndefOr[Boolean] = js.undefined
  var auto_init: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var gitignore_template: js.UndefOr[String] = js.undefined
  var has_issues: js.UndefOr[Boolean] = js.undefined
  var has_projects: js.UndefOr[Boolean] = js.undefined
  var has_wiki: js.UndefOr[Boolean] = js.undefined
  var homepage: js.UndefOr[String] = js.undefined
  var is_template: js.UndefOr[Boolean] = js.undefined
  var license_template: js.UndefOr[String] = js.undefined
  var name: String
  var org: String
  var `private`: js.UndefOr[Boolean] = js.undefined
  var team_id: js.UndefOr[Double] = js.undefined
}

object ReposCreateInOrgEndpoint {
  @scala.inline
  def apply(
    name: String,
    org: String,
    allow_merge_commit: js.UndefOr[Boolean] = js.undefined,
    allow_rebase_merge: js.UndefOr[Boolean] = js.undefined,
    allow_squash_merge: js.UndefOr[Boolean] = js.undefined,
    auto_init: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    gitignore_template: String = null,
    has_issues: js.UndefOr[Boolean] = js.undefined,
    has_projects: js.UndefOr[Boolean] = js.undefined,
    has_wiki: js.UndefOr[Boolean] = js.undefined,
    homepage: String = null,
    is_template: js.UndefOr[Boolean] = js.undefined,
    license_template: String = null,
    `private`: js.UndefOr[Boolean] = js.undefined,
    team_id: Int | Double = null
  ): ReposCreateInOrgEndpoint = {
    val __obj = js.Dynamic.literal(name = name, org = org)
    if (!js.isUndefined(allow_merge_commit)) __obj.updateDynamic("allow_merge_commit")(allow_merge_commit)
    if (!js.isUndefined(allow_rebase_merge)) __obj.updateDynamic("allow_rebase_merge")(allow_rebase_merge)
    if (!js.isUndefined(allow_squash_merge)) __obj.updateDynamic("allow_squash_merge")(allow_squash_merge)
    if (!js.isUndefined(auto_init)) __obj.updateDynamic("auto_init")(auto_init)
    if (description != null) __obj.updateDynamic("description")(description)
    if (gitignore_template != null) __obj.updateDynamic("gitignore_template")(gitignore_template)
    if (!js.isUndefined(has_issues)) __obj.updateDynamic("has_issues")(has_issues)
    if (!js.isUndefined(has_projects)) __obj.updateDynamic("has_projects")(has_projects)
    if (!js.isUndefined(has_wiki)) __obj.updateDynamic("has_wiki")(has_wiki)
    if (homepage != null) __obj.updateDynamic("homepage")(homepage)
    if (!js.isUndefined(is_template)) __obj.updateDynamic("is_template")(is_template)
    if (license_template != null) __obj.updateDynamic("license_template")(license_template)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    if (team_id != null) __obj.updateDynamic("team_id")(team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateInOrgEndpoint]
  }
}

