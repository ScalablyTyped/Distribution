package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.featureMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureloaderMod {
  
  @JSImport("ol/featureloader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadFeaturesXhr(
    url: String,
    format: default,
    success: js.Function0[Unit],
    failure: js.ThisFunction0[
      /* this */ typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default], 
      Unit
    ]
  ): FeatureLoader = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFeaturesXhr")(url.asInstanceOf[js.Any], format.asInstanceOf[js.Any], success.asInstanceOf[js.Any], failure.asInstanceOf[js.Any])).asInstanceOf[FeatureLoader]
  inline def loadFeaturesXhr(
    url: FeatureUrlFunction,
    format: default,
    success: js.Function0[Unit],
    failure: js.ThisFunction0[
      /* this */ typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default], 
      Unit
    ]
  ): FeatureLoader = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFeaturesXhr")(url.asInstanceOf[js.Any], format.asInstanceOf[js.Any], success.asInstanceOf[js.Any], failure.asInstanceOf[js.Any])).asInstanceOf[FeatureLoader]
  
  inline def setWithCredentials(xhrWithCredentials: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWithCredentials")(xhrWithCredentials.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def xhr(url: String, format: default): FeatureLoader = (^.asInstanceOf[js.Dynamic].applyDynamic("xhr")(url.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[FeatureLoader]
  inline def xhr(url: FeatureUrlFunction, format: default): FeatureLoader = (^.asInstanceOf[js.Dynamic].applyDynamic("xhr")(url.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[FeatureLoader]
  
  type FeatureLoader = js.ThisFunction3[
    /* this */ typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default] | typings.ol.olVectorTileMod.default, 
    /* p0 */ Extent, 
    /* p1 */ Double, 
    /* p2 */ typings.ol.projectionMod.default, 
    Unit
  ]
  
  type FeatureUrlFunction = js.Function3[/* p0 */ Extent, /* p1 */ Double, /* p2 */ typings.ol.projectionMod.default, String]
}
