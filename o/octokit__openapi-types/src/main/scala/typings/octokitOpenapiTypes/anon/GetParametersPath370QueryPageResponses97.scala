package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath370QueryPageResponses97 extends StObject {
  
  /**
    * List the people a user follows
    * @description Lists the people who the specified user follows.
    */
  var get: ParametersPath370QueryPageResponses97
}
object GetParametersPath370QueryPageResponses97 {
  
  inline def apply(get: ParametersPath370QueryPageResponses97): GetParametersPath370QueryPageResponses97 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath370QueryPageResponses97]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath370QueryPageResponses97] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath370QueryPageResponses97): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
