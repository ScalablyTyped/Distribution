package typings.mobx.anon

import typings.mobx.mobxStrings.`object`
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObservableKind[T] extends StObject {
  
  var debugObjectName: String
  
  var name: PropertyKey
  
  var `object`: T
  
  var observableKind: `object`
}
object ObservableKind {
  
  inline def apply[T](debugObjectName: String, name: PropertyKey, `object`: T): ObservableKind[T] = {
    val __obj = js.Dynamic.literal(debugObjectName = debugObjectName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], observableKind = "object")
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObservableKind[T]]
  }
  
  extension [Self <: ObservableKind[?], T](x: Self & ObservableKind[T]) {
    
    inline def setDebugObjectName(value: String): Self = StObject.set(x, "debugObjectName", value.asInstanceOf[js.Any])
    
    inline def setName(value: PropertyKey): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setObject(value: T): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObservableKind(value: `object`): Self = StObject.set(x, "observableKind", value.asInstanceOf[js.Any])
  }
}
