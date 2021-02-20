package typings.node.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InspectorNotification[T] extends StObject {
  
  var method: String = js.native
  
  var params: T = js.native
}
object InspectorNotification {
  
  @scala.inline
  def apply[T](method: String, params: T): InspectorNotification[T] = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorNotification[T]]
  }
  
  @scala.inline
  implicit class InspectorNotificationMutableBuilder[Self <: InspectorNotification[_], T] (val x: Self with InspectorNotification[T]) extends AnyVal {
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
