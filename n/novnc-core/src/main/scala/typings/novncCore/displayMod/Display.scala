package typings.novncCore.displayMod

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Display extends js.Object {
  def absX(x: Double): Double = js.native
  def absY(y: Double): Double = js.native
  def autoscale(containerWidth: Double, containerHeight: Double, downscaleOnly: Boolean): Unit = js.native
  def blitImage(x: Double, y: Double, width: Double, height: Double, arr: js.Array[Double], offset: Double): Unit = js.native
  def blitImage(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    arr: js.Array[Double],
    offset: Double,
    from_queue: Boolean
  ): Unit = js.native
  def blitRgbImage(x: Double, y: Double, width: Double, height: Double, arr: js.Array[Double], offset: Double): Unit = js.native
  def blitRgbImage(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    arr: js.Array[Double],
    offset: Double,
    from_queue: Boolean
  ): Unit = js.native
  def blitRgbxImage(x: Double, y: Double, width: Double, height: Double, arr: js.Array[Double], offset: Double): Unit = js.native
  def blitRgbxImage(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    arr: js.Array[Double],
    offset: Double,
    from_queue: Boolean
  ): Unit = js.native
  def changeCursor(
    pixels: js.Array[Double],
    mask: js.Array[Double],
    hotx: Double,
    hoty: Double,
    width: Double,
    height: Double
  ): Unit = js.native
  def clear(): Unit = js.native
  def clippingDisplay(): Boolean = js.native
  def copyImage(old_x: Double, old_y: Double, new_x: Double, new_y: Double, width: Double, height: Double): Unit = js.native
  def copyImage(
    old_x: Double,
    old_y: Double,
    new_x: Double,
    new_y: Double,
    width: Double,
    height: Double,
    from_queue: Boolean
  ): Unit = js.native
  def defaultCursor(): Unit = js.native
  def disableLocalCursor(): Unit = js.native
  def drawImage(img: HTMLImageElement, x: Double, y: Double): Unit = js.native
  def fillRect(x: Double, y: Double, width: Double, height: Double, color: NvColor): Unit = js.native
  def fillRect(x: Double, y: Double, width: Double, height: Double, color: NvColor, from_queue: Boolean): Unit = js.native
  def finishTile(): Unit = js.native
  def flip(): Unit = js.native
  def flip(from_queue: Boolean): Unit = js.native
  def flush(): Unit = js.native
  def get_context(): CanvasRenderingContext2D = js.native
  def get_cursor_uri(): js.Any = js.native
  def get_height(): Double = js.native
  def get_logo(): NvLogo = js.native
  def get_onFlush(): js.Function0[Unit] = js.native
  def get_prefer_js(): String | Boolean = js.native
  def get_render_mode(): String = js.native
  def get_scale(): Double = js.native
  def get_target(): HTMLCanvasElement = js.native
  def get_viewport(): Boolean = js.native
  def get_width(): Double = js.native
  def imageRect(x: Double, y: Double, mime: String, arr: js.Array[Double]): Unit = js.native
  def pending(): Boolean = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def set_cursor_uri(cursorUri: js.Any): Unit = js.native
  def set_logo(logo: NvLogo): Unit = js.native
  def set_onFlush(handler: js.Function0[Unit]): Unit = js.native
  def set_prefer_js(preferJs: String): Unit = js.native
  def set_scale(scale: Double): Unit = js.native
  def set_target(target: HTMLCanvasElement): Unit = js.native
  def set_viewport(viewport: Boolean): Unit = js.native
  def startTile(x: Double, y: Double, width: Double, height: Double, color: NvColor): Unit = js.native
  def subTile(x: Double, y: Double, width: Double, height: Double, color: NvColor): Unit = js.native
  def viewportChangePos(deltaX: Double, deltaY: Double): Unit = js.native
  def viewportChangeSize(): Unit = js.native
  def viewportChangeSize(width: Double): Unit = js.native
  def viewportChangeSize(width: Double, height: Double): Unit = js.native
}

