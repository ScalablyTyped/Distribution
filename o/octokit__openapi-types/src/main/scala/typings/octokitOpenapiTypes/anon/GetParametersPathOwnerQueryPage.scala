package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOwnerQueryPage extends StObject {
  
  /**
    * Lists the codespaces associated to a specified repository and the authenticated user.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces` repository permission to use this endpoint.
    */
  var get: ParametersPathOwnerQueryPage
  
  /**
    * Creates a codespace owned by the authenticated user in the specified repository.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  var post: RequestBodyContent199
}
object GetParametersPathOwnerQueryPage {
  
  inline def apply(get: ParametersPathOwnerQueryPage, post: RequestBodyContent199): GetParametersPathOwnerQueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOwnerQueryPage]
  }
  
  extension [Self <: GetParametersPathOwnerQueryPage](x: Self) {
    
    inline def setGet(value: ParametersPathOwnerQueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContent199): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
