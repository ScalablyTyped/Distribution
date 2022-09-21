package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses397 extends StObject {
  
  /** Lists the SSH signing keys for a user. This operation is accessible by anyone. */
  var get: Responses397
}
object GetResponses397 {
  
  inline def apply(get: Responses397): GetResponses397 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses397]
  }
  
  extension [Self <: GetResponses397](x: Self) {
    
    inline def setGet(value: Responses397): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
