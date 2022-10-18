package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses658 extends StObject {
  
  /** Lists the SSH signing keys for a user. This operation is accessible by anyone. */
  var get: Responses658
}
object GetResponses658 {
  
  inline def apply(get: Responses658): GetResponses658 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses658]
  }
  
  extension [Self <: GetResponses658](x: Self) {
    
    inline def setGet(value: Responses658): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
