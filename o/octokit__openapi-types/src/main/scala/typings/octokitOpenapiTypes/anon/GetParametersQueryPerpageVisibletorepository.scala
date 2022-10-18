package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPerpageVisibletorepository extends StObject {
  
  /**
    * The self-hosted runner groups REST API is available with GitHub Enterprise Cloud. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)."
    *
    * Lists all self-hosted runner groups configured in an organization and inherited from an enterprise.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: ParametersQueryPerpageVisibletorepository
  
  /**
    * The self-hosted runner groups REST API is available with GitHub Enterprise Cloud and GitHub Enterprise Server. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)."
    *
    * Creates a new self-hosted runner group for an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var post: Responses201Content316
}
object GetParametersQueryPerpageVisibletorepository {
  
  inline def apply(get: ParametersQueryPerpageVisibletorepository, post: Responses201Content316): GetParametersQueryPerpageVisibletorepository = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPerpageVisibletorepository]
  }
  
  extension [Self <: GetParametersQueryPerpageVisibletorepository](x: Self) {
    
    inline def setGet(value: ParametersQueryPerpageVisibletorepository): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content316): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
