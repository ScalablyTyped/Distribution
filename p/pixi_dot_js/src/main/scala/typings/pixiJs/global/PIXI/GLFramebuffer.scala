package typings.pixiJs.global.PIXI

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
@JSGlobal("PIXI.GLFramebuffer")
@js.native
class GLFramebuffer ()
  extends StObject
     with typings.pixiJs.PIXI.GLFramebuffer {
  
  /**
    * In case we use MSAA, this is actual framebuffer that has colorTextures[0]
    * The contents of that framebuffer are read when we use that renderTexture in sprites
    * @member {PIXI.Framebuffer} PIXI.GLFramebuffer#blitFramebuffer
    */
  /* CompleteClass */
  var blitFramebuffer: typings.pixiJs.PIXI.Framebuffer = js.native
  
  /**
    * latest known version of framebuffer format
    * @member {number} PIXI.GLFramebuffer#dirtyFormat
    * @protected
    */
  /* CompleteClass */
  var dirtyFormat: Double = js.native
  
  /**
    * latest known version of framebuffer
    * @member {number} PIXI.GLFramebuffer#dirtyId
    * @protected
    */
  /* CompleteClass */
  var dirtyId: Double = js.native
  
  /**
    * latest known version of framebuffer size
    * @member {number} PIXI.GLFramebuffer#dirtySize
    * @protected
    */
  /* CompleteClass */
  var dirtySize: Double = js.native
  
  /**
    * The WebGL framebuffer
    * @member {WebGLFramebuffer} PIXI.GLFramebuffer#framebuffer
    */
  /* CompleteClass */
  var framebuffer: WebGLFramebuffer = js.native
  
  /**
    * In case MSAA, we use this Renderbuffer instead of colorTextures[0] when we write info
    * @member {WebGLRenderbuffer} PIXI.GLFramebuffer#msaaBuffer
    */
  /* CompleteClass */
  var msaaBuffer: WebGLRenderbuffer = js.native
  
  /**
    * Detected AA samples number
    * @member {PIXI.MSAA_QUALITY} PIXI.GLFramebuffer#multisample
    */
  /* CompleteClass */
  var multisample: typings.pixiJs.PIXI.MSAA_QUALITY = js.native
  
  /**
    * stencil+depth , usually costs 32bits per pixel
    * @member {WebGLRenderbuffer} PIXI.GLFramebuffer#stencil
    */
  /* CompleteClass */
  var stencil: WebGLRenderbuffer = js.native
}
