package typings.ol

import typings.ol.formatFeatureMod.ReadOptions
import typings.ol.formatFeatureMod.WriteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatTextFeatureMod {
  
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for text feature formats.
    *
    * @abstract
    */
  @JSImport("ol/format/TextFeature", JSImport.Default)
  @js.native
  open class default () extends TextFeature
  
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for text feature formats.
    *
    * @abstract
    */
  @js.native
  trait TextFeature
    extends typings.ol.formatFeatureMod.default {
    
    /**
      * @abstract
      * @param {string} text Text.
      * @param {import("./Feature.js").ReadOptions} [options] Read options.
      * @protected
      * @return {import("../Feature.js").default} Feature.
      */
    /* protected */ def readFeatureFromText(text: String): typings.ol.renderFeatureMod.default = js.native
    /* protected */ def readFeatureFromText(text: String, options: ReadOptions): typings.ol.renderFeatureMod.default = js.native
    
    /**
      * @abstract
      * @param {string} text Text.
      * @param {import("./Feature.js").ReadOptions} [options] Read options.
      * @protected
      * @return {Array<import("../Feature.js").default>} Features.
      */
    /* protected */ def readFeaturesFromText(text: String): js.Array[typings.ol.renderFeatureMod.default] = js.native
    /* protected */ def readFeaturesFromText(text: String, options: ReadOptions): js.Array[typings.ol.renderFeatureMod.default] = js.native
    
    /**
      * @abstract
      * @param {string} text Text.
      * @param {import("./Feature.js").ReadOptions} [options] Read options.
      * @protected
      * @return {import("../geom/Geometry.js").default} Geometry.
      */
    /* protected */ def readGeometryFromText(text: String): typings.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromText(text: String, options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
    
    /**
      * @param {string} text Text.
      * @protected
      * @return {import("../proj/Projection.js").default|undefined} Projection.
      */
    /* protected */ def readProjectionFromText(text: String): js.UndefOr[typings.ol.projProjectionMod.default] = js.native
    
    /**
      * @abstract
      * @param {import("../Feature.js").default} feature Features.
      * @param {import("./Feature.js").WriteOptions} [options] Write options.
      * @protected
      * @return {string} Text.
      */
    /* protected */ def writeFeatureText(feature: typings.ol.renderFeatureMod.default): String = js.native
    /* protected */ def writeFeatureText(feature: typings.ol.renderFeatureMod.default, options: WriteOptions): String = js.native
    
    /**
      * @abstract
      * @param {Array<import("../Feature.js").default>} features Features.
      * @param {import("./Feature.js").WriteOptions} [options] Write options.
      * @protected
      * @return {string} Text.
      */
    /* protected */ def writeFeaturesText(features: js.Array[typings.ol.renderFeatureMod.default]): String = js.native
    /* protected */ def writeFeaturesText(features: js.Array[typings.ol.renderFeatureMod.default], options: WriteOptions): String = js.native
    
    /**
      * @abstract
      * @param {import("../geom/Geometry.js").default} geometry Geometry.
      * @param {import("./Feature.js").WriteOptions} [options] Write options.
      * @protected
      * @return {string} Text.
      */
    /* protected */ def writeGeometryText(geometry: typings.ol.geomGeometryMod.default): String = js.native
    /* protected */ def writeGeometryText(geometry: typings.ol.geomGeometryMod.default, options: WriteOptions): String = js.native
  }
}
