package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateParams extends js.Object {
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
    * `true` to archive this repository. **Note**: You cannot unarchive repositories through the API.
    */
  var archived: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Updates the default branch for this repository.
    */
  var default_branch: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A short description of the repository.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
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
    * The name of the repository.
    */
  var name: java.lang.String
  var owner: java.lang.String
  /**
    * Either `true` to make the repository private or `false` to make it public. Creating private repositories requires a paid GitHub account. Default: `false`.  ,* **Note**: You will get a `422` error if the organization restricts [changing repository visibility](https://help.github.com/articles/repository-permission-levels-for-an-organization#changing-the-visibility-of-repositories) to organization owners and a non-owner tries to change the value of private. **Note**: You will get a `422` error if the organization restricts [changing repository visibility](https://help.github.com/articles/repository-permission-levels-for-an-organization#changing-the-visibility-of-repositories) to organization owners and a non-owner tries to change the value of private.
    */
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
  var repo: java.lang.String
}

object ReposUpdateParams {
  @scala.inline
  def apply(
    name: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    allow_merge_commit: js.UndefOr[scala.Boolean] = js.undefined,
    allow_rebase_merge: js.UndefOr[scala.Boolean] = js.undefined,
    allow_squash_merge: js.UndefOr[scala.Boolean] = js.undefined,
    archived: js.UndefOr[scala.Boolean] = js.undefined,
    default_branch: java.lang.String = null,
    description: java.lang.String = null,
    has_issues: js.UndefOr[scala.Boolean] = js.undefined,
    has_projects: js.UndefOr[scala.Boolean] = js.undefined,
    has_wiki: js.UndefOr[scala.Boolean] = js.undefined,
    homepage: java.lang.String = null,
    `private`: js.UndefOr[scala.Boolean] = js.undefined
  ): ReposUpdateParams = {
    val __obj = js.Dynamic.literal(name = name, owner = owner, repo = repo)
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
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[ReposUpdateParams]
  }
}

