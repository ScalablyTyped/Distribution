package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters466 extends StObject {
  
  /**
    * List organization memberships for the authenticated user
    * @description Lists all of the authenticated user's organization memberships.
    */
  var get: Parameters466
}
object GetParameters466 {
  
  inline def apply(get: Parameters466): GetParameters466 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters466]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters466] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters466): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
