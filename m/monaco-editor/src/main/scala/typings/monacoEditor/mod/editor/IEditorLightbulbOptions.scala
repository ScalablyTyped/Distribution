package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditorLightbulbOptions extends StObject {
  
  /**
    * Enable the lightbulb code action.
    * Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object IEditorLightbulbOptions {
  
  inline def apply(): IEditorLightbulbOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorLightbulbOptions]
  }
  
  extension [Self <: IEditorLightbulbOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
