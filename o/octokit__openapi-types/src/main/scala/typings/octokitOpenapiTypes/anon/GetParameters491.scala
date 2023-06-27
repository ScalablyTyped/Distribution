package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters491 extends StObject {
  
  /**
    * List repositories for a user
    * @description Lists public repositories for the specified user. Note: For GitHub AE, this endpoint will list internal repositories for the specified user.
    */
  var get: Parameters491
}
object GetParameters491 {
  
  inline def apply(get: Parameters491): GetParameters491 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters491]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters491] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters491): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
