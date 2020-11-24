package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.global.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container extends js.Object {
  
  var container: JQuery[HTMLElement] = js.native
  
  var folderTools: js.UndefOr[Boolean] = js.native
  
  var onconfirm: js.UndefOr[js.Function1[/* item */ js.Object, Unit]] = js.native
  
  var onselect: js.UndefOr[js.Function1[/* item */ js.Object, Unit]] = js.native
}
object Container {
  
  @scala.inline
  def apply(container: JQuery[HTMLElement]): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: JQuery[HTMLElement]): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderTools(value: Boolean): Self = this.set("folderTools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolderTools: Self = this.set("folderTools", js.undefined)
    
    @scala.inline
    def setOnconfirm(value: /* item */ js.Object => Unit): Self = this.set("onconfirm", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnconfirm: Self = this.set("onconfirm", js.undefined)
    
    @scala.inline
    def setOnselect(value: /* item */ js.Object => Unit): Self = this.set("onselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnselect: Self = this.set("onselect", js.undefined)
  }
}
