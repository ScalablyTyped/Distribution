package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberOwner extends StObject {
  
  var parameters: PathIssuenumberOwner
}
object ParametersPathIssuenumberOwner {
  
  inline def apply(parameters: PathIssuenumberOwner): ParametersPathIssuenumberOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathIssuenumberOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumberOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
