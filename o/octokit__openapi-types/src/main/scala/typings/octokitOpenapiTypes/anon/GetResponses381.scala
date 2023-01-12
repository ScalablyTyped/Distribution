package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses381 extends StObject {
  
  /** Lists the GPG keys for a user. This information is accessible by anyone. */
  var get: Responses381
}
object GetResponses381 {
  
  inline def apply(get: Responses381): GetResponses381 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses381]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses381] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses381): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
