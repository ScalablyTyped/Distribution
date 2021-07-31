package typings.ol

import typings.ol.olFeatureMod.FeatureLike
import typings.ol.pixelMod.Pixel
import typings.ol.pluggableMapMod.FrameState
import typings.ol.renderEventMod.default
import typings.ol.sizeMod.Size
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderMod {
  
  @JSImport("ol/render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getRenderPixel(event: default, pixel: Pixel): Pixel = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderPixel")(event.asInstanceOf[js.Any], pixel.asInstanceOf[js.Any])).asInstanceOf[Pixel]
  
  @scala.inline
  def getVectorContext(event: default): typings.ol.immediateMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getVectorContext")(event.asInstanceOf[js.Any]).asInstanceOf[typings.ol.immediateMod.default]
  
  @scala.inline
  def renderDeclutterItems(frameState: FrameState, declutterTree: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("renderDeclutterItems")(frameState.asInstanceOf[js.Any], declutterTree.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def toContext(context: CanvasRenderingContext2D): typings.ol.immediateMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("toContext")(context.asInstanceOf[js.Any]).asInstanceOf[typings.ol.immediateMod.default]
  @scala.inline
  def toContext(context: CanvasRenderingContext2D, opt_options: ToContextOptions): typings.ol.immediateMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("toContext")(context.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[typings.ol.immediateMod.default]
  
  type OrderFunction = js.Function2[/* p0 */ FeatureLike, /* p1 */ FeatureLike, Double]
  
  trait State extends StObject {
    
    var context: CanvasRenderingContext2D
    
    var feature: FeatureLike
    
    var geometry: typings.ol.simpleGeometryMod.default
    
    var pixelRatio: Double
    
    var resolution: Double
    
    var rotation: Double
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
  
  trait ToContextOptions extends StObject {
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
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
