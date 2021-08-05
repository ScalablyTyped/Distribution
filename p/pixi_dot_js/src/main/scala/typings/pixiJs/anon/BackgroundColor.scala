package typings.pixiJs.anon

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColor extends StObject {
  
  var antialias: js.UndefOr[Boolean] = js.undefined
  
  var autoDensity: js.UndefOr[Boolean] = js.undefined
  
  var backgroundColor: js.UndefOr[Double] = js.undefined
  
  var clearBeforeRender: js.UndefOr[Boolean] = js.undefined
  
  var context: js.UndefOr[js.Any] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var powerPreference: js.UndefOr[String] = js.undefined
  
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
  
  var resolution: js.UndefOr[Double] = js.undefined
  
  var transparent: js.UndefOr[Boolean] = js.undefined
  
  var view: js.UndefOr[HTMLCanvasElement] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object BackgroundColor {
  
  inline def apply(): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColor]
  }
  
  extension [Self <: BackgroundColor](x: Self) {
    
    inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    inline def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
    
    inline def setAutoDensity(value: Boolean): Self = StObject.set(x, "autoDensity", value.asInstanceOf[js.Any])
    
    inline def setAutoDensityUndefined: Self = StObject.set(x, "autoDensity", js.undefined)
    
    inline def setBackgroundColor(value: Double): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setClearBeforeRender(value: Boolean): Self = StObject.set(x, "clearBeforeRender", value.asInstanceOf[js.Any])
    
    inline def setClearBeforeRenderUndefined: Self = StObject.set(x, "clearBeforeRender", js.undefined)
    
    inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPowerPreference(value: String): Self = StObject.set(x, "powerPreference", value.asInstanceOf[js.Any])
    
    inline def setPowerPreferenceUndefined: Self = StObject.set(x, "powerPreference", js.undefined)
    
    inline def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    inline def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    inline def setView(value: HTMLCanvasElement): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
