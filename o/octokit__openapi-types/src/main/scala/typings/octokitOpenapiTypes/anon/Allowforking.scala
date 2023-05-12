package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.BLANK
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.COMMIT_MESSAGES
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.COMMIT_OR_PR_TITLE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.MERGE_MESSAGE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.PR_BODY
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.PR_TITLE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`private`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allowforking extends StObject {
  
  /**
    * @description Either `true` to allow auto-merge on pull requests, or `false` to disallow auto-merge.
    * @default false
    */
  var allow_auto_merge: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Either `true` to allow private forks, or `false` to prevent private forks.
    * @default false
    */
  var allow_forking: js.UndefOr[Boolean] = js.undefined
  
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
    * @description Either `true` to always allow a pull request head branch that is behind its base branch to be updated even if it is not required to be up to date before merging, or false otherwise.
    * @default false
    */
  var allow_update_branch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether to archive this repository. `false` will unarchive a previously archived repository.
    * @default false
    */
  var archived: js.UndefOr[Boolean] = js.undefined
  
  /** @description Updates the default branch for this repository. */
  var default_branch: js.UndefOr[String] = js.undefined
  
  /**
    * @description Either `true` to allow automatically deleting head branches when pull requests are merged, or `false` to prevent automatic deletion.
    * @default false
    */
  var delete_branch_on_merge: js.UndefOr[Boolean] = js.undefined
  
  /** @description A short description of the repository. */
  var description: js.UndefOr[String] = js.undefined
  
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
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * @description Either `true` to make the repository private or `false` to make it public. Default: `false`.
    * **Note**: You will get a `422` error if the organization restricts [changing repository visibility](https://docs.github.com/articles/repository-permission-levels-for-an-organization#changing-the-visibility-of-repositories) to organization owners and a non-owner tries to change the value of private.
    * @default false
    */
  var `private`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Specify which security and analysis features to enable or disable for the repository.
    *
    * To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    *
    * For example, to enable GitHub Advanced Security, use this data in the body of the `PATCH` request:
    * `{ "security_and_analysis": {"advanced_security": { "status": "enabled" } } }`.
    *
    * You can check which security and analysis features are currently enabled by using a `GET /repos/{owner}/{repo}` request.
    */
  var security_and_analysis: js.UndefOr[Advancedsecurity | Null] = js.undefined
  
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
  
  /**
    * @deprecated
    * @description Either `true` to allow squash-merge commits to use pull request title, or `false` to use commit message. **This property has been deprecated. Please use `squash_merge_commit_title` instead.
    * @default false
    */
  var use_squash_pr_title_as_default: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description The visibility of the repository.
    * @enum {string}
    */
  var visibility: js.UndefOr[public | `private`] = js.undefined
  
  /**
    * @description Either `true` to require contributors to sign off on web-based commits, or `false` to not require contributors to sign off on web-based commits.
    * @default false
    */
  var web_commit_signoff_required: js.UndefOr[Boolean] = js.undefined
}
object Allowforking {
  
  inline def apply(): Allowforking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allowforking]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Allowforking] (val x: Self) extends AnyVal {
    
    inline def setAllow_auto_merge(value: Boolean): Self = StObject.set(x, "allow_auto_merge", value.asInstanceOf[js.Any])
    
    inline def setAllow_auto_mergeUndefined: Self = StObject.set(x, "allow_auto_merge", js.undefined)
    
    inline def setAllow_forking(value: Boolean): Self = StObject.set(x, "allow_forking", value.asInstanceOf[js.Any])
    
    inline def setAllow_forkingUndefined: Self = StObject.set(x, "allow_forking", js.undefined)
    
    inline def setAllow_merge_commit(value: Boolean): Self = StObject.set(x, "allow_merge_commit", value.asInstanceOf[js.Any])
    
    inline def setAllow_merge_commitUndefined: Self = StObject.set(x, "allow_merge_commit", js.undefined)
    
    inline def setAllow_rebase_merge(value: Boolean): Self = StObject.set(x, "allow_rebase_merge", value.asInstanceOf[js.Any])
    
    inline def setAllow_rebase_mergeUndefined: Self = StObject.set(x, "allow_rebase_merge", js.undefined)
    
    inline def setAllow_squash_merge(value: Boolean): Self = StObject.set(x, "allow_squash_merge", value.asInstanceOf[js.Any])
    
    inline def setAllow_squash_mergeUndefined: Self = StObject.set(x, "allow_squash_merge", js.undefined)
    
    inline def setAllow_update_branch(value: Boolean): Self = StObject.set(x, "allow_update_branch", value.asInstanceOf[js.Any])
    
    inline def setAllow_update_branchUndefined: Self = StObject.set(x, "allow_update_branch", js.undefined)
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    inline def setDefault_branch(value: String): Self = StObject.set(x, "default_branch", value.asInstanceOf[js.Any])
    
    inline def setDefault_branchUndefined: Self = StObject.set(x, "default_branch", js.undefined)
    
    inline def setDelete_branch_on_merge(value: Boolean): Self = StObject.set(x, "delete_branch_on_merge", value.asInstanceOf[js.Any])
    
    inline def setDelete_branch_on_mergeUndefined: Self = StObject.set(x, "delete_branch_on_merge", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
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
    
    inline def setMerge_commit_message(value: PR_BODY | PR_TITLE | BLANK): Self = StObject.set(x, "merge_commit_message", value.asInstanceOf[js.Any])
    
    inline def setMerge_commit_messageUndefined: Self = StObject.set(x, "merge_commit_message", js.undefined)
    
    inline def setMerge_commit_title(value: PR_TITLE | MERGE_MESSAGE): Self = StObject.set(x, "merge_commit_title", value.asInstanceOf[js.Any])
    
    inline def setMerge_commit_titleUndefined: Self = StObject.set(x, "merge_commit_title", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    inline def setSecurity_and_analysis(value: Advancedsecurity): Self = StObject.set(x, "security_and_analysis", value.asInstanceOf[js.Any])
    
    inline def setSecurity_and_analysisNull: Self = StObject.set(x, "security_and_analysis", null)
    
    inline def setSecurity_and_analysisUndefined: Self = StObject.set(x, "security_and_analysis", js.undefined)
    
    inline def setSquash_merge_commit_message(value: PR_BODY | COMMIT_MESSAGES | BLANK): Self = StObject.set(x, "squash_merge_commit_message", value.asInstanceOf[js.Any])
    
    inline def setSquash_merge_commit_messageUndefined: Self = StObject.set(x, "squash_merge_commit_message", js.undefined)
    
    inline def setSquash_merge_commit_title(value: PR_TITLE | COMMIT_OR_PR_TITLE): Self = StObject.set(x, "squash_merge_commit_title", value.asInstanceOf[js.Any])
    
    inline def setSquash_merge_commit_titleUndefined: Self = StObject.set(x, "squash_merge_commit_title", js.undefined)
    
    inline def setUse_squash_pr_title_as_default(value: Boolean): Self = StObject.set(x, "use_squash_pr_title_as_default", value.asInstanceOf[js.Any])
    
    inline def setUse_squash_pr_title_as_defaultUndefined: Self = StObject.set(x, "use_squash_pr_title_as_default", js.undefined)
    
    inline def setVisibility(value: public | `private`): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    inline def setWeb_commit_signoff_required(value: Boolean): Self = StObject.set(x, "web_commit_signoff_required", value.asInstanceOf[js.Any])
    
    inline def setWeb_commit_signoff_requiredUndefined: Self = StObject.set(x, "web_commit_signoff_required", js.undefined)
  }
}
