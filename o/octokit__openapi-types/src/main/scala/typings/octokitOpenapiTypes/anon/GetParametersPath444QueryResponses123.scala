package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath444QueryResponses123 extends StObject {
  
  /**
    * List repositories watched by a user
    * @description Lists repositories a user is watching.
    */
  var get: ParametersPath444QueryResponses123
}
object GetParametersPath444QueryResponses123 {
  
  inline def apply(get: ParametersPath444QueryResponses123): GetParametersPath444QueryResponses123 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath444QueryResponses123]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath444QueryResponses123] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath444QueryResponses123): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
