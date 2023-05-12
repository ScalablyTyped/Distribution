package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathKey extends StObject {
  
  /** Get a code of conduct */
  var get: ParametersPathKey
}
object GetParametersPathKey {
  
  inline def apply(get: ParametersPathKey): GetParametersPathKey = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathKey] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathKey): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
