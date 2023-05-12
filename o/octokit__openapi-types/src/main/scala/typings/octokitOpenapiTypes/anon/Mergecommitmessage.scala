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

trait Mergecommitmessage extends StObject {
  
  /**
    * @description Whether to allow auto-merge for pull requests.
    * @default false
    */
  var allow_auto_merge: js.UndefOr[Boolean] = js.undefined
  
  /** @description Whether to allow updating the pull request's branch. */
  var allow_update_branch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether to delete head branches when pull requests are merged.
    * @default false
    */
  var delete_branch_on_merge: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description The default value for a merge commit message.
    * - `PR_TITLE` - default to the pull request's title.
    * - `PR_BODY` - default to the pull request's body.
    * - `BLANK` - default to a blank commit message.
    * @enum {string}
    */
  var merge_commit_message: js.UndefOr[PR_BODY | PR_TITLE | BLANK] = js.undefined
  
  /**
    * @description The default value for a merge commit title.
    * - `PR_TITLE` - default to the pull request's title.
    * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., "Merge pull request #123 from branch-name").
    * @enum {string}
    */
  var merge_commit_title: js.UndefOr[PR_TITLE | MERGE_MESSAGE] = js.undefined
  
  /**
    * @description The default value for a squash merge commit message:
    * - `PR_BODY` - default to the pull request's body.
    * - `COMMIT_MESSAGES` - default to the branch's commit messages.
    * - `BLANK` - default to a blank commit message.
    * @enum {string}
    */
  var squash_merge_commit_message: js.UndefOr[PR_BODY | COMMIT_MESSAGES | BLANK] = js.undefined
  
  /**
    * @description The default value for a squash merge commit title:
    * - `PR_TITLE` - default to the pull request's title.
    * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
    * @enum {string}
    */
  var squash_merge_commit_title: js.UndefOr[PR_TITLE | COMMIT_OR_PR_TITLE] = js.undefined
  
  /**
    * @description Whether a squash merge commit can use the pull request title as default. **This property has been deprecated. Please use `squash_merge_commit_title` instead.**
    * @default false
    */
  var use_squash_pr_title_as_default: js.UndefOr[Boolean] = js.undefined
}
object Mergecommitmessage {
  
  inline def apply(): Mergecommitmessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mergecommitmessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mergecommitmessage] (val x: Self) extends AnyVal {
    
    inline def setAllow_auto_merge(value: Boolean): Self = StObject.set(x, "allow_auto_merge", value.asInstanceOf[js.Any])
    
    inline def setAllow_auto_mergeUndefined: Self = StObject.set(x, "allow_auto_merge", js.undefined)
    
    inline def setAllow_update_branch(value: Boolean): Self = StObject.set(x, "allow_update_branch", value.asInstanceOf[js.Any])
    
    inline def setAllow_update_branchUndefined: Self = StObject.set(x, "allow_update_branch", js.undefined)
    
    inline def setDelete_branch_on_merge(value: Boolean): Self = StObject.set(x, "delete_branch_on_merge", value.asInstanceOf[js.Any])
    
    inline def setDelete_branch_on_mergeUndefined: Self = StObject.set(x, "delete_branch_on_merge", js.undefined)
    
    inline def setMerge_commit_message(value: PR_BODY | PR_TITLE | BLANK): Self = StObject.set(x, "merge_commit_message", value.asInstanceOf[js.Any])
    
    inline def setMerge_commit_messageUndefined: Self = StObject.set(x, "merge_commit_message", js.undefined)
    
    inline def setMerge_commit_title(value: PR_TITLE | MERGE_MESSAGE): Self = StObject.set(x, "merge_commit_title", value.asInstanceOf[js.Any])
    
    inline def setMerge_commit_titleUndefined: Self = StObject.set(x, "merge_commit_title", js.undefined)
    
    inline def setSquash_merge_commit_message(value: PR_BODY | COMMIT_MESSAGES | BLANK): Self = StObject.set(x, "squash_merge_commit_message", value.asInstanceOf[js.Any])
    
    inline def setSquash_merge_commit_messageUndefined: Self = StObject.set(x, "squash_merge_commit_message", js.undefined)
    
    inline def setSquash_merge_commit_title(value: PR_TITLE | COMMIT_OR_PR_TITLE): Self = StObject.set(x, "squash_merge_commit_title", value.asInstanceOf[js.Any])
    
    inline def setSquash_merge_commit_titleUndefined: Self = StObject.set(x, "squash_merge_commit_title", js.undefined)
    
    inline def setUse_squash_pr_title_as_default(value: Boolean): Self = StObject.set(x, "use_squash_pr_title_as_default", value.asInstanceOf[js.Any])
    
    inline def setUse_squash_pr_title_as_defaultUndefined: Self = StObject.set(x, "use_squash_pr_title_as_default", js.undefined)
  }
}
