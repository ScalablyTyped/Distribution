package typings.pixiJs.anon

import typings.std.EXTTextureFilterAnisotropic
import typings.std.OESTextureFloat
import typings.std.OESVertexArrayObject
import typings.std.WEBGLDepthTexture
import typings.std.WEBGLDrawBuffers
import typings.std.WEBGLLoseContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnisotropicFiltering extends StObject {
  
  var anisotropicFiltering: EXTTextureFilterAnisotropic
  
  var depthTexture: WEBGLDepthTexture
  
  var drawBuffers: WEBGLDrawBuffers
  
  var floatTexture: OESTextureFloat
  
  var loseContext: WEBGLLoseContext
  
  var vertexArrayObject: OESVertexArrayObject
}
object AnisotropicFiltering {
  
  inline def apply(
    anisotropicFiltering: EXTTextureFilterAnisotropic,
    depthTexture: WEBGLDepthTexture,
    drawBuffers: WEBGLDrawBuffers,
    floatTexture: OESTextureFloat,
    loseContext: WEBGLLoseContext,
    vertexArrayObject: OESVertexArrayObject
  ): AnisotropicFiltering = {
    val __obj = js.Dynamic.literal(anisotropicFiltering = anisotropicFiltering.asInstanceOf[js.Any], depthTexture = depthTexture.asInstanceOf[js.Any], drawBuffers = drawBuffers.asInstanceOf[js.Any], floatTexture = floatTexture.asInstanceOf[js.Any], loseContext = loseContext.asInstanceOf[js.Any], vertexArrayObject = vertexArrayObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnisotropicFiltering]
  }
  
  extension [Self <: AnisotropicFiltering](x: Self) {
    
    inline def setAnisotropicFiltering(value: EXTTextureFilterAnisotropic): Self = StObject.set(x, "anisotropicFiltering", value.asInstanceOf[js.Any])
    
    inline def setDepthTexture(value: WEBGLDepthTexture): Self = StObject.set(x, "depthTexture", value.asInstanceOf[js.Any])
    
    inline def setDrawBuffers(value: WEBGLDrawBuffers): Self = StObject.set(x, "drawBuffers", value.asInstanceOf[js.Any])
    
    inline def setFloatTexture(value: OESTextureFloat): Self = StObject.set(x, "floatTexture", value.asInstanceOf[js.Any])
    
    inline def setLoseContext(value: WEBGLLoseContext): Self = StObject.set(x, "loseContext", value.asInstanceOf[js.Any])
    
    inline def setVertexArrayObject(value: OESVertexArrayObject): Self = StObject.set(x, "vertexArrayObject", value.asInstanceOf[js.Any])
  }
}
