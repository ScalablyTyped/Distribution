package typings.parse.mod.global.Parse.Cloud

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterSaveRequest[T]
  extends StObject
     with TriggerRequest[T] {
  
  var context: Record[String, Any]
}
object AfterSaveRequest {
  
  inline def apply[T](context: Record[String, Any], headers: Any, ip: String, log: Any, `object`: T, triggerName: String): AfterSaveRequest[T] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterSaveRequest[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AfterSaveRequest[?], T] (val x: Self & AfterSaveRequest[T]) extends AnyVal {
    
    inline def setContext(value: Record[String, Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
