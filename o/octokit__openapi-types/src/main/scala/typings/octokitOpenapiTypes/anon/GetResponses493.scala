package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses493 extends StObject {
  
  /**
    * List SSH signing keys for a user
    * @description Lists the SSH signing keys for a user. This operation is accessible by anyone.
    */
  var get: Responses493
}
object GetResponses493 {
  
  inline def apply(get: Responses493): GetResponses493 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses493]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses493] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses493): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
