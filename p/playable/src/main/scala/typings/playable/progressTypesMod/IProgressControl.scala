package typings.playable.progressTypesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProgressControl extends js.Object {
  
  def addTimeIndicator(time: Double): Unit = js.native
  
  def addTimeIndicators(times: js.Array[Double]): Unit = js.native
  
  def clearTimeIndicators(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def getElement(): HTMLElement = js.native
  
  def hide(): Unit = js.native
  
  def seekOnProgressDrag(): Unit = js.native
  
  def show(): Unit = js.native
  
  def showPreviewOnProgressDrag(): Unit = js.native
}
object IProgressControl {
  
  @scala.inline
  def apply(
    addTimeIndicator: Double => Unit,
    addTimeIndicators: js.Array[Double] => Unit,
    clearTimeIndicators: () => Unit,
    destroy: () => Unit,
    getElement: () => HTMLElement,
    hide: () => Unit,
    seekOnProgressDrag: () => Unit,
    show: () => Unit,
    showPreviewOnProgressDrag: () => Unit
  ): IProgressControl = {
    val __obj = js.Dynamic.literal(addTimeIndicator = js.Any.fromFunction1(addTimeIndicator), addTimeIndicators = js.Any.fromFunction1(addTimeIndicators), clearTimeIndicators = js.Any.fromFunction0(clearTimeIndicators), destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), seekOnProgressDrag = js.Any.fromFunction0(seekOnProgressDrag), show = js.Any.fromFunction0(show), showPreviewOnProgressDrag = js.Any.fromFunction0(showPreviewOnProgressDrag))
    __obj.asInstanceOf[IProgressControl]
  }
  
  @scala.inline
  implicit class IProgressControlOps[Self <: IProgressControl] (val x: Self) extends AnyVal {
    
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
    def setAddTimeIndicator(value: Double => Unit): Self = this.set("addTimeIndicator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddTimeIndicators(value: js.Array[Double] => Unit): Self = this.set("addTimeIndicators", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearTimeIndicators(value: () => Unit): Self = this.set("clearTimeIndicators", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElement(value: () => HTMLElement): Self = this.set("getElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSeekOnProgressDrag(value: () => Unit): Self = this.set("seekOnProgressDrag", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowPreviewOnProgressDrag(value: () => Unit): Self = this.set("showPreviewOnProgressDrag", js.Any.fromFunction0(value))
  }
}
