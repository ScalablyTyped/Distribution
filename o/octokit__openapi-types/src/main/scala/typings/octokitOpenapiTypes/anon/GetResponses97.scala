package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses97 extends StObject {
  
  /**
    * List public organization members
    * @description Members of an organization can choose to have their membership publicized or not.
    */
  var get: Responses97
}
object GetResponses97 {
  
  inline def apply(get: Responses97): GetResponses97 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses97]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses97] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses97): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
