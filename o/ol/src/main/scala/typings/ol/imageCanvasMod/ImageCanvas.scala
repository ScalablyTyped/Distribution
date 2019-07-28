package typings.ol.imageCanvasMod

import typings.std.Error
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageCanvas
  extends typings.ol.imageBaseMod.default {
  def getError(): Error = js.native
  @JSName("getImage")
  def getImage_HTMLCanvasElement(): HTMLCanvasElement = js.native
}

