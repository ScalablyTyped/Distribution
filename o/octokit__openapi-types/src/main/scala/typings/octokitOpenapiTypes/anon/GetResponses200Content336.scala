package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content336 extends StObject {
  
  /**
    * Get rules for a branch
    * @description Returns all rules that apply to the specified branch.
    */
  var get: Responses200Content336
}
object GetResponses200Content336 {
  
  inline def apply(get: Responses200Content336): GetResponses200Content336 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content336]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content336] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content336): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
