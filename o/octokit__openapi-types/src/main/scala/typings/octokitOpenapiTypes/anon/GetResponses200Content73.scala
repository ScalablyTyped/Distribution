package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content73 extends StObject {
  
  /**
    * Get an organization public key
    * @description Gets a public key for an organization, which is required in order to encrypt secrets. You need to encrypt the value of a secret before you can create or update secrets. You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: Responses200Content73
}
object GetResponses200Content73 {
  
  inline def apply(get: Responses200Content73): GetResponses200Content73 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content73]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content73] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content73): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
