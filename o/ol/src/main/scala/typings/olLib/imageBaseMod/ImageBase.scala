package typings
package olLib.imageBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageBase
  extends olLib.eventsTargetMod.default {
  var extent: olLib.extentMod.Extent = js.native
  var resolution: scala.Double = js.native
  var state: olLib.imageStateMod.ImageState = js.native
  /* protected */ def changed(): scala.Unit = js.native
  def getExtent(): olLib.extentMod.Extent = js.native
  def getImage(): stdLib.HTMLCanvasElement | stdLib.HTMLImageElement | stdLib.HTMLVideoElement = js.native
  def getPixelRatio(): scala.Double = js.native
  def getResolution(): scala.Double = js.native
  def getState(): olLib.imageStateMod.ImageState = js.native
  def load(): scala.Unit = js.native
}

