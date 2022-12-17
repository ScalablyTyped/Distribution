package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content12 extends StObject {
  
  /** Lists all the emojis available to use on GitHub. */
  var get: Responses200Content12
}
object GetResponses200Content12 {
  
  inline def apply(get: Responses200Content12): GetResponses200Content12 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content12]
  }
  
  extension [Self <: GetResponses200Content12](x: Self) {
    
    inline def setGet(value: Responses200Content12): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
