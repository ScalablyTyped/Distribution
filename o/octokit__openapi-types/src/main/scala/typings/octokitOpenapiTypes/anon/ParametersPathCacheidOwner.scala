package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCacheidOwner extends StObject {
  
  var parameters: PathCacheidOwner
}
object ParametersPathCacheidOwner {
  
  inline def apply(parameters: PathCacheidOwner): ParametersPathCacheidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCacheidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCacheidOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCacheidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
