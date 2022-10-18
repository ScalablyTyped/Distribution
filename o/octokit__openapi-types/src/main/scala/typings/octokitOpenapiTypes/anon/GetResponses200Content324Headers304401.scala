package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content324Headers304401 extends StObject {
  
  /** Lists the people who the authenticated user follows. */
  var get: Responses200Content324Headers304401
}
object GetResponses200Content324Headers304401 {
  
  inline def apply(get: Responses200Content324Headers304401): GetResponses200Content324Headers304401 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content324Headers304401]
  }
  
  extension [Self <: GetResponses200Content324Headers304401](x: Self) {
    
    inline def setGet(value: Responses200Content324Headers304401): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
