package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.afterDrop
import typings.monacoEditor.monacoEditorStrings.never
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDropIntoEditorOptions extends StObject {
  
  /**
    * Enable dropping into editor.
    * Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls if a widget is shown after a drop.
    * Defaults to 'afterDrop'.
    */
  var showDropSelector: js.UndefOr[afterDrop | never] = js.undefined
}
object IDropIntoEditorOptions {
  
  inline def apply(): IDropIntoEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDropIntoEditorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDropIntoEditorOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setShowDropSelector(value: afterDrop | never): Self = StObject.set(x, "showDropSelector", value.asInstanceOf[js.Any])
    
    inline def setShowDropSelectorUndefined: Self = StObject.set(x, "showDropSelector", js.undefined)
  }
}
