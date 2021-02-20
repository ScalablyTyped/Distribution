package typings.ol

import typings.ol.builderGroupMod.default
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.projMod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererVectorMod {
  
  @JSImport("ol/renderer/vector", "defaultOrder")
  @js.native
  def defaultOrder(feature1: FeatureLike, feature2: FeatureLike): Double = js.native
  
  @JSImport("ol/renderer/vector", "getSquaredTolerance")
  @js.native
  def getSquaredTolerance(resolution: Double, pixelRatio: Double): Double = js.native
  
  @JSImport("ol/renderer/vector", "getTolerance")
  @js.native
  def getTolerance(resolution: Double, pixelRatio: Double): Double = js.native
  
  @JSImport("ol/renderer/vector", "renderFeature")
  @js.native
  def renderFeature[T](
    replayGroup: default,
    feature: FeatureLike,
    style: typings.ol.styleStyleMod.default,
    squaredTolerance: Double,
    listener: js.Function1[/* p0 */ typings.ol.eventMod.default, Unit]
  ): Boolean = js.native
  @JSImport("ol/renderer/vector", "renderFeature")
  @js.native
  def renderFeature[T](
    replayGroup: default,
    feature: FeatureLike,
    style: typings.ol.styleStyleMod.default,
    squaredTolerance: Double,
    listener: js.Function1[/* p0 */ typings.ol.eventMod.default, Unit],
    opt_transform: TransformFunction
  ): Boolean = js.native
}
