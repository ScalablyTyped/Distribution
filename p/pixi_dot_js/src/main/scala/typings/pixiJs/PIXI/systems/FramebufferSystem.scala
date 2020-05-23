package typings.pixiJs.PIXI.systems

import typings.pixiJs.PIXI.Framebuffer
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
    * Clear the color of the context
    *
    * @param {Number} r - Red value from 0 to 1
    * @param {Number} g - Green value from 0 to 1
    * @param {Number} b - Blue value from 0 to 1
    * @param {Number} a - Alpha value from 0 to 1
    */
  def clear(r: Double, g: Double, b: Double, a: Double): Unit = js.native
  /**
    * Sets up the renderer context and necessary buffers.
    */
  def contextChange(): Unit = js.native
  /**
    * Disposes all framebuffers, but not textures bound to them
    * @param {boolean} [contextLost=false] If context was lost, we suppress all delete function calls
    */
  def disposeAll(): Unit = js.native
  def disposeAll(contextLost: Boolean): Unit = js.native
  /**
    * Disposes framebuffer
    * @param {PIXI.Framebuffer} framebuffer framebuffer that has to be disposed of
    * @param {boolean} [contextLost=false] If context was lost, we suppress all delete function calls
    */
  def disposeFramebuffer(framebuffer: Framebuffer): Unit = js.native
  def disposeFramebuffer(framebuffer: Framebuffer, contextLost: Boolean): Unit = js.native
  /**
    * Initialize framebuffer
    *
    * @protected
    * @param {PIXI.Framebuffer} framebuffer
    */
  /* protected */ def initFramebuffer(framebuffer: Framebuffer): Unit = js.native
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

