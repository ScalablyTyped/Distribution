package typings.mobx.anon

import typings.mobx.distTypesObservablevalueMod.IObservableValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectObservableKind[T] extends StObject {
  
  var debugObjectName: String
  
  var newValue: Any
  
  var `object`: IObservableValue[T]
  
  var observableKind: "value"
  
  var `type`: "create"
}
object ObjectObservableKind {
  
  inline def apply[T](debugObjectName: String, newValue: Any, `object`: IObservableValue[T]): ObjectObservableKind[T] = {
    val __obj = js.Dynamic.literal(debugObjectName = debugObjectName.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], observableKind = "value")
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("create")
    __obj.asInstanceOf[ObjectObservableKind[T]]
  }
  
  extension [Self <: ObjectObservableKind[?], T](x: Self & ObjectObservableKind[T]) {
    
    inline def setDebugObjectName(value: String): Self = StObject.set(x, "debugObjectName", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setObject(value: IObservableValue[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObservableKind(value: "value"): Self = StObject.set(x, "observableKind", value.asInstanceOf[js.Any])
    
    inline def setType(value: "create"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
