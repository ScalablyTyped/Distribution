package typings.ol

import typings.ol.olFeatureMod.FeatureLike
import typings.ol.pixelMod.Pixel
import typings.ol.pluggableMapMod.FrameState
import typings.ol.renderEventMod.default
import typings.ol.sizeMod.Size
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderMod {
  
  @JSImport("ol/render", "getRenderPixel")
  @js.native
  def getRenderPixel(event: default, pixel: Pixel): Pixel = js.native
  
  @JSImport("ol/render", "getVectorContext")
  @js.native
  def getVectorContext(event: default): typings.ol.immediateMod.default = js.native
  
  @JSImport("ol/render", "renderDeclutterItems")
  @js.native
  def renderDeclutterItems(frameState: FrameState, declutterTree: js.Any): js.Any = js.native
  
  @JSImport("ol/render", "toContext")
  @js.native
  def toContext(context: CanvasRenderingContext2D): typings.ol.immediateMod.default = js.native
  @JSImport("ol/render", "toContext")
  @js.native
  def toContext(context: CanvasRenderingContext2D, opt_options: ToContextOptions): typings.ol.immediateMod.default = js.native
  
  type OrderFunction = js.Function2[/* p0 */ FeatureLike, /* p1 */ FeatureLike, Double]
  
  @js.native
  trait State extends StObject {
    
    var context: CanvasRenderingContext2D = js.native
    
    var feature: FeatureLike = js.native
    
    var geometry: typings.ol.simpleGeometryMod.default = js.native
    
    var pixelRatio: Double = js.native
    
    var resolution: Double = js.native
    
    var rotation: Double = js.native
  }
  object State {
    
    @scala.inline
    def apply(
      context: CanvasRenderingContext2D,
      feature: FeatureLike,
      geometry: typings.ol.simpleGeometryMod.default,
      pixelRatio: Double,
      resolution: Double,
      rotation: Double
    ): State = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: CanvasRenderingContext2D): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeature(value: FeatureLike): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometry(value: typings.ol.simpleGeometryMod.default): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ToContextOptions extends StObject {
    
    var pixelRatio: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[Size] = js.native
  }
  object ToContextOptions {
    
    @scala.inline
    def apply(): ToContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToContextOptions]
    }
    
    @scala.inline
    implicit class ToContextOptionsMutableBuilder[Self <: ToContextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
