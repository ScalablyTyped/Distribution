package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content194 extends StObject {
  
  /** Checks the repository permission of a collaborator. The possible repository permissions are `admin`, `write`, `read`, and `none`. */
  var get: Responses200Content194
}
object GetResponses200Content194 {
  
  inline def apply(get: Responses200Content194): GetResponses200Content194 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content194]
  }
  
  extension [Self <: GetResponses200Content194](x: Self) {
    
    inline def setGet(value: Responses200Content194): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
