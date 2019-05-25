package typings
package olLib.sourceImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageSource
  extends olLib.sourceSourceMod.default {
  /* protected */ def findNearestResolution(resolution: scala.Double): scala.Double = js.native
  def getImage(
    extent: olLib.extentMod.Extent,
    resolution: scala.Double,
    pixelRatio: scala.Double,
    projection: olLib.projProjectionMod.default
  ): olLib.imageBaseMod.default = js.native
  /* protected */ def getImageInternal(
    extent: olLib.extentMod.Extent,
    resolution: scala.Double,
    pixelRatio: scala.Double,
    projection: olLib.projProjectionMod.default
  ): olLib.imageBaseMod.default = js.native
  /* protected */ def handleImageChange(event: olLib.eventsEventMod.default): scala.Unit = js.native
}

