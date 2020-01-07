package typings.ol

import typings.ol.formatFeatureMod.ReadOptions
import typings.ol.formatFeatureMod.WriteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/TextFeature", JSImport.Namespace)
@js.native
object formatTextFeatureMod extends js.Object {
  @js.native
  trait TextFeature
    extends typings.ol.formatFeatureMod.default {
    /* protected */ def readFeatureFromText(text: String): typings.ol.featureMod.default[typings.ol.geomGeometryMod.default] = js.native
    /* protected */ def readFeatureFromText(text: String, opt_options: ReadOptions): typings.ol.featureMod.default[typings.ol.geomGeometryMod.default] = js.native
    /* protected */ def readFeaturesFromText(text: String): js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = js.native
    /* protected */ def readFeaturesFromText(text: String, opt_options: ReadOptions): js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = js.native
    /* protected */ def readGeometryFromText(text: String): typings.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromText(text: String, opt_options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
    /* protected */ def readProjectionFromText(text: String): typings.ol.projProjectionMod.default = js.native
    /* protected */ def writeFeatureText(feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]): String = js.native
    /* protected */ def writeFeatureText(
      feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default],
      opt_options: WriteOptions
    ): String = js.native
    /* protected */ def writeFeaturesText(features: js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]): String = js.native
    /* protected */ def writeFeaturesText(
      features: js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]],
      opt_options: WriteOptions
    ): String = js.native
    /* protected */ def writeGeometryText(geometry: typings.ol.geomGeometryMod.default): String = js.native
    /* protected */ def writeGeometryText(geometry: typings.ol.geomGeometryMod.default, opt_options: WriteOptions): String = js.native
  }
  
  @js.native
  abstract class default () extends TextFeature
  
}

