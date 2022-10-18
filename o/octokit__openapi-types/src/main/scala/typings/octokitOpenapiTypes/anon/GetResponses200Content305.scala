package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content305 extends StObject {
  
  /** Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `codespaces_secrets` repository permission to use this endpoint. */
  var get: Responses200Content305
}
object GetResponses200Content305 {
  
  inline def apply(get: Responses200Content305): GetResponses200Content305 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content305]
  }
  
  extension [Self <: GetResponses200Content305](x: Self) {
    
    inline def setGet(value: Responses200Content305): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
