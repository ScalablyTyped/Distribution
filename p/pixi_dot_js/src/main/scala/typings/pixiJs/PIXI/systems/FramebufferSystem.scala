package typings.pixiJs.PIXI.systems

import typings.pixiJs.PIXI.BUFFER_BITS
import typings.pixiJs.PIXI.Framebuffer
import typings.pixiJs.PIXI.GLFramebuffer
import typings.pixiJs.PIXI.MSAA_QUALITY
import typings.pixiJs.PIXI.Rectangle
import typings.pixiJs.PIXI.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System plugin to the renderer to manage framebuffers.
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI.systems
  */
@js.native
trait FramebufferSystem extends System {
  /**
    * A list of managed framebuffers
    * @member {PIXI.Framebuffer[]} PIXI.systems.FramebufferSystem#managedFramebuffers
    * @readonly
    */
  val managedFramebuffers: js.Array[Framebuffer] = js.native
  /**
    * Get the size of the current width and height. Returns object with `width` and `height` values.
    *
    * @member {object}
    * @readonly
    */
  val size: js.Any = js.native
  /**
    * Framebuffer value that shows that we don't know what is bound
    * @member {Framebuffer} PIXI.systems.FramebufferSystem#unknownFramebuffer
    * @readonly
    */
  val unknownFramebuffer: Framebuffer = js.native
  /**
    * Bind a framebuffer
    *
    * @param {PIXI.Framebuffer} framebuffer
    * @param {PIXI.Rectangle} [frame] frame, default is framebuffer size
    */
  def bind(framebuffer: Framebuffer): Unit = js.native
  def bind(framebuffer: Framebuffer, frame: Rectangle): Unit = js.native
  /**
    * Only works with WebGL2
    *
    * blits framebuffer to another of the same or bigger size
    * after that target framebuffer is bound
    *
    * Fails with WebGL warning if blits multisample framebuffer to different size
    *
    * @param {PIXI.Framebuffer} [framebuffer] - by default it blits "into itself", from renderBuffer to texture.
    * @param {PIXI.Rectangle} [sourcePixels] - source rectangle in pixels
    * @param {PIXI.Rectangle} [destPixels] - dest rectangle in pixels, assumed to be the same as sourcePixels
    */
  def blit(): Unit = js.native
  def blit(
    framebuffer: js.UndefOr[scala.Nothing],
    sourcePixels: js.UndefOr[scala.Nothing],
    destPixels: Rectangle
  ): Unit = js.native
  def blit(framebuffer: js.UndefOr[scala.Nothing], sourcePixels: Rectangle): Unit = js.native
  def blit(framebuffer: js.UndefOr[scala.Nothing], sourcePixels: Rectangle, destPixels: Rectangle): Unit = js.native
  def blit(framebuffer: Framebuffer): Unit = js.native
  def blit(framebuffer: Framebuffer, sourcePixels: js.UndefOr[scala.Nothing], destPixels: Rectangle): Unit = js.native
  def blit(framebuffer: Framebuffer, sourcePixels: Rectangle): Unit = js.native
  def blit(framebuffer: Framebuffer, sourcePixels: Rectangle, destPixels: Rectangle): Unit = js.native
  /**
    * Clear the color of the context
    *
    * @param {Number} r - Red value from 0 to 1
    * @param {Number} g - Green value from 0 to 1
    * @param {Number} b - Blue value from 0 to 1
    * @param {Number} a - Alpha value from 0 to 1
    * @param {PIXI.BUFFER_BITS} [mask=BUFFER_BITS.COLOR | BUFFER_BITS.DEPTH] - Bitwise OR of masks
    *  that indicate the buffers to be cleared, by default COLOR and DEPTH buffers.
    */
  def clear(r: Double, g: Double, b: Double, a: Double): Unit = js.native
  def clear(r: Double, g: Double, b: Double, a: Double, mask: BUFFER_BITS): Unit = js.native
  /**
    * Sets up the renderer context and necessary buffers.
    */
  def contextChange(): Unit = js.native
  /**
    * Detects number of samples that is not more than a param but as close to it as possible
    *
    * @param {PIXI.MSAA_QUALITY} samples - number of samples
    * @returns {PIXI.MSAA_QUALITY} - recommended number of samples
    */
  def detectSamples(samples: MSAA_QUALITY): MSAA_QUALITY = js.native
  /**
    * Disposes all framebuffers, but not textures bound to them
    * @param {boolean} [contextLost=false] - If context was lost, we suppress all delete function calls
    */
  def disposeAll(): Unit = js.native
  def disposeAll(contextLost: Boolean): Unit = js.native
  /**
    * Disposes framebuffer
    * @param {PIXI.Framebuffer} framebuffer - framebuffer that has to be disposed of
    * @param {boolean} [contextLost=false] - If context was lost, we suppress all delete function calls
    */
  def disposeFramebuffer(framebuffer: Framebuffer): Unit = js.native
  def disposeFramebuffer(framebuffer: Framebuffer, contextLost: Boolean): Unit = js.native
  /**
    * Initialize framebuffer for this context
    *
    * @protected
    * @param {PIXI.Framebuffer} framebuffer
    * @returns {PIXI.GLFramebuffer} created GLFramebuffer
    */
  /* protected */ def initFramebuffer(framebuffer: Framebuffer): GLFramebuffer = js.native
  /**
    * resets framebuffer stored state, binds screen framebuffer
    *
    * should be called before renderTexture reset()
    */
  def reset(): Unit = js.native
  /**
    * Resize the framebuffer
    *
    * @protected
    * @param {PIXI.Framebuffer} framebuffer
    */
  /* protected */ def resizeFramebuffer(framebuffer: Framebuffer): Unit = js.native
  /**
    * Set the WebGLRenderingContext's viewport.
    *
    * @param {Number} x - X position of viewport
    * @param {Number} y - Y position of viewport
    * @param {Number} width - Width of viewport
    * @param {Number} height - Height of viewport
    */
  def setViewport(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  /**
    * Update the framebuffer
    *
    * @protected
    * @param {PIXI.Framebuffer} framebuffer
    */
  /* protected */ def updateFramebuffer(framebuffer: Framebuffer): Unit = js.native
}

