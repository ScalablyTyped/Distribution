package typings
package offscreencanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://html.spec.whatwg.org/multipage/canvas.html#dom-canvas-transfercontroltooffscreen
@js.native
trait HTMLCanvasElement
  extends stdLib.HTMLElement {
  def transferControlToOffscreen(): OffscreenCanvas = js.native
}

