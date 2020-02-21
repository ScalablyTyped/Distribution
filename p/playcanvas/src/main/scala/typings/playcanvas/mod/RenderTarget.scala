package typings.playcanvas.mod

import typings.playcanvas.AnonAutoResolve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.RenderTarget
  * @classdesc A render target is a rectangular rendering surface.
  * @description Creates a new render target. A color buffer or a depth buffer must be set.
  * @param {object} options - Object for passing optional arguments.
  * @param {pc.Texture} [options.colorBuffer] - The texture that this render target will treat as a rendering surface.
  * @param {boolean} [options.depth] - If set to true, depth buffer will be created. Defaults to true. Ignored if depthBuffer is defined.
  * @param {boolean} [options.stencil] - If set to true, depth buffer will include stencil. Defaults to false. Ignored if depthBuffer is defined or depth is false.
  * @param {pc.Texture} [options.depthBuffer] - The texture that this render target will treat as a depth/stencil surface (WebGL2 only). If set, the 'depth' and 'stencil' properties are ignored.
  * Texture must have pc.PIXELFORMAT_DEPTH or PIXELFORMAT_DEPTHSTENCIL format.
  * @param {number} [options.samples] - Number of hardware anti-aliasing samples (WebGL2 only). Default is 1.
  * @param {boolean} [options.autoResolve] - If samples > 1, enables or disables automatic MSAA resolve after rendering to this RT (see pc.RenderTarget#resolve). Defaults to true;
  * Defaults to true.
  * @param {number} [options.face] - If the colorBuffer parameter is a cubemap, use this option to specify the
  * face of the cubemap to render to. Can be:
  *
  * * {@link pc.CUBEFACE_POSX}
  * * {@link pc.CUBEFACE_NEGX}
  * * {@link pc.CUBEFACE_POSY}
  * * {@link pc.CUBEFACE_NEGY}
  * * {@link pc.CUBEFACE_POSZ}
  * * {@link pc.CUBEFACE_NEGZ}
  *
  * Defaults to pc.CUBEFACE_POSX.
  * @example
  * // Create a 512x512x24-bit render target with a depth buffer
  * var colorBuffer = new pc.Texture(graphicsDevice, {
  *     width: 512,
  *     height: 512,
  *     format: pc.PIXELFORMAT_R8_G8_B8
  * });
  * var renderTarget = new pc.RenderTarget({
  *     colorBuffer: colorBuffer,
  *     depth: true
  * });
  *
  * // Set the render target on a layer
  * layer.renderTarget = renderTarget;
  */
@JSImport("playcanvas", "RenderTarget")
@js.native
class RenderTarget protected ()
  extends typings.playcanvas.pc.RenderTarget {
  def this(options: AnonAutoResolve) = this()
}

