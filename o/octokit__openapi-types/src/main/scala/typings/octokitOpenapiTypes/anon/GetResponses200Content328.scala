package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content328 extends StObject {
  
  /** Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint. */
  var get: Responses200Content328
}
object GetResponses200Content328 {
  
  inline def apply(get: Responses200Content328): GetResponses200Content328 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content328]
  }
  
  extension [Self <: GetResponses200Content328](x: Self) {
    
    inline def setGet(value: Responses200Content328): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
