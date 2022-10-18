package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters303 extends StObject {
  
  /** Gets a public key for an organization, which is required in order to encrypt secrets. You need to encrypt the value of a secret before you can create or update secrets. You must authenticate using an access token with the `admin:org` scope to use this endpoint. */
  var get: Parameters303
}
object GetParameters303 {
  
  inline def apply(get: Parameters303): GetParameters303 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters303]
  }
  
  extension [Self <: GetParameters303](x: Self) {
    
    inline def setGet(value: Parameters303): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
