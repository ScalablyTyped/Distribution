package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.pluggableMapMod.FrameState
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.stateMod.State
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageCanvasMod {
  
  @JSImport("ol/source/ImageCanvas", JSImport.Default)
  @js.native
  class default () extends ImageCanvasSource {
    def this(opt_options: Options) = this()
  }
  
  type FunctionType = js.ThisFunction5[
    /* this */ typings.ol.olImageCanvasMod.default, 
    /* p0 */ Extent, 
    /* p1 */ Double, 
    /* p2 */ Double, 
    /* p3 */ Size, 
    /* p4 */ typings.ol.projectionMod.default, 
    js.UndefOr[HTMLCanvasElement | Null]
  ]
  
  @js.native
  trait ImageCanvasSource
    extends typings.ol.sourceImageMod.default
  
  @js.native
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.native
    
    var canvasFunction: js.UndefOr[FunctionType] = js.native
    
    var imageSmoothing: js.UndefOr[Boolean] = js.native
    
    var projection: js.UndefOr[ProjectionLike] = js.native
    
    var ratio: js.UndefOr[Double] = js.native
    
    var resolutions: js.UndefOr[js.Array[Double]] = js.native
    
    var state: js.UndefOr[State] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      @scala.inline
      def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value :_*))
      
      @scala.inline
      def setCanvasFunction(value: FunctionType): Self = StObject.set(x, "canvasFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanvasFunctionUndefined: Self = StObject.set(x, "canvasFunction", js.undefined)
      
      @scala.inline
      def setImageSmoothing(value: Boolean): Self = StObject.set(x, "imageSmoothing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSmoothingUndefined: Self = StObject.set(x, "imageSmoothing", js.undefined)
      
      @scala.inline
      def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      @scala.inline
      def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
      
      @scala.inline
      def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value :_*))
      
      @scala.inline
      def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
