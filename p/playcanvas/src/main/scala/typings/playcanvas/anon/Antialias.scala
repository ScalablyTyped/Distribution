package typings.playcanvas.anon

import typings.playcanvas.playcanvasStrings.`high-performance`
import typings.playcanvas.playcanvasStrings.`low-power`
import typings.playcanvas.playcanvasStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Antialias extends StObject {
  
  var antialias: js.UndefOr[Boolean] = js.undefined
  
  var depth: js.UndefOr[Boolean] = js.undefined
  
  var deviceTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  var glslangUrl: js.UndefOr[String] = js.undefined
  
  var powerPreference: js.UndefOr[default | `high-performance` | `low-power`] = js.undefined
  
  var stencil: js.UndefOr[Boolean] = js.undefined
  
  var twgslUrl: js.UndefOr[String] = js.undefined
  
  var xrCompatible: js.UndefOr[Boolean] = js.undefined
}
object Antialias {
  
  inline def apply(): Antialias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Antialias]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Antialias] (val x: Self) extends AnyVal {
    
    inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    inline def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
    
    inline def setDepth(value: Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setDeviceTypes(value: js.Array[String]): Self = StObject.set(x, "deviceTypes", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypesUndefined: Self = StObject.set(x, "deviceTypes", js.undefined)
    
    inline def setDeviceTypesVarargs(value: String*): Self = StObject.set(x, "deviceTypes", js.Array(value*))
    
    inline def setGlslangUrl(value: String): Self = StObject.set(x, "glslangUrl", value.asInstanceOf[js.Any])
    
    inline def setGlslangUrlUndefined: Self = StObject.set(x, "glslangUrl", js.undefined)
    
    inline def setPowerPreference(value: default | `high-performance` | `low-power`): Self = StObject.set(x, "powerPreference", value.asInstanceOf[js.Any])
    
    inline def setPowerPreferenceUndefined: Self = StObject.set(x, "powerPreference", js.undefined)
    
    inline def setStencil(value: Boolean): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
    
    inline def setStencilUndefined: Self = StObject.set(x, "stencil", js.undefined)
    
    inline def setTwgslUrl(value: String): Self = StObject.set(x, "twgslUrl", value.asInstanceOf[js.Any])
    
    inline def setTwgslUrlUndefined: Self = StObject.set(x, "twgslUrl", js.undefined)
    
    inline def setXrCompatible(value: Boolean): Self = StObject.set(x, "xrCompatible", value.asInstanceOf[js.Any])
    
    inline def setXrCompatibleUndefined: Self = StObject.set(x, "xrCompatible", js.undefined)
  }
}
