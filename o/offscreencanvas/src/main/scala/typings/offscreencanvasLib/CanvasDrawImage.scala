package typings
package offscreencanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://html.spec.whatwg.org/multipage/canvas.html#canvasdrawimage
@js.native
trait CanvasDrawImage extends js.Object {
  def drawImage(image: OffscreenCanvas, dx: scala.Double, dy: scala.Double): scala.Unit = js.native
  def drawImage(image: OffscreenCanvas, dx: scala.Double, dy: scala.Double, dw: scala.Double, dh: scala.Double): scala.Unit = js.native
  def drawImage(
    image: OffscreenCanvas,
    sx: scala.Double,
    sy: scala.Double,
    sw: scala.Double,
    sh: scala.Double,
    dx: scala.Double,
    dy: scala.Double,
    dw: scala.Double,
    dh: scala.Double
  ): scala.Unit = js.native
  def drawImage(image: stdLib.CanvasImageSource, dx: scala.Double, dy: scala.Double): scala.Unit = js.native
  def drawImage(
    image: stdLib.CanvasImageSource,
    dx: scala.Double,
    dy: scala.Double,
    dw: scala.Double,
    dh: scala.Double
  ): scala.Unit = js.native
  def drawImage(
    image: stdLib.CanvasImageSource,
    sx: scala.Double,
    sy: scala.Double,
    sw: scala.Double,
    sh: scala.Double,
    dx: scala.Double,
    dy: scala.Double,
    dw: scala.Double,
    dh: scala.Double
  ): scala.Unit = js.native
}

