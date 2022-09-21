package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var MonacoEnvironment: js.UndefOr[Environment] = js.undefined
}
object Window {
  
  inline def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setMonacoEnvironment(value: Environment): Self = StObject.set(x, "MonacoEnvironment", value.asInstanceOf[js.Any])
    
    inline def setMonacoEnvironmentUndefined: Self = StObject.set(x, "MonacoEnvironment", js.undefined)
  }
}
