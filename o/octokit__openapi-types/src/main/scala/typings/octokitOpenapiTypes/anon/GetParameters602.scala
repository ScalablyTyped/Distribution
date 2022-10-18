package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters602 extends StObject {
  
  /** Get the public key for an environment, which you need to encrypt environment secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `secrets` repository permission to use this endpoint. */
  var get: Parameters602
}
object GetParameters602 {
  
  inline def apply(get: Parameters602): GetParameters602 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters602]
  }
  
  extension [Self <: GetParameters602](x: Self) {
    
    inline def setGet(value: Parameters602): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
