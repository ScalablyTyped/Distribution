package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.featureMod.FeatureLike
import typings.ol.layerBaseMod.BackgroundColor
import typings.ol.mapMod.FrameState
import typings.ol.renderMod.OrderFunction
import typings.ol.styleFlatMod.FlatStyle
import typings.ol.styleFlatMod.FlatStyleLike
import typings.ol.styleStyleMod.Style
import typings.ol.styleStyleMod.StyleFunction
import typings.ol.styleStyleMod.StyleLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerBaseVectorMod {
  
  /**
    * @classdesc
    * Vector data that is rendered client-side.
    * Note that any property set in the options is set as a {@link module:ol/Object~BaseObject}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @template {import("../source/Vector.js").default|import("../source/VectorTile.js").default} VectorSourceType
    * @template {import("../renderer/canvas/VectorLayer.js").default|import("../renderer/canvas/VectorTileLayer.js").default|import("../renderer/canvas/VectorImageLayer.js").default|import("../renderer/webgl/PointsLayer.js").default} RendererType
    * @extends {Layer<VectorSourceType, RendererType>}
    * @api
    */
  @JSImport("ol/layer/BaseVector", JSImport.Default)
  @js.native
  /**
    * @param {Options<VectorSourceType>} [options] Options.
    */
  open class default[VectorSourceType /* <: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] | typings.ol.vectorTileMod.default */, RendererType /* <: typings.ol.rendererCanvasVectorLayerMod.default | typings.ol.rendererCanvasVectorTileLayerMod.default | typings.ol.rendererCanvasVectorImageLayerMod.default | typings.ol.rendererWebglPointsLayerMod.default */] () extends BaseVectorLayer[VectorSourceType, RendererType] {
    def this(options: Options[VectorSourceType]) = this()
  }
  
  /**
    * @classdesc
    * Vector data that is rendered client-side.
    * Note that any property set in the options is set as a {@link module:ol/Object~BaseObject}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @template {import("../source/Vector.js").default|import("../source/VectorTile.js").default} VectorSourceType
    * @template {import("../renderer/canvas/VectorLayer.js").default|import("../renderer/canvas/VectorTileLayer.js").default|import("../renderer/canvas/VectorImageLayer.js").default|import("../renderer/webgl/PointsLayer.js").default} RendererType
    * @extends {Layer<VectorSourceType, RendererType>}
    * @api
    */
  @js.native
  trait BaseVectorLayer[VectorSourceType /* <: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] | typings.ol.vectorTileMod.default */, RendererType /* <: typings.ol.rendererCanvasVectorLayerMod.default | typings.ol.rendererCanvasVectorTileLayerMod.default | typings.ol.rendererCanvasVectorImageLayerMod.default | typings.ol.rendererWebglPointsLayerMod.default */]
    extends typings.ol.layerLayerMod.default[VectorSourceType, RendererType] {
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var declutter_ : Any = js.native
    
    /**
      * @return {boolean} Declutter.
      */
    def getDeclutter(): Boolean = js.native
    
    /**
      * @return {number|undefined} Render buffer.
      */
    def getRenderBuffer(): js.UndefOr[Double] = js.native
    
    /**
      * @return {function(import("../Feature.js").default, import("../Feature.js").default): number|null|undefined} Render
      *     order.
      */
    def getRenderOrder(): js.Function2[
        /* arg0 */ typings.ol.renderFeatureMod.default, 
        /* arg1 */ typings.ol.renderFeatureMod.default, 
        js.UndefOr[Double | Null]
      ] = js.native
    
    /**
      * Get the style for features.  This returns whatever was passed to the `style`
      * option at construction or to the `setStyle` method.
      * @return {import("../style/Style.js").StyleLike|null|undefined} Layer style.
      * @api
      */
    def getStyle(): js.UndefOr[StyleLike | Null] = js.native
    
    /**
      * Get the style function.
      * @return {import("../style/Style.js").StyleFunction|undefined} Layer style function.
      * @api
      */
    def getStyleFunction(): js.UndefOr[StyleFunction] = js.native
    
    /**
      * @return {boolean} Whether the rendered layer should be updated while
      *     animating.
      */
    def getUpdateWhileAnimating(): Boolean = js.native
    
    /**
      * @return {boolean} Whether the rendered layer should be updated while
      *     interacting.
      */
    def getUpdateWhileInteracting(): Boolean = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var renderBuffer_ : Any = js.native
    
    /**
      * Render declutter items for this layer
      * @param {import("../Map.js").FrameState} frameState Frame state.
      */
    def renderDeclutter(frameState: FrameState): Unit = js.native
    
    /**
      * @param {import("../render.js").OrderFunction|null|undefined} renderOrder
      *     Render order.
      */
    def setRenderOrder(): Unit = js.native
    def setRenderOrder(renderOrder: OrderFunction): Unit = js.native
    
    /**
      * Set the style for features.  This can be a single style object, an array
      * of styles, or a function that takes a feature and resolution and returns
      * an array of styles. If set to `null`, the layer has no style (a `null` style),
      * so only features that have their own styles will be rendered in the layer. Call
      * `setStyle()` without arguments to reset to the default style. See
      * [the ol/style/Style module]{@link module:ol/style/Style~Style} for information on the default style.
      *
      * If your layer has a static style, you can use "flat" style object literals instead of
      * using the `Style` and symbolizer constructors (`Fill`, `Stroke`, etc.).  See the documentation
      * for the [flat style types]{@link module:ol/style/flat~FlatStyle} to see what properties are supported.
      *
      * @param {import("../style/Style.js").StyleLike|import("../style/flat.js").FlatStyleLike|null} [style] Layer style.
      * @api
      */
    def setStyle(): Unit = js.native
    def setStyle(style: FlatStyleLike | StyleLike): Unit = js.native
    
    /**
      * Style function for use within the library.
      * @type {import("../style/Style.js").StyleFunction|undefined}
      * @private
      */
    /* private */ var styleFunction_ : Any = js.native
    
    /**
      * User provided style.
      * @type {import("../style/Style.js").StyleLike}
      * @private
      */
    /* private */ var style_ : Any = js.native
    
    /**
      * @type {boolean}
      * @private
      */
    /* private */ var updateWhileAnimating_ : Any = js.native
    
    /**
      * @type {boolean}
      * @private
      */
    /* private */ var updateWhileInteracting_ : Any = js.native
  }
  
  trait Options[VectorSourceType /* <: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] | typings.ol.vectorTileMod.default */] extends StObject {
    
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
      * Arbitrary observable properties. Can be accessed with `#get()` and `#set()`.
      */
    var properties: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * The buffer in pixels around the viewport extent used by the
      * renderer when getting features from the vector source for the rendering or hit-detection.
      * Recommended value: the size of the largest symbol, line width or label.
      */
    var renderBuffer: js.UndefOr[Double] = js.undefined
    
    /**
      * Render order. Function to be used when sorting
      * features before rendering. By default features are drawn in the order that they are created. Use
      * `null` to avoid the sort, but get an undefined draw order.
      */
    var renderOrder: js.UndefOr[OrderFunction] = js.undefined
    
    /**
      * Source.
      */
    var source: js.UndefOr[VectorSourceType] = js.undefined
    
    /**
      * Layer style. When set to `null`, only
      * features that have their own style will be rendered. See {@link module :ol/style/Style~Style} for the default style
      * which will be used if this is not set.
      */
    var style: js.UndefOr[StyleLike | FlatStyleLike | Null] = js.undefined
    
    /**
      * When set to `true`, feature batches will
      * be recreated during animations. This means that no vectors will be shown clipped, but the
      * setting will have a performance impact for large amounts of vector data. When set to `false`,
      * batches will be recreated when no animation is active.
      */
    var updateWhileAnimating: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set to `true`, feature batches will
      * be recreated during interactions. See also `updateWhileAnimating`.
      */
    var updateWhileInteracting: js.UndefOr[Boolean] = js.undefined
    
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
    
    inline def apply[VectorSourceType /* <: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] | typings.ol.vectorTileMod.default */](): Options[VectorSourceType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[VectorSourceType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], VectorSourceType /* <: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] | typings.ol.vectorTileMod.default */] (val x: Self & Options[VectorSourceType]) extends AnyVal {
      
      inline def setBackground(value: BackgroundColor): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
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
      
      inline def setProperties(value: StringDictionary[Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setRenderBuffer(value: Double): Self = StObject.set(x, "renderBuffer", value.asInstanceOf[js.Any])
      
      inline def setRenderBufferUndefined: Self = StObject.set(x, "renderBuffer", js.undefined)
      
      inline def setRenderOrder(value: (/* arg0 */ FeatureLike, /* arg1 */ FeatureLike) => Double): Self = StObject.set(x, "renderOrder", js.Any.fromFunction2(value))
      
      inline def setRenderOrderUndefined: Self = StObject.set(x, "renderOrder", js.undefined)
      
      inline def setSource(value: VectorSourceType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setStyle(value: StyleLike | FlatStyleLike): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleFunction2(value: (/* arg0 */ FeatureLike, /* arg1 */ Double) => Style | js.Array[Style] | Unit): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: (FlatStyle | Style)*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setUpdateWhileAnimating(value: Boolean): Self = StObject.set(x, "updateWhileAnimating", value.asInstanceOf[js.Any])
      
      inline def setUpdateWhileAnimatingUndefined: Self = StObject.set(x, "updateWhileAnimating", js.undefined)
      
      inline def setUpdateWhileInteracting(value: Boolean): Self = StObject.set(x, "updateWhileInteracting", value.asInstanceOf[js.Any])
      
      inline def setUpdateWhileInteractingUndefined: Self = StObject.set(x, "updateWhileInteracting", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
