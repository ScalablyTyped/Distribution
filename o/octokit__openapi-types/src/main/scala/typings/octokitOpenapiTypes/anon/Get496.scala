package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Get496 extends StObject {
  
  /**
    * Get all API versions
    * @description Get all supported GitHub API versions.
    */
  var get: `496`
}
object Get496 {
  
  inline def apply(get: `496`): Get496 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Get496]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Get496] (val x: Self) extends AnyVal {
    
    inline def setGet(value: `496`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
