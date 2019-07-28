package typings.ol.imageMod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageWrapper
  extends typings.ol.imageBaseMod.default {
  def setImage(image: HTMLCanvasElement): Unit = js.native
  def setImage(image: HTMLImageElement): Unit = js.native
  def setImage(image: HTMLVideoElement): Unit = js.native
}

