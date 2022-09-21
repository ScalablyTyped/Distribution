package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses102 extends StObject {
  
  /** Members of an organization can choose to have their membership publicized or not. */
  var get: Responses102
}
object GetResponses102 {
  
  inline def apply(get: Responses102): GetResponses102 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses102]
  }
  
  extension [Self <: GetResponses102](x: Self) {
    
    inline def setGet(value: Responses102): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
