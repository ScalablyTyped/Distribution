package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses401403404500 extends StObject {
  
  /**
    * List codespaces in a repository for the authenticated user
    * @description Lists the codespaces associated to a specified repository and the authenticated user.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces` repository permission to use this endpoint.
    */
  var get: Responses401403404500
  
  /**
    * Create a codespace in a repository
    * @description Creates a codespace owned by the authenticated user in the specified repository.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  var post: RequestBodyContent207
}
object GetResponses401403404500 {
  
  inline def apply(get: Responses401403404500, post: RequestBodyContent207): GetResponses401403404500 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses401403404500]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses401403404500] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses401403404500): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContent207): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
