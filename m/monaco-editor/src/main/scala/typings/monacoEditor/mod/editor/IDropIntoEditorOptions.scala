package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDropIntoEditorOptions extends StObject {
  
  /**
    * Enable the dropping into editor.
    * Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object IDropIntoEditorOptions {
  
  inline def apply(): IDropIntoEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDropIntoEditorOptions]
  }
  
  extension [Self <: IDropIntoEditorOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
