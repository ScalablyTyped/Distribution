package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters37 extends StObject {
  
  /** Get all commonly used licenses */
  var get: Parameters37
}
object GetParameters37 {
  
  inline def apply(get: Parameters37): GetParameters37 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters37]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters37] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters37): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
