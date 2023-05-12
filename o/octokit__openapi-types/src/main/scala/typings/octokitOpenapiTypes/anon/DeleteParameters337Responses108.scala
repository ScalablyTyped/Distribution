package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters337Responses108 extends StObject {
  
  /**
    * Delete a repository ruleset
    * @description Delete a ruleset for a repository.
    */
  var delete: Parameters337Responses108
  
  /**
    * Get a repository ruleset
    * @description Get a ruleset for a repository.
    */
  var get: ParametersPathRepoRulesetid
  
  /**
    * Update a repository ruleset
    * @description Update a ruleset for a repository.
    */
  var put: Parameters337
}
object DeleteParameters337Responses108 {
  
  inline def apply(delete: Parameters337Responses108, get: ParametersPathRepoRulesetid, put: Parameters337): DeleteParameters337Responses108 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters337Responses108]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParameters337Responses108] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Parameters337Responses108): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathRepoRulesetid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters337): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
