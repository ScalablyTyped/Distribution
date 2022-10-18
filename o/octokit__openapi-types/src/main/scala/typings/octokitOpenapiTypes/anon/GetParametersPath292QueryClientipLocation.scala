package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath292QueryClientipLocation extends StObject {
  
  /**
    * List the machine types available for a given repository based on its configuration.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_metadata` repository permission to use this endpoint.
    */
  var get: ParametersPath292QueryClientipLocation
}
object GetParametersPath292QueryClientipLocation {
  
  inline def apply(get: ParametersPath292QueryClientipLocation): GetParametersPath292QueryClientipLocation = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath292QueryClientipLocation]
  }
  
  extension [Self <: GetParametersPath292QueryClientipLocation](x: Self) {
    
    inline def setGet(value: ParametersPath292QueryClientipLocation): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
