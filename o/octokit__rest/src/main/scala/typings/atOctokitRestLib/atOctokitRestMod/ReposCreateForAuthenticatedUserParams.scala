package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateForAuthenticatedUserParams extends js.Object {
  /**
    * Either `true` to allow merging pull requests with a merge commit, or `false` to prevent merging pull requests with merge commits.
    */
  var allow_merge_commit: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Either `true` to allow rebase-merging pull requests, or `false` to prevent rebase-merging.
    */
  var allow_rebase_merge: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Either `true` to allow squash-merging pull requests, or `false` to prevent squash-merging.
    */
  var allow_squash_merge: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Pass `true` to create an initial commit with empty README.
    */
  var auto_init: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A short description of the repository.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Desired language or platform [.gitignore template](https://github.com/github/gitignore) to apply. Use the name of the template without the extension. For example, "Haskell".
    */
  var gitignore_template: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Either `true` to enable issues for this repository or `false` to disable them.
    */
  var has_issues: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Either `true` to enable projects for this repository or `false` to disable them. **Note:** If you're creating a repository in an organization that has disabled repository projects, the default is `false`, and if you pass `true`, the API returns an error.
    */
  var has_projects: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Either `true` to enable the wiki for this repository or `false` to disable it.
    */
  var has_wiki: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A URL with more information about the repository.
    */
  var homepage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Either `true` to make this repo available as a template repository or `false` to prevent it.
    */
  var is_template: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Choose an [open source license template](https://choosealicense.com/) that best suits your needs, and then use the [license keyword](https://help.github.com/articles/licensing-a-repository/#searching-github-by-license-type) as the `license_template` string. For example, "mit" or "mpl-2.0".
    */
  var license_template: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the repository.
    */
  var name: java.lang.String
  /**
    * Either `true` to create a private repository or `false` to create a public one. Creating private repositories requires a paid GitHub account.
    */
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The id of the team that will be granted access to this repository. This is only valid when creating a repository in an organization.
    */
  var team_id: js.UndefOr[scala.Double] = js.undefined
}

object ReposCreateForAuthenticatedUserParams {
  @scala.inline
  def apply(
    name: java.lang.String,
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
    is_template: js.UndefOr[scala.Boolean] = js.undefined,
    license_template: java.lang.String = null,
    `private`: js.UndefOr[scala.Boolean] = js.undefined,
    team_id: scala.Int | scala.Double = null
  ): ReposCreateForAuthenticatedUserParams = {
    val __obj = js.Dynamic.literal(name = name)
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
    __obj.asInstanceOf[ReposCreateForAuthenticatedUserParams]
  }
}

