package typings.ol

import typings.ol.builderGroupMod.default
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.projMod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererVectorMod {
  
  @JSImport("ol/renderer/vector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultOrder(feature1: FeatureLike, feature2: FeatureLike): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultOrder")(feature1.asInstanceOf[js.Any], feature2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getSquaredTolerance(resolution: Double, pixelRatio: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSquaredTolerance")(resolution.asInstanceOf[js.Any], pixelRatio.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getTolerance(resolution: Double, pixelRatio: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTolerance")(resolution.asInstanceOf[js.Any], pixelRatio.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def renderFeature[T](
    replayGroup: default,
    feature: FeatureLike,
    style: typings.ol.styleStyleMod.default,
    squaredTolerance: Double,
    listener: js.Function1[/* p0 */ typings.ol.eventMod.default, Unit]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFeature")(replayGroup.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], style.asInstanceOf[js.Any], squaredTolerance.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def renderFeature[T](
    replayGroup: default,
    feature: FeatureLike,
    style: typings.ol.styleStyleMod.default,
    squaredTolerance: Double,
    listener: js.Function1[/* p0 */ typings.ol.eventMod.default, Unit],
    opt_transform: TransformFunction
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFeature")(replayGroup.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], style.asInstanceOf[js.Any], squaredTolerance.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], opt_transform.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
