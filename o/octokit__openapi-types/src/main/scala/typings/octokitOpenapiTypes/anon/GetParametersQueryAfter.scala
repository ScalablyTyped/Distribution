package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryAfter extends StObject {
  
  /** Gets the audit log for an enterprise. To use this endpoint, you must be an enterprise admin, and you must use an access token with the `admin:enterprise` scope. */
  var get: ParametersQueryAfter
}
object GetParametersQueryAfter {
  
  inline def apply(get: ParametersQueryAfter): GetParametersQueryAfter = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryAfter]
  }
  
  extension [Self <: GetParametersQueryAfter](x: Self) {
    
    inline def setGet(value: ParametersQueryAfter): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
