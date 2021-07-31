package typings.pixiJs.anon

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoDensity extends StObject {
  
  var antialias: js.UndefOr[Boolean] = js.undefined
  
  var autoDensity: js.UndefOr[Boolean] = js.undefined
  
  var backgroundColor: js.UndefOr[Double] = js.undefined
  
  var clearBeforeRender: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
  
  var resolution: js.UndefOr[Double] = js.undefined
  
  var transparent: js.UndefOr[Boolean] = js.undefined
  
  var view: js.UndefOr[HTMLCanvasElement] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object AutoDensity {
  
  @scala.inline
  def apply(): AutoDensity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoDensity]
  }
  
  @scala.inline
  implicit class AutoDensityMutableBuilder[Self <: AutoDensity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
    
    @scala.inline
    def setAutoDensity(value: Boolean): Self = StObject.set(x, "autoDensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDensityUndefined: Self = StObject.set(x, "autoDensity", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: Double): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setClearBeforeRender(value: Boolean): Self = StObject.set(x, "clearBeforeRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearBeforeRenderUndefined: Self = StObject.set(x, "clearBeforeRender", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
    
    @scala.inline
    def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    @scala.inline
    def setView(value: HTMLCanvasElement): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
