package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses393 extends StObject {
  
  /** Lists the GPG keys for a user. This information is accessible by anyone. */
  var get: Responses393
}
object GetResponses393 {
  
  inline def apply(get: Responses393): GetResponses393 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses393]
  }
  
  extension [Self <: GetResponses393](x: Self) {
    
    inline def setGet(value: Responses393): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
