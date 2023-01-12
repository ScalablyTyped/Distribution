package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`fast-forward`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.merge
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Basebranch extends StObject {
  
  var base_branch: js.UndefOr[String] = js.undefined
  
  /** @enum {string} */
  var merge_type: js.UndefOr[merge | `fast-forward` | none_] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
}
object Basebranch {
  
  inline def apply(): Basebranch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Basebranch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Basebranch] (val x: Self) extends AnyVal {
    
    inline def setBase_branch(value: String): Self = StObject.set(x, "base_branch", value.asInstanceOf[js.Any])
    
    inline def setBase_branchUndefined: Self = StObject.set(x, "base_branch", js.undefined)
    
    inline def setMerge_type(value: merge | `fast-forward` | none_): Self = StObject.set(x, "merge_type", value.asInstanceOf[js.Any])
    
    inline def setMerge_typeUndefined: Self = StObject.set(x, "merge_type", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
