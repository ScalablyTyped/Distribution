package typings.ol

import typings.ol.formatFeatureMod.ReadOptions
import typings.ol.formatFeatureMod.WriteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatJsonfeatureMod {
  
  /* note: abstract class */ @JSImport("ol/format/JSONFeature", JSImport.Default)
  @js.native
  open class default () extends JSONFeature
  
  @js.native
  trait JSONFeature
    extends typings.ol.formatFeatureMod.default {
    
    /**
      * Read a feature.  Only works for a single feature. Use readFeatures to
      * read a feature collection.
      */
    def readFeature(source: js.typedarray.ArrayBuffer): typings.ol.featureMod.default[typings.ol.geomGeometryMod.default] = js.native
    def readFeature(source: js.typedarray.ArrayBuffer, opt_options: ReadOptions): typings.ol.featureMod.default[typings.ol.geomGeometryMod.default] = js.native
    
    /* protected */ def readFeatureFromObject(`object`: Any): typings.ol.featureMod.default[typings.ol.geomGeometryMod.default] = js.native
    /* protected */ def readFeatureFromObject(`object`: Any, opt_options: ReadOptions): typings.ol.featureMod.default[typings.ol.geomGeometryMod.default] = js.native
    
    /* protected */ def readFeaturesFromObject(`object`: Any): js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = js.native
    /* protected */ def readFeaturesFromObject(`object`: Any, opt_options: ReadOptions): js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = js.native
    
    /**
      * Read a geometry.
      */
    def readGeometry(source: js.typedarray.ArrayBuffer): typings.ol.geomGeometryMod.default = js.native
    def readGeometry(source: js.typedarray.ArrayBuffer, opt_options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
    
    /* protected */ def readGeometryFromObject(`object`: Any): typings.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromObject(`object`: Any, opt_options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
    
    /**
      * Read the projection.
      */
    def readProjection(source: js.typedarray.ArrayBuffer): typings.ol.projProjectionMod.default = js.native
    
    /* protected */ def readProjectionFromObject(`object`: Any): typings.ol.projProjectionMod.default = js.native
    
    def writeFeatureObject(feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]): Any = js.native
    def writeFeatureObject(
      feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default],
      opt_options: WriteOptions
    ): Any = js.native
    
    def writeFeaturesObject(features: js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]): Any = js.native
    def writeFeaturesObject(
      features: js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]],
      opt_options: WriteOptions
    ): Any = js.native
    
    def writeGeometryObject(geometry: typings.ol.geomGeometryMod.default): Any = js.native
    def writeGeometryObject(geometry: typings.ol.geomGeometryMod.default, opt_options: WriteOptions): Any = js.native
  }
}
