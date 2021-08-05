package typings.playcanvas.anon

import typings.playcanvas.pc.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoResolve extends StObject {
  
  var autoResolve: js.UndefOr[Boolean] = js.undefined
  
  var colorBuffer: js.UndefOr[Texture] = js.undefined
  
  var depth: js.UndefOr[Boolean] = js.undefined
  
  var depthBuffer: js.UndefOr[Texture] = js.undefined
  
  var face: js.UndefOr[Double] = js.undefined
  
  var samples: js.UndefOr[Double] = js.undefined
  
  var stencil: js.UndefOr[Boolean] = js.undefined
}
object AutoResolve {
  
  inline def apply(): AutoResolve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoResolve]
  }
  
  extension [Self <: AutoResolve](x: Self) {
    
    inline def setAutoResolve(value: Boolean): Self = StObject.set(x, "autoResolve", value.asInstanceOf[js.Any])
    
    inline def setAutoResolveUndefined: Self = StObject.set(x, "autoResolve", js.undefined)
    
    inline def setColorBuffer(value: Texture): Self = StObject.set(x, "colorBuffer", value.asInstanceOf[js.Any])
    
    inline def setColorBufferUndefined: Self = StObject.set(x, "colorBuffer", js.undefined)
    
    inline def setDepth(value: Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthBuffer(value: Texture): Self = StObject.set(x, "depthBuffer", value.asInstanceOf[js.Any])
    
    inline def setDepthBufferUndefined: Self = StObject.set(x, "depthBuffer", js.undefined)
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setFace(value: Double): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
    
    inline def setFaceUndefined: Self = StObject.set(x, "face", js.undefined)
    
    inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    inline def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
    
    inline def setStencil(value: Boolean): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
    
    inline def setStencilUndefined: Self = StObject.set(x, "stencil", js.undefined)
  }
}
