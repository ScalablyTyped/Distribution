package typings.mobx.anon

import typings.mobx.distTypesObservablesetMod.ISetDidChange
import typings.mobx.distTypesObservablesetMod.ObservableSet
import typings.mobx.mobxStrings.delete
import typings.mobx.mobxStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugObjectNameObject[T]
  extends StObject
     with ISetDidChange[T] {
  
  var debugObjectName: String
  
  var `object`: ObservableSet[T]
  
  var observableKind: set
  
  var oldValue: T
  
  var `type`: delete
}
object DebugObjectNameObject {
  
  inline def apply[T](debugObjectName: String, `object`: ObservableSet[T], oldValue: T): DebugObjectNameObject[T] = {
    val __obj = js.Dynamic.literal(debugObjectName = debugObjectName.asInstanceOf[js.Any], observableKind = "set", oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("delete")
    __obj.asInstanceOf[DebugObjectNameObject[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DebugObjectNameObject[?], T] (val x: Self & DebugObjectNameObject[T]) extends AnyVal {
    
    inline def setDebugObjectName(value: String): Self = StObject.set(x, "debugObjectName", value.asInstanceOf[js.Any])
    
    inline def setObject(value: ObservableSet[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObservableKind(value: set): Self = StObject.set(x, "observableKind", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: delete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
