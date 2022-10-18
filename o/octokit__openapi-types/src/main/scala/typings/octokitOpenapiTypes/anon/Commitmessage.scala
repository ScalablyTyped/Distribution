package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.merge
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.rebase
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.squash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commitmessage extends StObject {
  
  /** @description Commit message for the merge commit. */
  var commit_message: String
  
  /** @description Title for the merge commit message. */
  var commit_title: String
  
  var enabled_by: Avatarurl
  
  /**
    * @description The merge method to use.
    * @enum {string}
    */
  var merge_method: merge | squash | rebase
}
object Commitmessage {
  
  inline def apply(
    commit_message: String,
    commit_title: String,
    enabled_by: Avatarurl,
    merge_method: merge | squash | rebase
  ): Commitmessage = {
    val __obj = js.Dynamic.literal(commit_message = commit_message.asInstanceOf[js.Any], commit_title = commit_title.asInstanceOf[js.Any], enabled_by = enabled_by.asInstanceOf[js.Any], merge_method = merge_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commitmessage]
  }
  
  extension [Self <: Commitmessage](x: Self) {
    
    inline def setCommit_message(value: String): Self = StObject.set(x, "commit_message", value.asInstanceOf[js.Any])
    
    inline def setCommit_title(value: String): Self = StObject.set(x, "commit_title", value.asInstanceOf[js.Any])
    
    inline def setEnabled_by(value: Avatarurl): Self = StObject.set(x, "enabled_by", value.asInstanceOf[js.Any])
    
    inline def setMerge_method(value: merge | squash | rebase): Self = StObject.set(x, "merge_method", value.asInstanceOf[js.Any])
  }
}
