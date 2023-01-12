package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("MonacoEnvironment")
  @js.native
  def MonacoEnvironment: js.UndefOr[Environment] = js.native
  inline def MonacoEnvironment_=(x: js.UndefOr[Environment]): Unit = js.Dynamic.global.updateDynamic("MonacoEnvironment")(x.asInstanceOf[js.Any])
  
  trait Window extends StObject {
    
    var MonacoEnvironment: js.UndefOr[Environment] = js.undefined
  }
  object Window {
    
    inline def apply(): typings.monacoEditor.mod.global.Window = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.monacoEditor.mod.global.Window]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.monacoEditor.mod.global.Window] (val x: Self) extends AnyVal {
      
      inline def setMonacoEnvironment(value: Environment): Self = StObject.set(x, "MonacoEnvironment", value.asInstanceOf[js.Any])
      
      inline def setMonacoEnvironmentUndefined: Self = StObject.set(x, "MonacoEnvironment", js.undefined)
    }
  }
}
