package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters446 extends StObject {
  
  /**
    * List codespaces for the authenticated user
    * @description Lists the authenticated user's codespaces.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces` repository permission to use this endpoint.
    */
  var get: Parameters446
  
  /**
    * Create a codespace for the authenticated user
    * @description Creates a new codespace, owned by the authenticated user.
    *
    * This endpoint requires either a `repository_id` OR a `pull_request` but not both.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  var post: RequestBodyContent447
}
object GetParameters446 {
  
  inline def apply(get: Parameters446, post: RequestBodyContent447): GetParameters446 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters446]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters446] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters446): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContent447): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
