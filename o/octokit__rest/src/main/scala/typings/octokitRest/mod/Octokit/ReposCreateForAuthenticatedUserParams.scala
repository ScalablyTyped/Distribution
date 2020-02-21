package typings.octokitRest.mod.Octokit

import typings.octokitRest.octokitRestStrings.`private`
import typings.octokitRest.octokitRestStrings.internal
import typings.octokitRest.octokitRestStrings.public
import typings.octokitRest.octokitRestStrings.visibility
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateForAuthenticatedUserParams extends js.Object {
  /**
    * Either `true` to allow merging pull requests with a merge commit, or `false` to prevent merging pull requests with merge commits.
    */
  var allow_merge_commit: js.UndefOr[Boolean] = js.undefined
  /**
    * Either `true` to allow rebase-merging pull requests, or `false` to prevent rebase-merging.
    */
  var allow_rebase_merge: js.UndefOr[Boolean] = js.undefined
  /**
    * Either `true` to allow squash-merging pull requests, or `false` to prevent squash-merging.
    */
  var allow_squash_merge: js.UndefOr[Boolean] = js.undefined
  /**
    * Pass `true` to create an initial commit with empty README.
    */
  var auto_init: js.UndefOr[Boolean] = js.undefined
  /**
    * Either `true` to allow automatically deleting head branches when pull requests are merged, or `false` to prevent automatic deletion.
    */
  var delete_branch_on_merge: js.UndefOr[Boolean] = js.undefined
  /**
    * A short description of the repository.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Desired language or platform [.gitignore template](https://github.com/github/gitignore) to apply. Use the name of the template without the extension. For example, "Haskell".
    */
  var gitignore_template: js.UndefOr[String] = js.undefined
  /**
    * Either `true` to enable issues for this repository or `false` to disable them.
    */
  var has_issues: js.UndefOr[Boolean] = js.undefined
  /**
    * Either `true` to enable projects for this repository or `false` to disable them. **Note:** If you're creating a repository in an organization that has disabled repository projects, the default is `false`, and if you pass `true`, the API returns an error.
    */
  var has_projects: js.UndefOr[Boolean] = js.undefined
  /**
    * Either `true` to enable the wiki for this repository or `false` to disable it.
    */
  var has_wiki: js.UndefOr[Boolean] = js.undefined
  /**
    * A URL with more information about the repository.
    */
  var homepage: js.UndefOr[String] = js.undefined
  /**
    * Either `true` to make this repo available as a template repository or `false` to prevent it.
    */
  var is_template: js.UndefOr[Boolean] = js.undefined
  /**
    * Choose an [open source license template](https://choosealicense.com/) that best suits your needs, and then use the [license keyword](https://help.github.com/articles/licensing-a-repository/#searching-github-by-license-type) as the `license_template` string. For example, "mit" or "mpl-2.0".
    */
  var license_template: js.UndefOr[String] = js.undefined
  /**
    * The name of the repository.
    */
  var name: String
  /**
    * Either `true` to create a private repository or `false` to create a public one. Creating private repositories requires a paid GitHub account.
    */
  var `private`: js.UndefOr[Boolean] = js.undefined
  /**
    * The id of the team that will be granted access to this repository. This is only valid when creating a repository in an organization.
    */
  var team_id: js.UndefOr[Double] = js.undefined
  /**
    * Can be `public` or `private`. If your organization is associated with an enterprise account using GitHub Enterprise Cloud, `visibility` can also be `internal`. For more information, see "[Creating an internal repository](https://help.github.com/github/creating-cloning-and-archiving-repositories/creating-an-internal-repository)" in the GitHub Help documentation.
    * The `visibility` parameter overrides the `private` parameter when you use both parameters with the `nebula-preview` preview header.
    */
  var visibility: js.UndefOr[
    public | `private` | typings.octokitRest.octokitRestStrings.visibility | internal
  ] = js.undefined
}

object ReposCreateForAuthenticatedUserParams {
  @scala.inline
  def apply(
    name: String,
    allow_merge_commit: js.UndefOr[Boolean] = js.undefined,
    allow_rebase_merge: js.UndefOr[Boolean] = js.undefined,
    allow_squash_merge: js.UndefOr[Boolean] = js.undefined,
    auto_init: js.UndefOr[Boolean] = js.undefined,
    delete_branch_on_merge: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    gitignore_template: String = null,
    has_issues: js.UndefOr[Boolean] = js.undefined,
    has_projects: js.UndefOr[Boolean] = js.undefined,
    has_wiki: js.UndefOr[Boolean] = js.undefined,
    homepage: String = null,
    is_template: js.UndefOr[Boolean] = js.undefined,
    license_template: String = null,
    `private`: js.UndefOr[Boolean] = js.undefined,
    team_id: Int | Double = null,
    visibility: public | `private` | visibility | internal = null
  ): ReposCreateForAuthenticatedUserParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_merge_commit)) __obj.updateDynamic("allow_merge_commit")(allow_merge_commit.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_rebase_merge)) __obj.updateDynamic("allow_rebase_merge")(allow_rebase_merge.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_squash_merge)) __obj.updateDynamic("allow_squash_merge")(allow_squash_merge.asInstanceOf[js.Any])
    if (!js.isUndefined(auto_init)) __obj.updateDynamic("auto_init")(auto_init.asInstanceOf[js.Any])
    if (!js.isUndefined(delete_branch_on_merge)) __obj.updateDynamic("delete_branch_on_merge")(delete_branch_on_merge.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (gitignore_template != null) __obj.updateDynamic("gitignore_template")(gitignore_template.asInstanceOf[js.Any])
    if (!js.isUndefined(has_issues)) __obj.updateDynamic("has_issues")(has_issues.asInstanceOf[js.Any])
    if (!js.isUndefined(has_projects)) __obj.updateDynamic("has_projects")(has_projects.asInstanceOf[js.Any])
    if (!js.isUndefined(has_wiki)) __obj.updateDynamic("has_wiki")(has_wiki.asInstanceOf[js.Any])
    if (homepage != null) __obj.updateDynamic("homepage")(homepage.asInstanceOf[js.Any])
    if (!js.isUndefined(is_template)) __obj.updateDynamic("is_template")(is_template.asInstanceOf[js.Any])
    if (license_template != null) __obj.updateDynamic("license_template")(license_template.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    if (team_id != null) __obj.updateDynamic("team_id")(team_id.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateForAuthenticatedUserParams]
  }
}

