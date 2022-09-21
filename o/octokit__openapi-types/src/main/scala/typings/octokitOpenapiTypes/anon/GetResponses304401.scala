package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses304401 extends StObject {
  
  /** List the authenticated user's starred gists: */
  var get: Responses304401
}
object GetResponses304401 {
  
  inline def apply(get: Responses304401): GetResponses304401 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses304401]
  }
  
  extension [Self <: GetResponses304401](x: Self) {
    
    inline def setGet(value: Responses304401): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
