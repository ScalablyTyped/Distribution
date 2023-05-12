package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.BLANK
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.COMMIT_MESSAGES
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.COMMIT_OR_PR_TITLE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.MERGE_MESSAGE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.PR_BODY
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.PR_TITLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allowmergecommit extends StObject {
  
  /**
    * @description Whether to allow Auto-merge to be used on pull requests.
    * @default false
    * @example false
    */
  var allow_auto_merge: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether to allow merge commits for pull requests.
    * @default true
    * @example true
    */
  var allow_merge_commit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether to allow rebase merges for pull requests.
    * @default true
    * @example true
    */
  var allow_rebase_merge: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether to allow squash merges for pull requests.
    * @default true
    * @example true
    */
  var allow_squash_merge: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether the repository is initialized with a minimal README.
    * @default false
    */
  var auto_init: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether to delete head branches when pull requests are merged
    * @default false
    * @example false
    */
  var delete_branch_on_merge: js.UndefOr[Boolean] = js.undefined
  
  /** @description A short description of the repository. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * @description The desired language or platform to apply to the .gitignore.
    * @example Haskell
    */
  var gitignore_template: js.UndefOr[String] = js.undefined
  
  /**
    * @description Whether discussions are enabled.
    * @default false
    * @example true
    */
  var has_discussions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether downloads are enabled.
    * @default true
    * @example true
    */
  var has_downloads: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether issues are enabled.
    * @default true
    * @example true
    */
  var has_issues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether projects are enabled.
    * @default true
    * @example true
    */
  var has_projects: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether the wiki is enabled.
    * @default true
    * @example true
    */
  var has_wiki: js.UndefOr[Boolean] = js.undefined
  
  /** @description A URL with more information about the repository. */
  var homepage: js.UndefOr[String] = js.undefined
  
  /**
    * @description Whether this repository acts as a template that can be used to generate new repositories.
    * @default false
    * @example true
    */
  var is_template: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description The license keyword of the open source license for this repository.
    * @example mit
    */
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
  
  /**
    * @description The name of the repository.
    * @example Team Environment
    */
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
}
object Allowmergecommit {
  
  inline def apply(name: String): Allowmergecommit = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowmergecommit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Allowmergecommit] (val x: Self) extends AnyVal {
    
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
    
    inline def setHas_discussions(value: Boolean): Self = StObject.set(x, "has_discussions", value.asInstanceOf[js.Any])
    
    inline def setHas_discussionsUndefined: Self = StObject.set(x, "has_discussions", js.undefined)
    
    inline def setHas_downloads(value: Boolean): Self = StObject.set(x, "has_downloads", value.asInstanceOf[js.Any])
    
    inline def setHas_downloadsUndefined: Self = StObject.set(x, "has_downloads", js.undefined)
    
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
  }
}
