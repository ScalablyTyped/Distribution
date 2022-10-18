package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content349304 extends StObject {
  
  /** Lists repositories the authenticated user is watching. */
  var get: Responses200Content349304
}
object GetResponses200Content349304 {
  
  inline def apply(get: Responses200Content349304): GetResponses200Content349304 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content349304]
  }
  
  extension [Self <: GetResponses200Content349304](x: Self) {
    
    inline def setGet(value: Responses200Content349304): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
