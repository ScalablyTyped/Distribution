package typings.nodeRedEditorClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Editor extends js.Object {
  
  var editor: typings.ace.AceAjax.Editor | GetText = js.native
  
  var elementPrefix: js.UndefOr[String] = js.native
  
  var ext: js.UndefOr[String] = js.native
  
  var fields: js.Array[String] = js.native
  
  var mode: js.UndefOr[String] = js.native
  
  var `type`: String = js.native
  
  var url: String = js.native
}
object Editor {
  
  @scala.inline
  def apply(
    editor: typings.ace.AceAjax.Editor | GetText,
    fields: js.Array[String],
    `type`: String,
    url: String
  ): Editor = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Editor]
  }
  
  @scala.inline
  implicit class EditorOps[Self <: Editor] (val x: Self) extends AnyVal {
    
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
    def setEditor(value: typings.ace.AceAjax.Editor | GetText): Self = this.set("editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementPrefix(value: String): Self = this.set("elementPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementPrefix: Self = this.set("elementPrefix", js.undefined)
    
    @scala.inline
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
