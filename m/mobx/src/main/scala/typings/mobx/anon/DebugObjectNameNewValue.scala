package typings.mobx.anon

import typings.mobx.distTypesObservablesetMod.ISetDidChange
import typings.mobx.distTypesObservablesetMod.ObservableSet
import typings.mobx.mobxStrings.add
import typings.mobx.mobxStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugObjectNameNewValue[T]
  extends StObject
     with ISetDidChange[T] {
  
  var debugObjectName: String
  
  var newValue: T
  
  var `object`: ObservableSet[T]
  
  var observableKind: set
  
  var `type`: add
}
object DebugObjectNameNewValue {
  
  inline def apply[T](debugObjectName: String, newValue: T, `object`: ObservableSet[T]): DebugObjectNameNewValue[T] = {
    val __obj = js.Dynamic.literal(debugObjectName = debugObjectName.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], observableKind = "set")
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("add")
    __obj.asInstanceOf[DebugObjectNameNewValue[T]]
  }
  
  extension [Self <: DebugObjectNameNewValue[?], T](x: Self & DebugObjectNameNewValue[T]) {
    
    inline def setDebugObjectName(value: String): Self = StObject.set(x, "debugObjectName", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setObject(value: ObservableSet[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObservableKind(value: set): Self = StObject.set(x, "observableKind", value.asInstanceOf[js.Any])
    
    inline def setType(value: add): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
