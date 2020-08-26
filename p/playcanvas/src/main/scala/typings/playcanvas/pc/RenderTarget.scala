package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@js.native
trait RenderTarget extends js.Object {
  /**
    * Color buffer set up on the render target.
    */
  val colorBuffer: Texture = js.native
  /**
    * Depth buffer set up on the render target. Only available, if depthBuffer was set in constructor.
    * Not available, if depth property was used instead.
    */
  val depthBuffer: Texture = js.native
  /**
    * If the render target is bound to a cubemap, this property
    * specifies which face of the cubemap is rendered to. Can be:
    *
    * * {@link pc.CUBEFACE_POSX}
    * * {@link pc.CUBEFACE_NEGX}
    * * {@link pc.CUBEFACE_POSY}
    * * {@link pc.CUBEFACE_NEGY}
    * * {@link pc.CUBEFACE_POSZ}
    * * {@link pc.CUBEFACE_NEGZ}
    */
  val face: Double = js.native
  /**
    * Height of the render target in pixels.
    */
  val height: Double = js.native
  /**
    * Width of the render target in pixels.
    */
  val width: Double = js.native
  /**
    * Copies color and/or depth contents of source render target to this one. Formats, sizes and anti-aliasing samples must match.
    * Depth buffer can only be copied on WebGL 2.0.
    * @param source - Source render target to copy from.
    * @param [color] - If true will copy the color buffer. Defaults to false.
    * @param [depth] - If true will copy the depth buffer. Defaults to false.
    * @returns True if the copy was successful, false otherwise.
    */
  def copy(source: RenderTarget): Boolean = js.native
  def copy(source: RenderTarget, color: js.UndefOr[scala.Nothing], depth: Boolean): Boolean = js.native
  def copy(source: RenderTarget, color: Boolean): Boolean = js.native
  def copy(source: RenderTarget, color: Boolean, depth: Boolean): Boolean = js.native
  /**
    * Frees resources associated with this render target.
    */
  def destroy(): Unit = js.native
  /**
    * If samples > 1, resolves the anti-aliased render target (WebGL2 only).
    * When you're rendering to an anti-aliased render target, pixels aren't written directly to the readable texture.
    * Instead, they're first written to a MSAA buffer, where each sample for each pixel is stored independently.
    * In order to read the results, you first need to 'resolve' the buffer - to average all samples and create a simple texture with one color per pixel.
    * This function performs this averaging and updates the colorBuffer and the depthBuffer.
    * If autoResolve is set to true, the resolve will happen after every rendering to this render target, otherwise you can do it manually,
    * during the app update or inside a pc.Command.
    * @param color - Resolve color buffer.
    * @param depth - Resolve depth buffer.
    */
  def resolve(color: Boolean, depth: Boolean): Unit = js.native
}

