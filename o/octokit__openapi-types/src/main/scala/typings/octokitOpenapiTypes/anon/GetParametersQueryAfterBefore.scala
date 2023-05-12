package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryAfterBefore extends StObject {
  
  /**
    * List repository security advisories
    * @description Lists security advisories in a repository.
    * You must authenticate using an access token with the `repo` scope or `repository_advisories:read` permission
    * in order to get published security advisories in a private repository, or any unpublished security advisories that you have access to.
    *
    * You can access unpublished security advisories from a repository if you are a security manager or administrator of that repository, or if you are a collaborator on any security advisory.
    */
  var get: ParametersQueryAfterBefore
  
  /**
    * Create a repository security advisory
    * @description Creates a new repository security advisory.
    * You must authenticate using an access token with the `repo` scope or `repository_advisories:write` permission to use this endpoint.
    *
    * In order to create a draft repository security advisory, you must be a security manager or administrator of that repository.
    */
  var post: RequestBodyContent342
}
object GetParametersQueryAfterBefore {
  
  inline def apply(get: ParametersQueryAfterBefore, post: RequestBodyContent342): GetParametersQueryAfterBefore = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryAfterBefore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryAfterBefore] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryAfterBefore): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContent342): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
