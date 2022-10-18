package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath292Query250 extends StObject {
  
  /**
    * Lists the codespaces associated to a specified repository and the authenticated user.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces` repository permission to use this endpoint.
    */
  var get: ParametersPath292Query250
  
  /**
    * Creates a codespace owned by the authenticated user in the specified repository.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  var post: Responses201202400
}
object GetParametersPath292Query250 {
  
  inline def apply(get: ParametersPath292Query250, post: Responses201202400): GetParametersPath292Query250 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath292Query250]
  }
  
  extension [Self <: GetParametersPath292Query250](x: Self) {
    
    inline def setGet(value: ParametersPath292Query250): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201202400): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
