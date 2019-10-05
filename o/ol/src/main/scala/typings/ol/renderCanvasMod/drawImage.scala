package typings.ol.renderCanvasMod

import typings.ol.transformMod.Transform
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas", "drawImage")
@js.native
object drawImage extends js.Object {
  def apply(
    context: CanvasRenderingContext2D,
    transform: Null,
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
  def apply(
    context: CanvasRenderingContext2D,
    transform: Null,
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
  def apply(
    context: CanvasRenderingContext2D,
    transform: Null,
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
  def apply(
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
  def apply(
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
  def apply(
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
}

