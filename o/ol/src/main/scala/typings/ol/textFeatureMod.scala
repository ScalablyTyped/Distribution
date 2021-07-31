package typings.ol

import typings.ol.featureMod.ReadOptions
import typings.ol.featureMod.WriteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFeatureMod {
  
  @JSImport("ol/format/TextFeature", JSImport.Default)
  @js.native
  abstract class default () extends TextFeature
  
  @js.native
  trait TextFeature
    extends typings.ol.featureMod.default {
    
    /* protected */ def readFeatureFromText(text: String): typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
    /* protected */ def readFeatureFromText(text: String, opt_options: ReadOptions): typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
    
    /* protected */ def readFeaturesFromText(text: String): js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = js.native
    /* protected */ def readFeaturesFromText(text: String, opt_options: ReadOptions): js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = js.native
    
    /* protected */ def readGeometryFromText(text: String): typings.ol.geometryMod.default = js.native
    /* protected */ def readGeometryFromText(text: String, opt_options: ReadOptions): typings.ol.geometryMod.default = js.native
    
    /* protected */ def readProjectionFromText(text: String): typings.ol.projectionMod.default = js.native
    
    /* protected */ def writeFeatureText(feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]): String = js.native
    /* protected */ def writeFeatureText(
      feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default],
      opt_options: WriteOptions
    ): String = js.native
    
    /* protected */ def writeFeaturesText(features: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]): String = js.native
    /* protected */ def writeFeaturesText(
      features: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]],
      opt_options: WriteOptions
    ): String = js.native
    
    /* protected */ def writeGeometryText(geometry: typings.ol.geometryMod.default): String = js.native
    /* protected */ def writeGeometryText(geometry: typings.ol.geometryMod.default, opt_options: WriteOptions): String = js.native
  }
}
