package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.merge
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.rebase
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.squash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mergemethod extends StObject {
  
  /** @description Extra detail to append to automatic commit message. */
  var commit_message: js.UndefOr[String] = js.undefined
  
  /** @description Title for the automatic commit message. */
  var commit_title: js.UndefOr[String] = js.undefined
  
  /**
    * @description Merge method to use. Possible values are `merge`, `squash` or `rebase`. Default is `merge`.
    * @enum {string}
    */
  var merge_method: js.UndefOr[merge | squash | rebase] = js.undefined
  
  /** @description SHA that pull request head must match to allow merge. */
  var sha: js.UndefOr[String] = js.undefined
}
object Mergemethod {
  
  inline def apply(): Mergemethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mergemethod]
  }
  
  extension [Self <: Mergemethod](x: Self) {
    
    inline def setCommit_message(value: String): Self = StObject.set(x, "commit_message", value.asInstanceOf[js.Any])
    
    inline def setCommit_messageUndefined: Self = StObject.set(x, "commit_message", js.undefined)
    
    inline def setCommit_title(value: String): Self = StObject.set(x, "commit_title", value.asInstanceOf[js.Any])
    
    inline def setCommit_titleUndefined: Self = StObject.set(x, "commit_title", js.undefined)
    
    inline def setMerge_method(value: merge | squash | rebase): Self = StObject.set(x, "merge_method", value.asInstanceOf[js.Any])
    
    inline def setMerge_methodUndefined: Self = StObject.set(x, "merge_method", js.undefined)
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setShaUndefined: Self = StObject.set(x, "sha", js.undefined)
  }
}
