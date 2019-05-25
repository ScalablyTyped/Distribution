package typings
package olLib.imageCanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageCanvas
  extends olLib.imageBaseMod.default {
  def getError(): stdLib.Error = js.native
  @JSName("getImage")
  def getImage_HTMLCanvasElement(): stdLib.HTMLCanvasElement = js.native
}

