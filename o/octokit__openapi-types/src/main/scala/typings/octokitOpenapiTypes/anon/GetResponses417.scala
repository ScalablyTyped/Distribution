package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses417 extends StObject {
  
  /**
    * List SSH signing keys for a user
    * @description Lists the SSH signing keys for a user. This operation is accessible by anyone.
    */
  var get: Responses417
}
object GetResponses417 {
  
  inline def apply(get: Responses417): GetResponses417 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses417]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses417] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses417): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
