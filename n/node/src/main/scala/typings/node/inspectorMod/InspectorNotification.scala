package typings.node.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectorNotification[T] extends StObject {
  
  var method: String
  
  var params: T
}
object InspectorNotification {
  
  inline def apply[T](method: String, params: T): InspectorNotification[T] = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorNotification[T]]
  }
  
  extension [Self <: InspectorNotification[?], T](x: Self & InspectorNotification[T]) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
