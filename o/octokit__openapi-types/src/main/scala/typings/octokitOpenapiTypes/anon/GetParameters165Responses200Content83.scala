package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters165Responses200Content83 extends StObject {
  
  /**
    * Get a repository public key
    * @description Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have write access to the `codespaces_secrets` repository permission to use this endpoint.
    */
  var get: Parameters165Responses200Content83
}
object GetParameters165Responses200Content83 {
  
  inline def apply(get: Parameters165Responses200Content83): GetParameters165Responses200Content83 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters165Responses200Content83]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters165Responses200Content83] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters165Responses200Content83): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
