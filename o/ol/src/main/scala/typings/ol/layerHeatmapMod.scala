package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerHeatmapMod {
  
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
  @JSImport("ol/layer/Heatmap", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends Heatmap {
    def this(options: Options) = this()
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
  @js.native
  trait Heatmap
    extends typings.ol.layerBaseVectorMod.default[
          typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default], 
          typings.ol.rendererWebglPointsLayerMod.default
        ] {
    
    /**
      * Return the blur size in pixels.
      * @return {number} Blur size in pixels.
      * @api
      * @observable
      */
    def getBlur(): Double = js.native
    
    /**
      * Return the gradient colors as array of strings.
      * @return {Array<string>} Colors.
      * @api
      * @observable
      */
    def getGradient(): js.Array[String] = js.native
    
    /**
      * Return the size of the radius in pixels.
      * @return {number} Radius size in pixel.
      * @api
      * @observable
      */
    def getRadius(): Double = js.native
    
    /**
      * @private
      * @type {HTMLCanvasElement}
      */
    /* private */ var gradient_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var handleGradientChanged_ : Any = js.native
    
    def renderDeclutter(): Unit = js.native
    
    /**
      * Set the blur size in pixels.
      * @param {number} blur Blur size in pixels.
      * @api
      * @observable
      */
    def setBlur(blur: Double): Unit = js.native
    
    /**
      * Set the gradient colors as array of strings.
      * @param {Array<string>} colors Gradient.
      * @api
      * @observable
      */
    def setGradient(colors: js.Array[String]): Unit = js.native
    
    /**
      * Set the size of the radius in pixels.
      * @param {number} radius Radius size in pixel.
      * @api
      * @observable
      */
    def setRadius(radius: Double): Unit = js.native
    
    def weightFunction_(feature: Any): Any = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Blur size in pixels.
      */
    var blur: js.UndefOr[Double] = js.undefined
    
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
      * The color gradient
      * of the heatmap, specified as an array of CSS color strings.
      */
    var gradient: js.UndefOr[js.Array[String]] = js.undefined
    
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
      * Radius size in pixels.
      */
    var radius: js.UndefOr[Double] = js.undefined
    
    /**
      * Point source.
      */
    var source: js.UndefOr[typings.ol.sourceVectorMod.default[typings.ol.geomPointMod.default]] = js.undefined
    
    /**
      * Visibility.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The feature
      * attribute to use for the weight or a function that returns a weight from a feature. Weight values
      * should range from 0 to 1 (and values outside will be clamped to that range).
      */
    var weight: js.UndefOr[String | (js.Function1[/* arg0 */ typings.ol.renderFeatureMod.default, Double])] = js.undefined
    
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
      
      inline def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
      
      inline def setGradient(value: js.Array[String]): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
      
      inline def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
      
      inline def setGradientVarargs(value: String*): Self = StObject.set(x, "gradient", js.Array(value*))
      
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
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setSource(value: typings.ol.sourceVectorMod.default[typings.ol.geomPointMod.default]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWeight(value: String | (js.Function1[/* arg0 */ typings.ol.renderFeatureMod.default, Double])): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightFunction1(value: /* arg0 */ typings.ol.renderFeatureMod.default => Double): Self = StObject.set(x, "weight", js.Any.fromFunction1(value))
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
