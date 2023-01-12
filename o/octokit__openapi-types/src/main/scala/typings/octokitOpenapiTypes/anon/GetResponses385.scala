package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses385 extends StObject {
  
  /** Lists the SSH signing keys for a user. This operation is accessible by anyone. */
  var get: Responses385
}
object GetResponses385 {
  
  inline def apply(get: Responses385): GetResponses385 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses385]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses385] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses385): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
