package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content48304 extends StObject {
  
  /**
    * List repositories watched by the authenticated user
    * @description Lists repositories the authenticated user is watching.
    */
  var get: Responses200Content48304
}
object GetResponses200Content48304 {
  
  inline def apply(get: Responses200Content48304): GetResponses200Content48304 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content48304]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content48304] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content48304): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
