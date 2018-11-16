package typings
package novncDashCoreLib.libDisplayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Display extends js.Object {
  def absX(x: scala.Double): scala.Double = js.native
  def absY(y: scala.Double): scala.Double = js.native
  def autoscale(containerWidth: scala.Double, containerHeight: scala.Double, downscaleOnly: scala.Boolean): scala.Unit = js.native
  def blitImage(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    arr: js.Array[scala.Double],
    offset: scala.Double
  ): scala.Unit = js.native
  def blitImage(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    arr: js.Array[scala.Double],
    offset: scala.Double,
    from_queue: scala.Boolean
  ): scala.Unit = js.native
  def blitRgbImage(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    arr: js.Array[scala.Double],
    offset: scala.Double
  ): scala.Unit = js.native
  def blitRgbImage(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    arr: js.Array[scala.Double],
    offset: scala.Double,
    from_queue: scala.Boolean
  ): scala.Unit = js.native
  def blitRgbxImage(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    arr: js.Array[scala.Double],
    offset: scala.Double
  ): scala.Unit = js.native
  def blitRgbxImage(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    arr: js.Array[scala.Double],
    offset: scala.Double,
    from_queue: scala.Boolean
  ): scala.Unit = js.native
  def changeCursor(
    pixels: js.Array[scala.Double],
    mask: js.Array[scala.Double],
    hotx: scala.Double,
    hoty: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def clippingDisplay(): scala.Boolean = js.native
  def copyImage(
    old_x: scala.Double,
    old_y: scala.Double,
    new_x: scala.Double,
    new_y: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): scala.Unit = js.native
  def copyImage(
    old_x: scala.Double,
    old_y: scala.Double,
    new_x: scala.Double,
    new_y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    from_queue: scala.Boolean
  ): scala.Unit = js.native
  def defaultCursor(): scala.Unit = js.native
  def disableLocalCursor(): scala.Unit = js.native
  def drawImage(img: stdLib.HTMLImageElement, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def fillRect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double, color: NvColor): scala.Unit = js.native
  def fillRect(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    color: NvColor,
    from_queue: scala.Boolean
  ): scala.Unit = js.native
  def finishTile(): scala.Unit = js.native
  def flip(): scala.Unit = js.native
  def flip(from_queue: scala.Boolean): scala.Unit = js.native
  def flush(): scala.Unit = js.native
  def get_context(): stdLib.CanvasRenderingContext2D = js.native
  def get_cursor_uri(): js.Any = js.native
  def get_height(): scala.Double = js.native
  def get_logo(): NvLogo = js.native
  def get_onFlush(): js.Function0[scala.Unit] = js.native
  def get_prefer_js(): java.lang.String | scala.Boolean = js.native
  def get_render_mode(): java.lang.String = js.native
  def get_scale(): scala.Double = js.native
  def get_target(): stdLib.HTMLCanvasElement = js.native
  def get_viewport(): scala.Boolean = js.native
  def get_width(): scala.Double = js.native
  def imageRect(x: scala.Double, y: scala.Double, mime: java.lang.String, arr: js.Array[scala.Double]): scala.Unit = js.native
  def pending(): scala.Boolean = js.native
  def resize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def set_cursor_uri(cursorUri: js.Any): scala.Unit = js.native
  def set_logo(logo: NvLogo): scala.Unit = js.native
  def set_onFlush(handler: js.Function0[scala.Unit]): scala.Unit = js.native
  def set_prefer_js(preferJs: java.lang.String): scala.Unit = js.native
  def set_scale(scale: scala.Double): scala.Unit = js.native
  def set_target(target: stdLib.HTMLCanvasElement): scala.Unit = js.native
  def set_viewport(viewport: scala.Boolean): scala.Unit = js.native
  def startTile(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double, color: NvColor): scala.Unit = js.native
  def subTile(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double, color: NvColor): scala.Unit = js.native
  def viewportChangePos(deltaX: scala.Double, deltaY: scala.Double): scala.Unit = js.native
  def viewportChangeSize(): scala.Unit = js.native
  def viewportChangeSize(width: scala.Double): scala.Unit = js.native
  def viewportChangeSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
}

