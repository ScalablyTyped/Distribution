package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.merge
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.rebase
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.squash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitmessageCommittitle extends StObject {
  
  /** @description Commit message for the merge commit. */
  var commit_message: String | Null
  
  /** @description Title for the merge commit message. */
  var commit_title: String
  
  /** User */
  var enabled_by: Deleted | Null
  
  /**
    * @description The merge method to use.
    * @enum {string}
    */
  var merge_method: merge | squash | rebase
}
object CommitmessageCommittitle {
  
  inline def apply(commit_title: String, merge_method: merge | squash | rebase): CommitmessageCommittitle = {
    val __obj = js.Dynamic.literal(commit_title = commit_title.asInstanceOf[js.Any], merge_method = merge_method.asInstanceOf[js.Any], commit_message = null, enabled_by = null)
    __obj.asInstanceOf[CommitmessageCommittitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommitmessageCommittitle] (val x: Self) extends AnyVal {
    
    inline def setCommit_message(value: String): Self = StObject.set(x, "commit_message", value.asInstanceOf[js.Any])
    
    inline def setCommit_messageNull: Self = StObject.set(x, "commit_message", null)
    
    inline def setCommit_title(value: String): Self = StObject.set(x, "commit_title", value.asInstanceOf[js.Any])
    
    inline def setEnabled_by(value: Deleted): Self = StObject.set(x, "enabled_by", value.asInstanceOf[js.Any])
    
    inline def setEnabled_byNull: Self = StObject.set(x, "enabled_by", null)
    
    inline def setMerge_method(value: merge | squash | rebase): Self = StObject.set(x, "merge_method", value.asInstanceOf[js.Any])
  }
}
