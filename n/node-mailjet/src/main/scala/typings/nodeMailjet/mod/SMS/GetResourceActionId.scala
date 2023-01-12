package typings.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceActionId extends StObject {
  
  def request(): js.Promise[ExportResponse]
}
object GetResourceActionId {
  
  inline def apply(request: () => js.Promise[ExportResponse]): GetResourceActionId = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction0(request))
    __obj.asInstanceOf[GetResourceActionId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourceActionId] (val x: Self) extends AnyVal {
    
    inline def setRequest(value: () => js.Promise[ExportResponse]): Self = StObject.set(x, "request", js.Any.fromFunction0(value))
  }
}
