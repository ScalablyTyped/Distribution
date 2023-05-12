package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200401403404 extends StObject {
  
  /**
    * List package versions for a package owned by a user
    * @description Lists package versions for a public package owned by a specified user.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  var get: Responses200401403404
}
object GetResponses200401403404 {
  
  inline def apply(get: Responses200401403404): GetResponses200401403404 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200401403404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200401403404] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200401403404): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
