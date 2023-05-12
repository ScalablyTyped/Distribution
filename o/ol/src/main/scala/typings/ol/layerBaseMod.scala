package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.layerLayerMod.State
import typings.ol.objectEventTypeMod.Types
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.olBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerBaseMod {
  
  /**
    * A css color, or a function called with a view resolution returning a css color.
    *
    * @typedef {string|function(number):string} BackgroundColor
    * @api
    */
  /**
    * @typedef {import("../ObjectEventType").Types|'change:extent'|'change:maxResolution'|'change:maxZoom'|
    *    'change:minResolution'|'change:minZoom'|'change:opacity'|'change:visible'|'change:zIndex'} BaseLayerObjectEventTypes
    */
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<BaseLayerObjectEventTypes, import("../Object").ObjectEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|BaseLayerObjectEventTypes, Return>} BaseLayerOnSignature
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
    * @property {BackgroundColor} [background] Background color for the layer. If not specified, no background
    * will be rendered.
    * @property {Object<string, *>} [properties] Arbitrary observable properties. Can be accessed with `#get()` and `#set()`.
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Note that with {@link module:ol/layer/Base~BaseLayer} and all its subclasses, any property set in
    * the options is set as a {@link module:ol/Object~BaseObject} property on the layer object, so
    * is observable, and has get/set accessors.
    *
    * @api
    */
  @JSImport("ol/layer/Base", JSImport.Default)
  @js.native
  open class default protected () extends BaseLayer {
    /**
      * @param {Options} options Layer options.
      */
    def this(options: Options) = this()
  }
  
  type BackgroundColor = String | (js.Function1[/* arg0 */ Double, String])
  
  /**
    * A css color, or a function called with a view resolution returning a css color.
    *
    * @typedef {string|function(number):string} BackgroundColor
    * @api
    */
  /**
    * @typedef {import("../ObjectEventType").Types|'change:extent'|'change:maxResolution'|'change:maxZoom'|
    *    'change:minResolution'|'change:minZoom'|'change:opacity'|'change:visible'|'change:zIndex'} BaseLayerObjectEventTypes
    */
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<BaseLayerObjectEventTypes, import("../Object").ObjectEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|BaseLayerObjectEventTypes, Return>} BaseLayerOnSignature
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
    * @property {BackgroundColor} [background] Background color for the layer. If not specified, no background
    * will be rendered.
    * @property {Object<string, *>} [properties] Arbitrary observable properties. Can be accessed with `#get()` and `#set()`.
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Note that with {@link module:ol/layer/Base~BaseLayer} and all its subclasses, any property set in
    * the options is set as a {@link module:ol/Object~BaseObject} property on the layer object, so
    * is observable, and has get/set accessors.
    *
    * @api
    */
  @js.native
  trait BaseLayer
    extends typings.ol.objectMod.default {
    
    /**
      * @type {BackgroundColor|false}
      * @private
      */
    /* private */ var background_ : Any = js.native
    
    /**
      * @type {string}
      * @private
      */
    /* private */ var className_ : Any = js.native
    
    /**
      * Get the background for this layer.
      * @return {BackgroundColor|false} Layer background.
      */
    def getBackground(): BackgroundColor | `false` = js.native
    
    /**
      * @return {string} CSS class name.
      */
    def getClassName(): String = js.native
    
    /**
      * Return the {@link module:ol/extent~Extent extent} of the layer or `undefined` if it
      * will be visible regardless of extent.
      * @return {import("../extent.js").Extent|undefined} The layer extent.
      * @observable
      * @api
      */
    def getExtent(): js.UndefOr[Extent] = js.native
    
    /**
      * This method is not meant to be called by layers or layer renderers because the state
      * is incorrect if the layer is included in a layer group.
      *
      * @param {boolean} [managed] Layer is managed.
      * @return {import("./Layer.js").State} Layer state.
      */
    def getLayerState(): State = js.native
    def getLayerState(managed: Boolean): State = js.native
    
    /**
      * @abstract
      * @param {Array<import("./Layer.js").State>} [states] Optional list of layer
      *     states (to be modified in place).
      * @return {Array<import("./Layer.js").State>} List of layer states.
      */
    def getLayerStatesArray(): js.Array[State] = js.native
    def getLayerStatesArray(states: js.Array[State]): js.Array[State] = js.native
    
    /**
      * @abstract
      * @param {Array<import("./Layer.js").default>} [array] Array of layers (to be
      *     modified in place).
      * @return {Array<import("./Layer.js").default>} Array of layers.
      */
    def getLayersArray(): js.Array[
        typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any]
      ] = js.native
    def getLayersArray(
      array: js.Array[
          typings.ol.layerLayerMod.default[
            typings.ol.sourceSourceMod.default, 
            typings.ol.layerLayerMod.default[Any, /* ol.ol/layer/Layer.default<any> */ Any]
          ]
        ]
    ): js.Array[
        typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any]
      ] = js.native
    
    /**
      * Return the maximum resolution of the layer.
      * @return {number} The maximum resolution of the layer.
      * @observable
      * @api
      */
    def getMaxResolution(): Double = js.native
    
    /**
      * Return the maximum zoom level of the layer.
      * @return {number} The maximum zoom level of the layer.
      * @observable
      * @api
      */
    def getMaxZoom(): Double = js.native
    
    /**
      * Return the minimum resolution of the layer.
      * @return {number} The minimum resolution of the layer.
      * @observable
      * @api
      */
    def getMinResolution(): Double = js.native
    
    /**
      * Return the minimum zoom level of the layer.
      * @return {number} The minimum zoom level of the layer.
      * @observable
      * @api
      */
    def getMinZoom(): Double = js.native
    
    /**
      * Return the opacity of the layer (between 0 and 1).
      * @return {number} The opacity of the layer.
      * @observable
      * @api
      */
    def getOpacity(): Double = js.native
    
    /**
      * @abstract
      * @return {import("../source/Source.js").State} Source state.
      */
    def getSourceState(): typings.ol.sourceSourceMod.State = js.native
    
    /**
      * Return the visibility of the layer (`true` or `false`).
      * @return {boolean} The visibility of the layer.
      * @observable
      * @api
      */
    def getVisible(): Boolean = js.native
    
    /**
      * Return the Z-index of the layer, which is used to order layers before
      * rendering. The default Z-index is 0.
      * @return {number} The Z-index of the layer.
      * @observable
      * @api
      */
    def getZIndex(): Double = js.native
    
    /***
      * @type {BaseLayerOnSignature<import("../events").EventsKey>}
      */
    @JSName("on")
    var on_BaseLayer: BaseLayerOnSignature[EventsKey] = js.native
    
    /***
      * @type {BaseLayerOnSignature<import("../events").EventsKey>}
      */
    @JSName("once")
    var once_BaseLayer: BaseLayerOnSignature[EventsKey] = js.native
    
    /**
      * Sets the background color.
      * @param {BackgroundColor} [background] Background color.
      */
    def setBackground(): Unit = js.native
    def setBackground(background: BackgroundColor): Unit = js.native
    
    /**
      * Set the extent at which the layer is visible.  If `undefined`, the layer
      * will be visible at all extents.
      * @param {import("../extent.js").Extent|undefined} extent The extent of the layer.
      * @observable
      * @api
      */
    def setExtent(): Unit = js.native
    def setExtent(extent: Extent): Unit = js.native
    
    /**
      * Set the maximum resolution at which the layer is visible.
      * @param {number} maxResolution The maximum resolution of the layer.
      * @observable
      * @api
      */
    def setMaxResolution(maxResolution: Double): Unit = js.native
    
    /**
      * Set the maximum zoom (exclusive) at which the layer is visible.
      * Note that the zoom levels for layer visibility are based on the
      * view zoom level, which may be different from a tile source zoom level.
      * @param {number} maxZoom The maximum zoom of the layer.
      * @observable
      * @api
      */
    def setMaxZoom(maxZoom: Double): Unit = js.native
    
    /**
      * Set the minimum resolution at which the layer is visible.
      * @param {number} minResolution The minimum resolution of the layer.
      * @observable
      * @api
      */
    def setMinResolution(minResolution: Double): Unit = js.native
    
    /**
      * Set the minimum zoom (inclusive) at which the layer is visible.
      * Note that the zoom levels for layer visibility are based on the
      * view zoom level, which may be different from a tile source zoom level.
      * @param {number} minZoom The minimum zoom of the layer.
      * @observable
      * @api
      */
    def setMinZoom(minZoom: Double): Unit = js.native
    
    /**
      * Set the opacity of the layer, allowed values range from 0 to 1.
      * @param {number} opacity The opacity of the layer.
      * @observable
      * @api
      */
    def setOpacity(opacity: Double): Unit = js.native
    
    /**
      * Set the visibility of the layer (`true` or `false`).
      * @param {boolean} visible The visibility of the layer.
      * @observable
      * @api
      */
    def setVisible(visible: Boolean): Unit = js.native
    
    /**
      * Set Z-index of the layer, which is used to order layers before rendering.
      * The default Z-index is 0.
      * @param {number} zindex The z-index of the layer.
      * @observable
      * @api
      */
    def setZIndex(zindex: Double): Unit = js.native
    
    /**
      * @type {import("./Layer.js").State}
      * @private
      */
    /* private */ var state_ : Any = js.native
    
    /***
      * @type {BaseLayerOnSignature<void>}
      */
    @JSName("un")
    var un_BaseLayer: BaseLayerOnSignature[Unit] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.objectEventTypeMod.Types
    - typings.ol.olStrings.changeColonextent
    - typings.ol.olStrings.changeColonmaxResolution
    - typings.ol.olStrings.changeColonmaxZoom
    - typings.ol.olStrings.changeColonminResolution
    - typings.ol.olStrings.changeColonminZoom
    - typings.ol.olStrings.changeColonopacity
    - typings.ol.olStrings.changeColonvisible
    - typings.ol.olStrings.changeColonzIndex
  */
  type BaseLayerObjectEventTypes = _BaseLayerObjectEventTypes | Types
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait BaseLayerOnSignature[Return]
    extends OnSignature[
          BaseLayerObjectEventTypes | EventTypes, 
          ObjectEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
  
  trait Options extends StObject {
    
    /**
      * Background color for the layer. If not specified, no background
      * will be rendered.
      */
    var background: js.UndefOr[BackgroundColor] = js.undefined
    
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
      
      inline def setBackground(value: BackgroundColor): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundFunction1(value: /* arg0 */ Double => String): Self = StObject.set(x, "background", js.Any.fromFunction1(value))
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
      
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
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait _BaseLayerObjectEventTypes extends StObject
}
