package typings.ol.renderCanvasMod

import typings.ol.structsLRUCacheMod.default
import typings.ol.transformMod.Transform
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val labelCache: default[HTMLCanvasElement] = js.native
  def drawImage(
    context: CanvasRenderingContext2D,
    transform: js.UndefOr[scala.Nothing],
    opacity: Double,
    image: HTMLCanvasElement,
    originX: Double,
    originY: Double,
    w: Double,
    h: Double,
    x: Double,
    y: Double,
    scale: Double
  ): Unit = js.native
  def drawImage(
    context: CanvasRenderingContext2D,
    transform: js.UndefOr[scala.Nothing],
    opacity: Double,
    image: HTMLImageElement,
    originX: Double,
    originY: Double,
    w: Double,
    h: Double,
    x: Double,
    y: Double,
    scale: Double
  ): Unit = js.native
  def drawImage(
    context: CanvasRenderingContext2D,
    transform: js.UndefOr[scala.Nothing],
    opacity: Double,
    image: HTMLVideoElement,
    originX: Double,
    originY: Double,
    w: Double,
    h: Double,
    x: Double,
    y: Double,
    scale: Double
  ): Unit = js.native
  def drawImage(
    context: CanvasRenderingContext2D,
    transform: Transform,
    opacity: Double,
    image: HTMLCanvasElement,
    originX: Double,
    originY: Double,
    w: Double,
    h: Double,
    x: Double,
    y: Double,
    scale: Double
  ): Unit = js.native
  def drawImage(
    context: CanvasRenderingContext2D,
    transform: Transform,
    opacity: Double,
    image: HTMLImageElement,
    originX: Double,
    originY: Double,
    w: Double,
    h: Double,
    x: Double,
    y: Double,
    scale: Double
  ): Unit = js.native
  def drawImage(
    context: CanvasRenderingContext2D,
    transform: Transform,
    opacity: Double,
    image: HTMLVideoElement,
    originX: Double,
    originY: Double,
    w: Double,
    h: Double,
    x: Double,
    y: Double,
    scale: Double
  ): Unit = js.native
  def measureTextWidth(font: String, text: String): Double = js.native
  def rotateAtOffset(context: CanvasRenderingContext2D, rotation: Double, offsetX: Double, offsetY: Double): Unit = js.native
}

