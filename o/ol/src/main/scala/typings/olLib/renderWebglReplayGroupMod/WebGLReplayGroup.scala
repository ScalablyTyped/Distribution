package typings
package olLib.renderWebglReplayGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLReplayGroup
  extends olLib.renderReplayGroupMod.default {
  def finish(context: olLib.webglContextMod.default): scala.Unit = js.native
  def forEachFeatureAtCoordinate[T](
    coordinate: olLib.coordinateMod.Coordinate,
    context: olLib.webglContextMod.default,
    center: olLib.coordinateMod.Coordinate,
    resolution: scala.Double,
    rotation: scala.Double,
    size: olLib.sizeMod.Size,
    pixelRatio: scala.Double,
    opacity: scala.Double,
    skippedFeaturesHash: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    callback: js.Function1[/* param0 */ olLib.featureMod.default | olLib.renderFeatureMod.default, T]
  ): T = js.native
  def getDeleteResourcesFunction(context: olLib.webglContextMod.default): js.Function0[scala.Unit] = js.native
  def hasFeatureAtCoordinate(
    coordinate: olLib.coordinateMod.Coordinate,
    context: olLib.webglContextMod.default,
    center: olLib.coordinateMod.Coordinate,
    resolution: scala.Double,
    rotation: scala.Double,
    size: olLib.sizeMod.Size,
    pixelRatio: scala.Double,
    opacity: scala.Double,
    skippedFeaturesHash: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  ): scala.Boolean = js.native
  def replay(
    context: olLib.webglContextMod.default,
    center: olLib.coordinateMod.Coordinate,
    resolution: scala.Double,
    rotation: scala.Double,
    size: olLib.sizeMod.Size,
    pixelRatio: scala.Double,
    opacity: scala.Double,
    skippedFeaturesHash: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  ): scala.Unit = js.native
}

