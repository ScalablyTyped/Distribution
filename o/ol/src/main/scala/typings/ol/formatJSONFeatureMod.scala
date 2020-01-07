package typings.ol

import typings.ol.formatFeatureMod.ReadOptions
import typings.ol.formatFeatureMod.WriteOptions
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/JSONFeature", JSImport.Namespace)
@js.native
object formatJSONFeatureMod extends js.Object {
  @js.native
  trait JSONFeature
    extends typings.ol.formatFeatureMod.default {
    def readFeature(source: ArrayBuffer): typings.ol.featureMod.default[typings.ol.geomGeometryMod.default] = js.native
    def readFeature(source: ArrayBuffer, opt_options: ReadOptions): typings.ol.featureMod.default[typings.ol.geomGeometryMod.default] = js.native
    /* protected */ def readFeatureFromObject(`object`: js.Any): typings.ol.featureMod.default[typings.ol.geomGeometryMod.default] = js.native
    /* protected */ def readFeatureFromObject(`object`: js.Any, opt_options: ReadOptions): typings.ol.featureMod.default[typings.ol.geomGeometryMod.default] = js.native
    /* protected */ def readFeaturesFromObject(`object`: js.Any): js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = js.native
    /* protected */ def readFeaturesFromObject(`object`: js.Any, opt_options: ReadOptions): js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = js.native
    def readGeometry(source: ArrayBuffer): typings.ol.geomGeometryMod.default = js.native
    def readGeometry(source: ArrayBuffer, opt_options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromObject(`object`: js.Any): typings.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromObject(`object`: js.Any, opt_options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
    def readProjection(source: ArrayBuffer): typings.ol.projProjectionMod.default = js.native
    /* protected */ def readProjectionFromObject(`object`: js.Any): typings.ol.projProjectionMod.default = js.native
    def writeFeatureObject(feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]): js.Any = js.native
    def writeFeatureObject(
      feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default],
      opt_options: WriteOptions
    ): js.Any = js.native
    def writeFeaturesObject(features: js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]): js.Any = js.native
    def writeFeaturesObject(
      features: js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]],
      opt_options: WriteOptions
    ): js.Any = js.native
    def writeGeometryObject(geometry: typings.ol.geomGeometryMod.default): js.Any = js.native
    def writeGeometryObject(geometry: typings.ol.geomGeometryMod.default, opt_options: WriteOptions): js.Any = js.native
  }
  
  @js.native
  abstract class default () extends JSONFeature
  
}

