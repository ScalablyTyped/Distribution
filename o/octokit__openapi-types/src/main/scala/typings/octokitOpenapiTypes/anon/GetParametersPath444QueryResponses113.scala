package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath444QueryResponses113 extends StObject {
  
  /**
    * List the people a user follows
    * @description Lists the people who the specified user follows.
    */
  var get: ParametersPath444QueryResponses113
}
object GetParametersPath444QueryResponses113 {
  
  inline def apply(get: ParametersPath444QueryResponses113): GetParametersPath444QueryResponses113 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath444QueryResponses113]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath444QueryResponses113] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath444QueryResponses113): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
