package typings.nodeRedEditorClient.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableOnEdit extends js.Object {
  
  var enableOnEdit: js.UndefOr[Boolean] = js.native
  
  var iconClass: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var name: String = js.native
  
  var toolbar: js.UndefOr[HTMLElement] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object EnableOnEdit {
  
  @scala.inline
  def apply(id: String, name: String): EnableOnEdit = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableOnEdit]
  }
  
  @scala.inline
  implicit class EnableOnEditOps[Self <: EnableOnEdit] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableOnEdit(value: Boolean): Self = this.set("enableOnEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableOnEdit: Self = this.set("enableOnEdit", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    
    @scala.inline
    def setToolbar(value: HTMLElement): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
