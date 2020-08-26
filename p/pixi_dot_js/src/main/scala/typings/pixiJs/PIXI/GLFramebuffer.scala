package typings.pixiJs.PIXI

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
@js.native
trait GLFramebuffer extends js.Object {
  /**
    * In case we use MSAA, this is actual framebuffer that has colorTextures[0]
    * The contents of that framebuffer are read when we use that renderTexture in sprites
    * @member {PIXI.Framebuffer} PIXI.GLFramebuffer#blitFramebuffer
    */
  var blitFramebuffer: Framebuffer = js.native
  /**
    * latest known version of framebuffer format
    * @member {number} PIXI.GLFramebuffer#dirtyFormat
    * @protected
    */
  var dirtyFormat: Double = js.native
  /**
    * latest known version of framebuffer
    * @member {number} PIXI.GLFramebuffer#dirtyId
    * @protected
    */
  var dirtyId: Double = js.native
  /**
    * latest known version of framebuffer size
    * @member {number} PIXI.GLFramebuffer#dirtySize
    * @protected
    */
  var dirtySize: Double = js.native
  /**
    * The WebGL framebuffer
    * @member {WebGLFramebuffer} PIXI.GLFramebuffer#framebuffer
    */
  var framebuffer: WebGLFramebuffer = js.native
  /**
    * In case MSAA, we use this Renderbuffer instead of colorTextures[0] when we write info
    * @member {WebGLRenderbuffer} PIXI.GLFramebuffer#msaaBuffer
    */
  var msaaBuffer: WebGLRenderbuffer = js.native
  /**
    * Detected AA samples number
    * @member {PIXI.MSAA_QUALITY} PIXI.GLFramebuffer#multisample
    */
  var multisample: MSAA_QUALITY = js.native
  /**
    * stencil+depth , usually costs 32bits per pixel
    * @member {WebGLRenderbuffer} PIXI.GLFramebuffer#stencil
    */
  var stencil: WebGLRenderbuffer = js.native
}

object GLFramebuffer {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class GLFramebufferOps[Self <: GLFramebuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlitFramebuffer(value: Framebuffer): Self = this.set("blitFramebuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirtyFormat(value: Double): Self = this.set("dirtyFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirtyId(value: Double): Self = this.set("dirtyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirtySize(value: Double): Self = this.set("dirtySize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFramebuffer(value: WebGLFramebuffer): Self = this.set("framebuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsaaBuffer(value: WebGLRenderbuffer): Self = this.set("msaaBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultisample(value: MSAA_QUALITY): Self = this.set("multisample", value.asInstanceOf[js.Any])
    @scala.inline
    def setStencil(value: WebGLRenderbuffer): Self = this.set("stencil", value.asInstanceOf[js.Any])
  }
  
}

