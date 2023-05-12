package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters141Responses200Content76 extends StObject {
  
  /**
    * Get a repository public key
    * @description Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `dependabot_secrets` repository permission to use this endpoint.
    */
  var get: Parameters141Responses200Content76
}
object GetParameters141Responses200Content76 {
  
  inline def apply(get: Parameters141Responses200Content76): GetParameters141Responses200Content76 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters141Responses200Content76]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters141Responses200Content76] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters141Responses200Content76): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
