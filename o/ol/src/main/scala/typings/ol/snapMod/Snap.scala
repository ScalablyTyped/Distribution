package typings.ol.snapMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.pixelMod.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snap
  extends typings.ol.pointerMod.default {
  def addFeature(feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]): Unit = js.native
  def addFeature(feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default], opt_listen: Boolean): Unit = js.native
  def removeFeature(feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]): Unit = js.native
  def removeFeature(feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default], opt_unlisten: Boolean): Unit = js.native
  def snapTo(pixel: Pixel, pixelCoordinate: Coordinate, map: typings.ol.pluggableMapMod.default): Result = js.native
}

