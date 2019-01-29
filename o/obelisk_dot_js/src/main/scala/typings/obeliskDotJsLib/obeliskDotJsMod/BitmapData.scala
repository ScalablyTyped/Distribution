package typings
package obeliskDotJsLib.obeliskDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obelisk.js", "BitmapData")
@js.native
class BitmapData protected () extends js.Object {
  def this(w: scala.Double, h: scala.Double) = this()
  def this(w: scala.Double, h: scala.Double, useDefaultCanvas: scala.Boolean) = this()
  var canvas: stdLib.HTMLCanvasElement = js.native
  var context: stdLib.CanvasRenderingContext2D = js.native
  var imageData: stdLib.ImageData = js.native
  def checkPixelAvailable(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def floodFill(posX: scala.Double, posY: scala.Double, color: scala.Double): scala.Unit = js.native
  def setPixel(posX: scala.Double, posY: scala.Double, color: scala.Double): scala.Unit = js.native
  def setPixelByIndex(index: scala.Double, color: scala.Double): scala.Unit = js.native
}

