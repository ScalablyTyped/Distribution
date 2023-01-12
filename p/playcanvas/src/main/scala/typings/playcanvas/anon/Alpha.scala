package typings.playcanvas.anon

import typings.playcanvas.playcanvasStrings.`high-performance`
import typings.playcanvas.playcanvasStrings.`low-power`
import typings.playcanvas.playcanvasStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alpha extends StObject {
  
  var alpha: js.UndefOr[Boolean] = js.undefined
  
  var antialias: js.UndefOr[Boolean] = js.undefined
  
  var depth: js.UndefOr[Boolean] = js.undefined
  
  var desynchronized: js.UndefOr[Boolean] = js.undefined
  
  var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.undefined
  
  var powerPreference: js.UndefOr[default | `high-performance` | `low-power`] = js.undefined
  
  var preferWebGl2: js.UndefOr[Boolean] = js.undefined
  
  var premultipliedAlpha: js.UndefOr[Boolean] = js.undefined
  
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
  
  var stencil: js.UndefOr[Boolean] = js.undefined
  
  var xrCompatible: js.UndefOr[Boolean] = js.undefined
}
object Alpha {
  
  inline def apply(): Alpha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alpha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alpha] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    inline def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
    
    inline def setDepth(value: Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setDesynchronized(value: Boolean): Self = StObject.set(x, "desynchronized", value.asInstanceOf[js.Any])
    
    inline def setDesynchronizedUndefined: Self = StObject.set(x, "desynchronized", js.undefined)
    
    inline def setFailIfMajorPerformanceCaveat(value: Boolean): Self = StObject.set(x, "failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
    
    inline def setFailIfMajorPerformanceCaveatUndefined: Self = StObject.set(x, "failIfMajorPerformanceCaveat", js.undefined)
    
    inline def setPowerPreference(value: default | `high-performance` | `low-power`): Self = StObject.set(x, "powerPreference", value.asInstanceOf[js.Any])
    
    inline def setPowerPreferenceUndefined: Self = StObject.set(x, "powerPreference", js.undefined)
    
    inline def setPreferWebGl2(value: Boolean): Self = StObject.set(x, "preferWebGl2", value.asInstanceOf[js.Any])
    
    inline def setPreferWebGl2Undefined: Self = StObject.set(x, "preferWebGl2", js.undefined)
    
    inline def setPremultipliedAlpha(value: Boolean): Self = StObject.set(x, "premultipliedAlpha", value.asInstanceOf[js.Any])
    
    inline def setPremultipliedAlphaUndefined: Self = StObject.set(x, "premultipliedAlpha", js.undefined)
    
    inline def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    inline def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
    
    inline def setStencil(value: Boolean): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
    
    inline def setStencilUndefined: Self = StObject.set(x, "stencil", js.undefined)
    
    inline def setXrCompatible(value: Boolean): Self = StObject.set(x, "xrCompatible", value.asInstanceOf[js.Any])
    
    inline def setXrCompatibleUndefined: Self = StObject.set(x, "xrCompatible", js.undefined)
  }
}
