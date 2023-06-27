package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoResolve extends StObject {
  
  var autoResolve: js.UndefOr[Boolean] = js.undefined
  
  var colorBuffer: js.UndefOr[typings.playcanvas.mod.Texture] = js.undefined
  
  var colorBuffers: js.UndefOr[js.Array[typings.playcanvas.mod.Texture]] = js.undefined
  
  var depth: js.UndefOr[Boolean] = js.undefined
  
  var depthBuffer: js.UndefOr[typings.playcanvas.mod.Texture] = js.undefined
  
  var face: js.UndefOr[Double] = js.undefined
  
  var flipY: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var samples: js.UndefOr[Double] = js.undefined
  
  var stencil: js.UndefOr[Boolean] = js.undefined
}
object AutoResolve {
  
  inline def apply(): AutoResolve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoResolve]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoResolve] (val x: Self) extends AnyVal {
    
    inline def setAutoResolve(value: Boolean): Self = StObject.set(x, "autoResolve", value.asInstanceOf[js.Any])
    
    inline def setAutoResolveUndefined: Self = StObject.set(x, "autoResolve", js.undefined)
    
    inline def setColorBuffer(value: typings.playcanvas.mod.Texture): Self = StObject.set(x, "colorBuffer", value.asInstanceOf[js.Any])
    
    inline def setColorBufferUndefined: Self = StObject.set(x, "colorBuffer", js.undefined)
    
    inline def setColorBuffers(value: js.Array[typings.playcanvas.mod.Texture]): Self = StObject.set(x, "colorBuffers", value.asInstanceOf[js.Any])
    
    inline def setColorBuffersUndefined: Self = StObject.set(x, "colorBuffers", js.undefined)
    
    inline def setColorBuffersVarargs(value: typings.playcanvas.mod.Texture*): Self = StObject.set(x, "colorBuffers", js.Array(value*))
    
    inline def setDepth(value: Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthBuffer(value: typings.playcanvas.mod.Texture): Self = StObject.set(x, "depthBuffer", value.asInstanceOf[js.Any])
    
    inline def setDepthBufferUndefined: Self = StObject.set(x, "depthBuffer", js.undefined)
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setFace(value: Double): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
    
    inline def setFaceUndefined: Self = StObject.set(x, "face", js.undefined)
    
    inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
    
    inline def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    inline def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
    
    inline def setStencil(value: Boolean): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
    
    inline def setStencilUndefined: Self = StObject.set(x, "stencil", js.undefined)
  }
}
