package typings.ol.interactionSnapMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.pixelMod.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snap
  extends typings.ol.interactionPointerMod.default {
  def addFeature(feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]): Unit = js.native
  def addFeature(feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default], opt_listen: Boolean): Unit = js.native
  def removeFeature(feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]): Unit = js.native
  def removeFeature(feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default], opt_unlisten: Boolean): Unit = js.native
  def snapTo(pixel: Pixel, pixelCoordinate: Coordinate, map: typings.ol.pluggableMapMod.default): Result = js.native
}

