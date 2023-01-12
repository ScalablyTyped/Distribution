package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters135Responses200Content67 extends StObject {
  
  /** Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `secrets` repository permission to use this endpoint. */
  var get: Parameters135Responses200Content67
}
object GetParameters135Responses200Content67 {
  
  inline def apply(get: Parameters135Responses200Content67): GetParameters135Responses200Content67 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters135Responses200Content67]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters135Responses200Content67] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters135Responses200Content67): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
