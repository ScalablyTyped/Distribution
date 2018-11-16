package typings
package plottableLib.buildSrcDrawersCanvasBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers/canvasBuffer", "CanvasBuffer")
@js.native
class CanvasBuffer protected () extends js.Object {
  def this(screenWidth: scala.Double, screenHeight: scala.Double) = this()
  def this(screenWidth: scala.Double, screenHeight: scala.Double, devicePixelRatio: scala.Double) = this()
  var canvas: stdLib.HTMLCanvasElement = js.native
  var ctx: d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D = js.native
  var devicePixelRatio: scala.Double = js.native
  var pixelHeight: scala.Double = js.native
  var pixelWidth: scala.Double = js.native
  var screenHeight: scala.Double = js.native
  var screenWidth: scala.Double = js.native
  def blit(ctx: d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D): scala.Unit = js.native
  def blit(ctx: d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D, x: scala.Double): scala.Unit = js.native
  def blit(
    ctx: d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D,
    x: scala.Double,
    y: scala.Double
  ): scala.Unit = js.native
  def blitCenter(ctx: d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D): scala.Unit = js.native
  def blitCenter(ctx: d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D, x: scala.Double): scala.Unit = js.native
  def blitCenter(
    ctx: d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D,
    x: scala.Double,
    y: scala.Double
  ): scala.Unit = js.native
  /**
       * Temporarily resets the current context transformation and fills the
       * entire canvas with the provided color. If no color is provided, the
       * canvas is cleared instead.
       */
  def clear(): this.type = js.native
  /**
       * Temporarily resets the current context transformation and fills the
       * entire canvas with the provided color. If no color is provided, the
       * canvas is cleared instead.
       */
  def clear(color: java.lang.String): this.type = js.native
  def getImageData(): stdLib.ImageData = js.native
  /**
       * Changes the size of the underlying canvas in screen space, respecting the
       * current devicePixelRatio.
       *
       * @param center - optionally enable a translate transformation moving the
       *                 origin to the center of the canvas.
       */
  def resize(screenWidth: scala.Double, screenHeight: scala.Double): this.type = js.native
  /**
       * Changes the size of the underlying canvas in screen space, respecting the
       * current devicePixelRatio.
       *
       * @param center - optionally enable a translate transformation moving the
       *                 origin to the center of the canvas.
       */
  def resize(screenWidth: scala.Double, screenHeight: scala.Double, center: scala.Boolean): this.type = js.native
}

@JSImport("plottable/build/src/drawers/canvasBuffer", "CanvasBuffer")
@js.native
object CanvasBuffer extends js.Object {
  /**
       * Resizes the canvas' internal pixel buffer to match the devicePixelRatio
       */
  def sizePixels(
    ctx: d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D,
    screenWidth: scala.Double,
    screenHeight: scala.Double,
    devicePixelRatio: scala.Double
  ): scala.Unit = js.native
}

