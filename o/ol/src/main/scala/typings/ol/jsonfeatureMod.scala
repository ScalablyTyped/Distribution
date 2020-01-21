package typings.ol

import typings.ol.featureMod.ReadOptions
import typings.ol.featureMod.WriteOptions
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/JSONFeature", JSImport.Namespace)
@js.native
object jsonfeatureMod extends js.Object {
  @js.native
  trait JSONFeature
    extends typings.ol.featureMod.default {
    def readFeature(source: ArrayBuffer): typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
    def readFeature(source: ArrayBuffer, opt_options: ReadOptions): typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
    /* protected */ def readFeatureFromObject(`object`: js.Any): typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
    /* protected */ def readFeatureFromObject(`object`: js.Any, opt_options: ReadOptions): typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
    /* protected */ def readFeaturesFromObject(`object`: js.Any): js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = js.native
    /* protected */ def readFeaturesFromObject(`object`: js.Any, opt_options: ReadOptions): js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = js.native
    def readGeometry(source: ArrayBuffer): typings.ol.geometryMod.default = js.native
    def readGeometry(source: ArrayBuffer, opt_options: ReadOptions): typings.ol.geometryMod.default = js.native
    /* protected */ def readGeometryFromObject(`object`: js.Any): typings.ol.geometryMod.default = js.native
    /* protected */ def readGeometryFromObject(`object`: js.Any, opt_options: ReadOptions): typings.ol.geometryMod.default = js.native
    def readProjection(source: ArrayBuffer): typings.ol.projectionMod.default = js.native
    /* protected */ def readProjectionFromObject(`object`: js.Any): typings.ol.projectionMod.default = js.native
    def writeFeatureObject(feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]): js.Any = js.native
    def writeFeatureObject(
      feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default],
      opt_options: WriteOptions
    ): js.Any = js.native
    def writeFeaturesObject(features: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]): js.Any = js.native
    def writeFeaturesObject(
      features: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]],
      opt_options: WriteOptions
    ): js.Any = js.native
    def writeGeometryObject(geometry: typings.ol.geometryMod.default): js.Any = js.native
    def writeGeometryObject(geometry: typings.ol.geometryMod.default, opt_options: WriteOptions): js.Any = js.native
  }
  
  @js.native
  abstract class default () extends JSONFeature
  
}

