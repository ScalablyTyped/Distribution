package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content465 extends StObject {
  
  /** Checks the repository permission of a collaborator. The possible repository permissions are `admin`, `write`, `read`, and `none`. */
  var get: Responses200Content465
}
object GetResponses200Content465 {
  
  inline def apply(get: Responses200Content465): GetResponses200Content465 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content465]
  }
  
  extension [Self <: GetResponses200Content465](x: Self) {
    
    inline def setGet(value: Responses200Content465): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
