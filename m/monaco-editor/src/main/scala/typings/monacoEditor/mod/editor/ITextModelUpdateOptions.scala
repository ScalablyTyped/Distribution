package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextModelUpdateOptions extends js.Object {
  
  var indentSize: js.UndefOr[Double] = js.native
  
  var insertSpaces: js.UndefOr[Boolean] = js.native
  
  var tabSize: js.UndefOr[Double] = js.native
  
  var trimAutoWhitespace: js.UndefOr[Boolean] = js.native
}
object ITextModelUpdateOptions {
  
  @scala.inline
  def apply(): ITextModelUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextModelUpdateOptions]
  }
  
  @scala.inline
  implicit class ITextModelUpdateOptionsOps[Self <: ITextModelUpdateOptions] (val x: Self) extends AnyVal {
    
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
    def setIndentSize(value: Double): Self = this.set("indentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentSize: Self = this.set("indentSize", js.undefined)
    
    @scala.inline
    def setInsertSpaces(value: Boolean): Self = this.set("insertSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaces: Self = this.set("insertSpaces", js.undefined)
    
    @scala.inline
    def setTabSize(value: Double): Self = this.set("tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabSize: Self = this.set("tabSize", js.undefined)
    
    @scala.inline
    def setTrimAutoWhitespace(value: Boolean): Self = this.set("trimAutoWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrimAutoWhitespace: Self = this.set("trimAutoWhitespace", js.undefined)
  }
}
