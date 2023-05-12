package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.featureMod.FeatureLike
import typings.ol.layerBaseMod.BackgroundColor
import typings.ol.layerBaseMod.BaseLayerObjectEventTypes
import typings.ol.layerLayerMod.LayerEventType
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.olBooleans.`false`
import typings.ol.olStrings.changeColonpreload
import typings.ol.olStrings.changeColonuseInterimTilesOnError
import typings.ol.renderEventTypeMod.LayerRenderEventTypes
import typings.ol.renderMod.OrderFunction
import typings.ol.styleStyleMod.Style
import typings.ol.styleStyleMod.StyleLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerVectorTileMod {
  
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
  @JSImport("ol/layer/VectorTile", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends VectorTileLayer {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Background color for the layer. If not specified, no
      * background will be rendered.
      */
    var background: js.UndefOr[`false` | BackgroundColor] = js.undefined
    
    /**
      * A CSS class name to set to the layer element.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Declutter images and text. Decluttering is applied to all
      * image and text styles of all Vector and VectorTile layers that have set this to `true`. The priority
      * is defined by the z-index of the layer, the `zIndex` of the style and the render order of features.
      * Higher z-index means higher priority. Within the same z-index, a feature rendered before another has
      * higher priority.
      *
      * As an optimization decluttered features from layers with the same `className` are rendered above
      * the fill and stroke styles of all of those layers regardless of z-index.  To opt out of this
      * behavior and place declutterd features with their own layer configure the layer with a `className`
      * other than `ol-layer`.
      */
    var declutter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The bounding extent for layer rendering.  The layer will not be
      * rendered outside of this extent.
      */
    var extent: js.UndefOr[Extent] = js.undefined
    
    /**
      * Sets the layer as overlay on a map. The map will not manage
      * this layer in its layers collection, and the layer will be rendered on top. This is useful for
      * temporary layers. The standard way to add a layer to a map and have it managed by the map is to
      * use [map.addLayer()]{@link import ("../Map.js").default#addLayer}.
      */
    var map: js.UndefOr[typings.ol.rendererMapMod.default] = js.undefined
    
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
      * Preload. Load low-resolution tiles up to `preload` levels. `0`
      * means no preloading.
      */
    var preload: js.UndefOr[Double] = js.undefined
    
    /**
      * Arbitrary observable properties. Can be accessed with `#get()` and `#set()`.
      */
    var properties: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * The buffer in pixels around the tile extent used by the
      * renderer when getting features from the vector tile for the rendering or hit-detection.
      * Recommended value: Vector tiles are usually generated with a buffer, so this value should match
      * the largest possible buffer of the used tiles. It should be at least the size of the largest
      * point symbol or line width.
      */
    var renderBuffer: js.UndefOr[Double] = js.undefined
    
    /**
      * Render mode for vector tiles:
      * * `'hybrid'`: Polygon and line elements are rendered as images, so pixels are scaled during zoom
      * animations. Point symbols and texts are accurately rendered as vectors and can stay upright on
      * rotated views.
      * * `'vector'`: Everything is rendered as vectors. Use this mode for improved performance on vector
      * tile layers with only a few rendered features (e.g. for highlighting a subset of features of
      * another layer with the same source).
      */
    var renderMode: js.UndefOr[VectorTileRenderType] = js.undefined
    
    /**
      * Render order. Function to be used when sorting
      * features before rendering. By default features are drawn in the order that they are created. Use
      * `null` to avoid the sort, but get an undefined draw order.
      */
    var renderOrder: js.UndefOr[OrderFunction] = js.undefined
    
    /**
      * Source.
      */
    var source: js.UndefOr[typings.ol.vectorTileMod.default] = js.undefined
    
    /**
      * Layer style. When set to `null`, only
      * features that have their own style will be rendered. See {@link module :ol/style/Style~Style} for the default style
      * which will be used if this is not set.
      */
    var style: js.UndefOr[StyleLike | Null] = js.undefined
    
    /**
      * When set to `true`, feature batches will be
      * recreated during animations. This means that no vectors will be shown clipped, but the setting
      * will have a performance impact for large amounts of vector data. When set to `false`, batches
      * will be recreated when no animation is active.
      */
    var updateWhileAnimating: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set to `true`, feature batches will be
      * recreated during interactions. See also `updateWhileAnimating`.
      */
    var updateWhileInteracting: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use interim tiles on error.
      */
    var useInterimTilesOnError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Visibility.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
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
      
      inline def setBackground(value: `false` | BackgroundColor): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundFunction1(value: /* arg0 */ Double => String): Self = StObject.set(x, "background", js.Any.fromFunction1(value))
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDeclutter(value: Boolean): Self = StObject.set(x, "declutter", value.asInstanceOf[js.Any])
      
      inline def setDeclutterUndefined: Self = StObject.set(x, "declutter", js.undefined)
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
      
      inline def setMap(value: typings.ol.rendererMapMod.default): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
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
      
      inline def setPreload(value: Double): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setProperties(value: StringDictionary[Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setRenderBuffer(value: Double): Self = StObject.set(x, "renderBuffer", value.asInstanceOf[js.Any])
      
      inline def setRenderBufferUndefined: Self = StObject.set(x, "renderBuffer", js.undefined)
      
      inline def setRenderMode(value: VectorTileRenderType): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
      
      inline def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
      
      inline def setRenderOrder(value: (/* arg0 */ FeatureLike, /* arg1 */ FeatureLike) => Double): Self = StObject.set(x, "renderOrder", js.Any.fromFunction2(value))
      
      inline def setRenderOrderUndefined: Self = StObject.set(x, "renderOrder", js.undefined)
      
      inline def setSource(value: typings.ol.vectorTileMod.default): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setStyle(value: StyleLike): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleFunction2(value: (/* arg0 */ FeatureLike, /* arg1 */ Double) => Style | js.Array[Style] | Unit): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setUpdateWhileAnimating(value: Boolean): Self = StObject.set(x, "updateWhileAnimating", value.asInstanceOf[js.Any])
      
      inline def setUpdateWhileAnimatingUndefined: Self = StObject.set(x, "updateWhileAnimating", js.undefined)
      
      inline def setUpdateWhileInteracting(value: Boolean): Self = StObject.set(x, "updateWhileInteracting", value.asInstanceOf[js.Any])
      
      inline def setUpdateWhileInteractingUndefined: Self = StObject.set(x, "updateWhileInteracting", js.undefined)
      
      inline def setUseInterimTilesOnError(value: Boolean): Self = StObject.set(x, "useInterimTilesOnError", value.asInstanceOf[js.Any])
      
      inline def setUseInterimTilesOnErrorUndefined: Self = StObject.set(x, "useInterimTilesOnError", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
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
  @js.native
  trait VectorTileLayer
    extends typings.ol.layerBaseVectorMod.default[
          typings.ol.vectorTileMod.default, 
          typings.ol.rendererCanvasVectorTileLayerMod.default
        ] {
    
    /**
      * Return the level as number to which we will preload tiles up to.
      * @return {number} The level to preload tiles up to.
      * @observable
      * @api
      */
    def getPreload(): Double = js.native
    
    /**
      * @return {VectorTileRenderType} The render mode.
      */
    def getRenderMode(): VectorTileRenderType = js.native
    
    /**
      * Whether we use interim tiles on error.
      * @return {boolean} Use interim tiles on error.
      * @observable
      * @api
      */
    def getUseInterimTilesOnError(): Boolean = js.native
    
    /***
      * @type {VectorTileLayerOnSignature<import("../events").EventsKey>}
      */
    @JSName("on")
    var on_VectorTileLayer: VectorTileLayerOnSignature[EventsKey] = js.native
    
    /***
      * @type {VectorTileLayerOnSignature<import("../events").EventsKey>}
      */
    @JSName("once")
    var once_VectorTileLayer: VectorTileLayerOnSignature[EventsKey] = js.native
    
    /**
      * @private
      * @type {VectorTileRenderType}
      */
    /* private */ var renderMode_ : Any = js.native
    
    /**
      * Set the level as number to which we will preload tiles up to.
      * @param {number} preload The level to preload tiles up to.
      * @observable
      * @api
      */
    def setPreload(preload: Double): Unit = js.native
    
    /**
      * Set whether we use interim tiles on error.
      * @param {boolean} useInterimTilesOnError Use interim tiles on error.
      * @observable
      * @api
      */
    def setUseInterimTilesOnError(useInterimTilesOnError: Boolean): Unit = js.native
    
    /***
      * @type {VectorTileLayerOnSignature<void>}
      */
    @JSName("un")
    var un_VectorTileLayer: VectorTileLayerOnSignature[Unit] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait VectorTileLayerOnSignature[Return]
    extends OnSignature[
          changeColonpreload | changeColonuseInterimTilesOnError | BaseLayerObjectEventTypes | EventTypes | LayerEventType | LayerRenderEventTypes, 
          ObjectEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.hybrid
    - typings.ol.olStrings.vector
  */
  trait VectorTileRenderType extends StObject
  object VectorTileRenderType {
    
    inline def hybrid: typings.ol.olStrings.hybrid = "hybrid".asInstanceOf[typings.ol.olStrings.hybrid]
    
    inline def vector: typings.ol.olStrings.vector = "vector".asInstanceOf[typings.ol.olStrings.vector]
  }
}
