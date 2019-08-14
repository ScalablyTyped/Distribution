package typings.ol.styleIconImageMod

import typings.ol.imageStateMod.ImageState
import typings.ol.sizeMod.Size
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconImage
  extends typings.ol.eventsTargetMod.default {
  def getHitDetectionImage(pixelRatio: Double): HTMLImageElement | HTMLCanvasElement = js.native
  def getImage(pixelRatio: Double): HTMLImageElement | HTMLCanvasElement = js.native
  def getImageState(): ImageState = js.native
  def getSize(): Size = js.native
  def getSrc(): js.UndefOr[String] = js.native
  def load(): Unit = js.native
}

