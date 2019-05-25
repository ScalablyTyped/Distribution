package typings
package olLib.renderCanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val labelCache: olLib.structsLRUCacheMod.default[stdLib.HTMLCanvasElement] = js.native
  def drawImage(
    context: stdLib.CanvasRenderingContext2D,
    transform: olLib.transformMod.Transform,
    opacity: scala.Double,
    image: stdLib.HTMLCanvasElement,
    originX: scala.Double,
    originY: scala.Double,
    w: scala.Double,
    h: scala.Double,
    x: scala.Double,
    y: scala.Double,
    scale: scala.Double
  ): scala.Unit = js.native
  def drawImage(
    context: stdLib.CanvasRenderingContext2D,
    transform: olLib.transformMod.Transform,
    opacity: scala.Double,
    image: stdLib.HTMLImageElement,
    originX: scala.Double,
    originY: scala.Double,
    w: scala.Double,
    h: scala.Double,
    x: scala.Double,
    y: scala.Double,
    scale: scala.Double
  ): scala.Unit = js.native
  def drawImage(
    context: stdLib.CanvasRenderingContext2D,
    transform: olLib.transformMod.Transform,
    opacity: scala.Double,
    image: stdLib.HTMLVideoElement,
    originX: scala.Double,
    originY: scala.Double,
    w: scala.Double,
    h: scala.Double,
    x: scala.Double,
    y: scala.Double,
    scale: scala.Double
  ): scala.Unit = js.native
  def measureTextWidth(font: java.lang.String, text: java.lang.String): scala.Double = js.native
  def rotateAtOffset(
    context: stdLib.CanvasRenderingContext2D,
    rotation: scala.Double,
    offsetX: scala.Double,
    offsetY: scala.Double
  ): scala.Unit = js.native
}

