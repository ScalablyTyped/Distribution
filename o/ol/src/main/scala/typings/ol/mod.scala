package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.assertionErrorMod.default
import typings.ol.collectionMod.Options
import typings.ol.extentMod.Extent
import typings.ol.featureMod.ObjectWithGeometry
import typings.ol.imageCanvasMod.Loader
import typings.ol.imageMod.LoadFunction
import typings.ol.mapMod.FrameState
import typings.ol.mapMod.MapOptions
import typings.ol.tileQueueMod.PriorityFunction
import typings.ol.tilecoordMod.TileCoord
import typings.ol.viewMod.ViewOptions
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.PointerEvent
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Error object thrown when an assertion failed. This is an ECMA-262 Error,
    * extended with a `code` property.
    * See https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error.
    */
  @JSImport("ol", "AssertionError")
  @js.native
  open class AssertionError protected () extends default {
    /**
      * @param {number} code Error code.
      */
    def this(code: Double) = this()
  }
  
  /***
    * @template T
    * @template Return
    * @typedef {import("./Observable").OnSignature<import("./Observable").EventTypes, import("./events/Event.js").default, Return> &
    *   import("./Observable").OnSignature<import("./ObjectEventType").Types|'change:length', import("./Object").ObjectEvent, Return> &
    *   import("./Observable").OnSignature<'add'|'remove', CollectionEvent<T>, Return> &
    *   import("./Observable").CombinedOnSignature<import("./Observable").EventTypes|import("./ObjectEventType").Types|
    *     'change:length'|'add'|'remove',Return>} CollectionOnSignature
    */
  /**
    * @typedef {Object} Options
    * @property {boolean} [unique=false] Disallow the same item from being added to
    * the collection twice.
    */
  /**
    * @classdesc
    * An expanded version of standard JS Array, adding convenience methods for
    * manipulation. Add and remove changes to the Collection trigger a Collection
    * event. Note that this does not cover changes to the objects _within_ the
    * Collection; they trigger events on the appropriate object, not on the
    * Collection as a whole.
    *
    * @fires CollectionEvent
    *
    * @template T
    * @api
    */
  @JSImport("ol", "Collection")
  @js.native
  /**
    * @param {Array<T>} [array] Array.
    * @param {Options} [options] Collection options.
    */
  open class Collection[T] ()
    extends typings.ol.collectionMod.default[T] {
    def this(array: js.Array[T]) = this()
    def this(array: js.Array[T], options: Options) = this()
    def this(array: Unit, options: Options) = this()
  }
  
  /**
    * @module ol/Disposable
    */
  /**
    * @classdesc
    * Objects that need to clean up after themselves.
    */
  @JSImport("ol", "Disposable")
  @js.native
  open class Disposable ()
    extends typings.ol.disposableMod.default
  
  /**
    * @typedef {typeof Feature|typeof import("./render/Feature.js").default} FeatureClass
    */
  /**
    * @typedef {Feature|import("./render/Feature.js").default} FeatureLike
    */
  /***
    * @template Return
    * @typedef {import("./Observable").OnSignature<import("./Observable").EventTypes, import("./events/Event.js").default, Return> &
    *   import("./Observable").OnSignature<import("./ObjectEventType").Types|'change:geometry', import("./Object").ObjectEvent, Return> &
    *   import("./Observable").CombinedOnSignature<import("./Observable").EventTypes|import("./ObjectEventType").Types
    *     |'change:geometry', Return>} FeatureOnSignature
    */
  /***
    * @template Geometry
    * @typedef {Object<string, *> & { geometry?: Geometry }} ObjectWithGeometry
    */
  /**
    * @classdesc
    * A vector object for geographic features with a geometry and other
    * attribute properties, similar to the features in vector file formats like
    * GeoJSON.
    *
    * Features can be styled individually with `setStyle`; otherwise they use the
    * style of their vector layer.
    *
    * Note that attribute properties are set as {@link module:ol/Object~BaseObject} properties on
    * the feature object, so they are observable, and have get/set accessors.
    *
    * Typically, a feature has a single geometry property. You can set the
    * geometry using the `setGeometry` method and get it with `getGeometry`.
    * It is possible to store more than one geometry on a feature using attribute
    * properties. By default, the geometry used for rendering is identified by
    * the property name `geometry`. If you want to use another geometry property
    * for rendering, use the `setGeometryName` method to change the attribute
    * property associated with the geometry for the feature.  For example:
    *
    * ```js
    *
    * import Feature from 'ol/Feature.js';
    * import Polygon from 'ol/geom/Polygon.js';
    * import Point from 'ol/geom/Point.js';
    *
    * const feature = new Feature({
    *   geometry: new Polygon(polyCoords),
    *   labelPoint: new Point(labelCoords),
    *   name: 'My Polygon',
    * });
    *
    * // get the polygon geometry
    * const poly = feature.getGeometry();
    *
    * // Render the feature as a point using the coordinates from labelPoint
    * feature.setGeometryName('labelPoint');
    *
    * // get the point geometry
    * const point = feature.getGeometry();
    * ```
    *
    * @api
    * @template {import("./geom/Geometry.js").default} [Geometry=import("./geom/Geometry.js").default]
    */
  @JSImport("ol", "Feature")
  @js.native
  /**
    * @param {Geometry|ObjectWithGeometry<Geometry>} [geometryOrProperties]
    *     You may pass a Geometry object directly, or an object literal containing
    *     properties. If you pass an object literal, you may include a Geometry
    *     associated with a `geometry` key.
    */
  open class Feature[Geometry /* <: typings.ol.geomGeometryMod.default */] ()
    extends typings.ol.featureMod.default[Geometry] {
    def this(geometryOrProperties: Geometry) = this()
    def this(geometryOrProperties: ObjectWithGeometry[Geometry]) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {boolean} [tracking=false] Start Tracking right after
    * instantiation.
    * @property {PositionOptions} [trackingOptions] Tracking options.
    * See https://www.w3.org/TR/geolocation-API/#position_options_interface.
    * @property {import("./proj.js").ProjectionLike} [projection] The projection the position
    * is reported in.
    */
  /**
    * @typedef {import("./ObjectEventType").Types|'change:accuracy'|'change:accuracyGeometry'|'change:altitude'|
    *    'change:altitudeAccuracy'|'change:heading'|'change:position'|'change:projection'|'change:speed'|'change:tracking'|
    *    'change:trackingOptions'} GeolocationObjectEventTypes
    */
  /***
    * @template Return
    * @typedef {import("./Observable").OnSignature<GeolocationObjectEventTypes, import("./Object").ObjectEvent, Return> &
    *   import("./Observable").OnSignature<'error', GeolocationError, Return> &
    *   import("./Observable").CombinedOnSignature<import("./Observable").EventTypes|GeolocationObjectEventTypes, Return> &
    *   import("./Observable").OnSignature<import("./Observable").EventTypes, import("./events/Event.js").default, Return>} GeolocationOnSignature
    */
  /**
    * @classdesc
    * Helper class for providing HTML5 Geolocation capabilities.
    * The [Geolocation API](https://www.w3.org/TR/geolocation-API/)
    * is used to locate a user's position.
    *
    * To get notified of position changes and errors, register listeners for the generic
    * `change` event and the `error` event on your instance of {@link module:ol/Geolocation~Geolocation}.
    *
    * Example:
    *
    *     const geolocation = new Geolocation({
    *       // take the projection to use from the map's view
    *       projection: view.getProjection()
    *     });
    *     // listen to changes in position
    *     geolocation.on('change', function(evt) {
    *       console.log(geolocation.getPosition());
    *     });
    *     // listen to error
    *     geolocation.on('error', function(evt) {
    *       window.console.log(evt.message);
    *     });
    *
    * @fires GeolocationError
    * @api
    */
  @JSImport("ol", "Geolocation")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class Geolocation ()
    extends typings.ol.geolocationMod.default {
    def this(options: typings.ol.geolocationMod.Options) = this()
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
  @JSImport("ol", "Graticule")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class Graticule ()
    extends typings.ol.layerGraticuleMod.default {
    def this(options: typings.ol.layerGraticuleMod.Options) = this()
  }
  
  /**
    * A function that takes an {@link module:ol/Image~ImageWrapper} for the image and a
    * `{string}` for the src as arguments. It is supposed to make it so the
    * underlying image {@link module:ol/Image~ImageWrapper#getImage} is assigned the
    * content specified by the src. If not specified, the default is
    *
    *     function(image, src) {
    *       image.getImage().src = src;
    *     }
    *
    * Providing a custom `imageLoadFunction` can be useful to load images with
    * post requests or - in general - through XHR requests, where the src of the
    * image element would be set to a data URI when the content is loaded.
    *
    * @typedef {function(ImageWrapper, string): void} LoadFunction
    * @api
    */
  @JSImport("ol", "Image")
  @js.native
  open class Image protected ()
    extends typings.ol.imageMod.default {
    /**
      * @param {import("./extent.js").Extent} extent Extent.
      * @param {number|undefined} resolution Resolution.
      * @param {number} pixelRatio Pixel ratio.
      * @param {string} src Image source URI.
      * @param {?string} crossOrigin Cross origin.
      * @param {LoadFunction} imageLoadFunction Image load function.
      * @param {CanvasRenderingContext2D} [context] Canvas context. When provided, the image will be
      *    drawn into the context's canvas, and `getImage()` will return the canvas once the image
      *    has finished loading.
      */
    def this(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      src: String,
      crossOrigin: String,
      imageLoadFunction: LoadFunction
    ) = this()
    def this(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      src: String,
      crossOrigin: Null,
      imageLoadFunction: LoadFunction
    ) = this()
    def this(
      extent: Extent,
      resolution: Unit,
      pixelRatio: Double,
      src: String,
      crossOrigin: String,
      imageLoadFunction: LoadFunction
    ) = this()
    def this(
      extent: Extent,
      resolution: Unit,
      pixelRatio: Double,
      src: String,
      crossOrigin: Null,
      imageLoadFunction: LoadFunction
    ) = this()
    def this(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      src: String,
      crossOrigin: String,
      imageLoadFunction: LoadFunction,
      context: CanvasRenderingContext2D
    ) = this()
    def this(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      src: String,
      crossOrigin: Null,
      imageLoadFunction: LoadFunction,
      context: CanvasRenderingContext2D
    ) = this()
    def this(
      extent: Extent,
      resolution: Unit,
      pixelRatio: Double,
      src: String,
      crossOrigin: String,
      imageLoadFunction: LoadFunction,
      context: CanvasRenderingContext2D
    ) = this()
    def this(
      extent: Extent,
      resolution: Unit,
      pixelRatio: Double,
      src: String,
      crossOrigin: Null,
      imageLoadFunction: LoadFunction,
      context: CanvasRenderingContext2D
    ) = this()
  }
  
  /**
    * @abstract
    */
  @JSImport("ol", "ImageBase")
  @js.native
  open class ImageBase protected ()
    extends typings.ol.imageBaseMod.default {
    /**
      * @param {import("./extent.js").Extent} extent Extent.
      * @param {number|undefined} resolution Resolution.
      * @param {number} pixelRatio Pixel ratio.
      * @param {import("./ImageState.js").default} state State.
      */
    def this(extent: Extent, resolution: Double, pixelRatio: Double, state: Any) = this()
    def this(extent: Extent, resolution: Unit, pixelRatio: Double, state: Any) = this()
  }
  
  /**
    * A function that is called to trigger asynchronous canvas drawing.  It is
    * called with a "done" callback that should be called when drawing is done.
    * If any error occurs during drawing, the "done" callback should be called with
    * that error.
    *
    * @typedef {function(function(Error=): void): void} Loader
    */
  @JSImport("ol", "ImageCanvas")
  @js.native
  open class ImageCanvas protected ()
    extends typings.ol.imageCanvasMod.default {
    /**
      * @param {import("./extent.js").Extent} extent Extent.
      * @param {number} resolution Resolution.
      * @param {number} pixelRatio Pixel ratio.
      * @param {HTMLCanvasElement} canvas Canvas.
      * @param {Loader} [loader] Optional loader function to
      *     support asynchronous canvas drawing.
      */
    def this(extent: Extent, resolution: Double, pixelRatio: Double, canvas: HTMLCanvasElement) = this()
    def this(extent: Extent, resolution: Double, pixelRatio: Double, canvas: HTMLCanvasElement, loader: Loader) = this()
  }
  
  @JSImport("ol", "ImageTile")
  @js.native
  open class ImageTile protected ()
    extends typings.ol.imageTileMod.default {
    /**
      * @param {import("./tilecoord.js").TileCoord} tileCoord Tile coordinate.
      * @param {import("./TileState.js").default} state State.
      * @param {string} src Image source URI.
      * @param {?string} crossOrigin Cross origin.
      * @param {import("./Tile.js").LoadFunction} tileLoadFunction Tile load function.
      * @param {import("./Tile.js").Options} [options] Tile options.
      */
    def this(
      tileCoord: TileCoord,
      state: Any,
      src: String,
      crossOrigin: String,
      tileLoadFunction: typings.ol.tileMod.LoadFunction
    ) = this()
    def this(
      tileCoord: TileCoord,
      state: Any,
      src: String,
      crossOrigin: Null,
      tileLoadFunction: typings.ol.tileMod.LoadFunction
    ) = this()
    def this(
      tileCoord: TileCoord,
      state: Any,
      src: String,
      crossOrigin: String,
      tileLoadFunction: typings.ol.tileMod.LoadFunction,
      options: typings.ol.tileMod.Options
    ) = this()
    def this(
      tileCoord: TileCoord,
      state: Any,
      src: String,
      crossOrigin: Null,
      tileLoadFunction: typings.ol.tileMod.LoadFunction,
      options: typings.ol.tileMod.Options
    ) = this()
  }
  
  /**
    * @module ol/Kinetic
    */
  /**
    * @classdesc
    * Implementation of inertial deceleration for map movement.
    *
    * @api
    */
  @JSImport("ol", "Kinetic")
  @js.native
  open class Kinetic protected ()
    extends typings.ol.kineticMod.default {
    /**
      * @param {number} decay Rate of decay (must be negative).
      * @param {number} minVelocity Minimum velocity (pixels/millisecond).
      * @param {number} delay Delay to consider to calculate the kinetic
      *     initial values (milliseconds).
      */
    def this(decay: Double, minVelocity: Double, delay: Double) = this()
  }
  
  /**
    * @classdesc
    * The map is the core component of OpenLayers. For a map to render, a view,
    * one or more layers, and a target container are needed:
    *
    *     import Map from 'ol/Map.js';
    *     import View from 'ol/View.js';
    *     import TileLayer from 'ol/layer/Tile.js';
    *     import OSM from 'ol/source/OSM.js';
    *
    *     const map = new Map({
    *       view: new View({
    *         center: [0, 0],
    *         zoom: 1,
    *       }),
    *       layers: [
    *         new TileLayer({
    *           source: new OSM(),
    *         }),
    *       ],
    *       target: 'map',
    *     });
    *
    * The above snippet creates a map using a {@link module:ol/layer/Tile~TileLayer} to
    * display {@link module:ol/source/OSM~OSM} OSM data and render it to a DOM
    * element with the id `map`.
    *
    * The constructor places a viewport container (with CSS class name
    * `ol-viewport`) in the target element (see `getViewport()`), and then two
    * further elements within the viewport: one with CSS class name
    * `ol-overlaycontainer-stopevent` for controls and some overlays, and one with
    * CSS class name `ol-overlaycontainer` for other overlays (see the `stopEvent`
    * option of {@link module:ol/Overlay~Overlay} for the difference). The map
    * itself is placed in a further element within the viewport.
    *
    * Layers are stored as a {@link module:ol/Collection~Collection} in
    * layerGroups. A top-level group is provided by the library. This is what is
    * accessed by `getLayerGroup` and `setLayerGroup`. Layers entered in the
    * options are added to this group, and `addLayer` and `removeLayer` change the
    * layer collection in the group. `getLayers` is a convenience function for
    * `getLayerGroup().getLayers()`. Note that {@link module:ol/layer/Group~LayerGroup}
    * is a subclass of {@link module:ol/layer/Base~BaseLayer}, so layers entered in the
    * options or added with `addLayer` can be groups, which can contain further
    * groups, and so on.
    *
    * @fires import("./MapBrowserEvent.js").MapBrowserEvent
    * @fires import("./MapEvent.js").MapEvent
    * @fires import("./render/Event.js").default#precompose
    * @fires import("./render/Event.js").default#postcompose
    * @fires import("./render/Event.js").default#rendercomplete
    * @api
    */
  @JSImport("ol", "Map")
  @js.native
  /**
    * @param {MapOptions} [options] Map options.
    */
  open class Map ()
    extends typings.ol.mapMod.default {
    def this(options: MapOptions) = this()
  }
  
  /**
    * @classdesc
    * Events emitted as map browser events are instances of this type.
    * See {@link module:ol/Map~Map} for which events trigger a map browser event.
    * @template {UIEvent} EVENT
    */
  @JSImport("ol", "MapBrowserEvent")
  @js.native
  open class MapBrowserEvent[EVENT /* <: UIEvent */] protected ()
    extends typings.ol.mapBrowserEventMod.default[EVENT] {
    /**
      * @param {string} type Event type.
      * @param {import("./Map.js").default} map Map.
      * @param {EVENT} originalEvent Original event.
      * @param {boolean} [dragging] Is the map currently being dragged?
      * @param {import("./Map.js").FrameState} [frameState] Frame state.
      * @param {Array<PointerEvent>} [activePointers] Active pointers.
      */
    def this(`type`: String, map: typings.ol.rendererMapMod.default, originalEvent: EVENT) = this()
    def this(`type`: String, map: typings.ol.rendererMapMod.default, originalEvent: EVENT, dragging: Boolean) = this()
    def this(
      `type`: String,
      map: typings.ol.rendererMapMod.default,
      originalEvent: EVENT,
      dragging: Boolean,
      frameState: FrameState
    ) = this()
    def this(
      `type`: String,
      map: typings.ol.rendererMapMod.default,
      originalEvent: EVENT,
      dragging: Unit,
      frameState: FrameState
    ) = this()
    def this(
      `type`: String,
      map: typings.ol.rendererMapMod.default,
      originalEvent: EVENT,
      dragging: Boolean,
      frameState: Unit,
      activePointers: js.Array[PointerEvent]
    ) = this()
    def this(
      `type`: String,
      map: typings.ol.rendererMapMod.default,
      originalEvent: EVENT,
      dragging: Boolean,
      frameState: FrameState,
      activePointers: js.Array[PointerEvent]
    ) = this()
    def this(
      `type`: String,
      map: typings.ol.rendererMapMod.default,
      originalEvent: EVENT,
      dragging: Unit,
      frameState: Unit,
      activePointers: js.Array[PointerEvent]
    ) = this()
    def this(
      `type`: String,
      map: typings.ol.rendererMapMod.default,
      originalEvent: EVENT,
      dragging: Unit,
      frameState: FrameState,
      activePointers: js.Array[PointerEvent]
    ) = this()
  }
  
  @JSImport("ol", "MapBrowserEventHandler")
  @js.native
  open class MapBrowserEventHandler protected ()
    extends typings.ol.mapBrowserEventHandlerMod.default {
    /**
      * @param {import("./Map.js").default} map The map with the viewport to listen to events on.
      * @param {number} [moveTolerance] The minimal distance the pointer must travel to trigger a move.
      */
    def this(map: typings.ol.rendererMapMod.default) = this()
    def this(map: typings.ol.rendererMapMod.default, moveTolerance: Double) = this()
  }
  
  /**
    * @classdesc
    * Events emitted as map events are instances of this type.
    * See {@link module:ol/Map~Map} for which events trigger a map event.
    */
  @JSImport("ol", "MapEvent")
  @js.native
  open class MapEvent protected ()
    extends typings.ol.mapEventMod.default {
    /**
      * @param {string} type Event type.
      * @param {import("./Map.js").default} map Map.
      * @param {?import("./Map.js").FrameState} [frameState] Frame state.
      */
    def this(`type`: String, map: typings.ol.rendererMapMod.default) = this()
    def this(`type`: String, map: typings.ol.rendererMapMod.default, frameState: FrameState) = this()
  }
  
  /***
    * @template Return
    * @typedef {import("./Observable").OnSignature<import("./Observable").EventTypes, import("./events/Event.js").default, Return> &
    *    import("./Observable").OnSignature<import("./ObjectEventType").Types, ObjectEvent, Return> &
    *    import("./Observable").CombinedOnSignature<import("./Observable").EventTypes|import("./ObjectEventType").Types, Return>} ObjectOnSignature
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Most non-trivial classes inherit from this.
    *
    * This extends {@link module:ol/Observable~Observable} with observable
    * properties, where each property is observable as well as the object as a
    * whole.
    *
    * Classes that inherit from this have pre-defined properties, to which you can
    * add your owns. The pre-defined properties are listed in this documentation as
    * 'Observable Properties', and have their own accessors; for example,
    * {@link module:ol/Map~Map} has a `target` property, accessed with
    * `getTarget()` and changed with `setTarget()`. Not all properties are however
    * settable. There are also general-purpose accessors `get()` and `set()`. For
    * example, `get('target')` is equivalent to `getTarget()`.
    *
    * The `set` accessors trigger a change event, and you can monitor this by
    * registering a listener. For example, {@link module:ol/View~View} has a
    * `center` property, so `view.on('change:center', function(evt) {...});` would
    * call the function whenever the value of the center property changes. Within
    * the function, `evt.target` would be the view, so `evt.target.getCenter()`
    * would return the new center.
    *
    * You can add your own observable properties with
    * `object.set('prop', 'value')`, and retrieve that with `object.get('prop')`.
    * You can listen for changes on that property value with
    * `object.on('change:prop', listener)`. You can get a list of all
    * properties with {@link module:ol/Object~BaseObject#getProperties}.
    *
    * Note that the observable properties are separate from standard JS properties.
    * You can, for example, give your map object a title with
    * `map.title='New title'` and with `map.set('title', 'Another title')`. The
    * first will be a `hasOwnProperty`; the second will appear in
    * `getProperties()`. Only the second is observable.
    *
    * Properties can be deleted by using the unset method. E.g.
    * object.unset('foo').
    *
    * @fires ObjectEvent
    * @api
    */
  @JSImport("ol", "Object")
  @js.native
  /**
    * @param {Object<string, *>} [values] An object with key-value pairs.
    */
  open class Object ()
    extends typings.ol.objectMod.default {
    def this(values: StringDictionary[Any]) = this()
  }
  
  /***
    * @template {string} Type
    * @template {Event|import("./events/Event.js").default} EventClass
    * @template Return
    * @typedef {(type: Type, listener: (event: EventClass) => ?) => Return} OnSignature
    */
  /***
    * @template {string} Type
    * @template Return
    * @typedef {(type: Type[], listener: (event: Event|import("./events/Event").default) => ?) => Return extends void ? void : Return[]} CombinedOnSignature
    */
  /**
    * @typedef {'change'|'error'} EventTypes
    */
  /***
    * @template Return
    * @typedef {OnSignature<EventTypes, import("./events/Event.js").default, Return> & CombinedOnSignature<EventTypes, Return>} ObservableOnSignature
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * An event target providing convenient methods for listener registration
    * and unregistration. A generic `change` event is always available through
    * {@link module:ol/Observable~Observable#changed}.
    *
    * @fires import("./events/Event.js").default
    * @api
    */
  @JSImport("ol", "Observable")
  @js.native
  open class Observable ()
    extends typings.ol.observableMod.default
  
  /**
    * @typedef {import("./ObjectEventType").Types|'change:element'|'change:map'|'change:offset'|'change:position'|
    *   'change:positioning'} OverlayObjectEventTypes
    */
  /***
    * @template Return
    * @typedef {import("./Observable").OnSignature<import("./Observable").EventTypes, import("./events/Event.js").default, Return> &
    *   import("./Observable").OnSignature<OverlayObjectEventTypes, import("./Object").ObjectEvent, Return> &
    *   import("./Observable").CombinedOnSignature<import("./Observable").EventTypes|OverlayObjectEventTypes, Return>} OverlayOnSignature
    */
  /**
    * @classdesc
    * An element to be displayed over the map and attached to a single map
    * location.  Like {@link module:ol/control/Control~Control}, Overlays are
    * visible widgets. Unlike Controls, they are not in a fixed position on the
    * screen, but are tied to a geographical coordinate, so panning the map will
    * move an Overlay but not a Control.
    *
    * Example:
    *
    *     import Overlay from 'ol/Overlay.js';
    *
    *     // ...
    *     const popup = new Overlay({
    *       element: document.getElementById('popup'),
    *     });
    *     popup.setPosition(coordinate);
    *     map.addOverlay(popup);
    *
    * @api
    */
  @JSImport("ol", "Overlay")
  @js.native
  open class Overlay protected ()
    extends typings.ol.overlayMod.default {
    /**
      * @param {Options} options Overlay options.
      */
    def this(options: typings.ol.overlayMod.Options) = this()
  }
  
  /**
    * A function that takes an {@link module:ol/Tile~Tile} for the tile and a
    * `{string}` for the url as arguments. The default is
    * ```js
    * source.setTileLoadFunction(function(tile, src) {
    *   tile.getImage().src = src;
    * });
    * ```
    * For more fine grained control, the load function can use fetch or XMLHttpRequest and involve
    * error handling:
    *
    * ```js
    * import TileState from 'ol/TileState.js';
    *
    * source.setTileLoadFunction(function(tile, src) {
    *   const xhr = new XMLHttpRequest();
    *   xhr.responseType = 'blob';
    *   xhr.addEventListener('loadend', function (evt) {
    *     const data = this.response;
    *     if (data !== undefined) {
    *       tile.getImage().src = URL.createObjectURL(data);
    *     } else {
    *       tile.setState(TileState.ERROR);
    *     }
    *   });
    *   xhr.addEventListener('error', function () {
    *     tile.setState(TileState.ERROR);
    *   });
    *   xhr.open('GET', src);
    *   xhr.send();
    * });
    * ```
    *
    * @typedef {function(Tile, string): void} LoadFunction
    * @api
    */
  /**
    * {@link module:ol/source/Tile~TileSource} sources use a function of this type to get
    * the url that provides a tile for a given tile coordinate.
    *
    * This function takes an {@link module:ol/tilecoord~TileCoord} for the tile
    * coordinate, a `{number}` representing the pixel ratio and a
    * {@link module:ol/proj/Projection~Projection} for the projection  as arguments
    * and returns a `{string}` representing the tile URL, or undefined if no tile
    * should be requested for the passed tile coordinate.
    *
    * @typedef {function(import("./tilecoord.js").TileCoord, number,
    *           import("./proj/Projection.js").default): (string|undefined)} UrlFunction
    * @api
    */
  /**
    * @typedef {Object} Options
    * @property {number} [transition=250] A duration for tile opacity
    * transitions in milliseconds. A duration of 0 disables the opacity transition.
    * @property {boolean} [interpolate=false] Use interpolated values when resampling.  By default,
    * the nearest neighbor is used when resampling.
    * @api
    */
  /**
    * @classdesc
    * Base class for tiles.
    *
    * @abstract
    */
  @JSImport("ol", "Tile")
  @js.native
  open class Tile protected ()
    extends typings.ol.tileMod.default {
    /**
      * @param {import("./tilecoord.js").TileCoord} tileCoord Tile coordinate.
      * @param {import("./TileState.js").default} state State.
      * @param {Options} [options] Tile options.
      */
    def this(tileCoord: TileCoord, state: Any) = this()
    def this(tileCoord: TileCoord, state: Any, options: typings.ol.tileMod.Options) = this()
  }
  
  @JSImport("ol", "TileCache")
  @js.native
  open class TileCache ()
    extends typings.ol.tileCacheMod.default {
    def this(highWaterMark: Double) = this()
  }
  
  /**
    * @typedef {function(import("./Tile.js").default, string, import("./coordinate.js").Coordinate, number): number} PriorityFunction
    */
  @JSImport("ol", "TileQueue")
  @js.native
  open class TileQueue protected ()
    extends typings.ol.tileQueueMod.default {
    /**
      * @param {PriorityFunction} tilePriorityFunction Tile priority function.
      * @param {function(): ?} tileChangeCallback Function called on each tile change event.
      */
    def this(tilePriorityFunction: PriorityFunction, tileChangeCallback: js.Function0[Any]) = this()
  }
  
  /**
    * @module ol/TileRange
    */
  /**
    * A representation of a contiguous block of tiles.  A tile range is specified
    * by its min/max tile coordinates and is inclusive of coordinates.
    */
  @JSImport("ol", "TileRange")
  @js.native
  open class TileRange protected ()
    extends typings.ol.tileRangeMod.default {
    /**
      * @param {number} minX Minimum X.
      * @param {number} maxX Maximum X.
      * @param {number} minY Minimum Y.
      * @param {number} maxY Maximum Y.
      */
    def this(minX: Double, maxX: Double, minY: Double, maxY: Double) = this()
  }
  
  @JSImport("ol", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  @JSImport("ol", "VectorRenderTile")
  @js.native
  open class VectorRenderTile protected ()
    extends typings.ol.vectorRenderTileMod.default {
    /**
      * @param {import("./tilecoord.js").TileCoord} tileCoord Tile coordinate.
      * @param {import("./TileState.js").default} state State.
      * @param {import("./tilecoord.js").TileCoord} urlTileCoord Wrapped tile coordinate for source urls.
      * @param {function(VectorRenderTile):Array<import("./VectorTile").default>} getSourceTiles Function
      * to get source tiles for this tile.
      */
    def this(
      tileCoord: TileCoord,
      state: Any,
      urlTileCoord: TileCoord,
      getSourceTiles: js.Function1[
            /* arg0 */ typings.ol.vectorRenderTileMod.VectorRenderTile, 
            js.Array[typings.ol.vectorTileMod.default]
          ]
    ) = this()
  }
  
  @JSImport("ol", "VectorTile")
  @js.native
  open class VectorTile protected ()
    extends typings.ol.vectorTileMod.default {
    /**
      * @param {import("./tilecoord.js").TileCoord} tileCoord Tile coordinate.
      * @param {import("./TileState.js").default} state State.
      * @param {string} src Data source url.
      * @param {import("./format/Feature.js").default} format Feature format.
      * @param {import("./Tile.js").LoadFunction} tileLoadFunction Tile load function.
      * @param {import("./Tile.js").Options} [options] Tile options.
      */
    def this(
      tileCoord: TileCoord,
      state: Any,
      src: String,
      format: typings.ol.renderFeatureMod.default,
      tileLoadFunction: typings.ol.tileMod.LoadFunction
    ) = this()
    def this(
      tileCoord: TileCoord,
      state: Any,
      src: String,
      format: typings.ol.renderFeatureMod.default,
      tileLoadFunction: typings.ol.tileMod.LoadFunction,
      options: typings.ol.tileMod.Options
    ) = this()
  }
  
  /**
    * @typedef {import("./ObjectEventType").Types|'change:center'|'change:resolution'|'change:rotation'} ViewObjectEventTypes
    */
  /***
    * @template Return
    * @typedef {import("./Observable").OnSignature<import("./Observable").EventTypes, import("./events/Event.js").default, Return> &
    *   import("./Observable").OnSignature<ViewObjectEventTypes, import("./Object").ObjectEvent, Return> &
    *   import("./Observable").CombinedOnSignature<import("./Observable").EventTypes|ViewObjectEventTypes, Return>} ViewOnSignature
    */
  /**
    * @classdesc
    * A View object represents a simple 2D view of the map.
    *
    * This is the object to act upon to change the center, resolution,
    * and rotation of the map.
    *
    * A View has a `projection`. The projection determines the
    * coordinate system of the center, and its units determine the units of the
    * resolution (projection units per pixel). The default projection is
    * Web Mercator (EPSG:3857).
    *
    * ### The view states
    *
    * A View is determined by three states: `center`, `resolution`,
    * and `rotation`. Each state has a corresponding getter and setter, e.g.
    * `getCenter` and `setCenter` for the `center` state.
    *
    * The `zoom` state is actually not saved on the view: all computations
    * internally use the `resolution` state. Still, the `setZoom` and `getZoom`
    * methods are available, as well as `getResolutionForZoom` and
    * `getZoomForResolution` to switch from one system to the other.
    *
    * ### The constraints
    *
    * `setCenter`, `setResolution` and `setRotation` can be used to change the
    * states of the view, but any constraint defined in the constructor will
    * be applied along the way.
    *
    * A View object can have a *resolution constraint*, a *rotation constraint*
    * and a *center constraint*.
    *
    * The *resolution constraint* typically restricts min/max values and
    * snaps to specific resolutions. It is determined by the following
    * options: `resolutions`, `maxResolution`, `maxZoom` and `zoomFactor`.
    * If `resolutions` is set, the other three options are ignored. See
    * documentation for each option for more information. By default, the view
    * only has a min/max restriction and allow intermediary zoom levels when
    * pinch-zooming for example.
    *
    * The *rotation constraint* snaps to specific angles. It is determined
    * by the following options: `enableRotation` and `constrainRotation`.
    * By default rotation is allowed and its value is snapped to zero when approaching the
    * horizontal.
    *
    * The *center constraint* is determined by the `extent` option. By
    * default the view center is not constrained at all.
    *
    * ### Changing the view state
    *
    * It is important to note that `setZoom`, `setResolution`, `setCenter` and
    * `setRotation` are subject to the above mentioned constraints. As such, it
    * may sometimes not be possible to know in advance the resulting state of the
    * View. For example, calling `setResolution(10)` does not guarantee that
    * `getResolution()` will return `10`.
    *
    * A consequence of this is that, when applying a delta on the view state, one
    * should use `adjustCenter`, `adjustRotation`, `adjustZoom` and `adjustResolution`
    * rather than the corresponding setters. This will let view do its internal
    * computations. Besides, the `adjust*` methods also take an `anchor`
    * argument which allows specifying an origin for the transformation.
    *
    * ### Interacting with the view
    *
    * View constraints are usually only applied when the view is *at rest*, meaning that
    * no interaction or animation is ongoing. As such, if the user puts the view in a
    * state that is not equivalent to a constrained one (e.g. rotating the view when
    * the snap angle is 0), an animation will be triggered at the interaction end to
    * put back the view to a stable state;
    *
    * @api
    */
  @JSImport("ol", "View")
  @js.native
  /**
    * @param {ViewOptions} [options] View options.
    */
  open class View ()
    extends typings.ol.viewMod.default {
    def this(options: ViewOptions) = this()
  }
  
  inline def getUid(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUid")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
}
