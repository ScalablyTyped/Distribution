package typings.playcanvas.mod

import typings.playcanvas.anon.CompileTime
import typings.playcanvas.anon.Depth
import typings.playcanvas.anon.Ib
import typings.std.DOMRect
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
  * @augments EventHandler
  */
@JSImport("playcanvas", "GraphicsDevice")
@js.native
open class GraphicsDevice protected () extends EventHandler {
  def this(canvas: Any, options: Any) = this()
  
  var _drawCallsPerFrame: Double = js.native
  
  var _height: Double = js.native
  
  /**
    * Reports whether a texture source is a canvas, image, video or ImageBitmap.
    *
    * @param {*} texture - Texture source data.
    * @returns {boolean} True if the texture is a canvas, image, video or ImageBitmap and false
    * otherwise.
    * @ignore
    */
  def _isBrowserInterface(texture: Any): Boolean = js.native
  
  def _isImageBrowserInterface(texture: Any): Boolean = js.native
  
  def _isImageCanvasInterface(texture: Any): Boolean = js.native
  
  def _isImageVideoInterface(texture: Any): Boolean = js.native
  
  var _maxPixelRatio: Double = js.native
  
  var _primsPerFrame: js.Array[Double] = js.native
  
  var _renderTargetCreationTime: Double = js.native
  
  var _shaderStats: CompileTime = js.native
  
  var _shaderSwitchesPerFrame: Double = js.native
  
  var _vram: Ib = js.native
  
  var _width: Double = js.native
  
  /**
    * An object representing current blend state
    *
    * @ignore
    */
  var blendState: BlendState = js.native
  
  /**
    * The maximum number of supported bones using uniform buffers.
    *
    * @type {number}
    * @readonly
    */
  val boneLimit: Double = js.native
  
  var buffers: js.Array[Any] = js.native
  
  /**
    * The canvas DOM element that provides the underlying WebGL context used by the graphics device.
    *
    * @type {HTMLCanvasElement}
    * @readonly
    */
  val canvas: HTMLCanvasElement = js.native
  
  var clientRect: DOMRect = js.native
  
  var cullMode: Double = js.native
  
  var defaultClearOptions: Depth = js.native
  
  /**
    * The current depth state.
    *
    * @ignore
    */
  var depthState: DepthState = js.native
  
  /**
    * Fired when the canvas is resized.
    *
    * @event GraphicsDevice#resizecanvas
    * @param {number} width - The new width of the canvas in pixels.
    * @param {number} height - The new height of the canvas in pixels.
    */
  /**
    * Destroy the graphics device.
    */
  def destroy(): Unit = js.native
  
  /**
    * The type of the device. Can be one of pc.DEVICETYPE_WEBGL1, pc.DEVICETYPE_WEBGL2 or pc.DEVICETYPE_WEBGPU.
    *
    * @type {import('./constants.js').DEVICETYPE_WEBGL1 | import('./constants.js').DEVICETYPE_WEBGL2 | import('./constants.js').DEVICETYPE_WEBGPU}
    */
  def deviceType: String = js.native
  
  /**
    * Function which executes at the start of the frame. This should not be called manually, as
    * it is handled by the AppBase instance.
    *
    * @ignore
    */
  def frameStart(): Unit = js.native
  
  def fullscreen: Boolean = js.native
  /**
    * Fullscreen mode.
    *
    * @type {boolean}
    */
  def fullscreen_=(arg: Boolean): Unit = js.native
  
  /**
    * Queries the maximum number of bones that can be referenced by a shader. The shader
    * generators (programlib) use this number to specify the matrix array size of the uniform
    * 'matrix_pose[0]'. The value is calculated based on the number of available uniform vectors
    * available after subtracting the number taken by a typical heavyweight shader. If a different
    * number is required, it can be tuned via {@link GraphicsDevice#setBoneLimit}.
    *
    * @returns {number} The maximum number of bones that can be supported by the host hardware.
    * @ignore
    */
  def getBoneLimit(): Double = js.native
  
  /**
    * Queries the currently set render target on the device.
    *
    * @returns {import('./render-target.js').RenderTarget} The current render target.
    * @example
    * // Get the current render target
    * const renderTarget = device.getRenderTarget();
    */
  def getRenderTarget(): RenderTarget = js.native
  
  /**
    * Height of the back buffer in pixels.
    *
    * @type {number}
    */
  def height: Double = js.native
  
  var indexBuffer: IndexBuffer = js.native
  
  var initOptions: Any = js.native
  
  /**
    * Initialize render target before it can be used.
    *
    * @param {import('./render-target.js').RenderTarget} target - The render target to be
    * initialized.
    * @ignore
    */
  def initRenderTarget(target: RenderTarget): Unit = js.native
  
  def initializeContextCaches(): Unit = js.native
  
  def initializeRenderState(): Unit = js.native
  
  /** @type {boolean} */
  var insideRenderPass: Boolean = js.native
  
  /**
    * True if the deviceType is WebGPU
    *
    * @type {boolean}
    * @readonly
    */
  val isWebGPU: Boolean = js.native
  
  /**
    * The maximum supported texture anisotropy setting.
    *
    * @type {number}
    * @readonly
    */
  val maxAnisotropy: Double = js.native
  
  /**
    * The maximum supported number of color buffers attached to a render target.
    *
    * @type {number}
    * @readonly
    */
  val maxColorAttachments: Double = js.native
  
  /**
    * The maximum supported dimension of a cube map.
    *
    * @type {number}
    * @readonly
    */
  val maxCubeMapSize: Double = js.native
  
  def maxPixelRatio: Double = js.native
  /**
    * Maximum pixel ratio.
    *
    * @type {number}
    */
  def maxPixelRatio_=(arg: Double): Unit = js.native
  
  /**
    * The maximum supported dimension of a texture.
    *
    * @type {number}
    * @readonly
    */
  val maxTextureSize: Double = js.native
  
  /**
    * The maximum supported dimension of a 3D texture (any axis).
    *
    * @type {number}
    * @readonly
    */
  val maxVolumeSize: Double = js.native
  
  def onDestroyShader(shader: Any): Unit = js.native
  
  def postDestroy(): Unit = js.native
  
  /**
    * Function that executes after the device has been created.
    */
  def postInit(): Unit = js.native
  
  /**
    * The highest shader precision supported by this graphics device. Can be 'hiphp', 'mediump' or
    * 'lowp'.
    *
    * @type {string}
    * @readonly
    */
  val precision: String = js.native
  
  /**
    * A vertex buffer representing a quad.
    *
    * @type {VertexBuffer}
    * @ignore
    */
  var quadVertexBuffer: VertexBuffer = js.native
  
  /**
    * Index of the currently active render pass.
    *
    * @type {number}
    * @ignore
    */
  var renderPassIndex: Double = js.native
  
  /**
    * Currently active render target.
    *
    * @type {import('./render-target.js').RenderTarget}
    * @ignore
    */
  var renderTarget: RenderTarget = js.native
  
  /**
    * A version number that is incremented every frame. This is used to detect if some object were
    * invalidated.
    *
    * @type {number}
    * @ignore
    */
  var renderVersion: Double = js.native
  
  /**
    * Sets the width and height of the canvas, then fires the `resizecanvas` event. Note that the
    * specified width and height values will be multiplied by the value of
    * {@link GraphicsDevice#maxPixelRatio} to give the final resultant width and height for the
    * canvas.
    *
    * @param {number} width - The new width of the canvas.
    * @param {number} height - The new height of the canvas.
    * @ignore
    */
  def resizeCanvas(width: Double, height: Double): Unit = js.native
  
  /**
    * The number of hardware anti-aliasing samples used by the frame buffer.
    *
    * @readonly
    * @type {number}
    */
  val samples: Double = js.native
  
  /**
    * The scope namespace for shader attributes and variables.
    *
    * @type {ScopeSpace}
    * @readonly
    */
  val scope: ScopeSpace = js.native
  
  /**
    * Sets the specified blend state.
    *
    * @param {BlendState} blendState - New blend state.
    */
  def setBlendState(blendState: BlendState): Unit = js.native
  
  /**
    * Specifies the maximum number of bones that the device can support on the current hardware.
    * This function allows the default calculated value based on available vector uniforms to be
    * overridden.
    *
    * @param {number} maxBones - The maximum number of bones supported by the host hardware.
    * @ignore
    */
  def setBoneLimit(maxBones: Double): Unit = js.native
  
  /**
    * Controls how triangles are culled based on their face direction. The default cull mode is
    * {@link CULLFACE_BACK}.
    *
    * @param {number} cullMode - The cull mode to set. Can be:
    *
    * - {@link CULLFACE_NONE}
    * - {@link CULLFACE_BACK}
    * - {@link CULLFACE_FRONT}
    */
  def setCullMode(cullMode: Double): Unit = js.native
  
  /**
    * Sets the specified depth state.
    *
    * @param {DepthState} depthState - New depth state.
    */
  def setDepthState(depthState: DepthState): Unit = js.native
  
  /**
    * Sets the current index buffer on the graphics device. On subsequent calls to
    * {@link GraphicsDevice#draw}, the specified index buffer will be used to provide index data
    * for any indexed primitives.
    *
    * @param {import('./index-buffer.js').IndexBuffer} indexBuffer - The index buffer to assign to
    * the device.
    */
  def setIndexBuffer(indexBuffer: IndexBuffer): Unit = js.native
  
  /**
    * Sets the specified render target on the device. If null is passed as a parameter, the back
    * buffer becomes the current target for all rendering operations.
    *
    * @param {import('./render-target.js').RenderTarget} renderTarget - The render target to
    * activate.
    * @example
    * // Set a render target to receive all rendering output
    * device.setRenderTarget(renderTarget);
    *
    * // Set the back buffer to receive all rendering output
    * device.setRenderTarget(null);
    */
  def setRenderTarget(renderTarget: RenderTarget): Unit = js.native
  
  /**
    * Sets the width and height of the canvas, then fires the `resizecanvas` event. Note that the
    * value of {@link GraphicsDevice#maxPixelRatio} is ignored.
    *
    * @param {number} width - The new width of the canvas.
    * @param {number} height - The new height of the canvas.
    * @ignore
    */
  def setResolution(width: Double, height: Double): Unit = js.native
  
  /**
    * Sets the specified stencil state. If both stencilFront and stencilBack are null, stencil
    * operation is disabled.
    *
    * @param {StencilParameters} [stencilFront] - The front stencil parameters. Defaults to
    * {@link StencilParameters.DEFAULT} if not specified.
    * @param {StencilParameters} [stencilBack] - The back stencil parameters. Defaults to
    * {@link StencilParameters.DEFAULT} if not specified.
    */
  def setStencilState(): Unit = js.native
  def setStencilState(stencilFront: Unit, stencilBack: StencilParameters): Unit = js.native
  def setStencilState(stencilFront: StencilParameters): Unit = js.native
  def setStencilState(stencilFront: StencilParameters, stencilBack: StencilParameters): Unit = js.native
  
  /**
    * Sets the current vertex buffer on the graphics device. On subsequent calls to
    * {@link GraphicsDevice#draw}, the specified vertex buffer(s) will be used to provide vertex
    * data for any primitives.
    *
    * @param {import('./vertex-buffer.js').VertexBuffer} vertexBuffer - The vertex buffer to
    * assign to the device.
    */
  def setVertexBuffer(vertexBuffer: VertexBuffer): Unit = js.native
  
  var sh: Double = js.native
  
  var shader: Any = js.native
  
  /** @type {import('./shader.js').Shader[]} */
  var shaders: js.Array[Shader] = js.native
  
  /**
    * The current back stencil parameters.
    *
    * @ignore
    */
  var stencilBack: StencilParameters = js.native
  
  /**
    * True if stencil is enabled and stencilFront and stencilBack are used
    *
    * @ignore
    */
  var stencilEnabled: Boolean = js.native
  
  /**
    * The current front stencil parameters.
    *
    * @ignore
    */
  var stencilFront: StencilParameters = js.native
  
  /**
    * True if hardware instancing is supported.
    *
    * @type {boolean}
    * @readonly
    */
  val supportsInstancing: Boolean = js.native
  
  /**
    * True if Multiple Render Targets feature is supported. This refers to the ability to render to
    * multiple color textures with a single draw call.
    *
    * @readonly
    * @type {boolean}
    */
  val supportsMrt: Boolean = js.native
  
  /**
    * True if the main framebuffer contains stencil attachment.
    *
    * @ignore
    * @type {boolean}
    */
  var supportsStencil: Boolean = js.native
  
  /**
    * True if the device supports uniform buffers.
    *
    * @type {boolean}
    * @ignore
    */
  var supportsUniformBuffers: Boolean = js.native
  
  /**
    * True if the device supports volume textures.
    *
    * @readonly
    * @type {boolean}
    */
  val supportsVolumeTextures: Boolean = js.native
  
  var sw: Double = js.native
  
  var sx: Double = js.native
  
  var sy: Double = js.native
  
  /** @type {import('./render-target.js').RenderTarget[]} */
  var targets: js.Array[RenderTarget] = js.native
  
  var textureBias: ScopeId = js.native
  
  /**
    * True if 32-bit floating-point textures can be used as a frame buffer.
    *
    * @type {boolean}
    * @readonly
    */
  val textureFloatRenderable: Boolean = js.native
  
  /**
    * True if 16-bit floating-point textures can be used as a frame buffer.
    *
    * @type {boolean}
    * @readonly
    */
  val textureHalfFloatRenderable: Boolean = js.native
  
  /** @type {import('./texture.js').Texture[]} */
  var textures: js.Array[Texture] = js.native
  
  def toJSON(key: Any): Any = js.native
  
  def updateClientRect(): Unit = js.native
  
  var vertexBuffers: js.Array[Any] = js.native
  
  var vh: Double = js.native
  
  var vw: Double = js.native
  
  var vx: Double = js.native
  
  var vy: Double = js.native
  
  /**
    * Width of the back buffer in pixels.
    *
    * @type {number}
    */
  def width: Double = js.native
}
object GraphicsDevice {
  
  @JSImport("playcanvas", "GraphicsDevice")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("playcanvas", "GraphicsDevice.EVENT_RESIZE")
  @js.native
  def EVENT_RESIZE: String = js.native
  inline def EVENT_RESIZE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_RESIZE")(x.asInstanceOf[js.Any])
}
