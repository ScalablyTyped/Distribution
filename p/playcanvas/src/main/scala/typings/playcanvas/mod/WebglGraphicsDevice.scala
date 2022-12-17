package typings.playcanvas.mod

import typings.playcanvas.anon.Alpha
import typings.playcanvas.anon.Base
import typings.playcanvas.anon.Depth
import typings.playcanvas.anon.Flags
import typings.std.EXTBlendMinmax
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
  
  def _contextLostHandler(event: Any): Unit = js.native
  
  def _contextRestoredHandler(): Unit = js.native
  
  var _copyShader: Shader = js.native
  
  var _spectorCurrentMarker: String = js.native
  
  var _spectorMarkers: js.Array[Any] = js.native
  
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
  
  var blendAlphaEquation: Double = js.native
  
  var blendColor: Color = js.native
  
  var blendDst: Double = js.native
  
  var blendDstAlpha: Double = js.native
  
  var blendEquation: Any = js.native
  
  var blendSrc: Any = js.native
  
  var blendSrcAlpha: Double = js.native
  
  var blending: Any = js.native
  
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
  
  /**
    * Frees memory from all shaders ever allocated with this device.
    *
    * @ignore
    */
  def clearShaderCache(): Unit = js.native
  
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
  
  var cullMode: Any = js.native
  
  var defaultClearOptions: Depth = js.native
  
  var defaultFramebuffer: Any = js.native
  
  var defaultFramebufferAlpha: Boolean = js.native
  
  var depthBiasEnabled: Any = js.native
  
  var depthFunc: Any = js.native
  
  var depthTest: Any = js.native
  
  var depthWrite: Any = js.native
  
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
    * @param {RenderPass} renderPass - The render pass to end.
    * @ignore
    */
  def endPass(renderPass: RenderPass): Unit = js.native
  
  var extBlendMinmax: Boolean | EXTBlendMinmax = js.native
  
  var extColorBufferFloat: EXTBlendMinmax = js.native
  
  var extColorBufferHalfFloat: EXTBlendMinmax = js.native
  
  var extCompressedTextureASTC: EXTBlendMinmax = js.native
  
  var extCompressedTextureATC: EXTBlendMinmax = js.native
  
  var extCompressedTextureETC: EXTBlendMinmax = js.native
  
  var extCompressedTextureETC1: EXTBlendMinmax = js.native
  
  var extCompressedTexturePVRTC: EXTBlendMinmax = js.native
  
  var extCompressedTextureS3TC: EXTBlendMinmax = js.native
  
  var extDebugRendererInfo: EXTBlendMinmax = js.native
  
  var extDepthTexture: Boolean | WEBGLDepthTexture = js.native
  
  var extDisjointTimerQuery: EXTBlendMinmax = js.native
  
  var extDrawBuffers: Boolean | EXTBlendMinmax = js.native
  
  var extFloatBlend: EXTBlendMinmax = js.native
  
  var extInstancing: Boolean | EXTBlendMinmax = js.native
  
  var extParallelShaderCompile: EXTBlendMinmax = js.native
  
  var extStandardDerivatives: Boolean | EXTBlendMinmax = js.native
  
  var extTextureFilterAnisotropic: EXTBlendMinmax = js.native
  
  var extTextureFloat: Boolean | EXTBlendMinmax = js.native
  
  var extTextureFloatLinear: EXTBlendMinmax = js.native
  
  var extTextureHalfFloat: Boolean | EXTBlendMinmax = js.native
  
  var extTextureHalfFloatLinear: EXTBlendMinmax = js.native
  
  var extTextureLod: Boolean | EXTBlendMinmax = js.native
  
  var extUintElement: Boolean | EXTBlendMinmax = js.native
  
  var extVertexArrayObject: Boolean | EXTBlendMinmax = js.native
  
  var feedback: WebGLTransformFeedback = js.native
  
  var forceDisableMultisampling: Boolean = js.native
  
  var fragmentUniformsCount: Any = js.native
  
  /**
    * Queries whether blending is enabled.
    *
    * @returns {boolean} True if blending is enabled and false otherwise.
    */
  def getBlending(): Boolean = js.native
  
  /**
    * Get copy shader for efficient rendering of fullscreen-quad with texture.
    *
    * @returns {Shader} The copy shader (based on `fullscreenQuadVS` and `outputTex2DPS` in
    * `shaderChunks`).
    * @ignore
    */
  def getCopyShader(): Shader = js.native
  
  /**
    * Gets the current cull mode.
    *
    * @returns {number} The current cull mode.
    * @ignore
    */
  def getCullMode(): Double = js.native
  
  /**
    * Queries whether depth testing is enabled.
    *
    * @returns {boolean} True if depth testing is enabled and false otherwise.
    * @example
    * var depthTest = device.getDepthTest();
    * console.log('Depth testing is ' + depthTest ? 'enabled' : 'disabled');
    */
  def getDepthTest(): Boolean = js.native
  
  /**
    * Queries whether writes to the depth buffer are enabled.
    *
    * @returns {boolean} True if depth writing is enabled and false otherwise.
    * @example
    * var depthWrite = device.getDepthWrite();
    * console.log('Depth writing is ' + depthWrite ? 'enabled' : 'disabled');
    */
  def getDepthWrite(): Boolean = js.native
  
  /**
    * Get the supported HDR pixel format.
    * Note that for WebGL2, PIXELFORMAT_RGB16F and PIXELFORMAT_RGB32F are not renderable according to this:
    * https://developer.mozilla.org/en-US/docs/Web/API/EXT_color_buffer_float
    * For WebGL1, only PIXELFORMAT_RGBA16F and PIXELFORMAT_RGBA32F are tested for being renderable.
    *
    * @returns {number} The HDR pixel format.
    * @ignore
    */
  def getHdrFormat(): Double = js.native
  
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
  
  var glBlendFunction: js.Array[Any] = js.native
  
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
    * Set the initial render state on the WebGL context.
    *
    * @ignore
    */
  def initializeRenderState(): Unit = js.native
  
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
  
  /**
    * Called when the WebGL context is restored. It reinitializes all context related resources.
    *
    * @ignore
    */
  def restoreContext(): Unit = js.native
  
  var samples: Any = js.native
  
  var separateAlphaBlend: Boolean = js.native
  
  var separateAlphaEquation: Boolean = js.native
  
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
  
  /**
    * Configures the blending equation. The default blend equation is {@link BLENDEQUATION_ADD}.
    *
    * @param {number} blendEquation - The blend equation. Can be:
    *
    * - {@link BLENDEQUATION_ADD}
    * - {@link BLENDEQUATION_SUBTRACT}
    * - {@link BLENDEQUATION_REVERSE_SUBTRACT}
    * - {@link BLENDEQUATION_MIN}
    * - {@link BLENDEQUATION_MAX}
    *
    * Note that MIN and MAX modes require either EXT_blend_minmax or WebGL2 to work (check
    * device.extBlendMinmax).
    */
  def setBlendEquation(blendEquation: Double): Unit = js.native
  
  /**
    * Configures the blending equation. The default blend equation is {@link BLENDEQUATION_ADD}.
    *
    * @param {number} blendEquation - The blend equation. Can be:
    *
    * - {@link BLENDEQUATION_ADD}
    * - {@link BLENDEQUATION_SUBTRACT}
    * - {@link BLENDEQUATION_REVERSE_SUBTRACT}
    * - {@link BLENDEQUATION_MIN}
    * - {@link BLENDEQUATION_MAX}
    *
    * Note that MIN and MAX modes require either EXT_blend_minmax or WebGL2 to work (check
    * device.extBlendMinmax).
    * @param {number} blendAlphaEquation - A separate blend equation for the alpha channel.
    * Accepts same values as `blendEquation`.
    */
  def setBlendEquationSeparate(blendEquation: Double, blendAlphaEquation: Double): Unit = js.native
  
  /**
    * Configures blending operations. Both source and destination blend modes can take the
    * following values:
    *
    * - {@link BLENDMODE_ZERO}
    * - {@link BLENDMODE_ONE}
    * - {@link BLENDMODE_SRC_COLOR}
    * - {@link BLENDMODE_ONE_MINUS_SRC_COLOR}
    * - {@link BLENDMODE_DST_COLOR}
    * - {@link BLENDMODE_ONE_MINUS_DST_COLOR}
    * - {@link BLENDMODE_SRC_ALPHA}
    * - {@link BLENDMODE_SRC_ALPHA_SATURATE}
    * - {@link BLENDMODE_ONE_MINUS_SRC_ALPHA}
    * - {@link BLENDMODE_DST_ALPHA}
    * - {@link BLENDMODE_ONE_MINUS_DST_ALPHA}
    * - {@link BLENDMODE_CONSTANT_COLOR}
    * - {@link BLENDMODE_ONE_MINUS_CONSTANT_COLOR}
    * - {@link BLENDMODE_CONSTANT_ALPHA}
    * - {@link BLENDMODE_ONE_MINUS_CONSTANT_ALPHA}
    *
    * @param {number} blendSrc - The source blend function.
    * @param {number} blendDst - The destination blend function.
    */
  def setBlendFunction(blendSrc: Double, blendDst: Double): Unit = js.native
  
  /**
    * Configures blending operations. Both source and destination blend modes can take the
    * following values:
    *
    * - {@link BLENDMODE_ZERO}
    * - {@link BLENDMODE_ONE}
    * - {@link BLENDMODE_SRC_COLOR}
    * - {@link BLENDMODE_ONE_MINUS_SRC_COLOR}
    * - {@link BLENDMODE_DST_COLOR}
    * - {@link BLENDMODE_ONE_MINUS_DST_COLOR}
    * - {@link BLENDMODE_SRC_ALPHA}
    * - {@link BLENDMODE_SRC_ALPHA_SATURATE}
    * - {@link BLENDMODE_ONE_MINUS_SRC_ALPHA}
    * - {@link BLENDMODE_DST_ALPHA}
    * - {@link BLENDMODE_ONE_MINUS_DST_ALPHA}
    *
    * @param {number} blendSrc - The source blend function.
    * @param {number} blendDst - The destination blend function.
    * @param {number} blendSrcAlpha - The separate source blend function for the alpha channel.
    * @param {number} blendDstAlpha - The separate destination blend function for the alpha channel.
    */
  def setBlendFunctionSeparate(blendSrc: Double, blendDst: Double, blendSrcAlpha: Double, blendDstAlpha: Double): Unit = js.native
  
  /**
    * Enables or disables blending.
    *
    * @param {boolean} blending - True to enable blending and false to disable it.
    */
  def setBlending(blending: Boolean): Unit = js.native
  
  def setBuffers(): Unit = js.native
  
  /**
    * Set the clear color used when the frame buffer is cleared.
    *
    * @param {number} r - The red component of the color in the range 0.0 to 1.0.
    * @param {number} g - The green component of the color in the range 0.0 to 1.0.
    * @param {number} b - The blue component of the color in the range 0.0 to 1.0.
    * @param {number} a - The alpha component of the color in the range 0.0 to 1.0.
    * @ignore
    */
  def setClearColor(r: Double, g: Double, b: Double, a: Double): Unit = js.native
  
  /**
    * Set the depth value used when the depth buffer is cleared.
    *
    * @param {number} depth - The depth value to clear the depth buffer to in the range 0.0
    * to 1.0.
    * @ignore
    */
  def setClearDepth(depth: Double): Unit = js.native
  
  /**
    * Set the stencil clear value used when the stencil buffer is cleared.
    *
    * @param {number} value - The stencil value to clear the stencil buffer to.
    */
  def setClearStencil(value: Double): Unit = js.native
  
  /**
    * Enables or disables writes to the color buffer. Once this state is set, it persists until it
    * is changed. By default, color writes are enabled for all color channels.
    *
    * @param {boolean} writeRed - True to enable writing of the red channel and false otherwise.
    * @param {boolean} writeGreen - True to enable writing of the green channel and false otherwise.
    * @param {boolean} writeBlue - True to enable writing of the blue channel and false otherwise.
    * @param {boolean} writeAlpha - True to enable writing of the alpha channel and false otherwise.
    * @example
    * // Just write alpha into the frame buffer
    * device.setColorWrite(false, false, false, true);
    */
  def setColorWrite(writeRed: Boolean, writeGreen: Boolean, writeBlue: Boolean, writeAlpha: Boolean): Unit = js.native
  
  /**
    * Controls how triangles are culled based on their face direction. The default cull mode is
    * {@link CULLFACE_BACK}.
    *
    * @param {number} cullMode - The cull mode to set. Can be:
    *
    * - {@link CULLFACE_NONE}
    * - {@link CULLFACE_BACK}
    * - {@link CULLFACE_FRONT}
    * - {@link CULLFACE_FRONTANDBACK}
    */
  def setCullMode(cullMode: Double): Unit = js.native
  
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
  
  /**
    * Configures the depth test.
    *
    * @param {number} func - A function to compare a new depth value with an existing z-buffer
    * value and decide if to write a pixel. Can be:
    *
    * - {@link FUNC_NEVER}: don't draw
    * - {@link FUNC_LESS}: draw if new depth < depth buffer
    * - {@link FUNC_EQUAL}: draw if new depth == depth buffer
    * - {@link FUNC_LESSEQUAL}: draw if new depth <= depth buffer
    * - {@link FUNC_GREATER}: draw if new depth > depth buffer
    * - {@link FUNC_NOTEQUAL}: draw if new depth != depth buffer
    * - {@link FUNC_GREATEREQUAL}: draw if new depth >= depth buffer
    * - {@link FUNC_ALWAYS}: always draw
    */
  def setDepthFunc(func: Double): Unit = js.native
  
  /**
    * Enables or disables depth testing of fragments. Once this state is set, it persists until it
    * is changed. By default, depth testing is enabled.
    *
    * @param {boolean} depthTest - True to enable depth testing and false otherwise.
    * @example
    * device.setDepthTest(true);
    */
  def setDepthTest(depthTest: Boolean): Unit = js.native
  
  /**
    * Enables or disables writes to the depth buffer. Once this state is set, it persists until it
    * is changed. By default, depth writes are enabled.
    *
    * @param {boolean} writeDepth - True to enable depth writing and false otherwise.
    * @example
    * device.setDepthWrite(true);
    */
  def setDepthWrite(writeDepth: Boolean): Unit = js.native
  
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
  
  /**
    * Configures stencil test for both front and back faces.
    *
    * @param {number} func - A comparison function that decides if the pixel should be written,
    * based on the current stencil buffer value, reference value, and mask value. Can be:
    *
    * - {@link FUNC_NEVER}: never pass
    * - {@link FUNC_LESS}: pass if (ref & mask) < (stencil & mask)
    * - {@link FUNC_EQUAL}: pass if (ref & mask) == (stencil & mask)
    * - {@link FUNC_LESSEQUAL}: pass if (ref & mask) <= (stencil & mask)
    * - {@link FUNC_GREATER}: pass if (ref & mask) > (stencil & mask)
    * - {@link FUNC_NOTEQUAL}: pass if (ref & mask) != (stencil & mask)
    * - {@link FUNC_GREATEREQUAL}: pass if (ref & mask) >= (stencil & mask)
    * - {@link FUNC_ALWAYS}: always pass
    *
    * @param {number} ref - Reference value used in comparison.
    * @param {number} mask - Mask applied to stencil buffer value and reference value before
    * comparison.
    */
  def setStencilFunc(func: Double, ref: Double, mask: Double): Unit = js.native
  
  /**
    * Configures stencil test for back faces.
    *
    * @param {number} func - A comparison function that decides if the pixel should be written,
    * based on the current stencil buffer value, reference value, and mask value. Can be:
    *
    * - {@link FUNC_NEVER}: never pass
    * - {@link FUNC_LESS}: pass if (ref & mask) < (stencil & mask)
    * - {@link FUNC_EQUAL}: pass if (ref & mask) == (stencil & mask)
    * - {@link FUNC_LESSEQUAL}: pass if (ref & mask) <= (stencil & mask)
    * - {@link FUNC_GREATER}: pass if (ref & mask) > (stencil & mask)
    * - {@link FUNC_NOTEQUAL}: pass if (ref & mask) != (stencil & mask)
    * - {@link FUNC_GREATEREQUAL}: pass if (ref & mask) >= (stencil & mask)
    * - {@link FUNC_ALWAYS}: always pass
    *
    * @param {number} ref - Reference value used in comparison.
    * @param {number} mask - Mask applied to stencil buffer value and reference value before comparison.
    */
  def setStencilFuncBack(func: Double, ref: Double, mask: Double): Unit = js.native
  
  /**
    * Configures stencil test for front faces.
    *
    * @param {number} func - A comparison function that decides if the pixel should be written,
    * based on the current stencil buffer value, reference value, and mask value. Can be:
    *
    * - {@link FUNC_NEVER}: never pass
    * - {@link FUNC_LESS}: pass if (ref & mask) < (stencil & mask)
    * - {@link FUNC_EQUAL}: pass if (ref & mask) == (stencil & mask)
    * - {@link FUNC_LESSEQUAL}: pass if (ref & mask) <= (stencil & mask)
    * - {@link FUNC_GREATER}: pass if (ref & mask) > (stencil & mask)
    * - {@link FUNC_NOTEQUAL}: pass if (ref & mask) != (stencil & mask)
    * - {@link FUNC_GREATEREQUAL}: pass if (ref & mask) >= (stencil & mask)
    * - {@link FUNC_ALWAYS}: always pass
    *
    * @param {number} ref - Reference value used in comparison.
    * @param {number} mask - Mask applied to stencil buffer value and reference value before comparison.
    */
  def setStencilFuncFront(func: Double, ref: Double, mask: Double): Unit = js.native
  
  /**
    * Configures how stencil buffer values should be modified based on the result of depth/stencil
    * tests. Works for both front and back faces.
    *
    * @param {number} fail - Action to take if stencil test is failed. Can be:
    *
    * - {@link STENCILOP_KEEP}: don't change the stencil buffer value
    * - {@link STENCILOP_ZERO}: set value to zero
    * - {@link STENCILOP_REPLACE}: replace value with the reference value (see {@link GraphicsDevice#setStencilFunc})
    * - {@link STENCILOP_INCREMENT}: increment the value
    * - {@link STENCILOP_INCREMENTWRAP}: increment the value, but wrap it to zero when it's larger
    * than a maximum representable value
    * - {@link STENCILOP_DECREMENT}: decrement the value
    * - {@link STENCILOP_DECREMENTWRAP}: decrement the value, but wrap it to a maximum
    * representable value, if the current value is 0
    * - {@link STENCILOP_INVERT}: invert the value bitwise
    *
    * @param {number} zfail - Action to take if depth test is failed.  Accepts the same values as
    * `fail`.
    * @param {number} zpass - Action to take if both depth and stencil test are passed. Accepts
    * the same values as `fail`.
    * @param {number} writeMask - A bit mask applied to the reference value, when written.
    */
  def setStencilOperation(fail: Double, zfail: Double, zpass: Double, writeMask: Double): Unit = js.native
  
  /**
    * Configures how stencil buffer values should be modified based on the result of depth/stencil
    * tests. Works for back faces.
    *
    * @param {number} fail - Action to take if stencil test is failed. Can be:
    *
    * - {@link STENCILOP_KEEP}: don't change the stencil buffer value
    * - {@link STENCILOP_ZERO}: set value to zero
    * - {@link STENCILOP_REPLACE}: replace value with the reference value (see {@link GraphicsDevice#setStencilFunc})
    * - {@link STENCILOP_INCREMENT}: increment the value
    * - {@link STENCILOP_INCREMENTWRAP}: increment the value, but wrap it to zero when it's larger
    * than a maximum representable value
    * - {@link STENCILOP_DECREMENT}: decrement the value
    * - {@link STENCILOP_DECREMENTWRAP}: decrement the value, but wrap it to a maximum
    * representable value, if the current value is 0
    * - {@link STENCILOP_INVERT}: invert the value bitwise
    *
    * @param {number} zfail - Action to take if depth test is failed. Accepts the same values as
    * `fail`.
    * @param {number} zpass - Action to take if both depth and stencil test are passed. Accepts
    * the same values as `fail`.
    * @param {number} writeMask - A bit mask applied to the reference value, when written.
    */
  def setStencilOperationBack(fail: Double, zfail: Double, zpass: Double, writeMask: Double): Unit = js.native
  
  /**
    * Configures how stencil buffer values should be modified based on the result of depth/stencil
    * tests. Works for front faces.
    *
    * @param {number} fail - Action to take if stencil test is failed. Can be:
    *
    * - {@link STENCILOP_KEEP}: don't change the stencil buffer value
    * - {@link STENCILOP_ZERO}: set value to zero
    * - {@link STENCILOP_REPLACE}: replace value with the reference value (see {@link GraphicsDevice#setStencilFunc})
    * - {@link STENCILOP_INCREMENT}: increment the value
    * - {@link STENCILOP_INCREMENTWRAP}: increment the value, but wrap it to zero when it's larger
    * than a maximum representable value
    * - {@link STENCILOP_DECREMENT}: decrement the value
    * - {@link STENCILOP_DECREMENTWRAP}: decrement the value, but wrap it to a maximum
    * representable value, if the current value is 0
    * - {@link STENCILOP_INVERT}: invert the value bitwise
    *
    * @param {number} zfail - Action to take if depth test is failed.  Accepts the same values as
    * `fail`.
    * @param {number} zpass - Action to take if both depth and stencil test are passed.  Accepts
    * the same values as `fail`.
    * @param {number} writeMask - A bit mask applied to the reference value, when written.
    */
  def setStencilOperationFront(fail: Double, zfail: Double, zpass: Double, writeMask: Double): Unit = js.native
  
  /**
    * Enables or disables stencil test.
    *
    * @param {boolean} enable - True to enable stencil test and false to disable it.
    */
  def setStencilTest(enable: Boolean): Unit = js.native
  
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
    * @param {VertexBuffer} tf - The output vertex buffer.
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
  
  var sh: Double = js.native
  
  /**
    * Start a render pass.
    *
    * @param {RenderPass} renderPass - The render pass to start.
    * @ignore
    */
  def startPass(renderPass: RenderPass): Unit = js.native
  
  var stencil: Any = js.native
  
  var stencilFailBack: Any = js.native
  
  var stencilFailFront: Any = js.native
  
  var stencilFuncBack: Any = js.native
  
  var stencilFuncFront: Any = js.native
  
  var stencilMaskBack: Double = js.native
  
  var stencilMaskFront: Double = js.native
  
  var stencilRefBack: Double = js.native
  
  var stencilRefFront: Double = js.native
  
  var stencilWriteMaskBack: Any = js.native
  
  var stencilWriteMaskFront: Any = js.native
  
  var stencilZfailBack: Double = js.native
  
  var stencilZfailFront: Double = js.native
  
  var stencilZpassBack: Double = js.native
  
  var stencilZpassFront: Double = js.native
  
  var supportsAreaLights: Boolean = js.native
  
  var supportsBoneTextures: Boolean = js.native
  
  var supportsGpuParticles: Boolean = js.native
  
  var supportsImageBitmap: Boolean = js.native
  
  var supportsMorphTargetTexturesCore: Boolean = js.native
  
  var supportsMsaa: Boolean = js.native
  
  var supportsStencil: Boolean = js.native
  
  var sw: Double = js.native
  
  var sx: Any = js.native
  
  var sy: Double = js.native
  
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
  
  def updateMarker(): Unit = js.native
  
  var vertexUniformsCount: Any = js.native
  
  var vh: Double = js.native
  
  var vw: Double = js.native
  
  var vx: Any = js.native
  
  var vy: Double = js.native
  
  /**
    * True if the WebGL context of this device is using the WebGL 2.0 API. If false, WebGL 1.0 is
    * being used.
    *
    * @type {boolean}
    * @ignore
    */
  var webgl2: Boolean = js.native
  
  var writeAlpha: Boolean = js.native
  
  var writeBlue: Boolean = js.native
  
  var writeGreen: Boolean = js.native
  
  var writeRed: Any = js.native
}
