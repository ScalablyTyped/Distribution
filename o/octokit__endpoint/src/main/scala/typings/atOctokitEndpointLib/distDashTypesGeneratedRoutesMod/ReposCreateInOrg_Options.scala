package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateInOrg_Options extends js.Object {
  var allow_merge_commit: js.UndefOr[scala.Boolean] = js.undefined
  var allow_rebase_merge: js.UndefOr[scala.Boolean] = js.undefined
  var allow_squash_merge: js.UndefOr[scala.Boolean] = js.undefined
  var auto_init: js.UndefOr[scala.Boolean] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var gitignore_template: js.UndefOr[java.lang.String] = js.undefined
  var has_issues: js.UndefOr[scala.Boolean] = js.undefined
  var has_projects: js.UndefOr[scala.Boolean] = js.undefined
  var has_wiki: js.UndefOr[scala.Boolean] = js.undefined
  var homepage: js.UndefOr[java.lang.String] = js.undefined
  var license_template: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var org: java.lang.String
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
  var team_id: js.UndefOr[scala.Double] = js.undefined
}

object ReposCreateInOrg_Options {
  @scala.inline
  def apply(
    name: java.lang.String,
    org: java.lang.String,
    allow_merge_commit: js.UndefOr[scala.Boolean] = js.undefined,
    allow_rebase_merge: js.UndefOr[scala.Boolean] = js.undefined,
    allow_squash_merge: js.UndefOr[scala.Boolean] = js.undefined,
    auto_init: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    gitignore_template: java.lang.String = null,
    has_issues: js.UndefOr[scala.Boolean] = js.undefined,
    has_projects: js.UndefOr[scala.Boolean] = js.undefined,
    has_wiki: js.UndefOr[scala.Boolean] = js.undefined,
    homepage: java.lang.String = null,
    license_template: java.lang.String = null,
    `private`: js.UndefOr[scala.Boolean] = js.undefined,
    team_id: scala.Int | scala.Double = null
  ): ReposCreateInOrg_Options = {
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
    if (license_template != null) __obj.updateDynamic("license_template")(license_template)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    if (team_id != null) __obj.updateDynamic("team_id")(team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateInOrg_Options]
  }
}

