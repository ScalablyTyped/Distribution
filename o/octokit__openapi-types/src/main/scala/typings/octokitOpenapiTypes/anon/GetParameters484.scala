package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters484 extends StObject {
  
  /**
    * List gists for a user
    * @description Lists public gists for the specified user:
    */
  var get: Parameters484
}
object GetParameters484 {
  
  inline def apply(get: Parameters484): GetParameters484 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters484]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters484] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters484): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
