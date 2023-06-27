package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses127 extends StObject {
  
  /**
    * Delete an organization repository ruleset
    * @description Delete a ruleset for an organization.
    */
  var delete: Responses127
  
  /**
    * Get an organization repository ruleset
    * @description Get a repository ruleset for an organization.
    */
  var get: ParametersPathRulesetid
  
  /**
    * Update an organization repository ruleset
    * @description Update a ruleset for an organization.
    */
  var put: Responses200Content126
}
object DeleteResponses127 {
  
  inline def apply(delete: Responses127, get: ParametersPathRulesetid, put: Responses200Content126): DeleteResponses127 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses127]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResponses127] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses127): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathRulesetid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses200Content126): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
