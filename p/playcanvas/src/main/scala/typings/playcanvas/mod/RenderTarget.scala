package typings.playcanvas.mod

import typings.playcanvas.anon.AutoResolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new render target. A color buffer or a depth buffer must be set.
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
  * @param options - Object for passing optional arguments.
  * @param [options.colorBuffer] - The texture that this render target will treat as a rendering surface.
  * @param [options.depth] - If set to true, depth buffer will be created. Defaults to true. Ignored if depthBuffer is defined.
  * @param [options.stencil] - If set to true, depth buffer will include stencil. Defaults to false. Ignored if depthBuffer is defined or depth is false.
  * @param [options.depthBuffer] - The texture that this render target will treat as a depth/stencil surface (WebGL2 only). If set, the 'depth' and 'stencil' properties are ignored.
  * Texture must have pc.PIXELFORMAT_DEPTH or PIXELFORMAT_DEPTHSTENCIL format.
  * @param [options.samples] - Number of hardware anti-aliasing samples (WebGL2 only). Default is 1.
  * @param [options.autoResolve] - If samples > 1, enables or disables automatic MSAA resolve after rendering to this RT (see pc.RenderTarget#resolve). Defaults to true;
  * Defaults to true.
  * @param [options.face] - If the colorBuffer parameter is a cubemap, use this option to specify the
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
  */
@JSImport("playcanvas", "RenderTarget")
@js.native
class RenderTarget protected ()
  extends StObject
     with typings.playcanvas.pc.RenderTarget {
  def this(options: AutoResolve) = this()
}
