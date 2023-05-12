package typings.ol

import typings.ol.featureMod.FeatureLike
import typings.ol.projMod.TransformFunction
import typings.ol.renderCanvasBuilderGroupMod.default
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
  
  inline def renderFeature(
    replayGroup: default,
    feature: FeatureLike,
    style: typings.ol.styleStyleMod.default,
    squaredTolerance: Double,
    listener: js.Function1[/* arg0 */ typings.ol.eventsEventMod.default, Unit]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFeature")(replayGroup.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], style.asInstanceOf[js.Any], squaredTolerance.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def renderFeature(
    replayGroup: default,
    feature: FeatureLike,
    style: typings.ol.styleStyleMod.default,
    squaredTolerance: Double,
    listener: js.Function1[/* arg0 */ typings.ol.eventsEventMod.default, Unit],
    transform: Unit,
    declutterBuilderGroup: default
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFeature")(replayGroup.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], style.asInstanceOf[js.Any], squaredTolerance.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], declutterBuilderGroup.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def renderFeature(
    replayGroup: default,
    feature: FeatureLike,
    style: typings.ol.styleStyleMod.default,
    squaredTolerance: Double,
    listener: js.Function1[/* arg0 */ typings.ol.eventsEventMod.default, Unit],
    transform: TransformFunction
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFeature")(replayGroup.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], style.asInstanceOf[js.Any], squaredTolerance.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def renderFeature(
    replayGroup: default,
    feature: FeatureLike,
    style: typings.ol.styleStyleMod.default,
    squaredTolerance: Double,
    listener: js.Function1[/* arg0 */ typings.ol.eventsEventMod.default, Unit],
    transform: TransformFunction,
    declutterBuilderGroup: default
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFeature")(replayGroup.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], style.asInstanceOf[js.Any], squaredTolerance.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], declutterBuilderGroup.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type FeatureCallback[T] = js.Function3[
    /* arg0 */ FeatureLike, 
    /* arg1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any], 
    /* arg2 */ typings.ol.geomSimpleGeometryMod.default, 
    T
  ]
}
