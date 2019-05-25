package typings
package olLib.interactionSnapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snap
  extends olLib.interactionPointerMod.default {
  def addFeature(feature: olLib.featureMod.default): scala.Unit = js.native
  def addFeature(feature: olLib.featureMod.default, opt_listen: scala.Boolean): scala.Unit = js.native
  def removeFeature(feature: olLib.featureMod.default): scala.Unit = js.native
  def removeFeature(feature: olLib.featureMod.default, opt_unlisten: scala.Boolean): scala.Unit = js.native
  def snapTo(
    pixel: olLib.pixelMod.Pixel,
    pixelCoordinate: olLib.coordinateMod.Coordinate,
    map: olLib.pluggableMapMod.default
  ): Result = js.native
}

