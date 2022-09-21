package typings.playcanvas.global.pc

import typings.playcanvas.anon.AutoResolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A render target is a rectangular rendering surface.
  */
@JSGlobal("pc.RenderTarget")
@js.native
open class RenderTarget protected ()
  extends typings.playcanvas.mod.RenderTarget {
  /**
    * Creates a new RenderTarget instance. A color buffer or a depth buffer must be set.
    *
    * @param {object} options - Object for passing optional arguments.
    * @param {boolean} [options.autoResolve] - If samples > 1, enables or disables automatic MSAA
    * resolve after rendering to this RT (see {@link RenderTarget#resolve}). Defaults to true.
    * @param {Texture} [options.colorBuffer] - The texture that this render target will treat as a
    * rendering surface.
    * @param {boolean} [options.depth] - If set to true, depth buffer will be created. Defaults to
    * true. Ignored if depthBuffer is defined.
    * @param {Texture} [options.depthBuffer] - The texture that this render target will treat as a
    * depth/stencil surface (WebGL2 only). If set, the 'depth' and 'stencil' properties are
    * ignored. Texture must have {@link PIXELFORMAT_DEPTH} or {@link PIXELFORMAT_DEPTHSTENCIL}
    * format.
    * @param {number} [options.face] - If the colorBuffer parameter is a cubemap, use this option
    * to specify the face of the cubemap to render to. Can be:
    *
    * - {@link CUBEFACE_POSX}
    * - {@link CUBEFACE_NEGX}
    * - {@link CUBEFACE_POSY}
    * - {@link CUBEFACE_NEGY}
    * - {@link CUBEFACE_POSZ}
    * - {@link CUBEFACE_NEGZ}
    *
    * Defaults to {@link CUBEFACE_POSX}.
    * @param {boolean} [options.flipY] - When set to true the image will be flipped in Y. Default
    * is false.
    * @param {string} [options.name] - The name of the render target.
    * @param {number} [options.samples] - Number of hardware anti-aliasing samples (WebGL2 only).
    * Default is 1.
    * @param {boolean} [options.stencil] - If set to true, depth buffer will include stencil.
    * Defaults to false. Ignored if depthBuffer is defined or depth is false.
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
    * // Set the render target on a camera component
    * camera.renderTarget = renderTarget;
    *
    * // Destroy render target at a later stage. Note that the color buffer needs
    * // to be destroyed separately.
    * renderTarget.colorBuffer.destroy();
    * renderTarget.destroy();
    * camera.renderTarget = null;
    */
  def this(options: AutoResolve, args: Any*) = this()
}
