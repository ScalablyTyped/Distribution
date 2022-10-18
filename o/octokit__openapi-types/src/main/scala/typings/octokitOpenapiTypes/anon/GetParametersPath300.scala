package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath300 extends StObject {
  
  /**
    * Lists all Codespaces secrets available at the organization-level without revealing their encrypted values.
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: ParametersPath300
}
object GetParametersPath300 {
  
  inline def apply(get: ParametersPath300): GetParametersPath300 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath300]
  }
  
  extension [Self <: GetParametersPath300](x: Self) {
    
    inline def setGet(value: ParametersPath300): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
