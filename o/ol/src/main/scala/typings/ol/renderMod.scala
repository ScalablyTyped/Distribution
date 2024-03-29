package typings.ol

import typings.ol.eventsEventMod.default
import typings.ol.featureMod.FeatureLike
import typings.ol.pixelMod.Pixel
import typings.ol.sizeMod.Size
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderMod {
  
  @JSImport("ol/render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRenderPixel(event: default, pixel: Pixel): Pixel = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderPixel")(event.asInstanceOf[js.Any], pixel.asInstanceOf[js.Any])).asInstanceOf[Pixel]
  
  inline def getVectorContext(event: default): typings.ol.renderCanvasImmediateMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getVectorContext")(event.asInstanceOf[js.Any]).asInstanceOf[typings.ol.renderCanvasImmediateMod.default]
  
  inline def toContext(context: CanvasRenderingContext2D): typings.ol.renderCanvasImmediateMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("toContext")(context.asInstanceOf[js.Any]).asInstanceOf[typings.ol.renderCanvasImmediateMod.default]
  inline def toContext(context: CanvasRenderingContext2D, options: ToContextOptions): typings.ol.renderCanvasImmediateMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("toContext")(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ol.renderCanvasImmediateMod.default]
  
  type OrderFunction = js.Function2[/* arg0 */ FeatureLike, /* arg1 */ FeatureLike, Double]
  
  trait State extends StObject {
    
    /**
      * Canvas context that the layer is being rendered to.
      */
    var context: CanvasRenderingContext2D
    
    /**
      * Feature.
      */
    var feature: FeatureLike
    
    /**
      * Geometry.
      */
    var geometry: typings.ol.geomSimpleGeometryMod.default
    
    /**
      * Pixel ratio used by the layer renderer.
      */
    var pixelRatio: Double
    
    /**
      * Resolution that the render batch was created and optimized for.
      * This is not the view's resolution that is being rendered.
      */
    var resolution: Double
    
    /**
      * Rotation of the rendered layer in radians.
      */
    var rotation: Double
  }
  object State {
    
    inline def apply(
      context: CanvasRenderingContext2D,
      feature: FeatureLike,
      geometry: typings.ol.geomSimpleGeometryMod.default,
      pixelRatio: Double,
      resolution: Double,
      rotation: Double
    ): State = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setContext(value: CanvasRenderingContext2D): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setFeature(value: FeatureLike): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setGeometry(value: typings.ol.geomSimpleGeometryMod.default): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    }
  }
  
  trait ToContextOptions extends StObject {
    
    /**
      * Pixel ratio (canvas
      * pixel to css pixel ratio) for the canvas.
      */
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Desired size of the canvas in css
      * pixels. When provided, both canvas and css size will be set according to the
      * `pixelRatio`. If not provided, the current canvas and css sizes will not be
      * altered.
      */
    var size: js.UndefOr[Size] = js.undefined
  }
  object ToContextOptions {
    
    inline def apply(): ToContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToContextOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToContextOptions] (val x: Self) extends AnyVal {
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value*))
    }
  }
}
