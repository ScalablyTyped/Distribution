package typings.playable.rootContainerTypesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRootContainer extends js.Object {
  
  def appendComponentElement(element: HTMLElement): Unit = js.native
  
  def attachToElement(element: HTMLElement): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def getElement(): HTMLElement = js.native
  
  def getHeight(): Double = js.native
  
  def getWidth(): Double = js.native
  
  def hide(): Unit = js.native
  
  def setFillAllSpace(flag: Boolean): Unit = js.native
  
  def setHeight(height: Double): Unit = js.native
  
  def setRtl(rtl: Boolean): Unit = js.native
  
  def setWidth(width: Double): Unit = js.native
  
  def show(): Unit = js.native
}
object IRootContainer {
  
  @scala.inline
  def apply(
    appendComponentElement: HTMLElement => Unit,
    attachToElement: HTMLElement => Unit,
    destroy: () => Unit,
    getElement: () => HTMLElement,
    getHeight: () => Double,
    getWidth: () => Double,
    hide: () => Unit,
    setFillAllSpace: Boolean => Unit,
    setHeight: Double => Unit,
    setRtl: Boolean => Unit,
    setWidth: Double => Unit,
    show: () => Unit
  ): IRootContainer = {
    val __obj = js.Dynamic.literal(appendComponentElement = js.Any.fromFunction1(appendComponentElement), attachToElement = js.Any.fromFunction1(attachToElement), destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), getHeight = js.Any.fromFunction0(getHeight), getWidth = js.Any.fromFunction0(getWidth), hide = js.Any.fromFunction0(hide), setFillAllSpace = js.Any.fromFunction1(setFillAllSpace), setHeight = js.Any.fromFunction1(setHeight), setRtl = js.Any.fromFunction1(setRtl), setWidth = js.Any.fromFunction1(setWidth), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[IRootContainer]
  }
  
  @scala.inline
  implicit class IRootContainerOps[Self <: IRootContainer] (val x: Self) extends AnyVal {
    
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
    def setAppendComponentElement(value: HTMLElement => Unit): Self = this.set("appendComponentElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttachToElement(value: HTMLElement => Unit): Self = this.set("attachToElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElement(value: () => HTMLElement): Self = this.set("getElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeight(value: () => Double): Self = this.set("getHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWidth(value: () => Double): Self = this.set("getWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFillAllSpace(value: Boolean => Unit): Self = this.set("setFillAllSpace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeight(value: Double => Unit): Self = this.set("setHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRtl(value: Boolean => Unit): Self = this.set("setRtl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWidth(value: Double => Unit): Self = this.set("setWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
}
