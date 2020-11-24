package typings.playable.mainUiBlockTypesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMainUIBlock extends js.Object {
  
  def destroy(): Unit = js.native
  
  def disableShowingContent(): Unit = js.native
  
  def enableShowingContent(): Unit = js.native
  
  def getElement(): HTMLElement = js.native
  
  def hide(): Unit = js.native
  
  def setShouldAlwaysShow(flag: Boolean): Unit = js.native
  
  def show(): Unit = js.native
}
object IMainUIBlock {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    disableShowingContent: () => Unit,
    enableShowingContent: () => Unit,
    getElement: () => HTMLElement,
    hide: () => Unit,
    setShouldAlwaysShow: Boolean => Unit,
    show: () => Unit
  ): IMainUIBlock = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disableShowingContent = js.Any.fromFunction0(disableShowingContent), enableShowingContent = js.Any.fromFunction0(enableShowingContent), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), setShouldAlwaysShow = js.Any.fromFunction1(setShouldAlwaysShow), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[IMainUIBlock]
  }
  
  @scala.inline
  implicit class IMainUIBlockOps[Self <: IMainUIBlock] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisableShowingContent(value: () => Unit): Self = this.set("disableShowingContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableShowingContent(value: () => Unit): Self = this.set("enableShowingContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElement(value: () => HTMLElement): Self = this.set("getElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetShouldAlwaysShow(value: Boolean => Unit): Self = this.set("setShouldAlwaysShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
}
