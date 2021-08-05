package typings.pixiJs.PIXI

import typings.std.WebGLFramebuffer
import typings.std.WebGLRenderbuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Internal framebuffer for WebGL context
  * @class
  * @memberof PIXI
  */
trait GLFramebuffer extends StObject {
  
  /**
    * In case we use MSAA, this is actual framebuffer that has colorTextures[0]
    * The contents of that framebuffer are read when we use that renderTexture in sprites
    * @member {PIXI.Framebuffer} PIXI.GLFramebuffer#blitFramebuffer
    */
  var blitFramebuffer: Framebuffer
  
  /**
    * latest known version of framebuffer format
    * @member {number} PIXI.GLFramebuffer#dirtyFormat
    * @protected
    */
  /* protected */ var dirtyFormat: Double
  
  /**
    * latest known version of framebuffer
    * @member {number} PIXI.GLFramebuffer#dirtyId
    * @protected
    */
  /* protected */ var dirtyId: Double
  
  /**
    * latest known version of framebuffer size
    * @member {number} PIXI.GLFramebuffer#dirtySize
    * @protected
    */
  /* protected */ var dirtySize: Double
  
  /**
    * The WebGL framebuffer
    * @member {WebGLFramebuffer} PIXI.GLFramebuffer#framebuffer
    */
  var framebuffer: WebGLFramebuffer
  
  /**
    * In case MSAA, we use this Renderbuffer instead of colorTextures[0] when we write info
    * @member {WebGLRenderbuffer} PIXI.GLFramebuffer#msaaBuffer
    */
  var msaaBuffer: WebGLRenderbuffer
  
  /**
    * Detected AA samples number
    * @member {PIXI.MSAA_QUALITY} PIXI.GLFramebuffer#multisample
    */
  var multisample: MSAA_QUALITY
  
  /**
    * stencil+depth , usually costs 32bits per pixel
    * @member {WebGLRenderbuffer} PIXI.GLFramebuffer#stencil
    */
  var stencil: WebGLRenderbuffer
}
object GLFramebuffer {
  
  inline def apply(
    blitFramebuffer: Framebuffer,
    dirtyFormat: Double,
    dirtyId: Double,
    dirtySize: Double,
    framebuffer: WebGLFramebuffer,
    msaaBuffer: WebGLRenderbuffer,
    multisample: MSAA_QUALITY,
    stencil: WebGLRenderbuffer
  ): GLFramebuffer = {
    val __obj = js.Dynamic.literal(blitFramebuffer = blitFramebuffer.asInstanceOf[js.Any], dirtyFormat = dirtyFormat.asInstanceOf[js.Any], dirtyId = dirtyId.asInstanceOf[js.Any], dirtySize = dirtySize.asInstanceOf[js.Any], framebuffer = framebuffer.asInstanceOf[js.Any], msaaBuffer = msaaBuffer.asInstanceOf[js.Any], multisample = multisample.asInstanceOf[js.Any], stencil = stencil.asInstanceOf[js.Any])
    __obj.asInstanceOf[GLFramebuffer]
  }
  
  extension [Self <: GLFramebuffer](x: Self) {
    
    inline def setBlitFramebuffer(value: Framebuffer): Self = StObject.set(x, "blitFramebuffer", value.asInstanceOf[js.Any])
    
    inline def setDirtyFormat(value: Double): Self = StObject.set(x, "dirtyFormat", value.asInstanceOf[js.Any])
    
    inline def setDirtyId(value: Double): Self = StObject.set(x, "dirtyId", value.asInstanceOf[js.Any])
    
    inline def setDirtySize(value: Double): Self = StObject.set(x, "dirtySize", value.asInstanceOf[js.Any])
    
    inline def setFramebuffer(value: WebGLFramebuffer): Self = StObject.set(x, "framebuffer", value.asInstanceOf[js.Any])
    
    inline def setMsaaBuffer(value: WebGLRenderbuffer): Self = StObject.set(x, "msaaBuffer", value.asInstanceOf[js.Any])
    
    inline def setMultisample(value: MSAA_QUALITY): Self = StObject.set(x, "multisample", value.asInstanceOf[js.Any])
    
    inline def setStencil(value: WebGLRenderbuffer): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
  }
}
