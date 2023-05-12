package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content211 extends StObject {
  
  /**
    * Get repository permissions for a user
    * @description Checks the repository permission of a collaborator. The possible repository permissions are `admin`, `write`, `read`, and `none`.
    */
  var get: Responses200Content211
}
object GetResponses200Content211 {
  
  inline def apply(get: Responses200Content211): GetResponses200Content211 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content211]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content211] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content211): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
