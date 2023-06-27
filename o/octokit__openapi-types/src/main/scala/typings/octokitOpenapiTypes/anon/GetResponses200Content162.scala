package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content162 extends StObject {
  
  /**
    * Get rate limit status for the authenticated user
    * @description **Note:** Accessing this endpoint does not count against your REST API rate limit.
    *
    * **Note:** The `rate` object is deprecated. If you're writing new API client code or updating existing code, you should use the `core` object instead of the `rate` object. The `core` object contains the same information that is present in the `rate` object.
    */
  var get: Responses200Content162
}
object GetResponses200Content162 {
  
  inline def apply(get: Responses200Content162): GetResponses200Content162 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content162]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content162] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content162): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
