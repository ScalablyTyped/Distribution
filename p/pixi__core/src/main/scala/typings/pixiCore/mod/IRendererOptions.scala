package typings.pixiCore.mod

import typings.pixiCore.pixiCoreStrings.notMultiplied
import typings.std.HTMLCanvasElement
import typings.std.WebGLPowerPreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRendererOptions
  extends StObject
     with typings.pixiCore.GlobalMixins.IRendererOptions {
  
  var antialias: js.UndefOr[Boolean] = js.undefined
  
  var autoDensity: js.UndefOr[Boolean] = js.undefined
  
  var backgroundAlpha: js.UndefOr[Double] = js.undefined
  
  var backgroundColor: js.UndefOr[Double] = js.undefined
  
  var clearBeforeRender: js.UndefOr[Boolean] = js.undefined
  
  var context: js.UndefOr[IRenderingContext] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var powerPreference: js.UndefOr[WebGLPowerPreference] = js.undefined
  
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
  
  var resolution: js.UndefOr[Double] = js.undefined
  
  /**
    * Use `backgroundAlpha` instead.
    * @deprecated
    */
  var transparent: js.UndefOr[Boolean] = js.undefined
  
  var useContextAlpha: js.UndefOr[Boolean | notMultiplied] = js.undefined
  
  var view: js.UndefOr[HTMLCanvasElement] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object IRendererOptions {
  
  inline def apply(): IRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRendererOptions]
  }
  
  extension [Self <: IRendererOptions](x: Self) {
    
    inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    inline def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
    
    inline def setAutoDensity(value: Boolean): Self = StObject.set(x, "autoDensity", value.asInstanceOf[js.Any])
    
    inline def setAutoDensityUndefined: Self = StObject.set(x, "autoDensity", js.undefined)
    
    inline def setBackgroundAlpha(value: Double): Self = StObject.set(x, "backgroundAlpha", value.asInstanceOf[js.Any])
    
    inline def setBackgroundAlphaUndefined: Self = StObject.set(x, "backgroundAlpha", js.undefined)
    
    inline def setBackgroundColor(value: Double): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setClearBeforeRender(value: Boolean): Self = StObject.set(x, "clearBeforeRender", value.asInstanceOf[js.Any])
    
    inline def setClearBeforeRenderUndefined: Self = StObject.set(x, "clearBeforeRender", js.undefined)
    
    inline def setContext(value: IRenderingContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPowerPreference(value: WebGLPowerPreference): Self = StObject.set(x, "powerPreference", value.asInstanceOf[js.Any])
    
    inline def setPowerPreferenceUndefined: Self = StObject.set(x, "powerPreference", js.undefined)
    
    inline def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    inline def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    inline def setUseContextAlpha(value: Boolean | notMultiplied): Self = StObject.set(x, "useContextAlpha", value.asInstanceOf[js.Any])
    
    inline def setUseContextAlphaUndefined: Self = StObject.set(x, "useContextAlpha", js.undefined)
    
    inline def setView(value: HTMLCanvasElement): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
