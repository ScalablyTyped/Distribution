package typings.playcanvas.global.pc

import typings.playcanvas.anon.Alpha
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The graphics device manages the underlying graphics context. It is responsible for submitting
  * render state changes and graphics primitives to the hardware. A graphics device is tied to a
  * specific canvas HTML element. It is valid to have more than one canvas element per page and
  * create a new graphics device against each.
  *
  * @augments GraphicsDevice
  */
@JSGlobal("pc.WebglGraphicsDevice")
@js.native
open class WebglGraphicsDevice protected ()
  extends typings.playcanvas.mod.WebglGraphicsDevice {
  /**
    * Creates a new WebglGraphicsDevice instance.
    *
    * @param {HTMLCanvasElement} canvas - The canvas to which the graphics device will render.
    * @param {object} [options] - Options passed when creating the WebGL context.
    * @param {boolean} [options.alpha=true] - Boolean that indicates if the canvas contains an
    * alpha buffer.
    * @param {boolean} [options.depth=true] - Boolean that indicates that the drawing buffer is
    * requested to have a depth buffer of at least 16 bits.
    * @param {boolean} [options.stencil=false] - Boolean that indicates that the drawing buffer is
    * requested to have a stencil buffer of at least 8 bits.
    * @param {boolean} [options.antialias=true] - Boolean that indicates whether or not to perform
    * anti-aliasing if possible.
    * @param {boolean} [options.premultipliedAlpha=true] - Boolean that indicates that the page
    * compositor will assume the drawing buffer contains colors with pre-multiplied alpha.
    * @param {boolean} [options.preserveDrawingBuffer=false] - If the value is true the buffers
    * will not be cleared and will preserve their values until cleared or overwritten by the
    * author.
    * @param {'default'|'high-performance'|'low-power'} [options.powerPreference='default'] - A
    * hint to the user agent indicating what configuration of GPU is suitable for the WebGL
    * context. Possible values are:
    *
    * - 'default': Let the user agent decide which GPU configuration is most suitable. This is the
    * default value.
    * - 'high-performance': Prioritizes rendering performance over power consumption.
    * - 'low-power': Prioritizes power saving over rendering performance.
    *
    * @param {boolean} [options.failIfMajorPerformanceCaveat=false] - Boolean that indicates if a
    * context will be created if the system performance is low or if no hardware GPU is available.
    * @param {boolean} [options.preferWebGl2=true] - Boolean that indicates if a WebGl2 context
    * should be preferred.
    * @param {boolean} [options.desynchronized=false] - Boolean that hints the user agent to
    * reduce the latency by desynchronizing the canvas paint cycle from the event loop.
    * @param {boolean} [options.xrCompatible] - Boolean that hints to the user agent to use a
    * compatible graphics adapter for an immersive XR device.
    */
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: HTMLCanvasElement, options: Alpha) = this()
}
