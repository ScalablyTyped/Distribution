package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.BLANK
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.COMMIT_MESSAGES
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.COMMIT_OR_PR_TITLE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.MERGE_MESSAGE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.PR_BODY
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.PR_TITLE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`private`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.internal
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Autoinit extends StObject {
  
  /**
    * @description Either `true` to allow auto-merge on pull requests, or `false` to disallow auto-merge.
    * @default false
    */
  var allow_auto_merge: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Either `true` to allow merging pull requests with a merge commit, or `false` to prevent merging pull requests with merge commits.
    * @default true
    */
  var allow_merge_commit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Either `true` to allow rebase-merging pull requests, or `false` to prevent rebase-merging.
    * @default true
    */
  var allow_rebase_merge: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Either `true` to allow squash-merging pull requests, or `false` to prevent squash-merging.
    * @default true
    */
  var allow_squash_merge: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Pass `true` to create an initial commit with empty README.
    * @default false
    */
  var auto_init: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Either `true` to allow automatically deleting head branches when pull requests are merged, or `false` to prevent automatic deletion.
    * @default false
    */
  var delete_branch_on_merge: js.UndefOr[Boolean] = js.undefined
  
  /** @description A short description of the repository. */
  var description: js.UndefOr[String] = js.undefined
  
  /** @description Desired language or platform [.gitignore template](https://github.com/github/gitignore) to apply. Use the name of the template without the extension. For example, "Haskell". */
  var gitignore_template: js.UndefOr[String] = js.undefined
  
  /**
    * @description Either `true` to enable issues for this repository or `false` to disable them.
    * @default true
    */
  var has_issues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Either `true` to enable projects for this repository or `false` to disable them. **Note:** If you're creating a repository in an organization that has disabled repository projects, the default is `false`, and if you pass `true`, the API returns an error.
    * @default true
    */
  var has_projects: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Either `true` to enable the wiki for this repository or `false` to disable it.
    * @default true
    */
  var has_wiki: js.UndefOr[Boolean] = js.undefined
  
  /** @description A URL with more information about the repository. */
  var homepage: js.UndefOr[String] = js.undefined
  
  /**
    * @description Either `true` to make this repo available as a template repository or `false` to prevent it.
    * @default false
    */
  var is_template: js.UndefOr[Boolean] = js.undefined
  
  /** @description Choose an [open source license template](https://choosealicense.com/) that best suits your needs, and then use the [license keyword](https://docs.github.com/articles/licensing-a-repository/#searching-github-by-license-type) as the `license_template` string. For example, "mit" or "mpl-2.0". */
  var license_template: js.UndefOr[String] = js.undefined
  
  /**
    * @description The default value for a merge commit message.
    *
    * - `PR_TITLE` - default to the pull request's title.
    * - `PR_BODY` - default to the pull request's body.
    * - `BLANK` - default to a blank commit message.
    * @enum {string}
    */
  var merge_commit_message: js.UndefOr[PR_BODY | PR_TITLE | BLANK] = js.undefined
  
  /**
    * @description The default value for a merge commit title.
    *
    * - `PR_TITLE` - default to the pull request's title.
    * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).
    * @enum {string}
    */
  var merge_commit_title: js.UndefOr[PR_TITLE | MERGE_MESSAGE] = js.undefined
  
  /** @description The name of the repository. */
  var name: String
  
  /**
    * @description Whether the repository is private.
    * @default false
    */
  var `private`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description The default value for a squash merge commit message:
    *
    * - `PR_BODY` - default to the pull request's body.
    * - `COMMIT_MESSAGES` - default to the branch's commit messages.
    * - `BLANK` - default to a blank commit message.
    * @enum {string}
    */
  var squash_merge_commit_message: js.UndefOr[PR_BODY | COMMIT_MESSAGES | BLANK] = js.undefined
  
  /**
    * @description The default value for a squash merge commit title:
    *
    * - `PR_TITLE` - default to the pull request's title.
    * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
    * @enum {string}
    */
  var squash_merge_commit_title: js.UndefOr[PR_TITLE | COMMIT_OR_PR_TITLE] = js.undefined
  
  /** @description The id of the team that will be granted access to this repository. This is only valid when creating a repository in an organization. */
  var team_id: js.UndefOr[Double] = js.undefined
  
  /**
    * @deprecated
    * @description Either `true` to allow squash-merge commits to use pull request title, or `false` to use commit message. **This property has been deprecated. Please use `squash_merge_commit_title` instead.
    * @default false
    */
  var use_squash_pr_title_as_default: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Can be `public` or `private`. If your organization is associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+, `visibility` can also be `internal`. Note: For GitHub Enterprise Server and GitHub AE, this endpoint will only list repositories available to all users on the enterprise. For more information, see "[Creating an internal repository](https://docs.github.com/en/github/creating-cloning-and-archiving-repositories/about-repository-visibility#about-internal-repositories)" in the GitHub Help documentation.
    * @enum {string}
    */
  var visibility: js.UndefOr[public | `private` | internal] = js.undefined
}
object Autoinit {
  
  inline def apply(name: String): Autoinit = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autoinit]
  }
  
  extension [Self <: Autoinit](x: Self) {
    
    inline def setAllow_auto_merge(value: Boolean): Self = StObject.set(x, "allow_auto_merge", value.asInstanceOf[js.Any])
    
    inline def setAllow_auto_mergeUndefined: Self = StObject.set(x, "allow_auto_merge", js.undefined)
    
    inline def setAllow_merge_commit(value: Boolean): Self = StObject.set(x, "allow_merge_commit", value.asInstanceOf[js.Any])
    
    inline def setAllow_merge_commitUndefined: Self = StObject.set(x, "allow_merge_commit", js.undefined)
    
    inline def setAllow_rebase_merge(value: Boolean): Self = StObject.set(x, "allow_rebase_merge", value.asInstanceOf[js.Any])
    
    inline def setAllow_rebase_mergeUndefined: Self = StObject.set(x, "allow_rebase_merge", js.undefined)
    
    inline def setAllow_squash_merge(value: Boolean): Self = StObject.set(x, "allow_squash_merge", value.asInstanceOf[js.Any])
    
    inline def setAllow_squash_mergeUndefined: Self = StObject.set(x, "allow_squash_merge", js.undefined)
    
    inline def setAuto_init(value: Boolean): Self = StObject.set(x, "auto_init", value.asInstanceOf[js.Any])
    
    inline def setAuto_initUndefined: Self = StObject.set(x, "auto_init", js.undefined)
    
    inline def setDelete_branch_on_merge(value: Boolean): Self = StObject.set(x, "delete_branch_on_merge", value.asInstanceOf[js.Any])
    
    inline def setDelete_branch_on_mergeUndefined: Self = StObject.set(x, "delete_branch_on_merge", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGitignore_template(value: String): Self = StObject.set(x, "gitignore_template", value.asInstanceOf[js.Any])
    
    inline def setGitignore_templateUndefined: Self = StObject.set(x, "gitignore_template", js.undefined)
    
    inline def setHas_issues(value: Boolean): Self = StObject.set(x, "has_issues", value.asInstanceOf[js.Any])
    
    inline def setHas_issuesUndefined: Self = StObject.set(x, "has_issues", js.undefined)
    
    inline def setHas_projects(value: Boolean): Self = StObject.set(x, "has_projects", value.asInstanceOf[js.Any])
    
    inline def setHas_projectsUndefined: Self = StObject.set(x, "has_projects", js.undefined)
    
    inline def setHas_wiki(value: Boolean): Self = StObject.set(x, "has_wiki", value.asInstanceOf[js.Any])
    
    inline def setHas_wikiUndefined: Self = StObject.set(x, "has_wiki", js.undefined)
    
    inline def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
    
    inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
    
    inline def setIs_template(value: Boolean): Self = StObject.set(x, "is_template", value.asInstanceOf[js.Any])
    
    inline def setIs_templateUndefined: Self = StObject.set(x, "is_template", js.undefined)
    
    inline def setLicense_template(value: String): Self = StObject.set(x, "license_template", value.asInstanceOf[js.Any])
    
    inline def setLicense_templateUndefined: Self = StObject.set(x, "license_template", js.undefined)
    
    inline def setMerge_commit_message(value: PR_BODY | PR_TITLE | BLANK): Self = StObject.set(x, "merge_commit_message", value.asInstanceOf[js.Any])
    
    inline def setMerge_commit_messageUndefined: Self = StObject.set(x, "merge_commit_message", js.undefined)
    
    inline def setMerge_commit_title(value: PR_TITLE | MERGE_MESSAGE): Self = StObject.set(x, "merge_commit_title", value.asInstanceOf[js.Any])
    
    inline def setMerge_commit_titleUndefined: Self = StObject.set(x, "merge_commit_title", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    inline def setSquash_merge_commit_message(value: PR_BODY | COMMIT_MESSAGES | BLANK): Self = StObject.set(x, "squash_merge_commit_message", value.asInstanceOf[js.Any])
    
    inline def setSquash_merge_commit_messageUndefined: Self = StObject.set(x, "squash_merge_commit_message", js.undefined)
    
    inline def setSquash_merge_commit_title(value: PR_TITLE | COMMIT_OR_PR_TITLE): Self = StObject.set(x, "squash_merge_commit_title", value.asInstanceOf[js.Any])
    
    inline def setSquash_merge_commit_titleUndefined: Self = StObject.set(x, "squash_merge_commit_title", js.undefined)
    
    inline def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
    
    inline def setTeam_idUndefined: Self = StObject.set(x, "team_id", js.undefined)
    
    inline def setUse_squash_pr_title_as_default(value: Boolean): Self = StObject.set(x, "use_squash_pr_title_as_default", value.asInstanceOf[js.Any])
    
    inline def setUse_squash_pr_title_as_defaultUndefined: Self = StObject.set(x, "use_squash_pr_title_as_default", js.undefined)
    
    inline def setVisibility(value: public | `private` | internal): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
