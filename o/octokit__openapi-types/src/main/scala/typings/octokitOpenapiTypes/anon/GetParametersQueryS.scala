package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryS extends StObject {
  
  /** Get the octocat as ASCII art */
  var get: ParametersQueryS
}
object GetParametersQueryS {
  
  inline def apply(get: ParametersQueryS): GetParametersQueryS = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryS]
  }
  
  extension [Self <: GetParametersQueryS](x: Self) {
    
    inline def setGet(value: ParametersQueryS): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
