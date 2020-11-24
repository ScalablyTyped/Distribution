package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorCommentsOptions>> */
@js.native
trait EditorCommentsOptions extends js.Object {
  
  val ignoreEmptyLines: Boolean = js.native
  
  val insertSpace: Boolean = js.native
}
object EditorCommentsOptions {
  
  @scala.inline
  def apply(ignoreEmptyLines: Boolean, insertSpace: Boolean): EditorCommentsOptions = {
    val __obj = js.Dynamic.literal(ignoreEmptyLines = ignoreEmptyLines.asInstanceOf[js.Any], insertSpace = insertSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorCommentsOptions]
  }
  
  @scala.inline
  implicit class EditorCommentsOptionsOps[Self <: EditorCommentsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIgnoreEmptyLines(value: Boolean): Self = this.set("ignoreEmptyLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpace(value: Boolean): Self = this.set("insertSpace", value.asInstanceOf[js.Any])
  }
}
