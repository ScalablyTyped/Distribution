package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content80304 extends StObject {
  
  /**
    * List users blocked by the authenticated user
    * @description List the users you've blocked on your personal account.
    */
  var get: Responses200Content80304
}
object GetResponses200Content80304 {
  
  inline def apply(get: Responses200Content80304): GetResponses200Content80304 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content80304]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content80304] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content80304): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
