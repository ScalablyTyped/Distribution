package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters395Responses127 extends StObject {
  
  /**
    * Delete a repository ruleset
    * @description Delete a ruleset for a repository.
    */
  var delete: Parameters395Responses127
  
  /**
    * Get a repository ruleset
    * @description Get a ruleset for a repository.
    */
  var get: ParametersPathRepoRulesetid
  
  /**
    * Update a repository ruleset
    * @description Update a ruleset for a repository.
    */
  var put: Parameters395
}
object DeleteParameters395Responses127 {
  
  inline def apply(delete: Parameters395Responses127, get: ParametersPathRepoRulesetid, put: Parameters395): DeleteParameters395Responses127 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters395Responses127]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParameters395Responses127] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Parameters395Responses127): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathRepoRulesetid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters395): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
