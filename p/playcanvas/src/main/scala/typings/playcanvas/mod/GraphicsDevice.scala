package typings.playcanvas.mod

import typings.playcanvas.anon.CompileTime
import typings.playcanvas.anon.Ib
import typings.std.DOMRect
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./render-target.js').RenderTarget} RenderTarget */
/** @typedef {import('./shader.js').Shader} Shader */
/** @typedef {import('./texture.js').Texture} Texture */
/** @typedef {import('./index-buffer.js').IndexBuffer} IndexBuffer */
/** @typedef {import('./vertex-buffer.js').VertexBuffer} VertexBuffer */
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
  def this(canvas: Any) = this()
  
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
  
  var _maxPixelRatio: Double = js.native
  
  var _primsPerFrame: js.Array[Double] = js.native
  
  var _renderTargetCreationTime: Double = js.native
  
  var _shaderStats: CompileTime = js.native
  
  var _shaderSwitchesPerFrame: Double = js.native
  
  var _vram: Ib = js.native
  
  var _width: Double = js.native
  
  /**
    * The maximum number of supported bones using uniform buffers.
    *
    * @type {number}
    */
  var boneLimit: Double = js.native
  
  var buffers: js.Array[Any] = js.native
  
  /**
    * The canvas DOM element that provides the underlying WebGL context used by the graphics device.
    *
    * @type {HTMLCanvasElement}
    */
  var canvas: HTMLCanvasElement = js.native
  
  var clientRect: DOMRect = js.native
  
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
    * The graphics device type, DEVICETYPE_WEBGL or DEVICETYPE_WEBGPU.
    *
    * @type {string}
    * @ignore
    */
  var deviceType: String = js.native
  
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
    * Retrieves the program library assigned to the specified graphics device.
    *
    * @returns {ProgramLibrary} The program library assigned to the device.
    * @ignore
    */
  def getProgramLibrary(): ProgramLibrary = js.native
  
  /**
    * Queries the currently set render target on the device.
    *
    * @returns {RenderTarget} The current render target.
    * @example
    * // Get the current render target
    * var renderTarget = device.getRenderTarget();
    */
  def getRenderTarget(): RenderTarget = js.native
  
  /**
    * Height of the back buffer in pixels.
    *
    * @type {number}
    */
  def height: Double = js.native
  
  var indexBuffer: IndexBuffer = js.native
  
  /**
    * Initialize render target before it can be used.
    *
    * @param {RenderTarget} target - The render target to be initialized.
    * @ignore
    */
  def initRenderTarget(target: RenderTarget): Unit = js.native
  
  def initializeContextCaches(): Unit = js.native
  
  /** @type {boolean} */
  var insideRenderPass: Boolean = js.native
  
  /**
    * The maximum supported texture anisotropy setting.
    *
    * @type {number}
    */
  var maxAnisotropy: Double = js.native
  
  /**
    * The maximum supported dimension of a cube map.
    *
    * @type {number}
    */
  var maxCubeMapSize: Double = js.native
  
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
    */
  var maxTextureSize: Double = js.native
  
  /**
    * The maximum supported dimension of a 3D texture (any axis).
    *
    * @type {number}
    */
  var maxVolumeSize: Double = js.native
  
  def postDestroy(): Unit = js.native
  
  /**
    * The highest shader precision supported by this graphics device. Can be 'hiphp', 'mediump' or
    * 'lowp'.
    *
    * @type {string}
    */
  var precision: String = js.native
  
  var programLib: ProgramLibrary = js.native
  
  /**
    * Currently active render target.
    *
    * @type {RenderTarget}
    * @ignore
    */
  var renderTarget: RenderTarget = js.native
  
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
    * The scope namespace for shader attributes and variables.
    *
    * @type {ScopeSpace}
    */
  var scope: ScopeSpace = js.native
  
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
    * Sets the current index buffer on the graphics device. On subsequent calls to
    * {@link GraphicsDevice#draw}, the specified index buffer will be used to provide index data
    * for any indexed primitives.
    *
    * @param {IndexBuffer} indexBuffer - The index buffer to assign to the device.
    */
  def setIndexBuffer(indexBuffer: IndexBuffer): Unit = js.native
  
  /**
    * Assigns a program library to the specified device. By default, a graphics device is created
    * with a program library that manages all of the programs that are used to render any
    * graphical primitives. However, this function allows the user to replace the existing program
    * library with a new one.
    *
    * @param {ProgramLibrary} programLib - The program library to assign to the device.
    * @ignore
    */
  def setProgramLibrary(programLib: ProgramLibrary): Unit = js.native
  
  /**
    * Sets the specified render target on the device. If null is passed as a parameter, the back
    * buffer becomes the current target for all rendering operations.
    *
    * @param {RenderTarget} renderTarget - The render target to activate.
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
    * Sets the current vertex buffer on the graphics device. On subsequent calls to
    * {@link GraphicsDevice#draw}, the specified vertex buffer(s) will be used to provide vertex
    * data for any primitives.
    *
    * @param {VertexBuffer} vertexBuffer - The vertex buffer to assign to the device.
    */
  def setVertexBuffer(vertexBuffer: VertexBuffer): Unit = js.native
  
  var shader: Any = js.native
  
  /** @type {Shader[]} */
  var shaders: js.Array[Shader] = js.native
  
  /**
    * True if hardware instancing is supported.
    *
    * @type {boolean}
    */
  var supportsInstancing: Boolean = js.native
  
  /**
    * True if the device supports uniform buffers.
    *
    * @type {boolean}
    * @ignore
    */
  var supportsUniformBuffers: Boolean = js.native
  
  /** @type {RenderTarget[]} */
  var targets: js.Array[RenderTarget] = js.native
  
  var textureBias: ScopeId = js.native
  
  /**
    * True if 32-bit floating-point textures can be used as a frame buffer.
    *
    * @type {boolean}
    */
  var textureFloatRenderable: Boolean = js.native
  
  /**
    * True if 16-bit floating-point textures can be used as a frame buffer.
    *
    * @type {boolean}
    */
  var textureHalfFloatRenderable: Boolean = js.native
  
  /** @type {Texture[]} */
  var textures: js.Array[Texture] = js.native
  
  def toJSON(key: Any): Any = js.native
  
  def updateClientRect(): Unit = js.native
  
  var vertexBuffers: js.Array[Any] = js.native
  
  /**
    * Width of the back buffer in pixels.
    *
    * @type {number}
    */
  def width: Double = js.native
}
