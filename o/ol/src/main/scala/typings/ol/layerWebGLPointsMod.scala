package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.styleLiteralMod.LiteralStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerWebGLPointsMod {
  
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
  @JSImport("ol/layer/WebGLPoints", JSImport.Default)
  @js.native
  open class default[VectorSourceType /* <: typings.ol.sourceVectorMod.default[typings.ol.geomPointMod.default] */] protected () extends WebGLPointsLayer[VectorSourceType] {
    /**
      * @param {Options<VectorSourceType>} options Options.
      */
    def this(options: Options[VectorSourceType]) = this()
  }
  
  trait Options[VectorSourceType /* <: typings.ol.sourceVectorMod.default[typings.ol.geomPointMod.default] */] extends StObject {
    
    /**
      * A CSS class name to set to the layer element.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Setting this to true will provide a slight performance boost, but will
      * prevent all hit detection on the layer.
      */
    var disableHitDetection: js.UndefOr[Boolean] = js.undefined
    
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
      * Point source.
      */
    var source: js.UndefOr[VectorSourceType] = js.undefined
    
    /**
      * Literal style to apply to the layer features.
      */
    var style: LiteralStyle
    
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
    
    inline def apply[VectorSourceType /* <: typings.ol.sourceVectorMod.default[typings.ol.geomPointMod.default] */](style: LiteralStyle): Options[VectorSourceType] = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[VectorSourceType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], VectorSourceType /* <: typings.ol.sourceVectorMod.default[typings.ol.geomPointMod.default] */] (val x: Self & Options[VectorSourceType]) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisableHitDetection(value: Boolean): Self = StObject.set(x, "disableHitDetection", value.asInstanceOf[js.Any])
      
      inline def setDisableHitDetectionUndefined: Self = StObject.set(x, "disableHitDetection", js.undefined)
      
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
      
      inline def setSource(value: VectorSourceType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setStyle(value: LiteralStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
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
  @js.native
  trait WebGLPointsLayer[VectorSourceType /* <: typings.ol.sourceVectorMod.default[typings.ol.geomPointMod.default] */]
    extends typings.ol.layerLayerMod.default[VectorSourceType, typings.ol.rendererWebglPointsLayerMod.default] {
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var hitDetectionDisabled_ : Any = js.native
    
    /**
      * @private
      * @type {import('../webgl/ShaderBuilder.js').StyleParseResult}
      */
    /* private */ var parseResult_ : Any = js.native
    
    /**
      * @type {Object<string, (string|number)>}
      * @private
      */
    /* private */ var styleVariables_ : Any = js.native
    
    /**
      * Update any variables used by the layer style and trigger a re-render.
      * @param {Object<string, number>} variables Variables to update.
      */
    def updateStyleVariables(variables: StringDictionary[Double]): Unit = js.native
  }
}
