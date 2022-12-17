package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content93304 extends StObject {
  
  /** Lists repositories the authenticated user is watching. */
  var get: Responses200Content93304
}
object GetResponses200Content93304 {
  
  inline def apply(get: Responses200Content93304): GetResponses200Content93304 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content93304]
  }
  
  extension [Self <: GetResponses200Content93304](x: Self) {
    
    inline def setGet(value: Responses200Content93304): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
