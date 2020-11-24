package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/tree-item/
@js.native
trait TreeItem extends js.Object {
  
  var collapsibleState: TreeItemCollapsibleState = js.native
  
   // https://dev.panic.com/panic/nova-issues/-/issues/909
  var color: js.UndefOr[Color] = js.native
  
  var command: js.UndefOr[js.Any] = js.native
  
  var contextValue: js.UndefOr[String] = js.native
  
  var descriptiveText: js.UndefOr[String] = js.native
  
  var identifier: js.UndefOr[String] = js.native
  
  var image: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var tooltip: js.UndefOr[String] = js.native
}
object TreeItem {
  
  @scala.inline
  def apply(collapsibleState: TreeItemCollapsibleState, name: String): TreeItem = {
    val __obj = js.Dynamic.literal(collapsibleState = collapsibleState.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeItem]
  }
  
  @scala.inline
  implicit class TreeItemOps[Self <: TreeItem] (val x: Self) extends AnyVal {
    
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
    def setCollapsibleState(value: TreeItemCollapsibleState): Self = this.set("collapsibleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCommand(value: js.Any): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    
    @scala.inline
    def setContextValue(value: String): Self = this.set("contextValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextValue: Self = this.set("contextValue", js.undefined)
    
    @scala.inline
    def setDescriptiveText(value: String): Self = this.set("descriptiveText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptiveText: Self = this.set("descriptiveText", js.undefined)
    
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
}
