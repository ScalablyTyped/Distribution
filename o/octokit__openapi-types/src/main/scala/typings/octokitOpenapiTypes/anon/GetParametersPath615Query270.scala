package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath615Query270 extends StObject {
  
  /** Lists public gists for the specified user: */
  var get: ParametersPath615Query270
}
object GetParametersPath615Query270 {
  
  inline def apply(get: ParametersPath615Query270): GetParametersPath615Query270 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath615Query270]
  }
  
  extension [Self <: GetParametersPath615Query270](x: Self) {
    
    inline def setGet(value: ParametersPath615Query270): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
