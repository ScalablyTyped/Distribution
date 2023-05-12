package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Get419 extends StObject {
  
  /**
    * Get all API versions
    * @description Get all supported GitHub API versions.
    */
  var get: `419`
}
object Get419 {
  
  inline def apply(get: `419`): Get419 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Get419]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Get419] (val x: Self) extends AnyVal {
    
    inline def setGet(value: `419`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
