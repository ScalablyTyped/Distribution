package typings.playcanvas.mod

import typings.playcanvas.anon.Alpha
import typings.playcanvas.anon.Base
import typings.playcanvas.anon.Flags
import typings.std.ANGLEInstancedArrays
import typings.std.HTMLCanvasElement
import typings.std.Map
import typings.std.WEBGLDepthTexture
import typings.std.WebGL2RenderingContext
import typings.std.WebGLFramebuffer
import typings.std.WebGLTransformFeedback
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
@JSImport("playcanvas", "WebglGraphicsDevice")
@js.native
open class WebglGraphicsDevice protected () extends GraphicsDevice {
  /**
    * Creates a new WebglGraphicsDevice instance.
    *
    * @param {HTMLCanvasElement} canvas - The canvas to which the graphics device will render.
    * @param {object} [options] - Options passed when creating the WebGL context.
    * @param {boolean} [options.alpha=true] - Boolean that indicates if the canvas contains an
    * alpha buffer.
    * @param {boolean} [options.depth=true] - Boolean that indicates that the drawing buffer is
    * requested to have a depth buffer of at least 16 bits.
    * @param {boolean} [options.stencil=true] - Boolean that indicates that the drawing buffer is
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
    * @param {WebGLRenderingContext | WebGL2RenderingContext} [options.gl] - The rendering context
    * to use. If not specified, a new context will be created.
    */
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: HTMLCanvasElement, options: Alpha) = this()
  
  def _contextLostHandler(event: Any): Unit = js.native
  
  def _contextRestoredHandler(): Unit = js.native
  
  var _copyShader: Shader = js.native
  
  var _deviceType: String = js.native
  
  var _extDisjointTimerQuery: ANGLEInstancedArrays = js.native
  
  var _tempEnableSafariTextureUnitWorkaround: Boolean = js.native
  
  var _tempMacChromeBlitFramebufferWorkaround: Boolean = js.native
  
  var _textureFloatHighPrecision: Boolean = js.native
  
  var _textureHalfFloatUpdatable: Boolean = js.native
  
  var _vaoMap: Map[Any, Any] = js.native
  
  var activeFramebuffer: Any = js.native
  
  /**
    * Activate the specified texture unit.
    *
    * @param {number} textureUnit - The texture unit to activate.
    * @ignore
    */
  def activeTexture(textureUnit: Double): Unit = js.native
  
  var alphaToCoverage: Any = js.native
  
  var areaLightLutFormat: Double = js.native
  
  var attributesInvalidated: Boolean = js.native
  
  /**
    * If the texture is not already bound on the currently active texture unit, bind it.
    *
    * @param {Texture} texture - The texture to bind.
    * @ignore
    */
  def bindTexture(texture: Texture): Unit = js.native
  
  /**
    * If the texture is not bound on the specified texture unit, active the texture unit and bind
    * the texture to it.
    *
    * @param {Texture} texture - The texture to bind.
    * @param {number} textureUnit - The texture unit to activate and bind the texture to.
    * @ignore
    */
  def bindTextureOnUnit(texture: Texture, textureUnit: Double): Unit = js.native
  
  var blendColor: Color = js.native
  
  var boundVao: Any = js.native
  
  /**
    * Clears the frame buffer of the currently set render target.
    *
    * @param {object} [options] - Optional options object that controls the behavior of the clear
    * operation defined as follows:
    * @param {number[]} [options.color] - The color to clear the color buffer to in the range 0.0
    * to 1.0 for each component.
    * @param {number} [options.depth=1] - The depth value to clear the depth buffer to in the
    * range 0.0 to 1.0.
    * @param {number} [options.flags] - The buffers to clear (the types being color, depth and
    * stencil). Can be any bitwise combination of:
    *
    * - {@link CLEARFLAG_COLOR}
    * - {@link CLEARFLAG_DEPTH}
    * - {@link CLEARFLAG_STENCIL}
    *
    * @param {number} [options.stencil=0] - The stencil value to clear the stencil buffer to. Defaults to 0.
    * @example
    * // Clear color buffer to black and depth buffer to 1.0
    * device.clear();
    *
    * // Clear just the color buffer to red
    * device.clear({
    *     color: [1, 0, 0, 1],
    *     flags: pc.CLEARFLAG_COLOR
    * });
    *
    * // Clear color buffer to yellow and depth to 1.0
    * device.clear({
    *     color: [1, 1, 0, 1],
    *     depth: 1,
    *     flags: pc.CLEARFLAG_COLOR | pc.CLEARFLAG_DEPTH
    * });
    */
  def clear(): Unit = js.native
  def clear(options: Flags): Unit = js.native
  
  var clearColor: Color = js.native
  
  var clearDepth: Any = js.native
  
  var clearStencil: Any = js.native
  
  /**
    * Frees memory from all vertex array objects ever allocated with this device.
    *
    * @ignore
    */
  def clearVertexArrayObjectCache(): Unit = js.native
  
  var commitFunction: js.Array[js.Object] = js.native
  
  var constantTexSource: ScopeId = js.native
  
  var contextLost: Boolean = js.native
  
  /**
    * Copies source render target into destination render target. Mostly used by post-effects.
    *
    * @param {RenderTarget} [source] - The source render target. Defaults to frame buffer.
    * @param {RenderTarget} [dest] - The destination render target. Defaults to frame buffer.
    * @param {boolean} [color] - If true will copy the color buffer. Defaults to false.
    * @param {boolean} [depth] - If true will copy the depth buffer. Defaults to false.
    * @returns {boolean} True if the copy was successful, false otherwise.
    */
  def copyRenderTarget(): Boolean = js.native
  def copyRenderTarget(source: Unit, dest: Unit, color: Boolean): Boolean = js.native
  def copyRenderTarget(source: Unit, dest: Unit, color: Boolean, depth: Boolean): Boolean = js.native
  def copyRenderTarget(source: Unit, dest: Unit, color: Unit, depth: Boolean): Boolean = js.native
  def copyRenderTarget(source: Unit, dest: RenderTarget): Boolean = js.native
  def copyRenderTarget(source: Unit, dest: RenderTarget, color: Boolean): Boolean = js.native
  def copyRenderTarget(source: Unit, dest: RenderTarget, color: Boolean, depth: Boolean): Boolean = js.native
  def copyRenderTarget(source: Unit, dest: RenderTarget, color: Unit, depth: Boolean): Boolean = js.native
  def copyRenderTarget(source: RenderTarget): Boolean = js.native
  def copyRenderTarget(source: RenderTarget, dest: Unit, color: Boolean): Boolean = js.native
  def copyRenderTarget(source: RenderTarget, dest: Unit, color: Boolean, depth: Boolean): Boolean = js.native
  def copyRenderTarget(source: RenderTarget, dest: Unit, color: Unit, depth: Boolean): Boolean = js.native
  def copyRenderTarget(source: RenderTarget, dest: RenderTarget): Boolean = js.native
  def copyRenderTarget(source: RenderTarget, dest: RenderTarget, color: Boolean): Boolean = js.native
  def copyRenderTarget(source: RenderTarget, dest: RenderTarget, color: Boolean, depth: Boolean): Boolean = js.native
  def copyRenderTarget(source: RenderTarget, dest: RenderTarget, color: Unit, depth: Boolean): Boolean = js.native
  
  def createIndexBufferImpl(indexBuffer: Any): WebglIndexBuffer = js.native
  
  def createRenderTargetImpl(renderTarget: Any): WebglRenderTarget = js.native
  
  def createShaderImpl(shader: Any): WebglShader = js.native
  
  def createTextureImpl(texture: Any): WebglTexture = js.native
  
  def createVertexArray(vertexBuffers: Any): Any = js.native
  
  def createVertexBufferImpl(vertexBuffer: Any, format: Any): WebglVertexBuffer = js.native
  
  var cullFace: Any = js.native
  
  var defaultFramebuffer: Any = js.native
  
  var depthBiasEnabled: Any = js.native
  
  /**
    * Submits a graphical primitive to the hardware for immediate rendering.
    *
    * @param {object} primitive - Primitive object describing how to submit current vertex/index
    * buffers.
    * @param {number} primitive.type - The type of primitive to render. Can be:
    *
    * - {@link PRIMITIVE_POINTS}
    * - {@link PRIMITIVE_LINES}
    * - {@link PRIMITIVE_LINELOOP}
    * - {@link PRIMITIVE_LINESTRIP}
    * - {@link PRIMITIVE_TRIANGLES}
    * - {@link PRIMITIVE_TRISTRIP}
    * - {@link PRIMITIVE_TRIFAN}
    *
    * @param {number} primitive.base - The offset of the first index or vertex to dispatch in the
    * draw call.
    * @param {number} primitive.count - The number of indices or vertices to dispatch in the draw
    * call.
    * @param {boolean} [primitive.indexed] - True to interpret the primitive as indexed, thereby
    * using the currently set index buffer and false otherwise.
    * @param {number} [numInstances=1] - The number of instances to render when using
    * ANGLE_instanced_arrays. Defaults to 1.
    * @param {boolean} [keepBuffers] - Optionally keep the current set of vertex / index buffers /
    * VAO. This is used when rendering of multiple views, for example under WebXR.
    * @example
    * // Render a single, unindexed triangle
    * device.draw({
    *     type: pc.PRIMITIVE_TRIANGLES,
    *     base: 0,
    *     count: 3,
    *     indexed: false
    * });
    */
  def draw(primitive: Base): Unit = js.native
  def draw(primitive: Base, numInstances: Double): Unit = js.native
  def draw(primitive: Base, numInstances: Double, keepBuffers: Boolean): Unit = js.native
  def draw(primitive: Base, numInstances: Unit, keepBuffers: Boolean): Unit = js.native
  
  /**
    * End a render pass.
    *
    * @param {import('../render-pass.js').RenderPass} renderPass - The render pass to end.
    * @ignore
    */
  def endPass(renderPass: RenderPass): Unit = js.native
  
  /**
    * Called after a batch of shaders was created, to guide in their optimal preparation for rendering.
    *
    * @ignore
    */
  def endShaderBatch(): Unit = js.native
  
  var extBlendMinmax: Boolean | ANGLEInstancedArrays = js.native
  
  var extColorBufferFloat: ANGLEInstancedArrays = js.native
  
  var extColorBufferHalfFloat: ANGLEInstancedArrays = js.native
  
  var extCompressedTextureASTC: ANGLEInstancedArrays = js.native
  
  var extCompressedTextureATC: ANGLEInstancedArrays = js.native
  
  var extCompressedTextureETC: ANGLEInstancedArrays = js.native
  
  var extCompressedTextureETC1: ANGLEInstancedArrays = js.native
  
  var extCompressedTexturePVRTC: ANGLEInstancedArrays = js.native
  
  var extCompressedTextureS3TC: ANGLEInstancedArrays = js.native
  
  var extDebugRendererInfo: ANGLEInstancedArrays = js.native
  
  var extDepthTexture: Boolean | WEBGLDepthTexture = js.native
  
  def extDisjointTimerQuery: ANGLEInstancedArrays = js.native
  
  var extDrawBuffers: Boolean | ANGLEInstancedArrays = js.native
  
  var extFloatBlend: ANGLEInstancedArrays = js.native
  
  var extInstancing: Boolean | ANGLEInstancedArrays = js.native
  
  var extParallelShaderCompile: ANGLEInstancedArrays = js.native
  
  var extStandardDerivatives: Boolean | ANGLEInstancedArrays = js.native
  
  var extTextureFilterAnisotropic: ANGLEInstancedArrays = js.native
  
  var extTextureFloat: Boolean | ANGLEInstancedArrays = js.native
  
  var extTextureFloatLinear: ANGLEInstancedArrays = js.native
  
  var extTextureHalfFloat: Boolean | ANGLEInstancedArrays = js.native
  
  var extTextureHalfFloatLinear: ANGLEInstancedArrays = js.native
  
  var extTextureLod: Boolean | ANGLEInstancedArrays = js.native
  
  var extUintElement: Boolean | ANGLEInstancedArrays = js.native
  
  var extVertexArrayObject: Boolean | ANGLEInstancedArrays = js.native
  
  var feedback: WebGLTransformFeedback = js.native
  
  var forceDisableMultisampling: Boolean = js.native
  
  var fragmentUniformsCount: Any = js.native
  
  var framebufferFormat: Double = js.native
  
  /**
    * Get copy shader for efficient rendering of fullscreen-quad with texture.
    *
    * @returns {Shader} The copy shader (based on `fullscreenQuadVS` and `outputTex2DPS` in
    * `shaderChunks`).
    * @ignore
    */
  def getCopyShader(): Shader = js.native
  
  def getExtension(args: Any*): ANGLEInstancedArrays = js.native
  
  /**
    * Get a supported HDR pixel format given a set of hardware support requirements.
    *
    * @param {boolean} preferLargest - If true, prefer the highest precision format. Otherwise prefer the lowest precision format.
    * @param {boolean} renderable - If true, only include pixel formats that can be used as render targets.
    * @param {boolean} updatable - If true, only include formats that can be updated by the CPU.
    * @param {boolean} filterable - If true, only include formats that support texture filtering.
    *
    * @returns {number} The HDR pixel format or null if there are none.
    * @ignore
    */
  def getHdrFormat(preferLargest: Boolean, renderable: Boolean, updatable: Boolean, filterable: Boolean): Double = js.native
  
  /**
    * Query the precision supported by ints and floats in vertex and fragment shaders. Note that
    * getShaderPrecisionFormat is not guaranteed to be present (such as some instances of the
    * default Android browser). In this case, assume highp is available.
    *
    * @returns {string} "highp", "mediump" or "lowp"
    * @ignore
    */
  def getPrecision(): String = js.native
  
  /**
    * The WebGL context managed by the graphics device. The type could also technically be
    * `WebGLRenderingContext` if WebGL 2.0 is not available. But in order for IntelliSense to be
    * able to function for all WebGL calls in the codebase, we specify `WebGL2RenderingContext`
    * here instead.
    *
    * @type {WebGL2RenderingContext}
    * @ignore
    */
  var gl: WebGL2RenderingContext = js.native
  
  var glAddress: js.Array[Any] = js.native
  
  var glBlendEquation: js.Array[Any] = js.native
  
  var glBlendFunctionAlpha: js.Array[Any] = js.native
  
  var glBlendFunctionColor: js.Array[Any] = js.native
  
  var glClearFlag: js.Array[Any] = js.native
  
  var glComparison: js.Array[Any] = js.native
  
  var glCull: js.Array[Any] = js.native
  
  var glFilter: js.Array[Any] = js.native
  
  var glPrimitive: js.Array[Any] = js.native
  
  var glStencilOp: js.Array[Any] = js.native
  
  var glType: js.Array[Any] = js.native
  
  /**
    * Query the capabilities of the WebGL context.
    *
    * @ignore
    */
  def initializeCapabilities(): Unit = js.native
  
  /**
    * Initialize the extensions provided by the WebGL context.
    *
    * @ignore
    */
  def initializeExtensions(): Unit = js.native
  
  /**
    * Called when the WebGL context was lost. It releases all context related resources.
    *
    * @ignore
    */
  def loseContext(): Unit = js.native
  
  var maxColorAttachments: Any = js.native
  
  var maxCombinedTextures: Any = js.native
  
  var maxDrawBuffers: Any = js.native
  
  var maxPrecision: String = js.native
  
  var maxRenderBufferSize: Any = js.native
  
  var maxSamples: Any = js.native
  
  var maxTextures: Any = js.native
  
  var maxVertexTextures: Any = js.native
  
  def popMarker(): Unit = js.native
  
  def pushMarker(name: Any): Unit = js.native
  
  var raster: Any = js.native
  
  /**
    * Reads a block of pixels from a specified rectangle of the current color framebuffer into an
    * ArrayBufferView object.
    *
    * @param {number} x - The x-coordinate of the rectangle's lower-left corner.
    * @param {number} y - The y-coordinate of the rectangle's lower-left corner.
    * @param {number} w - The width of the rectangle, in pixels.
    * @param {number} h - The height of the rectangle, in pixels.
    * @param {ArrayBufferView} pixels - The ArrayBufferView object that holds the returned pixel
    * data.
    * @ignore
    */
  def readPixels(x: Double, y: Double, w: Double, h: Double, pixels: js.typedarray.ArrayBufferView): Unit = js.native
  
  def resizeCanvas(width: Any, height: Any): Unit = js.native
  
  /**
    * Called when the WebGL context is restored. It reinitializes all context related resources.
    *
    * @ignore
    */
  def restoreContext(): Unit = js.native
  
  /**
    * Enables or disables alpha to coverage (WebGL2 only).
    *
    * @param {boolean} state - True to enable alpha to coverage and false to disable it.
    * @ignore
    */
  def setAlphaToCoverage(state: Boolean): Unit = js.native
  
  /**
    * Set the source and destination blending factors.
    *
    * @param {number} r - The red component in the range of 0 to 1. Default value is 0.
    * @param {number} g - The green component in the range of 0 to 1. Default value is 0.
    * @param {number} b - The blue component in the range of 0 to 1. Default value is 0.
    * @param {number} a - The alpha component in the range of 0 to 1. Default value is 0.
    * @ignore
    */
  def setBlendColor(r: Double, g: Double, b: Double, a: Double): Unit = js.native
  
  def setBlendState(blendState: Any): Unit = js.native
  
  def setBuffers(): Unit = js.native
  
  def setCullMode(cullMode: Any): Unit = js.native
  
  /**
    * Toggles the polygon offset render state.
    *
    * @param {boolean} on - True to enable polygon offset and false to disable it.
    * @ignore
    */
  def setDepthBias(on: Boolean): Unit = js.native
  
  /**
    * Specifies the scale factor and units to calculate depth values. The offset is added before
    * the depth test is performed and before the value is written into the depth buffer.
    *
    * @param {number} constBias - The multiplier by which an implementation-specific value is
    * multiplied with to create a constant depth offset.
    * @param {number} slopeBias - The scale factor for the variable depth offset for each polygon.
    * @ignore
    */
  def setDepthBiasValues(constBias: Double, slopeBias: Double): Unit = js.native
  
  def setDepthState(depthState: Any): Unit = js.native
  
  /**
    * Binds the specified framebuffer object.
    *
    * @param {WebGLFramebuffer | null} fb - The framebuffer to bind.
    * @ignore
    */
  def setFramebuffer(): Unit = js.native
  def setFramebuffer(fb: WebGLFramebuffer): Unit = js.native
  
  /**
    * Toggles the rasterization render state. Useful with transform feedback, when you only need
    * to process the data without drawing.
    *
    * @param {boolean} on - True to enable rasterization and false to disable it.
    * @ignore
    */
  def setRaster(on: Boolean): Unit = js.native
  
  /**
    * Set the active scissor rectangle on the specified device.
    *
    * @param {number} x - The pixel space x-coordinate of the bottom left corner of the scissor rectangle.
    * @param {number} y - The pixel space y-coordinate of the bottom left corner of the scissor rectangle.
    * @param {number} w - The width of the scissor rectangle in pixels.
    * @param {number} h - The height of the scissor rectangle in pixels.
    */
  def setScissor(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /**
    * Sets the active shader to be used during subsequent draw calls.
    *
    * @param {Shader} shader - The shader to set to assign to the device.
    * @returns {boolean} True if the shader was successfully set, false otherwise.
    */
  def setShader(shader: Shader): Boolean = js.native
  
  def setStencilFunc(func: Any, ref: Any, mask: Any): Unit = js.native
  
  def setStencilFuncBack(func: Any, ref: Any, mask: Any): Unit = js.native
  
  def setStencilFuncFront(func: Any, ref: Any, mask: Any): Unit = js.native
  
  def setStencilOperation(fail: Any, zfail: Any, zpass: Any, writeMask: Any): Unit = js.native
  
  def setStencilOperationBack(fail: Any, zfail: Any, zpass: Any, writeMask: Any): Unit = js.native
  
  def setStencilOperationFront(fail: Any, zfail: Any, zpass: Any, writeMask: Any): Unit = js.native
  
  def setStencilState(stencilFront: Any, stencilBack: Any): Unit = js.native
  
  def setStencilTest(enable: Any): Unit = js.native
  
  /**
    * Sets the specified texture on the specified texture unit.
    *
    * @param {Texture} texture - The texture to set.
    * @param {number} textureUnit - The texture unit to set the texture on.
    * @ignore
    */
  def setTexture(texture: Texture, textureUnit: Double): Unit = js.native
  
  /**
    * Update the texture parameters for a given texture if they have changed.
    *
    * @param {Texture} texture - The texture to update.
    * @ignore
    */
  def setTextureParameters(texture: Texture): Unit = js.native
  
  /**
    * Sets the output vertex buffer. It will be written to by a shader with transform feedback
    * varyings.
    *
    * @param {import('../vertex-buffer.js').VertexBuffer} tf - The output vertex buffer.
    * @ignore
    */
  def setTransformFeedbackBuffer(tf: VertexBuffer): Unit = js.native
  
  /**
    * Updates a texture's vertical flip.
    *
    * @param {boolean} flipY - True to flip the texture vertically.
    * @ignore
    */
  def setUnpackFlipY(flipY: Boolean): Unit = js.native
  
  /**
    * Updates a texture to have its RGB channels premultiplied by its alpha channel or not.
    *
    * @param {boolean} premultiplyAlpha - True to premultiply the alpha channel against the RGB
    * channels.
    * @ignore
    */
  def setUnpackPremultiplyAlpha(premultiplyAlpha: Boolean): Unit = js.native
  
  /**
    * Set the active rectangle for rendering on the specified device.
    *
    * @param {number} x - The pixel space x-coordinate of the bottom left corner of the viewport.
    * @param {number} y - The pixel space y-coordinate of the bottom left corner of the viewport.
    * @param {number} w - The width of the viewport in pixels.
    * @param {number} h - The height of the viewport in pixels.
    */
  def setViewport(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /**
    * Start a render pass.
    *
    * @param {import('../render-pass.js').RenderPass} renderPass - The render pass to start.
    * @ignore
    */
  def startPass(renderPass: RenderPass): Unit = js.native
  
  var stencil: Any = js.native
  
  var stencilFailBack: Any = js.native
  
  var stencilFailFront: Any = js.native
  
  var stencilFuncBack: Any = js.native
  
  var stencilFuncFront: Any = js.native
  
  var stencilMaskBack: Any = js.native
  
  var stencilMaskFront: Any = js.native
  
  var stencilRefBack: Any = js.native
  
  var stencilRefFront: Any = js.native
  
  var stencilWriteMaskBack: Any = js.native
  
  var stencilWriteMaskFront: Any = js.native
  
  var stencilZfailBack: Any = js.native
  
  var stencilZfailFront: Any = js.native
  
  var stencilZpassBack: Any = js.native
  
  var stencilZpassFront: Any = js.native
  
  var supportedExtensions: js.Array[String] = js.native
  
  var supportsAreaLights: Boolean = js.native
  
  var supportsBoneTextures: Boolean = js.native
  
  var supportsDepthShadow: Boolean = js.native
  
  var supportsGpuParticles: Boolean = js.native
  
  var supportsImageBitmap: Boolean = js.native
  
  var supportsMorphTargetTexturesCore: Boolean = js.native
  
  var supportsMsaa: Boolean = js.native
  
  var supportsTextureFetch: Boolean = js.native
  
  /**
    * Check if high precision floating-point textures are supported.
    *
    * @type {boolean}
    */
  def textureFloatHighPrecision: Boolean = js.native
  
  /**
    * Check if texture with half float format can be updated with data.
    *
    * @type {boolean}
    */
  def textureHalfFloatUpdatable: Boolean = js.native
  
  var textureUnit: Any = js.native
  
  var textureUnits: js.Array[Any] = js.native
  
  var transformFeedbackBuffer: Any = js.native
  
  def unbindVertexArray(): Unit = js.native
  
  var unmaskedRenderer: Any = js.native
  
  var unmaskedVendor: Any = js.native
  
  var unpackFlipY: Any = js.native
  
  var unpackPremultiplyAlpha: Any = js.native
  
  /**
    * Marks the beginning of a block of rendering. Internally, this function binds the render
    * target currently set on the device. This function should be matched with a call to
    * {@link GraphicsDevice#updateEnd}. Calls to {@link GraphicsDevice#updateBegin} and
    * {@link GraphicsDevice#updateEnd} must not be nested.
    *
    * @ignore
    */
  def updateBegin(): Unit = js.native
  
  /**
    * Marks the end of a block of rendering. This function should be called after a matching call
    * to {@link GraphicsDevice#updateBegin}. Calls to {@link GraphicsDevice#updateBegin} and
    * {@link GraphicsDevice#updateEnd} must not be nested.
    *
    * @ignore
    */
  def updateEnd(): Unit = js.native
  
  var vertexUniformsCount: Any = js.native
  
  /**
    * True if the WebGL context of this device is using the WebGL 2.0 API. If false, WebGL 1.0 is
    * being used.
    *
    * @type {boolean}
    * @ignore
    */
  var webgl2: Boolean = js.native
}
