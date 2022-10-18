package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses351 extends StObject {
  
  /** Members of an organization can choose to have their membership publicized or not. */
  var get: Responses351
}
object GetResponses351 {
  
  inline def apply(get: Responses351): GetResponses351 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses351]
  }
  
  extension [Self <: GetResponses351](x: Self) {
    
    inline def setGet(value: Responses351): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
