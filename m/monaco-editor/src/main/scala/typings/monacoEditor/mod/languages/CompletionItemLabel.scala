package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletionItemLabel extends js.Object {
  
  /**
    * The function or variable. Rendered leftmost.
    */
  var name: String = js.native
  
  /**
    * The parameters without the return type. Render after `name`.
    */
  var parameters: js.UndefOr[String] = js.native
  
  /**
    * The fully qualified name, like package name or file path. Rendered after `signature`.
    */
  var qualifier: js.UndefOr[String] = js.native
  
  /**
    * The return-type of a function or type of a property/variable. Rendered rightmost.
    */
  var `type`: js.UndefOr[String] = js.native
}
object CompletionItemLabel {
  
  @scala.inline
  def apply(name: String): CompletionItemLabel = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionItemLabel]
  }
  
  @scala.inline
  implicit class CompletionItemLabelOps[Self <: CompletionItemLabel] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: String): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setQualifier(value: String): Self = this.set("qualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualifier: Self = this.set("qualifier", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
