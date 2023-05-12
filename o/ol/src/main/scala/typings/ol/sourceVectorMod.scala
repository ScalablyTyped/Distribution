package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.featureloaderMod.FeatureLoader
import typings.ol.featureloaderMod.FeatureUrlFunction
import typings.ol.objectEventTypeMod.Types
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.sourceVectorEventTypeMod.VectorSourceEventTypes
import typings.ol.viewMod.ViewStateAndExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceVectorMod {
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types, import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<import("./VectorEventType").VectorSourceEventTypes, VectorSourceEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     import("./VectorEventType").VectorSourceEventTypes, Return>} VectorSourceOnSignature
    */
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {Array<import("../Feature.js").default<Geometry>>|Collection<import("../Feature.js").default<Geometry>>} [features]
    * Features. If provided as {@link module:ol/Collection~Collection}, the features in the source
    * and the collection will stay in sync.
    * @property {import("../format/Feature.js").default} [format] The feature format used by the XHR
    * feature loader when `url` is set. Required if `url` is set, otherwise ignored.
    * @property {import("../featureloader.js").FeatureLoader} [loader]
    * The loader function used to load features, from a remote source for example.
    * If this is not set and `url` is set, the source will create and use an XHR
    * feature loader. The `'featuresloadend'` and `'featuresloaderror'` events
    * will only fire if the `success` and `failure` callbacks are used.
    *
    * Example:
    *
    * ```js
    * import Vector from 'ol/source/Vector.js';
    * import GeoJSON from 'ol/format/GeoJSON.js';
    * import {bbox} from 'ol/loadingstrategy.js';
    *
    * const vectorSource = new Vector({
    *   format: new GeoJSON(),
    *   loader: function(extent, resolution, projection, success, failure) {
    *      const proj = projection.getCode();
    *      const url = 'https://ahocevar.com/geoserver/wfs?service=WFS&' +
    *          'version=1.1.0&request=GetFeature&typename=osm:water_areas&' +
    *          'outputFormat=application/json&srsname=' + proj + '&' +
    *          'bbox=' + extent.join(',') + ',' + proj;
    *      const xhr = new XMLHttpRequest();
    *      xhr.open('GET', url);
    *      const onError = function() {
    *        vectorSource.removeLoadedExtent(extent);
    *        failure();
    *      }
    *      xhr.onerror = onError;
    *      xhr.onload = function() {
    *        if (xhr.status == 200) {
    *          const features = vectorSource.getFormat().readFeatures(xhr.responseText);
    *          vectorSource.addFeatures(features);
    *          success(features);
    *        } else {
    *          onError();
    *        }
    *      }
    *      xhr.send();
    *    },
    *    strategy: bbox,
    *  });
    * ```
    * @property {boolean} [overlaps=true] This source may have overlapping geometries.
    * Setting this to `false` (e.g. for sources with polygons that represent administrative
    * boundaries or TopoJSON sources) allows the renderer to optimise fill and
    * stroke operations.
    * @property {LoadingStrategy} [strategy] The loading strategy to use.
    * By default an {@link module:ol/loadingstrategy.all}
    * strategy is used, a one-off strategy which loads all features at once.
    * @property {string|import("../featureloader.js").FeatureUrlFunction} [url]
    * Setting this option instructs the source to load features using an XHR loader
    * (see {@link module:ol/featureloader.xhr}). Use a `string` and an
    * {@link module:ol/loadingstrategy.all} for a one-off download of all features from
    * the given URL. Use a {@link module:ol/featureloader~FeatureUrlFunction} to generate the url with
    * other loading strategies.
    * Requires `format` to be set as well.
    * When default XHR feature loader is provided, the features will
    * be transformed from the data projection to the view projection
    * during parsing. If your remote data source does not advertise its projection
    * properly, this transformation will be incorrect. For some formats, the
    * default projection (usually EPSG:4326) can be overridden by setting the
    * dataProjection constructor option on the format.
    * Note that if a source contains non-feature data, such as a GeoJSON geometry
    * or a KML NetworkLink, these will be ignored. Use a custom loader to load these.
    * @property {boolean} [useSpatialIndex=true]
    * By default, an RTree is used as spatial index. When features are removed and
    * added frequently, and the total number of features is low, setting this to
    * `false` may improve performance.
    *
    * Note that
    * {@link module:ol/source/Vector~VectorSource#getFeaturesInExtent},
    * {@link module:ol/source/Vector~VectorSource#getClosestFeatureToCoordinate} and
    * {@link module:ol/source/Vector~VectorSource#getExtent} cannot be used when `useSpatialIndex` is
    * set to `false`, and {@link module:ol/source/Vector~VectorSource#forEachFeatureInExtent} will loop
    * through all features.
    *
    * When set to `false`, the features will be maintained in an
    * {@link module:ol/Collection~Collection}, which can be retrieved through
    * {@link module:ol/source/Vector~VectorSource#getFeaturesCollection}.
    * @property {boolean} [wrapX=true] Wrap the world horizontally. For vector editing across the
    * -180° and 180° meridians to work properly, this should be set to `false`. The
    * resulting geometry coordinates will then exceed the world bounds.
    * @template {import("../geom/Geometry.js").default} [Geometry=import("../geom/Geometry.js").default]
    */
  /**
    * @classdesc
    * Provides a source of features for vector layers. Vector features provided
    * by this source are suitable for editing. See {@link module:ol/source/VectorTile~VectorTile} for
    * vector data that is optimized for rendering.
    *
    * @fires VectorSourceEvent
    * @api
    * @template {import("../geom/Geometry.js").default} [Geometry=import("../geom/Geometry.js").default]
    */
  @JSImport("ol/source/Vector", JSImport.Default)
  @js.native
  /**
    * @param {Options<Geometry>} [options] Vector source options.
    */
  open class default[Geometry /* <: typings.ol.geomGeometryMod.default */] () extends VectorSource[Geometry] {
    def this(options: Options[Geometry]) = this()
  }
  
  @JSImport("ol/source/Vector", "VectorSourceEvent")
  @js.native
  open class VectorSourceEvent[Geometry /* <: typings.ol.geomGeometryMod.default */] protected ()
    extends typings.ol.eventsEventMod.default {
    /**
      * @param {string} type Type.
      * @param {import("../Feature.js").default<Geometry>} [feature] Feature.
      * @param {Array<import("../Feature.js").default<Geometry>>} [features] Features.
      */
    def this(`type`: String) = this()
    def this(`type`: String, feature: typings.ol.renderFeatureMod.default) = this()
    def this(`type`: String, feature: Unit, features: js.Array[typings.ol.renderFeatureMod.default]) = this()
    def this(
      `type`: String,
      feature: typings.ol.renderFeatureMod.default,
      features: js.Array[typings.ol.renderFeatureMod.default]
    ) = this()
    
    /**
      * The added or removed feature for the `ADDFEATURE` and `REMOVEFEATURE` events, `undefined` otherwise.
      * @type {import("../Feature.js").default<Geometry>|undefined}
      * @api
      */
    var feature: js.UndefOr[typings.ol.renderFeatureMod.default] = js.native
    
    /**
      * The loaded features for the `FEATURESLOADED` event, `undefined` otherwise.
      * @type {Array<import("../Feature.js").default<Geometry>>|undefined}
      * @api
      */
    var features: js.UndefOr[js.Array[typings.ol.renderFeatureMod.default]] = js.native
  }
  
  type LoadingStrategy = js.Function3[
    /* arg0 */ Extent, 
    /* arg1 */ Double, 
    /* arg2 */ typings.ol.projProjectionMod.default, 
    js.Array[Extent]
  ]
  
  trait Options[Geometry /* <: typings.ol.geomGeometryMod.default */] extends StObject {
    
    /**
      * Attributions.
      */
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    /**
      * Features. If provided as {@link module :ol/Collection~Collection}, the features in the source
      * and the collection will stay in sync.
      */
    var features: js.UndefOr[
        js.Array[typings.ol.renderFeatureMod.default] | typings.ol.collectionMod.default[typings.ol.renderFeatureMod.default]
      ] = js.undefined
    
    /**
      * The feature format used by the XHR
      * feature loader when `url` is set. Required if `url` is set, otherwise ignored.
      */
    var format: js.UndefOr[typings.ol.renderFeatureMod.default] = js.undefined
    
    /**
      * The loader function used to load features, from a remote source for example.
      * If this is not set and `url` is set, the source will create and use an XHR
      * feature loader. The `'featuresloadend'` and `'featuresloaderror'` events
      * will only fire if the `success` and `failure` callbacks are used.
      *
      * Example:
      *
      * ```js
      * import Vector from 'ol/source/Vector.js';
      * import GeoJSON from 'ol/format/GeoJSON.js';
      * import {bbox} from 'ol/loadingstrategy.js';
      *
      * const vectorSource = new Vector({
      * format: new GeoJSON(),
      * loader: function(extent, resolution, projection, success, failure) {
      * const proj = projection.getCode();
      * const url = 'https://ahocevar.com/geoserver/wfs?service=WFS&' +
      * 'version=1.1.0&request=GetFeature&typename=osm:water_areas&' +
      * 'outputFormat=application/json&srsname=' + proj + '&' +
      * 'bbox=' + extent.join(',') + ',' + proj;
      * const xhr = new XMLHttpRequest();
      * xhr.open('GET', url);
      * const onError = function() {
      * vectorSource.removeLoadedExtent(extent);
      * failure();
      * }
      * xhr.onerror = onError;
      * xhr.onload = function() {
      * if (xhr.status == 200) {
      * const features = vectorSource.getFormat().readFeatures(xhr.responseText);
      * vectorSource.addFeatures(features);
      * success(features);
      * } else {
      * onError();
      * }
      * }
      * xhr.send();
      * },
      * strategy: bbox,
      * });
      * ```
      */
    var loader: js.UndefOr[FeatureLoader] = js.undefined
    
    /**
      * This source may have overlapping geometries.
      * Setting this to `false` (e.g. for sources with polygons that represent administrative
      * boundaries or TopoJSON sources) allows the renderer to optimise fill and
      * stroke operations.
      */
    var overlaps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The loading strategy to use.
      * By default an {@link module :ol/loadingstrategy.all}strategy is used, a one-off strategy which loads all features at once.
      */
    var strategy: js.UndefOr[LoadingStrategy] = js.undefined
    
    /**
      * Setting this option instructs the source to load features using an XHR loader
      * (see {@link module :ol/featureloader.xhr}). Use a `string` and an
      * {@link module :ol/loadingstrategy.all} for a one-off download of all features from
      * the given URL. Use a {@link module :ol/featureloader~FeatureUrlFunction} to generate the url with
      * other loading strategies.
      * Requires `format` to be set as well.
      * When default XHR feature loader is provided, the features will
      * be transformed from the data projection to the view projection
      * during parsing. If your remote data source does not advertise its projection
      * properly, this transformation will be incorrect. For some formats, the
      * default projection (usually EPSG:4326) can be overridden by setting the
      * dataProjection constructor option on the format.
      * Note that if a source contains non-feature data, such as a GeoJSON geometry
      * or a KML NetworkLink, these will be ignored. Use a custom loader to load these.
      */
    var url: js.UndefOr[String | FeatureUrlFunction] = js.undefined
    
    /**
      * By default, an RTree is used as spatial index. When features are removed and
      * added frequently, and the total number of features is low, setting this to
      * `false` may improve performance.
      *
      * Note that
      * {@link module :ol/source/Vector~VectorSource#getFeaturesInExtent},
      * {@link module :ol/source/Vector~VectorSource#getClosestFeatureToCoordinate} and
      * {@link module :ol/source/Vector~VectorSource#getExtent} cannot be used when `useSpatialIndex` is
      * set to `false`, and {@link module :ol/source/Vector~VectorSource#forEachFeatureInExtent} will loop
      * through all features.
      *
      * When set to `false`, the features will be maintained in an
      * {@link module :ol/Collection~Collection}, which can be retrieved through
      * {@link module :ol/source/Vector~VectorSource#getFeaturesCollection}.
      */
    var useSpatialIndex: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Wrap the world horizontally. For vector editing across the
      * -180° and 180° meridians to work properly, this should be set to `false`. The
      * resulting geometry coordinates will then exceed the world bounds.
      */
    var wrapX: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply[Geometry /* <: typings.ol.geomGeometryMod.default */](): Options[Geometry] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[Geometry]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], Geometry /* <: typings.ol.geomGeometryMod.default */] (val x: Self & Options[Geometry]) extends AnyVal {
      
      inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      inline def setAttributionsFunction1(value: /* arg0 */ ViewStateAndExtent => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      inline def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value*))
      
      inline def setFeatures(
        value: js.Array[typings.ol.renderFeatureMod.default] | typings.ol.collectionMod.default[typings.ol.renderFeatureMod.default]
      ): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setFeaturesVarargs(value: typings.ol.renderFeatureMod.default*): Self = StObject.set(x, "features", js.Array(value*))
      
      inline def setFormat(value: typings.ol.renderFeatureMod.default): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLoader(value: FeatureLoader): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setOverlaps(value: Boolean): Self = StObject.set(x, "overlaps", value.asInstanceOf[js.Any])
      
      inline def setOverlapsUndefined: Self = StObject.set(x, "overlaps", js.undefined)
      
      inline def setStrategy(
        value: (/* arg0 */ Extent, /* arg1 */ Double, /* arg2 */ typings.ol.projProjectionMod.default) => js.Array[Extent]
      ): Self = StObject.set(x, "strategy", js.Any.fromFunction3(value))
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      inline def setUrl(value: String | FeatureUrlFunction): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlFunction3(
        value: (/* arg0 */ Extent, /* arg1 */ Double, /* arg2 */ typings.ol.projProjectionMod.default) => String
      ): Self = StObject.set(x, "url", js.Any.fromFunction3(value))
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUseSpatialIndex(value: Boolean): Self = StObject.set(x, "useSpatialIndex", value.asInstanceOf[js.Any])
      
      inline def setUseSpatialIndexUndefined: Self = StObject.set(x, "useSpatialIndex", js.undefined)
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types, import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<import("./VectorEventType").VectorSourceEventTypes, VectorSourceEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     import("./VectorEventType").VectorSourceEventTypes, Return>} VectorSourceOnSignature
    */
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {Array<import("../Feature.js").default<Geometry>>|Collection<import("../Feature.js").default<Geometry>>} [features]
    * Features. If provided as {@link module:ol/Collection~Collection}, the features in the source
    * and the collection will stay in sync.
    * @property {import("../format/Feature.js").default} [format] The feature format used by the XHR
    * feature loader when `url` is set. Required if `url` is set, otherwise ignored.
    * @property {import("../featureloader.js").FeatureLoader} [loader]
    * The loader function used to load features, from a remote source for example.
    * If this is not set and `url` is set, the source will create and use an XHR
    * feature loader. The `'featuresloadend'` and `'featuresloaderror'` events
    * will only fire if the `success` and `failure` callbacks are used.
    *
    * Example:
    *
    * ```js
    * import Vector from 'ol/source/Vector.js';
    * import GeoJSON from 'ol/format/GeoJSON.js';
    * import {bbox} from 'ol/loadingstrategy.js';
    *
    * const vectorSource = new Vector({
    *   format: new GeoJSON(),
    *   loader: function(extent, resolution, projection, success, failure) {
    *      const proj = projection.getCode();
    *      const url = 'https://ahocevar.com/geoserver/wfs?service=WFS&' +
    *          'version=1.1.0&request=GetFeature&typename=osm:water_areas&' +
    *          'outputFormat=application/json&srsname=' + proj + '&' +
    *          'bbox=' + extent.join(',') + ',' + proj;
    *      const xhr = new XMLHttpRequest();
    *      xhr.open('GET', url);
    *      const onError = function() {
    *        vectorSource.removeLoadedExtent(extent);
    *        failure();
    *      }
    *      xhr.onerror = onError;
    *      xhr.onload = function() {
    *        if (xhr.status == 200) {
    *          const features = vectorSource.getFormat().readFeatures(xhr.responseText);
    *          vectorSource.addFeatures(features);
    *          success(features);
    *        } else {
    *          onError();
    *        }
    *      }
    *      xhr.send();
    *    },
    *    strategy: bbox,
    *  });
    * ```
    * @property {boolean} [overlaps=true] This source may have overlapping geometries.
    * Setting this to `false` (e.g. for sources with polygons that represent administrative
    * boundaries or TopoJSON sources) allows the renderer to optimise fill and
    * stroke operations.
    * @property {LoadingStrategy} [strategy] The loading strategy to use.
    * By default an {@link module:ol/loadingstrategy.all}
    * strategy is used, a one-off strategy which loads all features at once.
    * @property {string|import("../featureloader.js").FeatureUrlFunction} [url]
    * Setting this option instructs the source to load features using an XHR loader
    * (see {@link module:ol/featureloader.xhr}). Use a `string` and an
    * {@link module:ol/loadingstrategy.all} for a one-off download of all features from
    * the given URL. Use a {@link module:ol/featureloader~FeatureUrlFunction} to generate the url with
    * other loading strategies.
    * Requires `format` to be set as well.
    * When default XHR feature loader is provided, the features will
    * be transformed from the data projection to the view projection
    * during parsing. If your remote data source does not advertise its projection
    * properly, this transformation will be incorrect. For some formats, the
    * default projection (usually EPSG:4326) can be overridden by setting the
    * dataProjection constructor option on the format.
    * Note that if a source contains non-feature data, such as a GeoJSON geometry
    * or a KML NetworkLink, these will be ignored. Use a custom loader to load these.
    * @property {boolean} [useSpatialIndex=true]
    * By default, an RTree is used as spatial index. When features are removed and
    * added frequently, and the total number of features is low, setting this to
    * `false` may improve performance.
    *
    * Note that
    * {@link module:ol/source/Vector~VectorSource#getFeaturesInExtent},
    * {@link module:ol/source/Vector~VectorSource#getClosestFeatureToCoordinate} and
    * {@link module:ol/source/Vector~VectorSource#getExtent} cannot be used when `useSpatialIndex` is
    * set to `false`, and {@link module:ol/source/Vector~VectorSource#forEachFeatureInExtent} will loop
    * through all features.
    *
    * When set to `false`, the features will be maintained in an
    * {@link module:ol/Collection~Collection}, which can be retrieved through
    * {@link module:ol/source/Vector~VectorSource#getFeaturesCollection}.
    * @property {boolean} [wrapX=true] Wrap the world horizontally. For vector editing across the
    * -180° and 180° meridians to work properly, this should be set to `false`. The
    * resulting geometry coordinates will then exceed the world bounds.
    * @template {import("../geom/Geometry.js").default} [Geometry=import("../geom/Geometry.js").default]
    */
  /**
    * @classdesc
    * Provides a source of features for vector layers. Vector features provided
    * by this source are suitable for editing. See {@link module:ol/source/VectorTile~VectorTile} for
    * vector data that is optimized for rendering.
    *
    * @fires VectorSourceEvent
    * @api
    * @template {import("../geom/Geometry.js").default} [Geometry=import("../geom/Geometry.js").default]
    */
  @js.native
  trait VectorSource[Geometry /* <: typings.ol.geomGeometryMod.default */]
    extends typings.ol.sourceSourceMod.default {
    
    /**
      * Add a single feature to the source.  If you want to add a batch of features
      * at once, call {@link module:ol/source/Vector~VectorSource#addFeatures #addFeatures()}
      * instead. A feature will not be added to the source if feature with
      * the same id is already there. The reason for this behavior is to avoid
      * feature duplication when using bbox or tile loading strategies.
      * Note: this also applies if an {@link module:ol/Collection~Collection} is used for features,
      * meaning that if a feature with a duplicate id is added in the collection, it will
      * be removed from it right away.
      * @param {import("../Feature.js").default<Geometry>} feature Feature to add.
      * @api
      */
    def addFeature(feature: typings.ol.renderFeatureMod.default): Unit = js.native
    
    /**
      * Add a feature without firing a `change` event.
      * @param {import("../Feature.js").default<Geometry>} feature Feature.
      * @protected
      */
    /* protected */ def addFeatureInternal(feature: typings.ol.renderFeatureMod.default): Unit = js.native
    
    /**
      * Add a batch of features to the source.
      * @param {Array<import("../Feature.js").default<Geometry>>} features Features to add.
      * @api
      */
    def addFeatures(features: js.Array[typings.ol.renderFeatureMod.default]): Unit = js.native
    
    /**
      * Add features without firing a `change` event.
      * @param {Array<import("../Feature.js").default<Geometry>>} features Features.
      * @protected
      */
    /* protected */ def addFeaturesInternal(features: js.Array[typings.ol.renderFeatureMod.default]): Unit = js.native
    
    /**
      * @param {string} featureKey Unique identifier for the feature.
      * @param {import("../Feature.js").default<Geometry>} feature The feature.
      * @return {boolean} The feature is "valid", in the sense that it is also a
      *     candidate for insertion into the Rtree.
      * @private
      */
    /* private */ var addToIndex_ : Any = js.native
    
    /**
      * @param {!Collection<import("../Feature.js").default<Geometry>>} collection Collection.
      * @private
      */
    /* private */ var bindFeaturesCollection_ : Any = js.native
    
    /**
      * Remove all features from the source.
      * @param {boolean} [fast] Skip dispatching of {@link module:ol/source/Vector.VectorSourceEvent#event:removefeature} events.
      * @api
      */
    def clear(): Unit = js.native
    def clear(fast: Boolean): Unit = js.native
    
    /**
      * @private
      * @type {Object<string, Array<import("../events.js").EventsKey>>}
      */
    /* private */ var featureChangeKeys_ : Any = js.native
    
    /**
      * @private
      * @type {Collection<import("../Feature.js").default<Geometry>>|null}
      */
    /* private */ var featuresCollection_ : Any = js.native
    
    /**
      * @private
      * @type {RBush<import("../Feature.js").default<Geometry>>}
      */
    /* private */ var featuresRtree_ : Any = js.native
    
    /**
      * Iterate through all features on the source, calling the provided callback
      * with each one.  If the callback returns any "truthy" value, iteration will
      * stop and the function will return the same value.
      * Note: this function only iterate through the feature that have a defined geometry.
      *
      * @param {function(import("../Feature.js").default<Geometry>): T} callback Called with each feature
      *     on the source.  Return a truthy value to stop iteration.
      * @return {T|undefined} The return value from the last call to the callback.
      * @template T
      * @api
      */
    def forEachFeature[T](callback: js.Function1[/* arg0 */ typings.ol.renderFeatureMod.default, T]): js.UndefOr[T] = js.native
    
    /**
      * Iterate through all features whose geometries contain the provided
      * coordinate, calling the callback with each feature.  If the callback returns
      * a "truthy" value, iteration will stop and the function will return the same
      * value.
      *
      * @param {import("../coordinate.js").Coordinate} coordinate Coordinate.
      * @param {function(import("../Feature.js").default<Geometry>): T} callback Called with each feature
      *     whose goemetry contains the provided coordinate.
      * @return {T|undefined} The return value from the last call to the callback.
      * @template T
      */
    def forEachFeatureAtCoordinateDirect[T_1](
      coordinate: Coordinate,
      callback: js.Function1[/* arg0 */ typings.ol.renderFeatureMod.default, T_1]
    ): js.UndefOr[T_1] = js.native
    
    /**
      * Iterate through all features whose bounding box intersects the provided
      * extent (note that the feature's geometry may not intersect the extent),
      * calling the callback with each feature.  If the callback returns a "truthy"
      * value, iteration will stop and the function will return the same value.
      *
      * If you are interested in features whose geometry intersects an extent, call
      * the {@link module:ol/source/Vector~VectorSource#forEachFeatureIntersectingExtent #forEachFeatureIntersectingExtent()} method instead.
      *
      * When `useSpatialIndex` is set to false, this method will loop through all
      * features, equivalent to {@link module:ol/source/Vector~VectorSource#forEachFeature #forEachFeature()}.
      *
      * @param {import("../extent.js").Extent} extent Extent.
      * @param {function(import("../Feature.js").default<Geometry>): T} callback Called with each feature
      *     whose bounding box intersects the provided extent.
      * @return {T|undefined} The return value from the last call to the callback.
      * @template T
      * @api
      */
    def forEachFeatureInExtent[T_2](extent: Extent, callback: js.Function1[/* arg0 */ typings.ol.renderFeatureMod.default, T_2]): js.UndefOr[T_2] = js.native
    
    /**
      * Iterate through all features whose geometry intersects the provided extent,
      * calling the callback with each feature.  If the callback returns a "truthy"
      * value, iteration will stop and the function will return the same value.
      *
      * If you only want to test for bounding box intersection, call the
      * {@link module:ol/source/Vector~VectorSource#forEachFeatureInExtent #forEachFeatureInExtent()} method instead.
      *
      * @param {import("../extent.js").Extent} extent Extent.
      * @param {function(import("../Feature.js").default<Geometry>): T} callback Called with each feature
      *     whose geometry intersects the provided extent.
      * @return {T|undefined} The return value from the last call to the callback.
      * @template T
      * @api
      */
    def forEachFeatureIntersectingExtent[T_3](extent: Extent, callback: js.Function1[/* arg0 */ typings.ol.renderFeatureMod.default, T_3]): js.UndefOr[T_3] = js.native
    
    /**
      * @private
      * @type {import("../format/Feature.js").default|undefined}
      */
    /* private */ var format_ : Any = js.native
    
    /**
      * Get the closest feature to the provided coordinate.
      *
      * This method is not available when the source is configured with
      * `useSpatialIndex` set to `false`.
      * @param {import("../coordinate.js").Coordinate} coordinate Coordinate.
      * @param {function(import("../Feature.js").default<Geometry>):boolean} [filter] Feature filter function.
      *     The filter function will receive one argument, the {@link module:ol/Feature~Feature feature}
      *     and it should return a boolean value. By default, no filtering is made.
      * @return {import("../Feature.js").default<Geometry>} Closest feature.
      * @api
      */
    def getClosestFeatureToCoordinate(coordinate: Coordinate): typings.ol.renderFeatureMod.default = js.native
    def getClosestFeatureToCoordinate(
      coordinate: Coordinate,
      filter: js.Function1[/* arg0 */ typings.ol.renderFeatureMod.default, Boolean]
    ): typings.ol.renderFeatureMod.default = js.native
    
    /**
      * Get the extent of the features currently in the source.
      *
      * This method is not available when the source is configured with
      * `useSpatialIndex` set to `false`.
      * @param {import("../extent.js").Extent} [extent] Destination extent. If provided, no new extent
      *     will be created. Instead, that extent's coordinates will be overwritten.
      * @return {import("../extent.js").Extent} Extent.
      * @api
      */
    def getExtent(): Extent = js.native
    def getExtent(extent: Extent): Extent = js.native
    
    /**
      * Get a feature by its identifier (the value returned by feature.getId()).
      * Note that the index treats string and numeric identifiers as the same.  So
      * `source.getFeatureById(2)` will return a feature with id `'2'` or `2`.
      *
      * @param {string|number} id Feature identifier.
      * @return {import("../Feature.js").default<Geometry>|null} The feature (or `null` if not found).
      * @api
      */
    def getFeatureById(id: String): typings.ol.renderFeatureMod.default | Null = js.native
    def getFeatureById(id: Double): typings.ol.renderFeatureMod.default | Null = js.native
    
    /**
      * Get a feature by its internal unique identifier (using `getUid`).
      *
      * @param {string} uid Feature identifier.
      * @return {import("../Feature.js").default<Geometry>|null} The feature (or `null` if not found).
      */
    def getFeatureByUid(uid: String): typings.ol.renderFeatureMod.default | Null = js.native
    
    /**
      * Get a snapshot of the features currently on the source in random order. The returned array
      * is a copy, the features are references to the features in the source.
      * @return {Array<import("../Feature.js").default<Geometry>>} Features.
      * @api
      */
    def getFeatures(): js.Array[typings.ol.renderFeatureMod.default] = js.native
    
    /**
      * Get all features whose geometry intersects the provided coordinate.
      * @param {import("../coordinate.js").Coordinate} coordinate Coordinate.
      * @return {Array<import("../Feature.js").default<Geometry>>} Features.
      * @api
      */
    def getFeaturesAtCoordinate(coordinate: Coordinate): js.Array[typings.ol.renderFeatureMod.default] = js.native
    
    /**
      * Get the features collection associated with this source. Will be `null`
      * unless the source was configured with `useSpatialIndex` set to `false`, or
      * with an {@link module:ol/Collection~Collection} as `features`.
      * @return {Collection<import("../Feature.js").default<Geometry>>|null} The collection of features.
      * @api
      */
    def getFeaturesCollection(): typings.ol.collectionMod.default[typings.ol.renderFeatureMod.default] | Null = js.native
    
    /**
      * Get all features whose bounding box intersects the provided extent.  Note that this returns an array of
      * all features intersecting the given extent in random order (so it may include
      * features whose geometries do not intersect the extent).
      *
      * When `useSpatialIndex` is set to false, this method will return all
      * features.
      *
      * @param {import("../extent.js").Extent} extent Extent.
      * @param {import("../proj/Projection.js").default} [projection] Include features
      * where `extent` exceeds the x-axis bounds of `projection` and wraps around the world.
      * @return {Array<import("../Feature.js").default<Geometry>>} Features.
      * @api
      */
    def getFeaturesInExtent(extent: Extent): js.Array[typings.ol.renderFeatureMod.default] = js.native
    def getFeaturesInExtent(extent: Extent, projection: typings.ol.projProjectionMod.default): js.Array[typings.ol.renderFeatureMod.default] = js.native
    
    /**
      * Get the format associated with this source.
      *
      * @return {import("../format/Feature.js").default|undefined} The feature format.
      * @api
      */
    def getFormat(): js.UndefOr[typings.ol.renderFeatureMod.default] = js.native
    
    /**
      * @return {boolean} The source can have overlapping geometries.
      */
    def getOverlaps(): Boolean = js.native
    
    /**
      * Get the url associated with this source.
      *
      * @return {string|import("../featureloader.js").FeatureUrlFunction|undefined} The url.
      * @api
      */
    def getUrl(): js.UndefOr[String | FeatureUrlFunction] = js.native
    
    /**
      * @param {Event} event Event.
      * @private
      */
    /* private */ var handleFeatureChange_ : Any = js.native
    
    /**
      * Returns true if the feature is contained within the source.
      * @param {import("../Feature.js").default<Geometry>} feature Feature.
      * @return {boolean} Has feature.
      * @api
      */
    def hasFeature(feature: typings.ol.renderFeatureMod.default): Boolean = js.native
    
    /**
      * A lookup of features by id (the return from feature.getId()).
      * @private
      * @type {!Object<string, import("../Feature.js").default<Geometry>>}
      */
    /* private */ var idIndex_ : Any = js.native
    
    /**
      * @return {boolean} Is empty.
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * @param {import("../extent.js").Extent} extent Extent.
      * @param {number} resolution Resolution.
      * @param {import("../proj/Projection.js").default} projection Projection.
      */
    def loadFeatures(extent: Extent, resolution: Double, projection: typings.ol.projProjectionMod.default): Unit = js.native
    
    /**
      * @private
      * @type {RBush<{extent: import("../extent.js").Extent}>}
      */
    /* private */ var loadedExtentsRtree_ : Any = js.native
    
    /**
      * @private
      * @type {import("../featureloader.js").FeatureLoader}
      */
    /* private */ var loader_ : Any = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var loadingExtentsCount_ : Any = js.native
    
    /**
      * @private
      * @type {!Object<string, import("../Feature.js").default<Geometry>>}
      */
    /* private */ var nullGeometryFeatures_ : Any = js.native
    
    /***
      * @type {VectorSourceOnSignature<import("../events").EventsKey>}
      */
    @JSName("on")
    var on_VectorSource: VectorSourceOnSignature[EventsKey] = js.native
    
    /***
      * @type {VectorSourceOnSignature<import("../events").EventsKey>}
      */
    @JSName("once")
    var once_VectorSource: VectorSourceOnSignature[EventsKey] = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var overlaps_ : Any = js.native
    
    /**
      * Remove a single feature from the source.  If you want to remove all features
      * at once, use the {@link module:ol/source/Vector~VectorSource#clear #clear()} method
      * instead.
      * @param {import("../Feature.js").default<Geometry>} feature Feature to remove.
      * @api
      */
    def removeFeature(feature: typings.ol.renderFeatureMod.default): Unit = js.native
    
    /**
      * Remove feature without firing a `change` event.
      * @param {import("../Feature.js").default<Geometry>} feature Feature.
      * @return {import("../Feature.js").default<Geometry>|undefined} The removed feature
      *     (or undefined if the feature was not found).
      * @protected
      */
    /* protected */ def removeFeatureInternal(feature: typings.ol.renderFeatureMod.default): js.UndefOr[typings.ol.renderFeatureMod.default] = js.native
    
    /**
      * Remove a feature from the id index.  Called internally when the feature id
      * may have changed.
      * @param {import("../Feature.js").default<Geometry>} feature The feature.
      * @return {boolean} Removed the feature from the index.
      * @private
      */
    /* private */ var removeFromIdIndex_ : Any = js.native
    
    /**
      * Remove an extent from the list of loaded extents.
      * @param {import("../extent.js").Extent} extent Extent.
      * @api
      */
    def removeLoadedExtent(extent: Extent): Unit = js.native
    
    /**
      * Set the new loader of the source. The next render cycle will use the
      * new loader.
      * @param {import("../featureloader.js").FeatureLoader} loader The loader to set.
      * @api
      */
    def setLoader(loader: FeatureLoader): Unit = js.native
    
    /**
      * Points the source to a new url. The next render cycle will use the new url.
      * @param {string|import("../featureloader.js").FeatureUrlFunction} url Url.
      * @api
      */
    def setUrl(url: String): Unit = js.native
    def setUrl(url: FeatureUrlFunction): Unit = js.native
    
    /**
      * @param {string} featureKey Unique identifier for the feature.
      * @param {import("../Feature.js").default<Geometry>} feature The feature.
      * @private
      */
    /* private */ var setupChangeEvents_ : Any = js.native
    
    /**
      * @private
      * @type {LoadingStrategy}
      */
    /* private */ var strategy_ : Any = js.native
    
    /**
      * A lookup of features by uid (using getUid(feature)).
      * @private
      * @type {!Object<string, import("../Feature.js").default<Geometry>>}
      */
    /* private */ var uidIndex_ : Any = js.native
    
    /***
      * @type {VectorSourceOnSignature<void>}
      */
    @JSName("un")
    var un_VectorSource: VectorSourceOnSignature[Unit] = js.native
    
    /**
      * @private
      * @type {string|import("../featureloader.js").FeatureUrlFunction|undefined}
      */
    /* private */ var url_ : Any = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait VectorSourceOnSignature[Return]
    extends OnSignature[
          EventTypes | Types | VectorSourceEventTypes, 
          ObjectEvent | VectorSourceEvent[typings.ol.geomGeometryMod.default] | typings.ol.eventsEventMod.default, 
          Return
        ]
}
