package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses94 extends StObject {
  
  /** Members of an organization can choose to have their membership publicized or not. */
  var get: Responses94
}
object GetResponses94 {
  
  inline def apply(get: Responses94): GetResponses94 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses94]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses94] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses94): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
