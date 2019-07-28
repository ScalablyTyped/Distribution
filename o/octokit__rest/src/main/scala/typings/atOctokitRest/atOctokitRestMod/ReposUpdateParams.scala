package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateParams extends js.Object {
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
    * `true` to archive this repository. **Note**: You cannot unarchive repositories through the API.
    */
  var archived: js.UndefOr[Boolean] = js.undefined
  /**
    * Updates the default branch for this repository.
    */
  var default_branch: js.UndefOr[String] = js.undefined
  /**
    * A short description of the repository.
    */
  var description: js.UndefOr[String] = js.undefined
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
    * The name of the repository.
    */
  var name: js.UndefOr[String] = js.undefined
  var owner: String
  /**
    * Either `true` to make the repository private or `false` to make it public. Creating private repositories requires a paid GitHub account. Default: `false`.
    * **Note**: You will get a `422` error if the organization restricts [changing repository visibility](https://help.github.com/articles/repository-permission-levels-for-an-organization#changing-the-visibility-of-repositories) to organization owners and a non-owner tries to change the value of private. **Note**: You will get a `422` error if the organization restricts [changing repository visibility](https://help.github.com/articles/repository-permission-levels-for-an-organization#changing-the-visibility-of-repositories) to organization owners and a non-owner tries to change the value of private.
    */
  var `private`: js.UndefOr[Boolean] = js.undefined
  var repo: String
}

object ReposUpdateParams {
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
  ): ReposUpdateParams = {
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
    __obj.asInstanceOf[ReposUpdateParams]
  }
}

