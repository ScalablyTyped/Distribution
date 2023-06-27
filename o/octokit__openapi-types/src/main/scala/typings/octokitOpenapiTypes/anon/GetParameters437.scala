package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters437 extends StObject {
  
  /**
    * Get an environment public key
    * @description Get the public key for an environment, which you need to encrypt environment secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  var get: Parameters437
}
object GetParameters437 {
  
  inline def apply(get: Parameters437): GetParameters437 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters437]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters437] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters437): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
