package typings.mobx.anon

import typings.mobx.distTypesObservablesetMod.ObservableSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugObjectNameObject[T] extends StObject {
  
  var debugObjectName: String
  
  var `object`: ObservableSet[T]
  
  var observableKind: "set"
  
  var oldValue: T
  
  var `type`: "delete"
}
object DebugObjectNameObject {
  
  inline def apply[T](debugObjectName: String, `object`: ObservableSet[T], oldValue: T): DebugObjectNameObject[T] = {
    val __obj = js.Dynamic.literal(debugObjectName = debugObjectName.asInstanceOf[js.Any], observableKind = "set", oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("delete")
    __obj.asInstanceOf[DebugObjectNameObject[T]]
  }
  
  extension [Self <: DebugObjectNameObject[?], T](x: Self & DebugObjectNameObject[T]) {
    
    inline def setDebugObjectName(value: String): Self = StObject.set(x, "debugObjectName", value.asInstanceOf[js.Any])
    
    inline def setObject(value: ObservableSet[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObservableKind(value: "set"): Self = StObject.set(x, "observableKind", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: "delete"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
