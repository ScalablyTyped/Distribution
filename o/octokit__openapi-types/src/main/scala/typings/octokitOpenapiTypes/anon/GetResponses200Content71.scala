package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content71 extends StObject {
  
  /**
    * List users blocked by an organization
    * @description List the users blocked by an organization.
    */
  var get: Responses200Content71
}
object GetResponses200Content71 {
  
  inline def apply(get: Responses200Content71): GetResponses200Content71 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content71]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content71] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content71): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
