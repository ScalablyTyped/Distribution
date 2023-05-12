package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath370QueryPageResponses104 extends StObject {
  
  /**
    * List repositories watched by a user
    * @description Lists repositories a user is watching.
    */
  var get: ParametersPath370QueryPageResponses104
}
object GetParametersPath370QueryPageResponses104 {
  
  inline def apply(get: ParametersPath370QueryPageResponses104): GetParametersPath370QueryPageResponses104 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath370QueryPageResponses104]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath370QueryPageResponses104] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath370QueryPageResponses104): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
