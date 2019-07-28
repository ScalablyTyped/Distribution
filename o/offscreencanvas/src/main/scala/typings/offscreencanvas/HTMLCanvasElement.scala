package typings.offscreencanvas

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://html.spec.whatwg.org/multipage/canvas.html#dom-canvas-transfercontroltooffscreen
@js.native
trait HTMLCanvasElement extends HTMLElement {
  def transferControlToOffscreen(): OffscreenCanvas = js.native
}

