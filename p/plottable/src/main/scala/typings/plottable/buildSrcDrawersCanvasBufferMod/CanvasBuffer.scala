package typings.plottable.buildSrcDrawersCanvasBufferMod

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers/canvasBuffer", "CanvasBuffer")
@js.native
class CanvasBuffer protected () extends js.Object {
  def this(screenWidth: Double, screenHeight: Double) = this()
  def this(screenWidth: Double, screenHeight: Double, devicePixelRatio: Double) = this()
  var canvas: HTMLCanvasElement = js.native
  var ctx: CanvasRenderingContext2D = js.native
  var devicePixelRatio: Double = js.native
  var pixelHeight: Double = js.native
  var pixelWidth: Double = js.native
  var screenHeight: Double = js.native
  var screenWidth: Double = js.native
  def blit(ctx: CanvasRenderingContext2D): Unit = js.native
  def blit(ctx: CanvasRenderingContext2D, x: Double): Unit = js.native
  def blit(ctx: CanvasRenderingContext2D, x: Double, y: Double): Unit = js.native
  def blitCenter(ctx: CanvasRenderingContext2D): Unit = js.native
  def blitCenter(ctx: CanvasRenderingContext2D, x: Double): Unit = js.native
  def blitCenter(ctx: CanvasRenderingContext2D, x: Double, y: Double): Unit = js.native
  /**
    * Temporarily resets the current context transformation and fills the
    * entire canvas with the provided color. If no color is provided, the
    * canvas is cleared instead.
    */
  def clear(): this.type = js.native
  def clear(color: String): this.type = js.native
  def getImageData(): ImageData = js.native
  /**
    * Changes the size of the underlying canvas in screen space, respecting the
    * current devicePixelRatio.
    *
    * @param center - optionally enable a translate transformation moving the
    *                 origin to the center of the canvas.
    */
  def resize(screenWidth: Double, screenHeight: Double): this.type = js.native
  def resize(screenWidth: Double, screenHeight: Double, center: Boolean): this.type = js.native
}

/* static members */
@JSImport("plottable/build/src/drawers/canvasBuffer", "CanvasBuffer")
@js.native
object CanvasBuffer extends js.Object {
  /**
    * Resizes the canvas' internal pixel buffer to match the devicePixelRatio
    */
  def sizePixels(ctx: CanvasRenderingContext2D, screenWidth: Double, screenHeight: Double, devicePixelRatio: Double): Unit = js.native
}

