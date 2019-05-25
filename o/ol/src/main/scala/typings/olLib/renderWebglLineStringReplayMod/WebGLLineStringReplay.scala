package typings
package olLib.renderWebglLineStringReplayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLLineStringReplay
  extends olLib.renderWebglReplayMod.default {
  def drawPolygonCoordinates(
    flatCoordinates: js.Array[scala.Double],
    holeFlatCoordinates: js.Array[js.Array[scala.Double]],
    stride: scala.Double
  ): scala.Unit = js.native
  def getCurrentIndex(): scala.Double = js.native
  def setPolygonStyle(feature: olLib.featureMod.default): scala.Unit = js.native
  def setPolygonStyle(feature: olLib.featureMod.default, opt_index: scala.Double): scala.Unit = js.native
  def setPolygonStyle(feature: olLib.renderFeatureMod.default): scala.Unit = js.native
  def setPolygonStyle(feature: olLib.renderFeatureMod.default, opt_index: scala.Double): scala.Unit = js.native
}

