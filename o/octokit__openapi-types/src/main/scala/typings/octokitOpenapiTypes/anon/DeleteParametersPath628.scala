package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath628 extends StObject {
  
  /**
    * Remove a single repository from an installation. The authenticated user must have admin access to the repository.
    *
    * You must use a personal access token (which you can create via the [command line](https://docs.github.com/github/authenticating-to-github/creating-a-personal-access-token) or [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication)) to access this endpoint.
    */
  var delete: ParametersPath628
  
  /**
    * Add a single repository to an installation. The authenticated user must have admin access to the repository.
    *
    * You must use a personal access token (which you can create via the [command line](https://docs.github.com/github/authenticating-to-github/creating-a-personal-access-token) or [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication)) to access this endpoint.
    */
  var put: ParametersPath628
}
object DeleteParametersPath628 {
  
  inline def apply(delete: ParametersPath628, put: ParametersPath628): DeleteParametersPath628 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath628]
  }
  
  extension [Self <: DeleteParametersPath628](x: Self) {
    
    inline def setDelete(value: ParametersPath628): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPath628): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
