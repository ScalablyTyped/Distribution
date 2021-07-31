package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.always
import typings.monacoEditor.monacoEditorStrings.multiline
import typings.monacoEditor.monacoEditorStrings.never
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorFindOptions>> */
trait EditorFindOptions extends StObject {
  
  val addExtraSpaceOnTop: Boolean
  
  val autoFindInSelection: never | always | multiline
  
  val cursorMoveOnType: Boolean
  
  val loop: Boolean
  
  val seedSearchStringFromSelection: Boolean
}
object EditorFindOptions {
  
  @scala.inline
  def apply(
    addExtraSpaceOnTop: Boolean,
    autoFindInSelection: never | always | multiline,
    cursorMoveOnType: Boolean,
    loop: Boolean,
    seedSearchStringFromSelection: Boolean
  ): EditorFindOptions = {
    val __obj = js.Dynamic.literal(addExtraSpaceOnTop = addExtraSpaceOnTop.asInstanceOf[js.Any], autoFindInSelection = autoFindInSelection.asInstanceOf[js.Any], cursorMoveOnType = cursorMoveOnType.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], seedSearchStringFromSelection = seedSearchStringFromSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorFindOptions]
  }
  
  @scala.inline
  implicit class EditorFindOptionsMutableBuilder[Self <: EditorFindOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddExtraSpaceOnTop(value: Boolean): Self = StObject.set(x, "addExtraSpaceOnTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFindInSelection(value: never | always | multiline): Self = StObject.set(x, "autoFindInSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorMoveOnType(value: Boolean): Self = StObject.set(x, "cursorMoveOnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeedSearchStringFromSelection(value: Boolean): Self = StObject.set(x, "seedSearchStringFromSelection", value.asInstanceOf[js.Any])
  }
}
