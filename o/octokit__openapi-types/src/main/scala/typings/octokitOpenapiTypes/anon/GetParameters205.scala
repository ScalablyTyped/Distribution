package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters205 extends StObject {
  
  /** List branches */
  var get: Parameters205
}
object GetParameters205 {
  
  inline def apply(get: Parameters205): GetParameters205 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters205]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters205] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters205): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
