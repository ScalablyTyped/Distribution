package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content67 extends StObject {
  
  /** Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint. */
  var get: Responses200Content67
}
object GetResponses200Content67 {
  
  inline def apply(get: Responses200Content67): GetResponses200Content67 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content67]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content67] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content67): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
