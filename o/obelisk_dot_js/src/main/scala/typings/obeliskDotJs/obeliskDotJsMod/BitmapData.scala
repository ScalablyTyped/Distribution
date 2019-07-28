package typings.obeliskDotJs.obeliskDotJsMod

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obelisk.js", "BitmapData")
@js.native
class BitmapData protected () extends js.Object {
  def this(w: Double, h: Double) = this()
  def this(w: Double, h: Double, useDefaultCanvas: Boolean) = this()
  var canvas: HTMLCanvasElement = js.native
  var context: CanvasRenderingContext2D = js.native
  var imageData: ImageData = js.native
  def checkPixelAvailable(x: Double, y: Double): Boolean = js.native
  def floodFill(posX: Double, posY: Double, color: Double): Unit = js.native
  def setPixel(posX: Double, posY: Double, color: Double): Unit = js.native
  def setPixelByIndex(index: Double, color: Double): Unit = js.native
}

