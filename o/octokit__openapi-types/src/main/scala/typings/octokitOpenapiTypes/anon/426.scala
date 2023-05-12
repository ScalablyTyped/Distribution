package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.required_deployments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `426` extends StObject {
  
  var parameters: js.UndefOr[Requireddeploymentenvironments] = js.undefined
  
  /** @enum {string} */
  var `type`: required_deployments
}
object `426` {
  
  inline def apply(): `426` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("required_deployments")
    __obj.asInstanceOf[`426`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `426`] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Requireddeploymentenvironments): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setType(value: required_deployments): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
