package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content542 extends StObject {
  
  /** Lists languages for the specified repository. The value shown for each language is the number of bytes of code written in that language. */
  var get: Responses200Content542
}
object GetResponses200Content542 {
  
  inline def apply(get: Responses200Content542): GetResponses200Content542 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content542]
  }
  
  extension [Self <: GetResponses200Content542](x: Self) {
    
    inline def setGet(value: Responses200Content542): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
