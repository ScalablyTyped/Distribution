package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.sourceSourceMod.State
import typings.ol.viewMod.ViewStateAndExtent
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceImageCanvasMod {
  
  /**
    * A function returning the canvas element (`{HTMLCanvasElement}`)
    * used by the source as an image. The arguments passed to the function are:
    * {@link module:ol/extent~Extent} the image extent, `{number}` the image resolution,
    * `{number}` the pixel ratio of the map, {@link module:ol/size~Size} the image size,
    * and {@link module:ol/proj/Projection~Projection} the image projection. The canvas returned by
    * this function is cached by the source. The this keyword inside the function
    * references the {@link module:ol/source/ImageCanvas~ImageCanvasSource}.
    *
    * @typedef {function(this:import("../ImageCanvas.js").default, import("../extent.js").Extent, number,
    *     number, import("../size.js").Size, import("../proj/Projection.js").default): HTMLCanvasElement} FunctionType
    */
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {FunctionType} [canvasFunction] Canvas function.
    * The function returning the canvas element used by the source
    * as an image. The arguments passed to the function are: {@link import("../extent.js").Extent} the
    * image extent, `{number}` the image resolution, `{number}` the pixel ratio of the map,
    * {@link import("../size.js").Size} the image size, and {@link import("../proj/Projection.js").default} the image
    * projection. The canvas returned by this function is cached by the source. If
    * the value returned by the function is later changed then
    * `changed` should be called on the source for the source to
    * invalidate the current cached image. See: {@link module:ol/Observable~Observable#changed}
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {number} [ratio=1.5] Ratio. 1 means canvases are the size of the map viewport, 2 means twice the
    * width and height of the map viewport, and so on. Must be `1` or higher.
    * @property {Array<number>} [resolutions] Resolutions.
    * If specified, new canvases will be created for these resolutions
    * @property {import("./Source.js").State} [state] Source state.
    */
  /**
    * @classdesc
    * Base class for image sources where a canvas element is the image.
    * @api
    */
  @JSImport("ol/source/ImageCanvas", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] ImageCanvas options.
    */
  open class default () extends ImageCanvasSource {
    def this(options: Options) = this()
  }
  
  type FunctionType = js.ThisFunction5[
    /* this */ typings.ol.imageCanvasMod.default, 
    /* arg1 */ Extent, 
    /* arg2 */ Double, 
    /* arg3 */ Double, 
    /* arg4 */ Size, 
    /* arg5 */ typings.ol.projProjectionMod.default, 
    HTMLCanvasElement
  ]
  
  /**
    * A function returning the canvas element (`{HTMLCanvasElement}`)
    * used by the source as an image. The arguments passed to the function are:
    * {@link module:ol/extent~Extent} the image extent, `{number}` the image resolution,
    * `{number}` the pixel ratio of the map, {@link module:ol/size~Size} the image size,
    * and {@link module:ol/proj/Projection~Projection} the image projection. The canvas returned by
    * this function is cached by the source. The this keyword inside the function
    * references the {@link module:ol/source/ImageCanvas~ImageCanvasSource}.
    *
    * @typedef {function(this:import("../ImageCanvas.js").default, import("../extent.js").Extent, number,
    *     number, import("../size.js").Size, import("../proj/Projection.js").default): HTMLCanvasElement} FunctionType
    */
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {FunctionType} [canvasFunction] Canvas function.
    * The function returning the canvas element used by the source
    * as an image. The arguments passed to the function are: {@link import("../extent.js").Extent} the
    * image extent, `{number}` the image resolution, `{number}` the pixel ratio of the map,
    * {@link import("../size.js").Size} the image size, and {@link import("../proj/Projection.js").default} the image
    * projection. The canvas returned by this function is cached by the source. If
    * the value returned by the function is later changed then
    * `changed` should be called on the source for the source to
    * invalidate the current cached image. See: {@link module:ol/Observable~Observable#changed}
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {number} [ratio=1.5] Ratio. 1 means canvases are the size of the map viewport, 2 means twice the
    * width and height of the map viewport, and so on. Must be `1` or higher.
    * @property {Array<number>} [resolutions] Resolutions.
    * If specified, new canvases will be created for these resolutions
    * @property {import("./Source.js").State} [state] Source state.
    */
  /**
    * @classdesc
    * Base class for image sources where a canvas element is the image.
    * @api
    */
  @js.native
  trait ImageCanvasSource
    extends typings.ol.sourceImageMod.default {
    
    /**
      * @private
      * @type {FunctionType}
      */
    /* private */ var canvasFunction_ : Any = js.native
    
    /**
      * @private
      * @type {import("../ImageCanvas.js").default}
      */
    /* private */ var canvas_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var ratio_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var renderedRevision_ : Any = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Attributions.
      */
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    /**
      * Canvas function.
      * The function returning the canvas element used by the source
      * as an image. The arguments passed to the function are: {@link import ("../extent.js").Extent} the
      * image extent, `{number}` the image resolution, `{number}` the pixel ratio of the map,
      * {@link import ("../size.js").Size} the image size, and {@link import ("../proj/Projection.js").default} the image
      * projection. The canvas returned by this function is cached by the source. If
      * the value returned by the function is later changed then
      * `changed` should be called on the source for the source to
      * invalidate the current cached image. See: {@link module :ol/Observable~Observable#changed}
      */
    var canvasFunction: js.UndefOr[FunctionType] = js.undefined
    
    /**
      * Use interpolated values when resampling.  By default,
      * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
      */
    var interpolate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Projection. Default is the view projection.
      */
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * Ratio. 1 means canvases are the size of the map viewport, 2 means twice the
      * width and height of the map viewport, and so on. Must be `1` or higher.
      */
    var ratio: js.UndefOr[Double] = js.undefined
    
    /**
      * Resolutions.
      * If specified, new canvases will be created for these resolutions
      */
    var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Source state.
      */
    var state: js.UndefOr[State] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      inline def setAttributionsFunction1(value: /* arg0 */ ViewStateAndExtent => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      inline def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value*))
      
      inline def setCanvasFunction(value: FunctionType): Self = StObject.set(x, "canvasFunction", value.asInstanceOf[js.Any])
      
      inline def setCanvasFunctionUndefined: Self = StObject.set(x, "canvasFunction", js.undefined)
      
      inline def setInterpolate(value: Boolean): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      inline def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      inline def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
      
      inline def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value*))
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
