package typings.playcanvas.playcanvasMod

import typings.playcanvas.Anon_AutoResolve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.RenderTarget
  * @classdesc A render target is a rectangular rendering surface.
  * @description Creates a new render target. A color buffer or a depth buffer must be set.
  * @param {Object} options Object for passing optional arguments.
  * @param {pc.Texture} [options.colorBuffer] The texture that this render target will treat as a rendering surface.
  * @param {Boolean} [options.depth] If set to true, depth buffer will be created. Defaults to true. Ignored if depthBuffer is defined.
  * @param {Boolean} [options.stencil] If set to true, depth buffer will include stencil. Defaults to false. Ignored if depthBuffer is defined or depth is false.
  * @param {pc.Texture} [options.depthBuffer] The texture that this render target will treat as a depth/stencil surface (WebGL2 only). If set, the 'depth' and 'stencil' properties are ignored.
  * Texture must have pc.PIXELFORMAT_DEPTH or PIXELFORMAT_DEPTHSTENCIL format.
  * @param {Number} [options.samples] Number of hardware anti-aliasing samples (WebGL2 only). Default is 1.
  * @param {Boolean} [options.autoResolve] If samples > 1, enables or disables automatic MSAA resolve after rendering to this RT (see pc.RenderTarget#resolve). Defaults to true;
  * Defaults to true.
  * @param {Number} [options.face] If the colorBuffer parameter is a cubemap, use this option to specify the
  * face of the cubemap to render to. Can be:
  * <ul>
  *     <li>pc.CUBEFACE_POSX</li>
  *     <li>pc.CUBEFACE_NEGX</li>
  *     <li>pc.CUBEFACE_POSY</li>
  *     <li>pc.CUBEFACE_NEGY</li>
  *     <li>pc.CUBEFACE_POSZ</li>
  *     <li>pc.CUBEFACE_NEGZ</li>
  * </ul>
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
  def this(options: Anon_AutoResolve) = this()
}

