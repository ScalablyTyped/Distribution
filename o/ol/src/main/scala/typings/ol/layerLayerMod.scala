package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.featureMod.FeatureLike
import typings.ol.layerBaseMod.BaseLayerObjectEventTypes
import typings.ol.mapMod.FrameState
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.pixelMod.Pixel
import typings.ol.renderEventTypeMod.LayerRenderEventTypes
import typings.ol.viewMod.ViewStateAndExtent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerLayerMod {
  
  @JSImport("ol/layer/Layer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  @JSImport("ol/layer/Layer", JSImport.Default)
  @js.native
  open class default[SourceType /* <: typings.ol.sourceSourceMod.default */, RendererType /* <: default[Any, /* ol.ol/layer/Layer.default<any> */ Any] */] protected () extends Layer[SourceType, RendererType] {
    /**
      * @param {Options<SourceType>} options Layer options.
      */
    def this(options: Options[SourceType]) = this()
  }
  
  inline def inView(layerState: State, viewState: typings.ol.viewMod.State): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inView")(layerState.asInstanceOf[js.Any], viewState.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
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
  @js.native
  trait Layer[SourceType /* <: typings.ol.sourceSourceMod.default */, RendererType /* <: default[Any, /* ol.ol/layer/Layer.default<any> */ Any] */]
    extends typings.ol.layerBaseMod.default {
    
    /**
      * Create a renderer for this layer.
      * @return {RendererType} A layer renderer.
      * @protected
      */
    /* protected */ def createRenderer(): RendererType = js.native
    
    def getAttributions(view: ViewStateAndExtent): js.Array[String] = js.native
    /**
      * Get the attributions of the source of this layer for the given view.
      * @param {View|import("../View.js").ViewStateAndExtent} view View or  {@link import("../Map.js").FrameState}.
      * @return {Array<string>} Attributions for this layer at the given view.
      * @api
      */
    def getAttributions(view: typings.ol.viewMod.default): js.Array[String] = js.native
    
    /**
      * @param {import("../pixel").Pixel} pixel Pixel.
      * @return {Uint8ClampedArray|Uint8Array|Float32Array|DataView|null} Pixel data.
      */
    def getData(pixel: Pixel): js.typedarray.Uint8ClampedArray | js.typedarray.Uint8Array | js.typedarray.Float32Array | js.typedarray.DataView | Null = js.native
    
    /**
      * @param {import("../pixel").Pixel} pixel Pixel.
      * @return {Promise<Array<import("../Feature").FeatureLike>>} Promise that resolves with
      * an array of features.
      */
    def getFeatures(pixel: Pixel): js.Promise[js.Array[FeatureLike]] = js.native
    
    /**
      * For use inside the library only.
      * @return {import("../Map.js").default|null} Map.
      */
    def getMapInternal(): typings.ol.rendererMapMod.default | Null = js.native
    
    /**
      * @return {SourceType|null} The source being rendered.
      */
    def getRenderSource(): SourceType | Null = js.native
    
    /**
      * Get the renderer for this layer.
      * @return {RendererType|null} The layer renderer.
      */
    def getRenderer(): RendererType | Null = js.native
    
    /**
      * Get the layer source.
      * @return {SourceType|null} The layer source (or `null` if not yet set).
      * @observable
      * @api
      */
    def getSource(): SourceType | Null = js.native
    
    /**
      * @private
      */
    /* private */ var handleSourceChange_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var handleSourcePropertyChange_ : Any = js.native
    
    /**
      * @return {boolean} The layer has a renderer.
      */
    def hasRenderer(): Boolean = js.native
    
    def isVisible(view: ViewStateAndExtent): Boolean = js.native
    /**
      * The layer is visible in the given view, i.e. within its min/max resolution or zoom and
      * extent, and `getVisible()` is `true`.
      * @param {View|import("../View.js").ViewStateAndExtent} view View or {@link import("../Map.js").FrameState}.
      * @return {boolean} The layer is visible in the current view.
      * @api
      */
    def isVisible(view: typings.ol.viewMod.default): Boolean = js.native
    
    /**
      * @private
      * @type {?import("../events.js").EventsKey}
      */
    /* private */ var mapPrecomposeKey_ : Any = js.native
    
    /**
      * @private
      * @type {?import("../events.js").EventsKey}
      */
    /* private */ var mapRenderKey_ : Any = js.native
    
    /***
      * @type {LayerOnSignature<import("../events").EventsKey>}
      */
    @JSName("on")
    var on_Layer: LayerOnSignature[EventsKey] = js.native
    
    /***
      * @type {LayerOnSignature<import("../events").EventsKey>}
      */
    @JSName("once")
    var once_Layer: LayerOnSignature[EventsKey] = js.native
    
    def render(frameState: Null, target: HTMLElement): HTMLElement = js.native
    /**
      * In charge to manage the rendering of the layer. One layer type is
      * bounded with one layer renderer.
      * @param {?import("../Map.js").FrameState} frameState Frame state.
      * @param {HTMLElement} target Target which the renderer may (but need not) use
      * for rendering its content.
      * @return {HTMLElement} The rendered element.
      */
    def render(frameState: FrameState, target: HTMLElement): HTMLElement = js.native
    
    /**
      * @protected
      * @type {boolean}
      */
    /* protected */ var rendered: Boolean = js.native
    
    /**
      * @private
      * @type {RendererType}
      */
    /* private */ var renderer_ : Any = js.native
    
    /**
      * Sets the layer to be rendered on top of other layers on a map. The map will
      * not manage this layer in its layers collection. This
      * is useful for temporary layers. To remove an unmanaged layer from the map,
      * use `#setMap(null)`.
      *
      * To add the layer to a map and have it managed by the map, use
      * {@link module:ol/Map~Map#addLayer} instead.
      * @param {import("../Map.js").default|null} map Map.
      * @api
      */
    def setMap(): Unit = js.native
    def setMap(map: typings.ol.rendererMapMod.default): Unit = js.native
    
    /**
      * For use inside the library only.
      * @param {import("../Map.js").default|null} map Map.
      */
    def setMapInternal(): Unit = js.native
    def setMapInternal(map: typings.ol.rendererMapMod.default): Unit = js.native
    
    /**
      * Set the layer source.
      * @param {SourceType|null} source The layer source.
      * @observable
      * @api
      */
    def setSource(): Unit = js.native
    def setSource(source: SourceType): Unit = js.native
    
    /**
      * @private
      * @type {?import("../events.js").EventsKey}
      */
    /* private */ var sourceChangeKey_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var sourceReady_ : Any = js.native
    
    /***
      * @type {LayerOnSignature<void>}
      */
    @JSName("un")
    var un_Layer: LayerOnSignature[Unit] = js.native
    
    /**
      * Called when a layer is not visible during a map render.
      */
    def unrender(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.sourceready
    - typings.ol.olStrings.changeColonsource
  */
  trait LayerEventType extends StObject
  object LayerEventType {
    
    inline def changeColonsource: typings.ol.olStrings.changeColonsource = "change:source".asInstanceOf[typings.ol.olStrings.changeColonsource]
    
    inline def sourceready: typings.ol.olStrings.sourceready = "sourceready".asInstanceOf[typings.ol.olStrings.sourceready]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait LayerOnSignature[Return]
    extends OnSignature[
          BaseLayerObjectEventTypes | EventTypes | LayerEventType | LayerRenderEventTypes, 
          ObjectEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
  
  trait Options[SourceType /* <: typings.ol.sourceSourceMod.default */] extends StObject {
    
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
      * Map.
      */
    var map: js.UndefOr[typings.ol.rendererMapMod.default | Null] = js.undefined
    
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
      * Render function. Takes the frame state as input and is expected to return an
      * HTML element. Will overwrite the default rendering for the layer.
      */
    var render: js.UndefOr[RenderFunction] = js.undefined
    
    /**
      * Source for this layer.  If not provided to the constructor,
      * the source can be set by calling {@link module :ol/layer/Layer~Layer#setSource layer.setSource(source)} after
      * construction.
      */
    var source: js.UndefOr[SourceType] = js.undefined
    
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
    
    inline def apply[SourceType /* <: typings.ol.sourceSourceMod.default */](): Options[SourceType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[SourceType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], SourceType /* <: typings.ol.sourceSourceMod.default */] (val x: Self & Options[SourceType]) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
      
      inline def setMap(value: typings.ol.rendererMapMod.default): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapNull: Self = StObject.set(x, "map", null)
      
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
      
      inline def setProperties(value: StringDictionary[Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setRender(value: /* arg0 */ FrameState => HTMLElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setSource(value: SourceType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type RenderFunction = js.Function1[/* arg0 */ FrameState, HTMLElement]
  
  trait State extends StObject {
    
    /**
      * Extent.
      */
    var extent: js.UndefOr[Extent] = js.undefined
    
    /**
      * Layer.
      */
    var layer: default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any]
    
    /**
      * Managed.
      */
    var managed: Boolean
    
    /**
      * Maximum resolution.
      */
    var maxResolution: Double
    
    /**
      * Maximum zoom.
      */
    var maxZoom: Double
    
    /**
      * Minimum resolution.
      */
    var minResolution: Double
    
    /**
      * Minimum zoom.
      */
    var minZoom: Double
    
    /**
      * Opacity, the value is rounded to two digits to appear after the decimal point.
      */
    var opacity: Double
    
    /**
      * Visible.
      */
    var visible: Boolean
    
    /**
      * ZIndex.
      */
    var zIndex: Double
  }
  object State {
    
    inline def apply(
      layer: default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any],
      managed: Boolean,
      maxResolution: Double,
      maxZoom: Double,
      minResolution: Double,
      minZoom: Double,
      opacity: Double,
      visible: Boolean,
      zIndex: Double
    ): State = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], managed = managed.asInstanceOf[js.Any], maxResolution = maxResolution.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], minResolution = minResolution.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
      
      inline def setLayer(value: default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any]): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setManaged(value: Boolean): Self = StObject.set(x, "managed", value.asInstanceOf[js.Any])
      
      inline def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    }
  }
}
