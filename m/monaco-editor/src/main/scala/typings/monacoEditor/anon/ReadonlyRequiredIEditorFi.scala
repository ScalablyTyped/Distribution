package typings.monacoEditor.anon

import typings.monacoEditor.monacoEditorStrings.always
import typings.monacoEditor.monacoEditorStrings.multiline
import typings.monacoEditor.monacoEditorStrings.never
import typings.monacoEditor.monacoEditorStrings.selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorFindOptions>> */
trait ReadonlyRequiredIEditorFi extends StObject {
  
  val addExtraSpaceOnTop: Boolean
  
  val autoFindInSelection: never | always | multiline
  
  val cursorMoveOnType: Boolean
  
  val loop: Boolean
  
  val seedSearchStringFromSelection: never | always | selection
}
object ReadonlyRequiredIEditorFi {
  
  inline def apply(
    addExtraSpaceOnTop: Boolean,
    autoFindInSelection: never | always | multiline,
    cursorMoveOnType: Boolean,
    loop: Boolean,
    seedSearchStringFromSelection: never | always | selection
  ): ReadonlyRequiredIEditorFi = {
    val __obj = js.Dynamic.literal(addExtraSpaceOnTop = addExtraSpaceOnTop.asInstanceOf[js.Any], autoFindInSelection = autoFindInSelection.asInstanceOf[js.Any], cursorMoveOnType = cursorMoveOnType.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], seedSearchStringFromSelection = seedSearchStringFromSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyRequiredIEditorFi]
  }
  
  extension [Self <: ReadonlyRequiredIEditorFi](x: Self) {
    
    inline def setAddExtraSpaceOnTop(value: Boolean): Self = StObject.set(x, "addExtraSpaceOnTop", value.asInstanceOf[js.Any])
    
    inline def setAutoFindInSelection(value: never | always | multiline): Self = StObject.set(x, "autoFindInSelection", value.asInstanceOf[js.Any])
    
    inline def setCursorMoveOnType(value: Boolean): Self = StObject.set(x, "cursorMoveOnType", value.asInstanceOf[js.Any])
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setSeedSearchStringFromSelection(value: never | always | selection): Self = StObject.set(x, "seedSearchStringFromSelection", value.asInstanceOf[js.Any])
  }
}
