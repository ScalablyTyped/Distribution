package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath292QueryClientipRef extends StObject {
  
  /**
    * Gets the default attributes for codespaces created by the user with the repository.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  var get: ParametersPath292QueryClientipRef
}
object GetParametersPath292QueryClientipRef {
  
  inline def apply(get: ParametersPath292QueryClientipRef): GetParametersPath292QueryClientipRef = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath292QueryClientipRef]
  }
  
  extension [Self <: GetParametersPath292QueryClientipRef](x: Self) {
    
    inline def setGet(value: ParametersPath292QueryClientipRef): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
