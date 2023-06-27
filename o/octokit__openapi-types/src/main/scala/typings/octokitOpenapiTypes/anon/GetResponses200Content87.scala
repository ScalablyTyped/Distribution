package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content87 extends StObject {
  
  /**
    * Get an organization public key
    * @description Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.
    */
  var get: Responses200Content87
}
object GetResponses200Content87 {
  
  inline def apply(get: Responses200Content87): GetResponses200Content87 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content87]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content87] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content87): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
