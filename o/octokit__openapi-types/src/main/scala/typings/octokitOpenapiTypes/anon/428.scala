package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pull_request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `428` extends StObject {
  
  var parameters: js.UndefOr[Dismissstalereviewsonpush] = js.undefined
  
  /** @enum {string} */
  var `type`: pull_request
}
object `428` {
  
  inline def apply(): `428` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("pull_request")
    __obj.asInstanceOf[`428`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `428`] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Dismissstalereviewsonpush): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setType(value: pull_request): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
