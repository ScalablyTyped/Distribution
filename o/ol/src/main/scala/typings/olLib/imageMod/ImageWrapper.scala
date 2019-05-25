package typings
package olLib.imageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageWrapper
  extends olLib.imageBaseMod.default {
  def setImage(image: stdLib.HTMLCanvasElement): scala.Unit = js.native
  def setImage(image: stdLib.HTMLImageElement): scala.Unit = js.native
  def setImage(image: stdLib.HTMLVideoElement): scala.Unit = js.native
}

