package typings.offscreencanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://html.spec.whatwg.org/multipage/canvas.html#dom-canvas-transfercontroltooffscreen
@js.native
trait HTMLCanvasElement extends js.Object {
  
  def transferControlToOffscreen(): OffscreenCanvas = js.native
}
object HTMLCanvasElement {
  
  @scala.inline
  def apply(transferControlToOffscreen: () => OffscreenCanvas): HTMLCanvasElement = {
    val __obj = js.Dynamic.literal(transferControlToOffscreen = js.Any.fromFunction0(transferControlToOffscreen))
    __obj.asInstanceOf[HTMLCanvasElement]
  }
  
  @scala.inline
  implicit class HTMLCanvasElementOps[Self <: HTMLCanvasElement] (val x: Self) extends AnyVal {
    
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
    def setTransferControlToOffscreen(value: () => OffscreenCanvas): Self = this.set("transferControlToOffscreen", js.Any.fromFunction0(value))
  }
}
