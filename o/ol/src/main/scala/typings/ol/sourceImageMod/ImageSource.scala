package typings.ol.sourceImageMod

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageSource
  extends typings.ol.sourceSourceMod.default {
  /* protected */ def findNearestResolution(resolution: Double): Double = js.native
  def getImage(
    extent: Extent,
    resolution: Double,
    pixelRatio: Double,
    projection: typings.ol.projProjectionMod.default
  ): typings.ol.imageBaseMod.default = js.native
  /* protected */ def getImageInternal(
    extent: Extent,
    resolution: Double,
    pixelRatio: Double,
    projection: typings.ol.projProjectionMod.default
  ): typings.ol.imageBaseMod.default = js.native
  /* protected */ def handleImageChange(event: typings.ol.eventsEventMod.default): Unit = js.native
}

