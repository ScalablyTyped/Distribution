package typings.ol.renderWebglReplayGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.coordinateMod.Coordinate
import typings.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLReplayGroup
  extends typings.ol.renderReplayGroupMod.default {
  def finish(context: typings.ol.webglContextMod.default): Unit = js.native
  def forEachFeatureAtCoordinate[T](
    coordinate: Coordinate,
    context: typings.ol.webglContextMod.default,
    center: Coordinate,
    resolution: Double,
    rotation: Double,
    size: Size,
    pixelRatio: Double,
    opacity: Double,
    skippedFeaturesHash: StringDictionary[Boolean],
    callback: js.Function1[/* p0 */ typings.ol.featureMod.default | typings.ol.renderFeatureMod.default, T]
  ): T = js.native
  def getDeleteResourcesFunction(context: typings.ol.webglContextMod.default): js.Function0[Unit] = js.native
  def hasFeatureAtCoordinate(
    coordinate: Coordinate,
    context: typings.ol.webglContextMod.default,
    center: Coordinate,
    resolution: Double,
    rotation: Double,
    size: Size,
    pixelRatio: Double,
    opacity: Double,
    skippedFeaturesHash: StringDictionary[Boolean]
  ): Boolean = js.native
  def replay(
    context: typings.ol.webglContextMod.default,
    center: Coordinate,
    resolution: Double,
    rotation: Double,
    size: Size,
    pixelRatio: Double,
    opacity: Double,
    skippedFeaturesHash: StringDictionary[Boolean]
  ): Unit = js.native
}

