package typings
package olLib.styleIconImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconImage
  extends olLib.eventsTargetMod.default {
  def getHitDetectionImage(pixelRatio: scala.Double): stdLib.HTMLImageElement | stdLib.HTMLCanvasElement = js.native
  def getImage(pixelRatio: scala.Double): stdLib.HTMLImageElement | stdLib.HTMLCanvasElement = js.native
  def getImageState(): olLib.imageStateMod.ImageState = js.native
  def getSize(): olLib.sizeMod.Size = js.native
  def getSrc(): java.lang.String = js.native
  def load(): scala.Unit = js.native
}

