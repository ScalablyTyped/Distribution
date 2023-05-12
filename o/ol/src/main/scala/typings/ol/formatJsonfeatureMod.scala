package typings.ol

import typings.ol.formatFeatureMod.ReadOptions
import typings.ol.formatFeatureMod.WriteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatJsonfeatureMod {
  
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for JSON feature formats.
    *
    * @abstract
    */
  @JSImport("ol/format/JSONFeature", JSImport.Default)
  @js.native
  open class default () extends JSONFeature
  
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for JSON feature formats.
    *
    * @abstract
    */
  @js.native
  trait JSONFeature
    extends typings.ol.formatFeatureMod.default {
    
    /**
      * Read a feature.  Only works for a single feature. Use `readFeatures` to
      * read a feature collection.
      *
      * @param {ArrayBuffer|Document|Element|Object|string} source Source.
      * @param {import("./Feature.js").ReadOptions} [options] Read options.
      * @return {import("../Feature.js").default} Feature.
      * @api
      */
    def readFeature(source: js.typedarray.ArrayBuffer): typings.ol.renderFeatureMod.default = js.native
    def readFeature(source: js.typedarray.ArrayBuffer, options: ReadOptions): typings.ol.renderFeatureMod.default = js.native
    
    /**
      * @abstract
      * @param {Object} object Object.
      * @param {import("./Feature.js").ReadOptions} [options] Read options.
      * @protected
      * @return {import("../Feature.js").default} Feature.
      */
    /* protected */ def readFeatureFromObject(`object`: Any): typings.ol.renderFeatureMod.default = js.native
    /* protected */ def readFeatureFromObject(`object`: Any, options: ReadOptions): typings.ol.renderFeatureMod.default = js.native
    
    /**
      * @abstract
      * @param {Object} object Object.
      * @param {import("./Feature.js").ReadOptions} [options] Read options.
      * @protected
      * @return {Array<import("../Feature.js").default>} Features.
      */
    /* protected */ def readFeaturesFromObject(`object`: Any): js.Array[typings.ol.renderFeatureMod.default] = js.native
    /* protected */ def readFeaturesFromObject(`object`: Any, options: ReadOptions): js.Array[typings.ol.renderFeatureMod.default] = js.native
    
    /**
      * @abstract
      * @param {Object} object Object.
      * @param {import("./Feature.js").ReadOptions} [options] Read options.
      * @protected
      * @return {import("../geom/Geometry.js").default} Geometry.
      */
    /* protected */ def readGeometryFromObject(`object`: Any): typings.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromObject(`object`: Any, options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
    
    /**
      * Read the projection.
      *
      * @param {ArrayBuffer|Document|Element|Object|string} source Source.
      * @return {import("../proj/Projection.js").default} Projection.
      * @api
      */
    def readProjection(source: js.typedarray.ArrayBuffer): typings.ol.projProjectionMod.default = js.native
    
    /**
      * @abstract
      * @param {Object} object Object.
      * @protected
      * @return {import("../proj/Projection.js").default} Projection.
      */
    /* protected */ def readProjectionFromObject(`object`: Any): typings.ol.projProjectionMod.default = js.native
    
    /**
      * @abstract
      * @param {import("../Feature.js").default} feature Feature.
      * @param {import("./Feature.js").WriteOptions} [options] Write options.
      * @return {Object} Object.
      */
    def writeFeatureObject(feature: typings.ol.renderFeatureMod.default): Any = js.native
    def writeFeatureObject(feature: typings.ol.renderFeatureMod.default, options: WriteOptions): Any = js.native
    
    /**
      * @abstract
      * @param {Array<import("../Feature.js").default>} features Features.
      * @param {import("./Feature.js").WriteOptions} [options] Write options.
      * @return {Object} Object.
      */
    def writeFeaturesObject(features: js.Array[typings.ol.renderFeatureMod.default]): Any = js.native
    def writeFeaturesObject(features: js.Array[typings.ol.renderFeatureMod.default], options: WriteOptions): Any = js.native
    
    /**
      * @abstract
      * @param {import("../geom/Geometry.js").default} geometry Geometry.
      * @param {import("./Feature.js").WriteOptions} [options] Write options.
      * @return {Object} Object.
      */
    def writeGeometryObject(geometry: typings.ol.geomGeometryMod.default): Any = js.native
    def writeGeometryObject(geometry: typings.ol.geomGeometryMod.default, options: WriteOptions): Any = js.native
  }
}
