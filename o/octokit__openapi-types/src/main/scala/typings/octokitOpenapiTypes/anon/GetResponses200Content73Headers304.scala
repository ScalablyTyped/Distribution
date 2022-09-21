package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content73Headers304 extends StObject {
  
  /** Lists the people who the authenticated user follows. */
  var get: Responses200Content73Headers304
}
object GetResponses200Content73Headers304 {
  
  inline def apply(get: Responses200Content73Headers304): GetResponses200Content73Headers304 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content73Headers304]
  }
  
  extension [Self <: GetResponses200Content73Headers304](x: Self) {
    
    inline def setGet(value: Responses200Content73Headers304): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
