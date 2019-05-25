package typings
package olLib.imageTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageTile
  extends olLib.tileMod.default {
  def getImage(): stdLib.HTMLCanvasElement | stdLib.HTMLImageElement | stdLib.HTMLVideoElement = js.native
}

