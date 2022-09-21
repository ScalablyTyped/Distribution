package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content101304 extends StObject {
  
  /** Lists repositories the authenticated user is watching. */
  var get: Responses200Content101304
}
object GetResponses200Content101304 {
  
  inline def apply(get: Responses200Content101304): GetResponses200Content101304 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content101304]
  }
  
  extension [Self <: GetResponses200Content101304](x: Self) {
    
    inline def setGet(value: Responses200Content101304): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
