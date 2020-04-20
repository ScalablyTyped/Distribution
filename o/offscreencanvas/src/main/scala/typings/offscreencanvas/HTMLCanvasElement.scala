package typings.offscreencanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://html.spec.whatwg.org/multipage/canvas.html#dom-canvas-transfercontroltooffscreen
trait HTMLCanvasElement extends js.Object {
  def transferControlToOffscreen(): OffscreenCanvas
}

object HTMLCanvasElement {
  @scala.inline
  def apply(transferControlToOffscreen: () => OffscreenCanvas): HTMLCanvasElement = {
    val __obj = js.Dynamic.literal(transferControlToOffscreen = js.Any.fromFunction0(transferControlToOffscreen))
    __obj.asInstanceOf[HTMLCanvasElement]
  }
}

