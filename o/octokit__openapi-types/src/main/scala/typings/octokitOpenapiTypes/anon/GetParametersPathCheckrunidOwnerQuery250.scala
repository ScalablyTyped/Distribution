package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathCheckrunidOwnerQuery250 extends StObject {
  
  /** Lists annotations for a check run using the annotation `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get annotations for a check run. OAuth Apps and authenticated users must have the `repo` scope to get annotations for a check run in a private repository. */
  var get: ParametersPathCheckrunidOwnerQuery250
}
object GetParametersPathCheckrunidOwnerQuery250 {
  
  inline def apply(get: ParametersPathCheckrunidOwnerQuery250): GetParametersPathCheckrunidOwnerQuery250 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathCheckrunidOwnerQuery250]
  }
  
  extension [Self <: GetParametersPathCheckrunidOwnerQuery250](x: Self) {
    
    inline def setGet(value: ParametersPathCheckrunidOwnerQuery250): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
