package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters57 extends StObject {
  
  /** Gets a public key for an organization, which is required in order to encrypt secrets. You need to encrypt the value of a secret before you can create or update secrets. You must authenticate using an access token with the `admin:org` scope to use this endpoint. */
  var get: Parameters57
}
object GetParameters57 {
  
  inline def apply(get: Parameters57): GetParameters57 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters57]
  }
  
  extension [Self <: GetParameters57](x: Self) {
    
    inline def setGet(value: Parameters57): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
