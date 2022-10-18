package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath300Query250 extends StObject {
  
  /**
    * Lists the codespaces associated to a specified organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: ParametersPath300Query250
}
object GetParametersPath300Query250 {
  
  inline def apply(get: ParametersPath300Query250): GetParametersPath300Query250 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath300Query250]
  }
  
  extension [Self <: GetParametersPath300Query250](x: Self) {
    
    inline def setGet(value: ParametersPath300Query250): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
