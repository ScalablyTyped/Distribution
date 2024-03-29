package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content80 extends StObject {
  
  /**
    * List users blocked by an organization
    * @description List the users blocked by an organization.
    */
  var get: Responses200Content80
}
object GetResponses200Content80 {
  
  inline def apply(get: Responses200Content80): GetResponses200Content80 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content80]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content80] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content80): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
