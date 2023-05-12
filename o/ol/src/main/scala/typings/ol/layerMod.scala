package typings.ol

import typings.ol.layerGraticuleMod.Options
import typings.ol.layerGraticuleMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerMod {
  
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
  @JSImport("ol/layer", "Graticule")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class Graticule () extends default {
    def this(options: Options) = this()
  }
  
  /**
    * @classdesc
    * A {@link module:ol/Collection~Collection} of layers that are handled together.
    *
    * A generic `change` event is triggered when the group/Collection changes.
    *
    * @api
    */
  @JSImport("ol/layer", "Group")
  @js.native
  /**
    * @param {Options} [options] Layer options.
    */
  open class Group ()
    extends typings.ol.layerGroupMod.default {
    def this(options: typings.ol.layerGroupMod.Options) = this()
  }
  
  /**
    * @classdesc
    * Layer for rendering vector data as a heatmap.
    * Note that any property set in the options is set as a {@link module:ol/Object~BaseObject}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @fires import("../render/Event.js").RenderEvent
    * @extends {BaseVector<import("../source/Vector.js").default, WebGLPointsLayerRenderer>}
    * @api
    */
  @JSImport("ol/layer", "Heatmap")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class Heatmap ()
    extends typings.ol.layerHeatmapMod.default {
    def this(options: typings.ol.layerHeatmapMod.Options) = this()
  }
  
  /**
    * @classdesc
    * Server-rendered images that are available for arbitrary extents and
    * resolutions.
    * Note that any property set in the options is set as a {@link module:ol/Object~BaseObject}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @template {import("../source/Image.js").default} ImageSourceType
    * @extends {BaseImageLayer<ImageSourceType, CanvasImageLayerRenderer>}
    * @api
    */
  @JSImport("ol/layer", "Image")
  @js.native
  /**
    * @param {import("./BaseImage.js").Options<ImageSourceType>} [options] Layer options.
    */
  open class Image[ImageSourceType /* <: typings.ol.styleImageMod.default */] ()
    extends typings.ol.layerImageMod.default[ImageSourceType] {
    def this(options: typings.ol.layerBaseImageMod.Options[ImageSourceType]) = this()
  }
  
  /**
    * @typedef {function(import("../Map.js").FrameState):HTMLElement} RenderFunction
    */
  /**
    * @typedef {'sourceready'|'change:source'} LayerEventType
    */
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("./Base").BaseLayerObjectEventTypes|
    *     LayerEventType, import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<import("../render/EventType").LayerRenderEventTypes, import("../render/Event").default, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("./Base").BaseLayerObjectEventTypes|LayerEventType|
    *     import("../render/EventType").LayerRenderEventTypes, Return>} LayerOnSignature
    */
  /**
    * @template {import("../source/Source.js").default} [SourceType=import("../source/Source.js").default]
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
    * @property {SourceType} [source] Source for this layer.  If not provided to the constructor,
    * the source can be set by calling {@link module:ol/layer/Layer~Layer#setSource layer.setSource(source)} after
    * construction.
    * @property {import("../Map.js").default|null} [map] Map.
    * @property {RenderFunction} [render] Render function. Takes the frame state as input and is expected to return an
    * HTML element. Will overwrite the default rendering for the layer.
    * @property {Object<string, *>} [properties] Arbitrary observable properties. Can be accessed with `#get()` and `#set()`.
    */
  /**
    * @typedef {Object} State
    * @property {import("./Layer.js").default} layer Layer.
    * @property {number} opacity Opacity, the value is rounded to two digits to appear after the decimal point.
    * @property {boolean} visible Visible.
    * @property {boolean} managed Managed.
    * @property {import("../extent.js").Extent} [extent] Extent.
    * @property {number} zIndex ZIndex.
    * @property {number} maxResolution Maximum resolution.
    * @property {number} minResolution Minimum resolution.
    * @property {number} minZoom Minimum zoom.
    * @property {number} maxZoom Maximum zoom.
    */
  /**
    * @classdesc
    * Base class from which all layer types are derived. This should only be instantiated
    * in the case where a custom layer is added to the map with a custom `render` function.
    * Such a function can be specified in the `options` object, and is expected to return an HTML element.
    *
    * A visual representation of raster or vector map data.
    * Layers group together those properties that pertain to how the data is to be
    * displayed, irrespective of the source of that data.
    *
    * Layers are usually added to a map with [map.addLayer()]{@link import("../Map.js").default#addLayer}.
    * Components like {@link module:ol/interaction/Draw~Draw} use unmanaged layers
    * internally. These unmanaged layers are associated with the map using
    * [layer.setMap()]{@link module:ol/layer/Layer~Layer#setMap} instead.
    *
    * A generic `change` event is fired when the state of the source changes.
    * A `sourceready` event is fired when the layer's source is ready.
    *
    * @fires import("../render/Event.js").RenderEvent#prerender
    * @fires import("../render/Event.js").RenderEvent#postrender
    * @fires import("../events/Event.js").BaseEvent#sourceready
    *
    * @template {import("../source/Source.js").default} [SourceType=import("../source/Source.js").default]
    * @template {import("../renderer/Layer.js").default} [RendererType=import("../renderer/Layer.js").default]
    * @api
    */
  @JSImport("ol/layer", "Layer")
  @js.native
  open class Layer[SourceType /* <: typings.ol.sourceSourceMod.default */, RendererType /* <: typings.ol.layerLayerMod.default[Any, /* ol.ol/layer/Layer.default<any> */ Any] */] protected ()
    extends typings.ol.layerLayerMod.default[SourceType, RendererType] {
    /**
      * @param {Options<SourceType>} options Layer options.
      */
    def this(options: typings.ol.layerLayerMod.Options[SourceType]) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {string} styleUrl The URL of the Mapbox style object to use for this layer.  For a
    * style created with Mapbox Studio and hosted on Mapbox, this will look like
    * 'mapbox://styles/you/your-style'.
    * @property {string} [accessToken] The access token for your Mapbox style. This has to be provided
    * for `mapbox://` style urls. For `https://` and other urls, any access key must be the last query
    * parameter of the style url.
    * @property {string} [source] If your style uses more than one source, you need to use either the
    * `source` property or the `layers` property to limit rendering to a single vector source.  The
    * `source` property corresponds to the id of a vector source in your Mapbox style.
    * @property {Array<string>} [layers] Limit rendering to the list of included layers.  All layers
    * must share the same vector source.  If your style uses more than one source, you need to use
    * either the `source` property or the `layers` property to limit rendering to a single vector
    * source.
    * @property {boolean} [declutter=true] Declutter images and text. Decluttering is applied to all
    * image and text styles of all Vector and VectorTile layers that have set this to `true`. The priority
    * is defined by the z-index of the layer, the `zIndex` of the style and the render order of features.
    * Higher z-index means higher priority. Within the same z-index, a feature rendered before another has
    * higher priority.
    *
    * As an optimization decluttered features from layers with the same `className` are rendered above
    * the fill and stroke styles of all of those layers regardless of z-index.  To opt out of this
    * behavior and place declutterd features with their own layer configure the layer with a `className`
    * other than `ol-layer`.
    * @property {import("./Base.js").BackgroundColor|false} [background] Background color for the layer.
    * If not specified, the background from the Mapbox style object will be used. Set to `false` to prevent
    * the Mapbox style's background from being used.
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
    * be visible. If neither `maxResolution` nor `minZoom` are defined, the layer's `maxResolution` will
    * match the style source's `minzoom`.
    * @property {number} [minZoom] The minimum view zoom level (exclusive) above which this layer will
    * be visible. If neither `maxResolution` nor `minZoom` are defined, the layer's `minZoom` will match
    * the style source's `minzoom`.
    * @property {number} [maxZoom] The maximum view zoom level (inclusive) at which this layer will
    * be visible.
    * @property {import("../render.js").OrderFunction} [renderOrder] Render order. Function to be used when sorting
    * features before rendering. By default features are drawn in the order that they are created. Use
    * `null` to avoid the sort, but get an undefined draw order.
    * @property {number} [renderBuffer=100] The buffer in pixels around the tile extent used by the
    * renderer when getting features from the vector tile for the rendering or hit-detection.
    * Recommended value: Vector tiles are usually generated with a buffer, so this value should match
    * the largest possible buffer of the used tiles. It should be at least the size of the largest
    * point symbol or line width.
    * @property {import("./VectorTile.js").VectorTileRenderType} [renderMode='hybrid'] Render mode for vector tiles:
    *  * `'hybrid'`: Polygon and line elements are rendered as images, so pixels are scaled during zoom
    *    animations. Point symbols and texts are accurately rendered as vectors and can stay upright on
    *    rotated views.
    *  * `'vector'`: Everything is rendered as vectors. Use this mode for improved performance on vector
    *    tile layers with only a few rendered features (e.g. for highlighting a subset of features of
    *    another layer with the same source).
    * @property {import("../Map.js").default} [map] Sets the layer as overlay on a map. The map will not manage
    * this layer in its layers collection, and the layer will be rendered on top. This is useful for
    * temporary layers. The standard way to add a layer to a map and have it managed by the map is to
    * use [map.addLayer()]{@link import("../Map.js").default#addLayer}.
    * @property {boolean} [updateWhileAnimating=false] When set to `true`, feature batches will be
    * recreated during animations. This means that no vectors will be shown clipped, but the setting
    * will have a performance impact for large amounts of vector data. When set to `false`, batches
    * will be recreated when no animation is active.
    * @property {boolean} [updateWhileInteracting=false] When set to `true`, feature batches will be
    * recreated during interactions. See also `updateWhileAnimating`.
    * @property {number} [preload=0] Preload. Load low-resolution tiles up to `preload` levels. `0`
    * means no preloading.
    * @property {boolean} [useInterimTilesOnError=true] Use interim tiles on error.
    * @property {Object<string, *>} [properties] Arbitrary observable properties. Can be accessed with `#get()` and `#set()`.
    */
  /**
    * @classdesc
    * A vector tile layer based on a Mapbox style that uses a single vector source.  Configure
    * the layer with the `styleUrl` and `accessToken` shown in Mapbox Studio's share panel.
    * If the style uses more than one source, use the `source` property to choose a single
    * vector source.  If you want to render a subset of the layers in the style, use the `layers`
    * property (all layers must share the same vector source).  See the constructor options for
    * more detail.
    *
    *     const map = new Map({
    *       view: new View({
    *         center: [0, 0],
    *         zoom: 1,
    *       }),
    *       layers: [
    *         new MapboxVectorLayer({
    *           styleUrl: 'mapbox://styles/mapbox/bright-v9',
    *           accessToken: 'your-mapbox-access-token-here',
    *         }),
    *       ],
    *       target: 'map',
    *     });
    *
    * On configuration or loading error, the layer will trigger an `'error'` event.  Listeners
    * will receive an object with an `error` property that can be used to diagnose the problem.
    *
    * **Note for users of the full build**: The `MapboxVectorLayer` requires the
    * [ol-mapbox-style](https://github.com/openlayers/ol-mapbox-style) library to be loaded as well.
    *
    * @param {Options} options Options.
    * @extends {VectorTileLayer}
    * @fires module:ol/events/Event~BaseEvent#event:error
    * @api
    */
  @JSImport("ol/layer", "MapboxVector")
  @js.native
  open class MapboxVector protected ()
    extends typings.ol.layerMapboxVectorMod.default {
    /**
      * @param {Options} options Layer options.  At a minimum, `styleUrl` and `accessToken`
      * must be provided.
      */
    def this(options: typings.ol.layerMapboxVectorMod.Options) = this()
  }
  
  /**
    * @classdesc
    * For layer sources that provide pre-rendered, tiled images in grids that are
    * organized by zoom levels for specific resolutions.
    * Note that any property set in the options is set as a {@link module:ol/Object~BaseObject}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @template {import("../source/Tile.js").default} TileSourceType
    * @extends BaseTileLayer<TileSourceType, CanvasTileLayerRenderer>
    * @api
    */
  @JSImport("ol/layer", "Tile")
  @js.native
  /**
    * @param {import("./BaseTile.js").Options<TileSourceType>} [options] Tile layer options.
    */
  open class Tile[TileSourceType /* <: typings.ol.tileMod.default */] ()
    extends typings.ol.layerTileMod.default[TileSourceType] {
    def this(options: typings.ol.layerBaseTileMod.Options[TileSourceType]) = this()
  }
  
  /**
    * @classdesc
    * Vector data is rendered client-side, as vectors. This layer type provides most accurate rendering
    * even during animations. Points and labels stay upright on rotated views. For very large
    * amounts of vector data, performance may suffer during pan and zoom animations. In this case,
    * try {@link module:ol/layer/VectorImage~VectorImageLayer}.
    *
    * Note that any property set in the options is set as a {@link module:ol/Object~BaseObject}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @template {import("../source/Vector.js").default} VectorSourceType
    * @extends {BaseVectorLayer<VectorSourceType, CanvasVectorLayerRenderer>}
    * @api
    */
  @JSImport("ol/layer", "Vector")
  @js.native
  /**
    * @param {import("./BaseVector.js").Options<VectorSourceType>} [options] Options.
    */
  open class Vector[VectorSourceType /* <: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] */] ()
    extends typings.ol.layerVectorMod.default[VectorSourceType] {
    def this(options: typings.ol.layerBaseVectorMod.Options[VectorSourceType]) = this()
  }
  
  /**
    * @template {import("../source/Vector.js").default} VectorSourceType
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
    * @property {import("../render.js").OrderFunction} [renderOrder] Render order. Function to be used when sorting
    * features before rendering. By default features are drawn in the order that they are created. Use
    * `null` to avoid the sort, but get an undefined draw order.
    * @property {number} [renderBuffer=100] The buffer in pixels around the viewport extent used by the
    * renderer when getting features from the vector source for the rendering or hit-detection.
    * Recommended value: the size of the largest symbol, line width or label.
    * @property {VectorSourceType} [source] Source.
    * @property {import("../Map.js").default} [map] Sets the layer as overlay on a map. The map will not manage
    * this layer in its layers collection, and the layer will be rendered on top. This is useful for
    * temporary layers. The standard way to add a layer to a map and have it managed by the map is to
    * use [map.addLayer()]{@link import("../Map.js").default#addLayer}.
    * @property {boolean} [declutter=false] Declutter images and text on this layer. The priority is defined
    * by the `zIndex` of the style and the render order of features. Higher z-index means higher priority.
    * Within the same z-index, a feature rendered before another has higher priority.
    * @property {import("../style/Style.js").StyleLike|null} [style] Layer style. When set to `null`, only
    * features that have their own style will be rendered. See {@link module:ol/style/Style~Style} for the default style
    * which will be used if this is not set.
    * @property {number} [imageRatio=1] Ratio by which the rendered extent should be larger than the
    * viewport extent. A larger ratio avoids cut images during panning, but will cause a decrease in performance.
    * @property {Object<string, *>} [properties] Arbitrary observable properties. Can be accessed with `#get()` and `#set()`.
    */
  /**
    * @classdesc
    * Vector data is rendered client-side, to an image. This layer type provides great performance
    * during panning and zooming, but point symbols and texts are always rotated with the view and
    * pixels are scaled during zoom animations. For more accurate rendering of vector data, use
    * {@link module:ol/layer/Vector~VectorLayer} instead.
    *
    * Note that any property set in the options is set as a {@link module:ol/Object~BaseObject}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @template {import("../source/Vector.js").default} VectorSourceType
    * @extends {BaseVectorLayer<VectorSourceType, CanvasVectorImageLayerRenderer>}
    * @api
    */
  @JSImport("ol/layer", "VectorImage")
  @js.native
  /**
    * @param {Options<VectorSourceType>} [options] Options.
    */
  open class VectorImage[VectorSourceType /* <: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] */] ()
    extends typings.ol.layerVectorImageMod.default[VectorSourceType] {
    def this(options: typings.ol.layerVectorImageMod.Options[VectorSourceType]) = this()
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("./Base").BaseLayerObjectEventTypes|
    *     import("./Layer.js").LayerEventType|'change:preload'|'change:useInterimTilesOnError', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<import("../render/EventType").LayerRenderEventTypes, import("../render/Event").default, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("./Base").BaseLayerObjectEventTypes|
    *     import("./Layer.js").LayerEventType|'change:preload'|'change:useInterimTilesOnError'|import("../render/EventType").LayerRenderEventTypes, Return>} VectorTileLayerOnSignature
    */
  /**
    * @typedef {'hybrid' | 'vector'} VectorTileRenderType
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
    * @property {import("../render.js").OrderFunction} [renderOrder] Render order. Function to be used when sorting
    * features before rendering. By default features are drawn in the order that they are created. Use
    * `null` to avoid the sort, but get an undefined draw order.
    * @property {number} [renderBuffer=100] The buffer in pixels around the tile extent used by the
    * renderer when getting features from the vector tile for the rendering or hit-detection.
    * Recommended value: Vector tiles are usually generated with a buffer, so this value should match
    * the largest possible buffer of the used tiles. It should be at least the size of the largest
    * point symbol or line width.
    * @property {VectorTileRenderType} [renderMode='hybrid'] Render mode for vector tiles:
    *  * `'hybrid'`: Polygon and line elements are rendered as images, so pixels are scaled during zoom
    *    animations. Point symbols and texts are accurately rendered as vectors and can stay upright on
    *    rotated views.
    *  * `'vector'`: Everything is rendered as vectors. Use this mode for improved performance on vector
    *    tile layers with only a few rendered features (e.g. for highlighting a subset of features of
    *    another layer with the same source).
    * @property {import("../source/VectorTile.js").default} [source] Source.
    * @property {import("../Map.js").default} [map] Sets the layer as overlay on a map. The map will not manage
    * this layer in its layers collection, and the layer will be rendered on top. This is useful for
    * temporary layers. The standard way to add a layer to a map and have it managed by the map is to
    * use [map.addLayer()]{@link import("../Map.js").default#addLayer}.
    * @property {boolean} [declutter=false] Declutter images and text. Decluttering is applied to all
    * image and text styles of all Vector and VectorTile layers that have set this to `true`. The priority
    * is defined by the z-index of the layer, the `zIndex` of the style and the render order of features.
    * Higher z-index means higher priority. Within the same z-index, a feature rendered before another has
    * higher priority.
    *
    * As an optimization decluttered features from layers with the same `className` are rendered above
    * the fill and stroke styles of all of those layers regardless of z-index.  To opt out of this
    * behavior and place declutterd features with their own layer configure the layer with a `className`
    * other than `ol-layer`.
    * @property {import("../style/Style.js").StyleLike|null} [style] Layer style. When set to `null`, only
    * features that have their own style will be rendered. See {@link module:ol/style/Style~Style} for the default style
    * which will be used if this is not set.
    * @property {import("./Base.js").BackgroundColor|false} [background] Background color for the layer. If not specified, no
    * background will be rendered.
    * @property {boolean} [updateWhileAnimating=false] When set to `true`, feature batches will be
    * recreated during animations. This means that no vectors will be shown clipped, but the setting
    * will have a performance impact for large amounts of vector data. When set to `false`, batches
    * will be recreated when no animation is active.
    * @property {boolean} [updateWhileInteracting=false] When set to `true`, feature batches will be
    * recreated during interactions. See also `updateWhileAnimating`.
    * @property {number} [preload=0] Preload. Load low-resolution tiles up to `preload` levels. `0`
    * means no preloading.
    * @property {boolean} [useInterimTilesOnError=true] Use interim tiles on error.
    * @property {Object<string, *>} [properties] Arbitrary observable properties. Can be accessed with `#get()` and `#set()`.
    */
  /**
    * @classdesc
    * Layer for vector tile data that is rendered client-side.
    * Note that any property set in the options is set as a {@link module:ol/Object~BaseObject}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @param {Options} [options] Options.
    * @extends {BaseVectorLayer<import("../source/VectorTile.js").default, CanvasVectorTileLayerRenderer>}
    * @api
    */
  @JSImport("ol/layer", "VectorTile")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class VectorTile ()
    extends typings.ol.layerVectorTileMod.default {
    def this(options: typings.ol.layerVectorTileMod.Options) = this()
  }
  
  /**
    * @template {import("../source/Vector.js").default<import("../geom/Point.js").default>} VectorSourceType
    * @typedef {Object} Options
    * @property {import('../style/literal.js').LiteralStyle} style Literal style to apply to the layer features.
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
    * @property {VectorSourceType} [source] Point source.
    * @property {boolean} [disableHitDetection=false] Setting this to true will provide a slight performance boost, but will
    * prevent all hit detection on the layer.
    * @property {Object<string, *>} [properties] Arbitrary observable properties. Can be accessed with `#get()` and `#set()`.
    */
  /**
    * @classdesc
    * Layer optimized for rendering large point datasets. Takes a `style` property which
    * is a serializable JSON object describing how the layer should be rendered.
    *
    * Here are a few samples of literal style objects:
    * ```js
    * const style = {
    *   symbol: {
    *     symbolType: 'circle',
    *     size: 8,
    *     color: '#33AAFF',
    *     opacity: 0.9
    *   }
    * }
    * ```
    *
    * ```js
    * const style = {
    *   symbol: {
    *     symbolType: 'image',
    *     offset: [0, 12],
    *     size: [4, 8],
    *     src: '../static/exclamation-mark.png'
    *   }
    * }
    * ```
    *
    * **Important: a `WebGLPoints` layer must be manually disposed when removed, otherwise the underlying WebGL context
    * will not be garbage collected.**
    *
    * Note that any property set in the options is set as a {@link module:ol/Object~BaseObject}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @template {import("../source/Vector.js").default<import("../geom/Point.js").default>} VectorSourceType
    * @extends {Layer<VectorSourceType, WebGLPointsLayerRenderer>}
    * @fires import("../render/Event.js").RenderEvent
    */
  @JSImport("ol/layer", "WebGLPoints")
  @js.native
  open class WebGLPoints[VectorSourceType /* <: typings.ol.sourceVectorMod.default[typings.ol.geomPointMod.default] */] protected ()
    extends typings.ol.layerWebGLPointsMod.default[VectorSourceType] {
    /**
      * @param {Options<VectorSourceType>} options Options.
      */
    def this(options: typings.ol.layerWebGLPointsMod.Options[VectorSourceType]) = this()
  }
  
  /**
    * @classdesc
    * For layer sources that provide pre-rendered, tiled images in grids that are
    * organized by zoom levels for specific resolutions.
    * Note that any property set in the options is set as a {@link module:ol/Object~BaseObject}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @extends BaseTileLayer<SourceType, WebGLTileLayerRenderer>
    * @fires import("../render/Event.js").RenderEvent
    * @api
    */
  @JSImport("ol/layer", "WebGLTile")
  @js.native
  open class WebGLTile protected ()
    extends typings.ol.layerWebGLTileMod.default {
    /**
      * @param {Options} options Tile layer options.
      */
    def this(options: typings.ol.layerWebGLTileMod.Options) = this()
  }
}
