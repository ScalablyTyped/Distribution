package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerGraticuleMod {
  
  /**
    * @typedef {Object} GraticuleLabelDataType
    * @property {Point} geom Geometry.
    * @property {string} text Text.
    */
  /**
    * @typedef {Object} Options
    * @property {string} [className='ol-layer'] A CSS class name to set to the layer element.
    * @property {number} [opacity=1] Opacity (0, 1).
    * @property {boolean} [visible=true] Visibility.
    * @property {import("../extent.js").Extent} [extent] The bounding extent for layer rendering.  The layer will not be
    * rendered outside of this extent.
    * @property {number} [zIndex] The z-index for layer rendering.  At rendering time, the layers
    * will be ordered, first by Z-index and then by position. When `undefined`, a `zIndex` of 0 is assumed
    * for layers that are added to the map's `layers` collection, or `Infinity` when the layer's `setMap()`
    * method was used.
    * @property {number} [minResolution] The minimum resolution (inclusive) at which this layer will be
    * visible.
    * @property {number} [maxResolution] The maximum resolution (exclusive) below which this layer will
    * be visible.
    * @property {number} [minZoom] The minimum view zoom level (exclusive) above which this layer will be
    * visible.
    * @property {number} [maxZoom] The maximum view zoom level (inclusive) at which this layer will
    * be visible.
    * @property {number} [maxLines=100] The maximum number of meridians and
    * parallels from the center of the map. The default value of 100 means that at
    * most 200 meridians and 200 parallels will be displayed. The default value is
    * appropriate for conformal projections like Spherical Mercator. If you
    * increase the value, more lines will be drawn and the drawing performance will
    * decrease.
    * @property {Stroke} [strokeStyle] The
    * stroke style to use for drawing the graticule. If not provided, the following stroke will be used:
    * ```js
    * new Stroke({
    *   color: 'rgba(0, 0, 0, 0.2)' // a not fully opaque black
    * });
    * ```
    * @property {number} [targetSize=100] The target size of the graticule cells,
    * in pixels.
    * @property {boolean} [showLabels=false] Render a label with the respective
    * latitude/longitude for each graticule line.
    * @property {function(number):string} [lonLabelFormatter] Label formatter for
    * longitudes. This function is called with the longitude as argument, and
    * should return a formatted string representing the longitude. By default,
    * labels are formatted as degrees, minutes, seconds and hemisphere.
    * @property {function(number):string} [latLabelFormatter] Label formatter for
    * latitudes. This function is called with the latitude as argument, and
    * should return a formatted string representing the latitude. By default,
    * labels are formatted as degrees, minutes, seconds and hemisphere.
    * @property {number} [lonLabelPosition=0] Longitude label position in fractions
    * (0..1) of view extent. 0 means at the bottom of the viewport, 1 means at the
    * top.
    * @property {number} [latLabelPosition=1] Latitude label position in fractions
    * (0..1) of view extent. 0 means at the left of the viewport, 1 means at the
    * right.
    * @property {Text} [lonLabelStyle] Longitude label text
    * style. If not provided, the following style will be used:
    * ```js
    * new Text({
    *   font: '12px Calibri,sans-serif',
    *   textBaseline: 'bottom',
    *   fill: new Fill({
    *     color: 'rgba(0,0,0,1)'
    *   }),
    *   stroke: new Stroke({
    *     color: 'rgba(255,255,255,1)',
    *     width: 3
    *   })
    * });
    * ```
    * Note that the default's `textBaseline` configuration will not work well for
    * `lonLabelPosition` configurations that position labels close to the top of
    * the viewport.
    * @property {Text} [latLabelStyle] Latitude label text style.
    * If not provided, the following style will be used:
    * ```js
    * new Text({
    *   font: '12px Calibri,sans-serif',
    *   textAlign: 'end',
    *   fill: new Fill({
    *     color: 'rgba(0,0,0,1)'
    *   }),
    *   stroke: Stroke({
    *     color: 'rgba(255,255,255,1)',
    *     width: 3
    *   })
    * });
    * ```
    * Note that the default's `textAlign` configuration will not work well for
    * `latLabelPosition` configurations that position labels close to the left of
    * the viewport.
    * @property {Array<number>} [intervals=[90, 45, 30, 20, 10, 5, 2, 1, 30/60, 20/60, 10/60, 5/60, 2/60, 1/60, 30/3600, 20/3600, 10/3600, 5/3600, 2/3600, 1/3600]]
    * Intervals (in degrees) for the graticule. Example to limit graticules to 30 and 10 degrees intervals:
    * ```js
    * [30, 10]
    * ```
    * @property {boolean} [wrapX=true] Whether to repeat the graticule horizontally.
    * @property {Object<string, *>} [properties] Arbitrary observable properties. Can be accessed with `#get()` and `#set()`.
    */
  /**
    * @classdesc
    * Layer that renders a grid for a coordinate system (currently only EPSG:4326 is supported).
    * Note that the view projection must define both extent and worldExtent.
    *
    * @fires import("../render/Event.js").RenderEvent
    * @extends {VectorLayer<import("../source/Vector.js").default>}
    * @api
    */
  @JSImport("ol/layer/Graticule", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends Graticule {
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} GraticuleLabelDataType
    * @property {Point} geom Geometry.
    * @property {string} text Text.
    */
  /**
    * @typedef {Object} Options
    * @property {string} [className='ol-layer'] A CSS class name to set to the layer element.
    * @property {number} [opacity=1] Opacity (0, 1).
    * @property {boolean} [visible=true] Visibility.
    * @property {import("../extent.js").Extent} [extent] The bounding extent for layer rendering.  The layer will not be
    * rendered outside of this extent.
    * @property {number} [zIndex] The z-index for layer rendering.  At rendering time, the layers
    * will be ordered, first by Z-index and then by position. When `undefined`, a `zIndex` of 0 is assumed
    * for layers that are added to the map's `layers` collection, or `Infinity` when the layer's `setMap()`
    * method was used.
    * @property {number} [minResolution] The minimum resolution (inclusive) at which this layer will be
    * visible.
    * @property {number} [maxResolution] The maximum resolution (exclusive) below which this layer will
    * be visible.
    * @property {number} [minZoom] The minimum view zoom level (exclusive) above which this layer will be
    * visible.
    * @property {number} [maxZoom] The maximum view zoom level (inclusive) at which this layer will
    * be visible.
    * @property {number} [maxLines=100] The maximum number of meridians and
    * parallels from the center of the map. The default value of 100 means that at
    * most 200 meridians and 200 parallels will be displayed. The default value is
    * appropriate for conformal projections like Spherical Mercator. If you
    * increase the value, more lines will be drawn and the drawing performance will
    * decrease.
    * @property {Stroke} [strokeStyle] The
    * stroke style to use for drawing the graticule. If not provided, the following stroke will be used:
    * ```js
    * new Stroke({
    *   color: 'rgba(0, 0, 0, 0.2)' // a not fully opaque black
    * });
    * ```
    * @property {number} [targetSize=100] The target size of the graticule cells,
    * in pixels.
    * @property {boolean} [showLabels=false] Render a label with the respective
    * latitude/longitude for each graticule line.
    * @property {function(number):string} [lonLabelFormatter] Label formatter for
    * longitudes. This function is called with the longitude as argument, and
    * should return a formatted string representing the longitude. By default,
    * labels are formatted as degrees, minutes, seconds and hemisphere.
    * @property {function(number):string} [latLabelFormatter] Label formatter for
    * latitudes. This function is called with the latitude as argument, and
    * should return a formatted string representing the latitude. By default,
    * labels are formatted as degrees, minutes, seconds and hemisphere.
    * @property {number} [lonLabelPosition=0] Longitude label position in fractions
    * (0..1) of view extent. 0 means at the bottom of the viewport, 1 means at the
    * top.
    * @property {number} [latLabelPosition=1] Latitude label position in fractions
    * (0..1) of view extent. 0 means at the left of the viewport, 1 means at the
    * right.
    * @property {Text} [lonLabelStyle] Longitude label text
    * style. If not provided, the following style will be used:
    * ```js
    * new Text({
    *   font: '12px Calibri,sans-serif',
    *   textBaseline: 'bottom',
    *   fill: new Fill({
    *     color: 'rgba(0,0,0,1)'
    *   }),
    *   stroke: new Stroke({
    *     color: 'rgba(255,255,255,1)',
    *     width: 3
    *   })
    * });
    * ```
    * Note that the default's `textBaseline` configuration will not work well for
    * `lonLabelPosition` configurations that position labels close to the top of
    * the viewport.
    * @property {Text} [latLabelStyle] Latitude label text style.
    * If not provided, the following style will be used:
    * ```js
    * new Text({
    *   font: '12px Calibri,sans-serif',
    *   textAlign: 'end',
    *   fill: new Fill({
    *     color: 'rgba(0,0,0,1)'
    *   }),
    *   stroke: Stroke({
    *     color: 'rgba(255,255,255,1)',
    *     width: 3
    *   })
    * });
    * ```
    * Note that the default's `textAlign` configuration will not work well for
    * `latLabelPosition` configurations that position labels close to the left of
    * the viewport.
    * @property {Array<number>} [intervals=[90, 45, 30, 20, 10, 5, 2, 1, 30/60, 20/60, 10/60, 5/60, 2/60, 1/60, 30/3600, 20/3600, 10/3600, 5/3600, 2/3600, 1/3600]]
    * Intervals (in degrees) for the graticule. Example to limit graticules to 30 and 10 degrees intervals:
    * ```js
    * [30, 10]
    * ```
    * @property {boolean} [wrapX=true] Whether to repeat the graticule horizontally.
    * @property {Object<string, *>} [properties] Arbitrary observable properties. Can be accessed with `#get()` and `#set()`.
    */
  /**
    * @classdesc
    * Layer that renders a grid for a coordinate system (currently only EPSG:4326 is supported).
    * Note that the view projection must define both extent and worldExtent.
    *
    * @fires import("../render/Event.js").RenderEvent
    * @extends {VectorLayer<import("../source/Vector.js").default>}
    * @api
    */
  @js.native
  trait Graticule
    extends typings.ol.layerVectorMod.default[typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default]] {
    
    /**
      * @param {number} lon Longitude.
      * @param {number} minLat Minimal latitude.
      * @param {number} maxLat Maximal latitude.
      * @param {number} squaredTolerance Squared tolerance.
      * @param {import("../extent.js").Extent} extent Extent.
      * @param {number} index Index.
      * @return {number} Index.
      * @private
      */
    /* private */ var addMeridian_ : Any = js.native
    
    /**
      * @param {number} lat Latitude.
      * @param {number} minLon Minimal longitude.
      * @param {number} maxLon Maximal longitude.
      * @param {number} squaredTolerance Squared tolerance.
      * @param {import("../extent.js").Extent} extent Extent.
      * @param {number} index Index.
      * @return {number} Index.
      * @private
      */
    /* private */ var addParallel_ : Any = js.native
    
    /**
      * @type {import("../coordinate.js").Coordinate}
      * @private
      */
    /* private */ var bottomLeft_ : Any = js.native
    
    /**
      * @type {import("../coordinate.js").Coordinate}
      * @private
      */
    /* private */ var bottomRight_ : Any = js.native
    
    /**
      * @param {import("../extent.js").Extent} extent Extent.
      * @param {import("../coordinate.js").Coordinate} center Center.
      * @param {number} resolution Resolution.
      * @param {number} squaredTolerance Squared tolerance.
      * @private
      */
    /* private */ var createGraticule_ : Any = js.native
    
    /**
      * @param {import("../render/Event.js").default} event Render event.
      * @private
      */
    /* private */ var drawLabels_ : Any = js.native
    
    /**
      * feature pool to use when updating graticule
      * @type {Array<Feature>}
      * @private
      */
    /* private */ var featurePool_ : Any = js.native
    
    /**
      * @type {import("../proj.js").TransformFunction|undefined}
      * @private
      */
    /* private */ var fromLonLatTransform_ : Any = js.native
    
    /**
      * @param {number} resolution Resolution.
      * @return {number} The interval in degrees.
      * @private
      */
    /* private */ var getInterval_ : Any = js.native
    
    /**
      * @param {LineString} lineString Meridian
      * @param {import("../extent.js").Extent} extent Extent.
      * @param {number} index Index.
      * @return {Point} Meridian point.
      * @private
      */
    /* private */ var getMeridianPoint_ : Any = js.native
    
    /**
      * @param {number} lon Longitude.
      * @param {number} minLat Minimal latitude.
      * @param {number} maxLat Maximal latitude.
      * @param {number} squaredTolerance Squared tolerance.
      * @return {LineString} The meridian line string.
      * @param {number} index Index.
      * @private
      */
    /* private */ var getMeridian_ : Any = js.native
    
    /**
      * Get the list of meridians.  Meridians are lines of equal longitude.
      * @return {Array<LineString>} The meridians.
      * @api
      */
    def getMeridians(): js.Array[typings.ol.geomLineStringMod.default] = js.native
    
    /**
      * @param {LineString} lineString Parallels.
      * @param {import("../extent.js").Extent} extent Extent.
      * @param {number} index Index.
      * @return {Point} Parallel point.
      * @private
      */
    /* private */ var getParallelPoint_ : Any = js.native
    
    /**
      * @param {number} lat Latitude.
      * @param {number} minLon Minimal longitude.
      * @param {number} maxLon Maximal longitude.
      * @param {number} squaredTolerance Squared tolerance.
      * @return {LineString} The parallel line string.
      * @param {number} index Index.
      * @private
      */
    /* private */ var getParallel_ : Any = js.native
    
    /**
      * Get the list of parallels.  Parallels are lines of equal latitude.
      * @return {Array<LineString>} The parallels.
      * @api
      */
    def getParallels(): js.Array[typings.ol.geomLineStringMod.default] = js.native
    
    /**
      * @type {Array<number>}
      * @private
      */
    /* private */ var intervals_ : Any = js.native
    
    /**
      * @type {function(number):string}
      * @private
      */
    /* private */ var latLabelFormatter_ : Any = js.native
    
    /**
      * Latitude Label position in fractions (0..1) of view extent. 0 means left, 1
      * means right.
      * @type {number}
      * @private
      */
    /* private */ var latLabelPosition_ : Any = js.native
    
    /**
      * @type {Style}
      * @private
      */
    /* private */ var latLabelStyleBase_ : Any = js.native
    
    /**
      * @private
      * @param {import("../Feature").default} feature Feature
      * @return {Style} style
      */
    /* private */ var latLabelStyle_ : Any = js.native
    
    /**
      * @type {Style}
      * @private
      */
    /* private */ var lineStyle_ : Any = js.native
    
    /**
      * @type {?import("../extent.js").Extent}
      * @private
      */
    /* private */ var loadedExtent_ : Any = js.native
    
    /**
      * Update geometries in the source based on current view
      * @param {import("../extent").Extent} extent Extent
      * @param {number} resolution Resolution
      * @param {import("../proj/Projection.js").default} projection Projection
      */
    def loaderFunction(extent: Extent, resolution: Double, projection: typings.ol.projProjectionMod.default): Unit = js.native
    
    /**
      * @type {null|function(number):string}
      * @private
      */
    /* private */ var lonLabelFormatter_ : Any = js.native
    
    /**
      * Longitude label position in fractions (0..1) of view extent. 0 means
      * bottom, 1 means top.
      * @type {number}
      * @private
      */
    /* private */ var lonLabelPosition_ : Any = js.native
    
    /**
      * @type {Style}
      * @private
      */
    /* private */ var lonLabelStyleBase_ : Any = js.native
    
    /**
      * @private
      * @param {import("../Feature").default} feature Feature
      * @return {Style} style
      */
    /* private */ var lonLabelStyle_ : Any = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var maxLat_ : Any = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var maxLines_ : Any = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var maxLon_ : Any = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var maxX_ : Any = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var maxY_ : Any = js.native
    
    /**
      * @type {Array<GraticuleLabelDataType>}
      * @private
      */
    /* private */ var meridiansLabels_ : Any = js.native
    
    /**
      * @type {Array<LineString>}
      * @private
      */
    /* private */ var meridians_ : Any = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var minLat_ : Any = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var minLon_ : Any = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var minX_ : Any = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var minY_ : Any = js.native
    
    /**
      * @type {Array<GraticuleLabelDataType>}
      * @private
      */
    /* private */ var parallelsLabels_ : Any = js.native
    
    /**
      * @type {Array<LineString>}
      * @private
      */
    /* private */ var parallels_ : Any = js.native
    
    /**
      * @type {import("../coordinate.js").Coordinate}
      * @private
      */
    /* private */ var projectionCenterLonLat_ : Any = js.native
    
    /**
      * @type {import("../proj/Projection.js").default}
      */
    var projection_ : typings.ol.projProjectionMod.default = js.native
    
    /**
      * @type {?import("../extent.js").Extent}
      * @private
      */
    /* private */ var renderedExtent_ : Any = js.native
    
    /**
      * @type {?number}
      * @private
      */
    /* private */ var renderedResolution_ : Any = js.native
    
    /**
      * Strategy function for loading features based on the view's extent and
      * resolution.
      * @param {import("../extent.js").Extent} extent Extent.
      * @param {number} resolution Resolution.
      * @return {Array<import("../extent.js").Extent>} Extents.
      */
    def strategyFunction(extent: Extent, resolution: Double): js.Array[Extent] = js.native
    
    /**
      * @type {Stroke}
      * @private
      */
    /* private */ var strokeStyle_ : Any = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var targetSize_ : Any = js.native
    
    /**
      * @type {import("../proj.js").TransformFunction|undefined}
      * @private
      */
    /* private */ var toLonLatTransform_ : Any = js.native
    
    /**
      * @type {import("../coordinate.js").Coordinate}
      * @private
      */
    /* private */ var topLeft_ : Any = js.native
    
    /**
      * @type {import("../coordinate.js").Coordinate}
      * @private
      */
    /* private */ var topRight_ : Any = js.native
    
    /**
      * @param {import("../proj/Projection.js").default} projection Projection.
      * @private
      */
    /* private */ var updateProjectionInfo_ : Any = js.native
  }
  
  trait GraticuleLabelDataType extends StObject {
    
    /**
      * Geometry.
      */
    var geom: typings.ol.geomPointMod.default
    
    /**
      * Text.
      */
    var text: String
  }
  object GraticuleLabelDataType {
    
    inline def apply(geom: typings.ol.geomPointMod.default, text: String): GraticuleLabelDataType = {
      val __obj = js.Dynamic.literal(geom = geom.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraticuleLabelDataType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GraticuleLabelDataType] (val x: Self) extends AnyVal {
      
      inline def setGeom(value: typings.ol.geomPointMod.default): Self = StObject.set(x, "geom", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * A CSS class name to set to the layer element.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The bounding extent for layer rendering.  The layer will not be
      * rendered outside of this extent.
      */
    var extent: js.UndefOr[Extent] = js.undefined
    
    /**
      * Intervals (in degrees) for the graticule. Example to limit graticules to 30 and 10 degrees intervals:
      * ```js
      * [30, 10]
      * ```
      */
    var intervals: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Label formatter for
      * latitudes. This function is called with the latitude as argument, and
      * should return a formatted string representing the latitude. By default,
      * labels are formatted as degrees, minutes, seconds and hemisphere.
      */
    var latLabelFormatter: js.UndefOr[js.Function1[/* arg0 */ Double, String]] = js.undefined
    
    /**
      * Latitude label position in fractions
      * (0..1) of view extent. 0 means at the left of the viewport, 1 means at the
      * right.
      */
    var latLabelPosition: js.UndefOr[Double] = js.undefined
    
    /**
      * Latitude label text style.
      * If not provided, the following style will be used:
      * ```js
      * new Text({
      * font: '12px Calibri,sans-serif',
      * textAlign: 'end',
      * fill: new Fill({
      * color: 'rgba(0,0,0,1)'
      * }),
      * stroke: Stroke({
      * color: 'rgba(255,255,255,1)',
      * width: 3
      * })
      * });
      * ```
      * Note that the default's `textAlign` configuration will not work well for
      * `latLabelPosition` configurations that position labels close to the left of
      * the viewport.
      */
    var latLabelStyle: js.UndefOr[typings.ol.styleTextMod.default] = js.undefined
    
    /**
      * Label formatter for
      * longitudes. This function is called with the longitude as argument, and
      * should return a formatted string representing the longitude. By default,
      * labels are formatted as degrees, minutes, seconds and hemisphere.
      */
    var lonLabelFormatter: js.UndefOr[js.Function1[/* arg0 */ Double, String]] = js.undefined
    
    /**
      * Longitude label position in fractions
      * (0..1) of view extent. 0 means at the bottom of the viewport, 1 means at the
      * top.
      */
    var lonLabelPosition: js.UndefOr[Double] = js.undefined
    
    /**
      * Longitude label text
      * style. If not provided, the following style will be used:
      * ```js
      * new Text({
      * font: '12px Calibri,sans-serif',
      * textBaseline: 'bottom',
      * fill: new Fill({
      * color: 'rgba(0,0,0,1)'
      * }),
      * stroke: new Stroke({
      * color: 'rgba(255,255,255,1)',
      * width: 3
      * })
      * });
      * ```
      * Note that the default's `textBaseline` configuration will not work well for
      * `lonLabelPosition` configurations that position labels close to the top of
      * the viewport.
      */
    var lonLabelStyle: js.UndefOr[typings.ol.styleTextMod.default] = js.undefined
    
    /**
      * The maximum number of meridians and
      * parallels from the center of the map. The default value of 100 means that at
      * most 200 meridians and 200 parallels will be displayed. The default value is
      * appropriate for conformal projections like Spherical Mercator. If you
      * increase the value, more lines will be drawn and the drawing performance will
      * decrease.
      */
    var maxLines: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum resolution (exclusive) below which this layer will
      * be visible.
      */
    var maxResolution: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum view zoom level (inclusive) at which this layer will
      * be visible.
      */
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum resolution (inclusive) at which this layer will be
      * visible.
      */
    var minResolution: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum view zoom level (exclusive) above which this layer will be
      * visible.
      */
    var minZoom: js.UndefOr[Double] = js.undefined
    
    /**
      * Opacity (0, 1).
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /**
      * Arbitrary observable properties. Can be accessed with `#get()` and `#set()`.
      */
    var properties: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * Render a label with the respective
      * latitude/longitude for each graticule line.
      */
    var showLabels: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The
      * stroke style to use for drawing the graticule. If not provided, the following stroke will be used:
      * ```js
      * new Stroke({
      * color: 'rgba(0, 0, 0, 0.2)' // a not fully opaque black
      * });
      * ```
      */
    var strokeStyle: js.UndefOr[typings.ol.styleStrokeMod.default] = js.undefined
    
    /**
      * The target size of the graticule cells,
      * in pixels.
      */
    var targetSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Visibility.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to repeat the graticule horizontally.
      */
    var wrapX: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The z-index for layer rendering.  At rendering time, the layers
      * will be ordered, first by Z-index and then by position. When `undefined`, a `zIndex` of 0 is assumed
      * for layers that are added to the map's `layers` collection, or `Infinity` when the layer's `setMap()`
      * method was used.
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
      
      inline def setIntervals(value: js.Array[Double]): Self = StObject.set(x, "intervals", value.asInstanceOf[js.Any])
      
      inline def setIntervalsUndefined: Self = StObject.set(x, "intervals", js.undefined)
      
      inline def setIntervalsVarargs(value: Double*): Self = StObject.set(x, "intervals", js.Array(value*))
      
      inline def setLatLabelFormatter(value: /* arg0 */ Double => String): Self = StObject.set(x, "latLabelFormatter", js.Any.fromFunction1(value))
      
      inline def setLatLabelFormatterUndefined: Self = StObject.set(x, "latLabelFormatter", js.undefined)
      
      inline def setLatLabelPosition(value: Double): Self = StObject.set(x, "latLabelPosition", value.asInstanceOf[js.Any])
      
      inline def setLatLabelPositionUndefined: Self = StObject.set(x, "latLabelPosition", js.undefined)
      
      inline def setLatLabelStyle(value: typings.ol.styleTextMod.default): Self = StObject.set(x, "latLabelStyle", value.asInstanceOf[js.Any])
      
      inline def setLatLabelStyleUndefined: Self = StObject.set(x, "latLabelStyle", js.undefined)
      
      inline def setLonLabelFormatter(value: /* arg0 */ Double => String): Self = StObject.set(x, "lonLabelFormatter", js.Any.fromFunction1(value))
      
      inline def setLonLabelFormatterUndefined: Self = StObject.set(x, "lonLabelFormatter", js.undefined)
      
      inline def setLonLabelPosition(value: Double): Self = StObject.set(x, "lonLabelPosition", value.asInstanceOf[js.Any])
      
      inline def setLonLabelPositionUndefined: Self = StObject.set(x, "lonLabelPosition", js.undefined)
      
      inline def setLonLabelStyle(value: typings.ol.styleTextMod.default): Self = StObject.set(x, "lonLabelStyle", value.asInstanceOf[js.Any])
      
      inline def setLonLabelStyleUndefined: Self = StObject.set(x, "lonLabelStyle", js.undefined)
      
      inline def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      inline def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      inline def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      inline def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setProperties(value: StringDictionary[Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
      
      inline def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
      
      inline def setStrokeStyle(value: typings.ol.styleStrokeMod.default): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
      
      inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
      
      inline def setTargetSize(value: Double): Self = StObject.set(x, "targetSize", value.asInstanceOf[js.Any])
      
      inline def setTargetSizeUndefined: Self = StObject.set(x, "targetSize", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
