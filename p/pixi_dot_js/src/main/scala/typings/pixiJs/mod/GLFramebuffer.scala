package typings.pixiJs.mod

import typings.std.WebGLFramebuffer
import typings.std.WebGLRenderbuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Internal framebuffer for WebGL context
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "GLFramebuffer")
@js.native
class GLFramebuffer ()
  extends typings.pixiJs.PIXI.GLFramebuffer {
  /**
    * In case we use MSAA, this is actual framebuffer that has colorTextures[0]
    * The contents of that framebuffer are read when we use that renderTexture in sprites
    * @member {PIXI.Framebuffer} PIXI.GLFramebuffer#blitFramebuffer
    */
  /* CompleteClass */
  override var blitFramebuffer: typings.pixiJs.PIXI.Framebuffer = js.native
  /**
    * latest known version of framebuffer format
    * @member {number} PIXI.GLFramebuffer#dirtyFormat
    * @protected
    */
  /* CompleteClass */
  override var dirtyFormat: Double = js.native
  /**
    * latest known version of framebuffer
    * @member {number} PIXI.GLFramebuffer#dirtyId
    * @protected
    */
  /* CompleteClass */
  override var dirtyId: Double = js.native
  /**
    * latest known version of framebuffer size
    * @member {number} PIXI.GLFramebuffer#dirtySize
    * @protected
    */
  /* CompleteClass */
  override var dirtySize: Double = js.native
  /**
    * The WebGL framebuffer
    * @member {WebGLFramebuffer} PIXI.GLFramebuffer#framebuffer
    */
  /* CompleteClass */
  override var framebuffer: WebGLFramebuffer = js.native
  /**
    * In case MSAA, we use this Renderbuffer instead of colorTextures[0] when we write info
    * @member {WebGLRenderbuffer} PIXI.GLFramebuffer#msaaBuffer
    */
  /* CompleteClass */
  override var msaaBuffer: WebGLRenderbuffer = js.native
  /**
    * Detected AA samples number
    * @member {PIXI.MSAA_QUALITY} PIXI.GLFramebuffer#multisample
    */
  /* CompleteClass */
  override var multisample: typings.pixiJs.PIXI.MSAA_QUALITY = js.native
  /**
    * stencil+depth , usually costs 32bits per pixel
    * @member {WebGLRenderbuffer} PIXI.GLFramebuffer#stencil
    */
  /* CompleteClass */
  override var stencil: WebGLRenderbuffer = js.native
}

