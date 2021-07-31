package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorCommentsOptions>> */
trait EditorCommentsOptions extends StObject {
  
  val ignoreEmptyLines: Boolean
  
  val insertSpace: Boolean
}
object EditorCommentsOptions {
  
  @scala.inline
  def apply(ignoreEmptyLines: Boolean, insertSpace: Boolean): EditorCommentsOptions = {
    val __obj = js.Dynamic.literal(ignoreEmptyLines = ignoreEmptyLines.asInstanceOf[js.Any], insertSpace = insertSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorCommentsOptions]
  }
  
  @scala.inline
  implicit class EditorCommentsOptionsMutableBuilder[Self <: EditorCommentsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreEmptyLines(value: Boolean): Self = StObject.set(x, "ignoreEmptyLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpace(value: Boolean): Self = StObject.set(x, "insertSpace", value.asInstanceOf[js.Any])
  }
}
