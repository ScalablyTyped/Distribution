package typings.ol.imageTileMod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageTile
  extends typings.ol.tileMod.default {
  def getImage(): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
}

