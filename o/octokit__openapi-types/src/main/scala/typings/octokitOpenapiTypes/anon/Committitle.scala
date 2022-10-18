package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.merge
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.rebase
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.squash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Committitle extends StObject {
  
  /** @description Commit message for the merge commit. */
  var commit_message: String
  
  /** @description Title for the merge commit message. */
  var commit_title: String
  
  var enabled_by: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
  
  /**
    * @description The merge method to use.
    * @enum {string}
    */
  var merge_method: merge | squash | rebase
}
object Committitle {
  
  inline def apply(
    commit_message: String,
    commit_title: String,
    enabled_by: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any,
    merge_method: merge | squash | rebase
  ): Committitle = {
    val __obj = js.Dynamic.literal(commit_message = commit_message.asInstanceOf[js.Any], commit_title = commit_title.asInstanceOf[js.Any], enabled_by = enabled_by.asInstanceOf[js.Any], merge_method = merge_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Committitle]
  }
  
  extension [Self <: Committitle](x: Self) {
    
    inline def setCommit_message(value: String): Self = StObject.set(x, "commit_message", value.asInstanceOf[js.Any])
    
    inline def setCommit_title(value: String): Self = StObject.set(x, "commit_title", value.asInstanceOf[js.Any])
    
    inline def setEnabled_by(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
    ): Self = StObject.set(x, "enabled_by", value.asInstanceOf[js.Any])
    
    inline def setMerge_method(value: merge | squash | rebase): Self = StObject.set(x, "merge_method", value.asInstanceOf[js.Any])
  }
}
