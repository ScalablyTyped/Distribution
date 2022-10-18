package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters395Responses200Content321 extends StObject {
  
  /** Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `secrets` repository permission to use this endpoint. */
  var get: Parameters395Responses200Content321
}
object GetParameters395Responses200Content321 {
  
  inline def apply(get: Parameters395Responses200Content321): GetParameters395Responses200Content321 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters395Responses200Content321]
  }
  
  extension [Self <: GetParameters395Responses200Content321](x: Self) {
    
    inline def setGet(value: Parameters395Responses200Content321): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
