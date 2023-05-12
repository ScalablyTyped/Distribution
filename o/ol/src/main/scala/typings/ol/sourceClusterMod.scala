package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.viewMod.ViewStateAndExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceClusterMod {
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {number} [distance=20] Distance in pixels within which features will
    * be clustered together.
    * @property {number} [minDistance=0] Minimum distance in pixels between clusters.
    * Will be capped at the configured distance.
    * By default no minimum distance is guaranteed. This config can be used to avoid
    * overlapping icons. As a tradoff, the cluster feature's position will no longer be
    * the center of all its features.
    * @property {function(Feature):Point} [geometryFunction]
    * Function that takes an {@link module:ol/Feature~Feature} as argument and returns an
    * {@link module:ol/geom/Point~Point} as cluster calculation point for the feature. When a
    * feature should not be considered for clustering, the function should return
    * `null`. The default, which works when the underlying source contains point
    * features only, is
    * ```js
    * function(feature) {
    *   return feature.getGeometry();
    * }
    * ```
    * See {@link module:ol/geom/Polygon~Polygon#getInteriorPoint} for a way to get a cluster
    * calculation point for polygons.
    * @property {function(Point, Array<Feature>):Feature} [createCluster]
    * Function that takes the cluster's center {@link module:ol/geom/Point~Point} and an array
    * of {@link module:ol/Feature~Feature} included in this cluster. Must return a
    * {@link module:ol/Feature~Feature} that will be used to render. Default implementation is:
    * ```js
    * function(point, features) {
    *   return new Feature({
    *     geometry: point,
    *     features: features
    *   });
    * }
    * ```
    * @property {VectorSource} [source=null] Source.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    */
  /**
    * @classdesc
    * Layer source to cluster vector data. Works out of the box with point
    * geometries. For other geometry types, or if not all geometries should be
    * considered for clustering, a custom `geometryFunction` can be defined.
    *
    * If the instance is disposed without also disposing the underlying
    * source `setSource(null)` has to be called to remove the listener reference
    * from the wrapped source.
    * @api
    */
  @JSImport("ol/source/Cluster", JSImport.Default)
  @js.native
  open class default protected () extends Cluster {
    /**
      * @param {Options} options Cluster options.
      */
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {number} [distance=20] Distance in pixels within which features will
    * be clustered together.
    * @property {number} [minDistance=0] Minimum distance in pixels between clusters.
    * Will be capped at the configured distance.
    * By default no minimum distance is guaranteed. This config can be used to avoid
    * overlapping icons. As a tradoff, the cluster feature's position will no longer be
    * the center of all its features.
    * @property {function(Feature):Point} [geometryFunction]
    * Function that takes an {@link module:ol/Feature~Feature} as argument and returns an
    * {@link module:ol/geom/Point~Point} as cluster calculation point for the feature. When a
    * feature should not be considered for clustering, the function should return
    * `null`. The default, which works when the underlying source contains point
    * features only, is
    * ```js
    * function(feature) {
    *   return feature.getGeometry();
    * }
    * ```
    * See {@link module:ol/geom/Polygon~Polygon#getInteriorPoint} for a way to get a cluster
    * calculation point for polygons.
    * @property {function(Point, Array<Feature>):Feature} [createCluster]
    * Function that takes the cluster's center {@link module:ol/geom/Point~Point} and an array
    * of {@link module:ol/Feature~Feature} included in this cluster. Must return a
    * {@link module:ol/Feature~Feature} that will be used to render. Default implementation is:
    * ```js
    * function(point, features) {
    *   return new Feature({
    *     geometry: point,
    *     features: features
    *   });
    * }
    * ```
    * @property {VectorSource} [source=null] Source.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    */
  /**
    * @classdesc
    * Layer source to cluster vector data. Works out of the box with point
    * geometries. For other geometry types, or if not all geometries should be
    * considered for clustering, a custom `geometryFunction` can be defined.
    *
    * If the instance is disposed without also disposing the underlying
    * source `setSource(null)` has to be called to remove the listener reference
    * from the wrapped source.
    * @api
    */
  @js.native
  trait Cluster
    extends typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] {
    
    /**
      * @private
      */
    /* private */ var boundRefresh_ : Any = js.native
    
    /**
      * @protected
      */
    /* protected */ def cluster(): Unit = js.native
    
    /**
      * @param {Array<Feature>} features Features
      * @param {import("../extent.js").Extent} extent The searched extent for these features.
      * @return {Feature} The cluster feature.
      * @protected
      */
    /* protected */ def createCluster(
      features: js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]],
      extent: Extent
    ): typings.ol.featureMod.default[typings.ol.geomGeometryMod.default] = js.native
    
    /**
      * @type {function(Point, Array<Feature>):Feature}
      * @private
      */
    /* private */ var createCustomCluster_ : Any = js.native
    
    /**
      * @type {number}
      * @protected
      */
    /* protected */ var distance: Double = js.native
    
    /**
      * @type {Array<Feature>}
      * @protected
      */
    /* protected */ var features: js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = js.native
    
    /**
      * @param {Feature} feature Feature.
      * @return {Point} Cluster calculation point.
      * @protected
      */
    /* protected */ def geometryFunction(arg0: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]): typings.ol.geomPointMod.default = js.native
    
    /**
      * Get the distance in pixels between clusters.
      * @return {number} Distance.
      * @api
      */
    def getDistance(): Double = js.native
    
    /**
      * The configured minimum distance between clusters.
      * @return {number} The minimum distance in pixels.
      * @api
      */
    def getMinDistance(): Double = js.native
    
    /**
      * Get a reference to the wrapped source.
      * @return {VectorSource|null} Source.
      * @api
      */
    def getSource(): typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] | Null = js.native
    
    /**
      * @type {number}
      * @protected
      */
    /* protected */ var interpolationRatio: Double = js.native
    
    /**
      * @type {number}
      * @protected
      */
    /* protected */ var minDistance: Double = js.native
    
    /**
      * @type {number|undefined}
      * @protected
      */
    /* protected */ var resolution: js.UndefOr[Double] = js.native
    
    /**
      * Set the distance within which features will be clusterd together.
      * @param {number} distance The distance in pixels.
      * @api
      */
    def setDistance(distance: Double): Unit = js.native
    
    /**
      * Set the minimum distance between clusters. Will be capped at the
      * configured distance.
      * @param {number} minDistance The minimum distance in pixels.
      * @api
      */
    def setMinDistance(minDistance: Double): Unit = js.native
    
    /**
      * Replace the wrapped source.
      * @param {VectorSource|null} source The new source for this instance.
      * @api
      */
    def setSource(): Unit = js.native
    def setSource(source: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default]): Unit = js.native
    
    /**
      * @type {VectorSource|null}
      * @protected
      */
    /* protected */ var source: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] | Null = js.native
    
    /**
      * Update the distances and refresh the source if necessary.
      * @param {number} distance The new distance.
      * @param {number} minDistance The new minimum distance.
      */
    def updateDistance(distance: Double, minDistance: Double): Unit = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Attributions.
      */
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    /**
      * Function that takes the cluster's center {@link module :ol/geom/Point~Point} and an array
      * of {@link module :ol/Feature~Feature} included in this cluster. Must return a
      * {@link module :ol/Feature~Feature} that will be used to render. Default implementation is:
      * ```js
      * function(point, features) {
      * return new Feature({
      * geometry: point,
      * features: features
      * });
      * }
      * ```
      */
    var createCluster: js.UndefOr[
        js.Function2[
          /* arg0 */ typings.ol.geomPointMod.default, 
          /* arg1 */ js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]], 
          typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]
        ]
      ] = js.undefined
    
    /**
      * Distance in pixels within which features will
      * be clustered together.
      */
    var distance: js.UndefOr[Double] = js.undefined
    
    /**
      * Function that takes an {@link module :ol/Feature~Feature} as argument and returns an
      * {@link module :ol/geom/Point~Point} as cluster calculation point for the feature. When a
      * feature should not be considered for clustering, the function should return
      * `null`. The default, which works when the underlying source contains point
      * features only, is
      * ```js
      * function(feature) {
      * return feature.getGeometry();
      * }
      * ```
      * See {@link module :ol/geom/Polygon~Polygon#getInteriorPoint} for a way to get a cluster
      * calculation point for polygons.
      */
    var geometryFunction: js.UndefOr[
        js.Function1[
          /* arg0 */ typings.ol.featureMod.default[typings.ol.geomGeometryMod.default], 
          typings.ol.geomPointMod.default
        ]
      ] = js.undefined
    
    /**
      * Minimum distance in pixels between clusters.
      * Will be capped at the configured distance.
      * By default no minimum distance is guaranteed. This config can be used to avoid
      * overlapping icons. As a tradoff, the cluster feature's position will no longer be
      * the center of all its features.
      */
    var minDistance: js.UndefOr[Double] = js.undefined
    
    /**
      * Source.
      */
    var source: js.UndefOr[typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default]] = js.undefined
    
    /**
      * Whether to wrap the world horizontally.
      */
    var wrapX: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      inline def setAttributionsFunction1(value: /* arg0 */ ViewStateAndExtent => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      inline def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value*))
      
      inline def setCreateCluster(
        value: (/* arg0 */ typings.ol.geomPointMod.default, /* arg1 */ js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]) => typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]
      ): Self = StObject.set(x, "createCluster", js.Any.fromFunction2(value))
      
      inline def setCreateClusterUndefined: Self = StObject.set(x, "createCluster", js.undefined)
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setGeometryFunction(
        value: /* arg0 */ typings.ol.featureMod.default[typings.ol.geomGeometryMod.default] => typings.ol.geomPointMod.default
      ): Self = StObject.set(x, "geometryFunction", js.Any.fromFunction1(value))
      
      inline def setGeometryFunctionUndefined: Self = StObject.set(x, "geometryFunction", js.undefined)
      
      inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
      
      inline def setMinDistanceUndefined: Self = StObject.set(x, "minDistance", js.undefined)
      
      inline def setSource(value: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
}
