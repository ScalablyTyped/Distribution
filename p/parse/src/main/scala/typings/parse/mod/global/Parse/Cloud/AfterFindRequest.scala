package typings.parse.mod.global.Parse.Cloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterFindRequest[T]
  extends StObject
     with TriggerRequest[T] {
  
  var objects: js.Array[T]
}
object AfterFindRequest {
  
  inline def apply[T](headers: Any, ip: String, log: Any, `object`: T, objects: js.Array[T], triggerName: String): AfterFindRequest[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterFindRequest[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AfterFindRequest[?], T] (val x: Self & AfterFindRequest[T]) extends AnyVal {
    
    inline def setObjects(value: js.Array[T]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsVarargs(value: T*): Self = StObject.set(x, "objects", js.Array(value*))
  }
}
