package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPagePerpageRepositoryid extends StObject {
  
  /**
    * Lists the authenticated user's codespaces.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces` repository permission to use this endpoint.
    */
  var get: ParametersQueryPagePerpageRepositoryid
  
  /**
    * Creates a new codespace, owned by the authenticated user.
    *
    * This endpoint requires either a `repository_id` OR a `pull_request` but not both.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  var post: RequestBodyContent196Responses201202401
}
object GetParametersQueryPagePerpageRepositoryid {
  
  inline def apply(get: ParametersQueryPagePerpageRepositoryid, post: RequestBodyContent196Responses201202401): GetParametersQueryPagePerpageRepositoryid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPagePerpageRepositoryid]
  }
  
  extension [Self <: GetParametersQueryPagePerpageRepositoryid](x: Self) {
    
    inline def setGet(value: ParametersQueryPagePerpageRepositoryid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContent196Responses201202401): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
