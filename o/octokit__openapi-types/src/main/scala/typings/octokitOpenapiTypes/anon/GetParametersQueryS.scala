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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryS] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryS): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
