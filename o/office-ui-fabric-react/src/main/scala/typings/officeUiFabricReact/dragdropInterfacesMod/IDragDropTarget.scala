package typings.officeUiFabricReact.dragdropInterfacesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDragDropTarget extends js.Object {
  
  var key: String = js.native
  
  var options: IDragDropOptions = js.native
  
  var root: HTMLElement = js.native
}
object IDragDropTarget {
  
  @scala.inline
  def apply(key: String, options: IDragDropOptions, root: HTMLElement): IDragDropTarget = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDragDropTarget]
  }
  
  @scala.inline
  implicit class IDragDropTargetOps[Self <: IDragDropTarget] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: IDragDropOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: HTMLElement): Self = this.set("root", value.asInstanceOf[js.Any])
  }
}
