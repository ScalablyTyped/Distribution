package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath317Query309 extends StObject {
  
  /**
    * The self-hosted runner groups REST API is available with GitHub Enterprise Cloud and GitHub Enterprise Server. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)."
    *
    * Lists the repositories with access to a self-hosted runner group configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: ParametersPath317Query309
  
  /**
    * The self-hosted runner groups REST API is available with GitHub Enterprise Cloud. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)."
    *
    * Replaces the list of repositories that have access to a self-hosted runner group configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var put: ParametersPath317RequestBodyContentApplicationjsonSelectedrepositoryids
}
object GetParametersPath317Query309 {
  
  inline def apply(
    get: ParametersPath317Query309,
    put: ParametersPath317RequestBodyContentApplicationjsonSelectedrepositoryids
  ): GetParametersPath317Query309 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath317Query309]
  }
  
  extension [Self <: GetParametersPath317Query309](x: Self) {
    
    inline def setGet(value: ParametersPath317Query309): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPath317RequestBodyContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
