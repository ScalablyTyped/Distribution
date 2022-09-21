package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofScriptComponent extends StObject {
  
  /* static member */
  var scriptMethods: Initialize
}
object TypeofScriptComponent {
  
  inline def apply(scriptMethods: Initialize): TypeofScriptComponent = {
    val __obj = js.Dynamic.literal(scriptMethods = scriptMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofScriptComponent]
  }
  
  extension [Self <: TypeofScriptComponent](x: Self) {
    
    inline def setScriptMethods(value: Initialize): Self = StObject.set(x, "scriptMethods", value.asInstanceOf[js.Any])
  }
}
