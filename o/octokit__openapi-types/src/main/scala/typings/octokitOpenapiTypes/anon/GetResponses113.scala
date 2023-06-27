package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses113 extends StObject {
  
  /**
    * List public organization members
    * @description Members of an organization can choose to have their membership publicized or not.
    */
  var get: Responses113
}
object GetResponses113 {
  
  inline def apply(get: Responses113): GetResponses113 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses113]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses113] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses113): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
