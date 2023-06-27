package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters490 extends StObject {
  
  /**
    * List user projects
    * @description Lists projects for a user.
    */
  var get: Parameters490
}
object GetParameters490 {
  
  inline def apply(get: Parameters490): GetParameters490 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters490]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters490] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters490): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
