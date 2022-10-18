package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath317Responses extends StObject {
  
  /**
    * The self-hosted runner groups REST API is available with GitHub Enterprise Cloud. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)."
    *
    * Deletes a self-hosted runner group for an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var delete: ParametersPath317Responses
  
  /**
    * The self-hosted runner groups REST API is available with GitHub Enterprise Cloud. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)."
    *
    * Gets a specific self-hosted runner group for an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: ParametersPath317
  
  /**
    * The self-hosted runner groups REST API is available with GitHub Enterprise Cloud. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)."
    *
    * Updates the `name` and `visibility` of a self-hosted runner group in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var patch: Responses200Content316
}
object DeleteParametersPath317Responses {
  
  inline def apply(delete: ParametersPath317Responses, get: ParametersPath317, patch: Responses200Content316): DeleteParametersPath317Responses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath317Responses]
  }
  
  extension [Self <: DeleteParametersPath317Responses](x: Self) {
    
    inline def setDelete(value: ParametersPath317Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath317): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content316): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
