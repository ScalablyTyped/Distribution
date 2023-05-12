package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.featureMod.FeatureLike
import typings.ol.renderMod.OrderFunction
import typings.ol.styleStyleMod.Style
import typings.ol.styleStyleMod.StyleLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerVectorImageMod {
  
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
  @JSImport("ol/layer/VectorImage", JSImport.Default)
  @js.native
  /**
    * @param {Options<VectorSourceType>} [options] Options.
    */
  open class default[VectorSourceType /* <: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] */] () extends VectorImageLayer[VectorSourceType] {
    def this(options: Options[VectorSourceType]) = this()
  }
  
  trait Options[VectorSourceType /* <: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] */] extends StObject {
    
    /**
      * A CSS class name to set to the layer element.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Declutter images and text on this layer. The priority is defined
      * by the `zIndex` of the style and the render order of features. Higher z-index means higher priority.
      * Within the same z-index, a feature rendered before another has higher priority.
      */
    var declutter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The bounding extent for layer rendering.  The layer will not be
      * rendered outside of this extent.
      */
    var extent: js.UndefOr[Extent] = js.undefined
    
    /**
      * Ratio by which the rendered extent should be larger than the
      * viewport extent. A larger ratio avoids cut images during panning, but will cause a decrease in performance.
      */
    var imageRatio: js.UndefOr[Double] = js.undefined
    
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
    var style: js.UndefOr[StyleLike | Null] = js.undefined
    
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
    
    inline def apply[VectorSourceType /* <: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] */](): Options[VectorSourceType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[VectorSourceType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], VectorSourceType /* <: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] */] (val x: Self & Options[VectorSourceType]) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDeclutter(value: Boolean): Self = StObject.set(x, "declutter", value.asInstanceOf[js.Any])
      
      inline def setDeclutterUndefined: Self = StObject.set(x, "declutter", js.undefined)
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
      
      inline def setImageRatio(value: Double): Self = StObject.set(x, "imageRatio", value.asInstanceOf[js.Any])
      
      inline def setImageRatioUndefined: Self = StObject.set(x, "imageRatio", js.undefined)
      
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
      
      inline def setStyle(value: StyleLike): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleFunction2(value: (/* arg0 */ FeatureLike, /* arg1 */ Double) => Style | js.Array[Style] | Unit): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
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
  @js.native
  trait VectorImageLayer[VectorSourceType /* <: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] */]
    extends typings.ol.layerBaseVectorMod.default[VectorSourceType, typings.ol.rendererCanvasVectorImageLayerMod.default] {
    
    /**
      * @return {number} Ratio between rendered extent size and viewport extent size.
      */
    def getImageRatio(): Double = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var imageRatio_ : Any = js.native
  }
}
