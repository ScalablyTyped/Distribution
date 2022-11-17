package typings.mobx.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugObjectName extends StObject {
  
  var debugObjectName: String
  
  var observableKind: "map"
}
object DebugObjectName {
  
  inline def apply(debugObjectName: String): DebugObjectName = {
    val __obj = js.Dynamic.literal(debugObjectName = debugObjectName.asInstanceOf[js.Any], observableKind = "map")
    __obj.asInstanceOf[DebugObjectName]
  }
  
  extension [Self <: DebugObjectName](x: Self) {
    
    inline def setDebugObjectName(value: String): Self = StObject.set(x, "debugObjectName", value.asInstanceOf[js.Any])
    
    inline def setObservableKind(value: "map"): Self = StObject.set(x, "observableKind", value.asInstanceOf[js.Any])
  }
}
