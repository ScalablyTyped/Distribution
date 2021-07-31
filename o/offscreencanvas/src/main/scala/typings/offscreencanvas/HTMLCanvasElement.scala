package typings.offscreencanvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://html.spec.whatwg.org/multipage/canvas.html#dom-canvas-transfercontroltooffscreen
trait HTMLCanvasElement extends StObject {
  
  def transferControlToOffscreen(): OffscreenCanvas
}
object HTMLCanvasElement {
  
  @scala.inline
  def apply(transferControlToOffscreen: () => OffscreenCanvas): HTMLCanvasElement = {
    val __obj = js.Dynamic.literal(transferControlToOffscreen = js.Any.fromFunction0(transferControlToOffscreen))
    __obj.asInstanceOf[HTMLCanvasElement]
  }
  
  @scala.inline
  implicit class HTMLCanvasElementMutableBuilder[Self <: HTMLCanvasElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransferControlToOffscreen(value: () => OffscreenCanvas): Self = StObject.set(x, "transferControlToOffscreen", js.Any.fromFunction0(value))
  }
}
