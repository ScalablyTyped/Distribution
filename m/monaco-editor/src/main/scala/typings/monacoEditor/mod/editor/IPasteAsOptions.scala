package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.afterPaste
import typings.monacoEditor.monacoEditorStrings.never
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPasteAsOptions extends StObject {
  
  /**
    * Enable paste as functionality in editors.
    * Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls if a widget is shown after a drop.
    * Defaults to 'afterPaste'.
    */
  var showPasteSelector: js.UndefOr[afterPaste | never] = js.undefined
}
object IPasteAsOptions {
  
  inline def apply(): IPasteAsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPasteAsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPasteAsOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setShowPasteSelector(value: afterPaste | never): Self = StObject.set(x, "showPasteSelector", value.asInstanceOf[js.Any])
    
    inline def setShowPasteSelectorUndefined: Self = StObject.set(x, "showPasteSelector", js.undefined)
  }
}
