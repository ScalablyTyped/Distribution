package typings.ol

import typings.ol.featureMod.FeatureClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatMvtMod {
  
  /**
    * @typedef {Object} Options
    * @property {import("../Feature.js").FeatureClass} [featureClass] Class for features returned by
    * {@link module:ol/format/MVT~MVT#readFeatures}. Set to {@link module:ol/Feature~Feature} to get full editing and geometry
    * support at the cost of decreased rendering performance. The default is
    * {@link module:ol/render/Feature~RenderFeature}, which is optimized for rendering and hit detection.
    * @property {string} [geometryName='geometry'] Geometry name to use when creating features.
    * @property {string} [layerName='layer'] Name of the feature attribute that holds the layer name.
    * @property {Array<string>} [layers] Layers to read features from. If not provided, features will be read from all
    * @property {string} [idProperty] Optional property that will be assigned as the feature id and removed from the properties.
    * layers.
    */
  /**
    * @classdesc
    * Feature format for reading data in the Mapbox MVT format.
    *
    * @param {Options} [options] Options.
    * @api
    */
  @JSImport("ol/format/MVT", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends MVT {
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("../Feature.js").FeatureClass} [featureClass] Class for features returned by
    * {@link module:ol/format/MVT~MVT#readFeatures}. Set to {@link module:ol/Feature~Feature} to get full editing and geometry
    * support at the cost of decreased rendering performance. The default is
    * {@link module:ol/render/Feature~RenderFeature}, which is optimized for rendering and hit detection.
    * @property {string} [geometryName='geometry'] Geometry name to use when creating features.
    * @property {string} [layerName='layer'] Name of the feature attribute that holds the layer name.
    * @property {Array<string>} [layers] Layers to read features from. If not provided, features will be read from all
    * @property {string} [idProperty] Optional property that will be assigned as the feature id and removed from the properties.
    * layers.
    */
  /**
    * @classdesc
    * Feature format for reading data in the Mapbox MVT format.
    *
    * @param {Options} [options] Options.
    * @api
    */
  @js.native
  trait MVT
    extends typings.ol.formatFeatureMod.default {
    
    /**
      * @private
      * @param {PBF} pbf PBF
      * @param {Object} rawFeature Raw Mapbox feature.
      * @param {import("./Feature.js").ReadOptions} options Read options.
      * @return {import("../Feature.js").FeatureLike|null} Feature.
      */
    /* private */ var createFeature_ : Any = js.native
    
    /**
      * @type {Projection}
      */
    @JSName("dataProjection")
    var dataProjection_MVT: typings.ol.projProjectionMod.default = js.native
    
    /**
      * @private
      * @type {import("../Feature.js").FeatureClass}
      */
    /* private */ var featureClass_ : Any = js.native
    
    /**
      * @private
      * @type {string|undefined}
      */
    /* private */ var geometryName_ : Any = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var idProperty_ : Any = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var layerName_ : Any = js.native
    
    /**
      * @private
      * @type {Array<string>|null}
      */
    /* private */ var layers_ : Any = js.native
    
    /**
      * Read the raw geometry from the pbf offset stored in a raw feature's geometry
      * property.
      * @param {PBF} pbf PBF.
      * @param {Object} feature Raw feature.
      * @param {Array<number>} flatCoordinates Array to store flat coordinates in.
      * @param {Array<number>} ends Array to store ends in.
      * @private
      */
    /* private */ var readRawGeometry_ : Any = js.native
    
    /**
      * Sets the layers that features will be read from.
      * @param {Array<string>} layers Layers.
      * @api
      */
    def setLayers(layers: js.Array[String]): Unit = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Class for features returned by
      * {@link module :ol/format/MVT~MVT#readFeatures}. Set to {@link module :ol/Feature~Feature} to get full editing and geometry
      * support at the cost of decreased rendering performance. The default is
      * {@link module :ol/render/Feature~RenderFeature}, which is optimized for rendering and hit detection.
      */
    var featureClass: js.UndefOr[FeatureClass] = js.undefined
    
    /**
      * Geometry name to use when creating features.
      */
    var geometryName: js.UndefOr[String] = js.undefined
    
    /**
      * Optional property that will be assigned as the feature id and removed from the properties.
      * layers.
      */
    var idProperty: js.UndefOr[String] = js.undefined
    
    /**
      * Name of the feature attribute that holds the layer name.
      */
    var layerName: js.UndefOr[String] = js.undefined
    
    /**
      * Layers to read features from. If not provided, features will be read from all
      */
    var layers: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setFeatureClass(value: FeatureClass): Self = StObject.set(x, "featureClass", value.asInstanceOf[js.Any])
      
      inline def setFeatureClassUndefined: Self = StObject.set(x, "featureClass", js.undefined)
      
      inline def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
      
      inline def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
      
      inline def setIdProperty(value: String): Self = StObject.set(x, "idProperty", value.asInstanceOf[js.Any])
      
      inline def setIdPropertyUndefined: Self = StObject.set(x, "idProperty", js.undefined)
      
      inline def setLayerName(value: String): Self = StObject.set(x, "layerName", value.asInstanceOf[js.Any])
      
      inline def setLayerNameUndefined: Self = StObject.set(x, "layerName", js.undefined)
      
      inline def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value*))
    }
  }
}
