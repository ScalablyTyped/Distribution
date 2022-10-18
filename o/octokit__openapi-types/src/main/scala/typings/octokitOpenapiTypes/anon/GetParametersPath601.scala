package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath601 extends StObject {
  
  /** Lists all secrets available in an environment without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint. */
  var get: ParametersPath601
}
object GetParametersPath601 {
  
  inline def apply(get: ParametersPath601): GetParametersPath601 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath601]
  }
  
  extension [Self <: GetParametersPath601](x: Self) {
    
    inline def setGet(value: ParametersPath601): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
