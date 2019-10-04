package typings.playcanvas.pcNs

import typings.playcanvas.Anon_Base
import typings.playcanvas.Anon_Color
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.GraphicsDevice
  * @extends pc.EventHandler
  * @classdesc The graphics device manages the underlying graphics context. It is responsible
  * for submitting render state changes and graphics primitives to the hardware. A graphics
  * device is tied to a specific canvas HTML element. It is valid to have more than one
  * canvas element per page and create a new graphics device against each.
  * @description Creates a new graphics device.
  * @param {HTMLCanvasElement} canvas The canvas to which the graphics device will render.
  * @param {Object} [options] Options passed when creating the WebGL context. More info {@link https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext here}.
  * @property {HTMLCanvasElement} canvas The canvas DOM element that provides the underlying WebGL context used by the graphics device.
  * @property {Boolean} textureFloatRenderable Determines if 32-bit floating-point textures can be used as frame buffer. [read only]
  * @property {Boolean} textureHalfFloatRenderable Determines if 16-bit floating-point textures can be used as frame buffer. [read only]
  * @property {pc.ScopeSpace} scope The scope namespace for shader attributes and variables. [read only]
  */
@JSGlobal("pc.GraphicsDevice")
@js.native
class GraphicsDevice protected () extends EventHandler {
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: HTMLCanvasElement, options: js.Any) = this()
  /**
    * The canvas DOM element that provides the underlying WebGL context used by the graphics device.
    */
  var canvas: HTMLCanvasElement = js.native
  /**
    * @name pc.GraphicsDevice#fullscreen
    * @type {Boolean}
    * @description Fullscreen mode
    */
  var fullscreen: Boolean = js.native
  /**
    * @readonly
    * @name pc.GraphicsDevice#height
    * @type {Number}
    * @description Height of the back buffer in pixels.
    */
  val height: Double = js.native
  /**
    * @readonly
    * @name pc.GraphicsDevice#maxAnisotropy
    * @type Number
    * @description The maximum supported texture anisotropy setting.
    */
  val maxAnisotropy: Double = js.native
  /**
    * @readonly
    * @name pc.GraphicsDevice#maxCubeMapSize
    * @type Number
    * @description The maximum supported dimension of a cube map.
    */
  val maxCubeMapSize: Double = js.native
  /**
    * @name pc.GraphicsDevice#maxPixelRatio
    * @type {Number}
    * @description Maximum pixel ratio
    */
  var maxPixelRatio: Double = js.native
  /**
    * @readonly
    * @name pc.GraphicsDevice#maxTextureSize
    * @type Number
    * @description The maximum supported dimension of a texture.
    */
  val maxTextureSize: Double = js.native
  /**
    * @readonly
    * @name pc.GraphicsDevice#maxVolumeSize
    * @type Number
    * @description The maximum supported dimension of a 3D texture (any axis).
    */
  val maxVolumeSize: Double = js.native
  /**
    * @readonly
    * @name pc.GraphicsDevice#precision
    * @type String
    * @description The highest shader precision supported by this graphics device. Can be 'hiphp', 'mediump' or 'lowp'.
    */
  val precision: String = js.native
  /**
    * The scope namespace for shader attributes and variables. [read only]
    */
  var scope: ScopeSpace = js.native
  /**
    * @readonly
    * @name pc.GraphicsDevice#textureFloatHighPrecision
    * @type {Number}
    * @description Check if high precision floating-point textures are supported
    */
  val textureFloatHighPrecision: Double = js.native
  /**
    * Determines if 32-bit floating-point textures can be used as frame buffer. [read only]
    */
  var textureFloatRenderable: Boolean = js.native
  /**
    * Determines if 16-bit floating-point textures can be used as frame buffer. [read only]
    */
  var textureHalfFloatRenderable: Boolean = js.native
  /**
    * @readonly
    * @name pc.GraphicsDevice#width
    * @type {Number}
    * @description Width of the back buffer in pixels.
    */
  val width: Double = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#clear
    * @description Clears the frame buffer of the currently set render target.
    * @param {Object} options Optional options object that controls the behavior of the clear operation defined as follows:
    * @param {Number[]} options.color The color to clear the color buffer to in the range 0.0 to 1.0 for each component.
    * @param {Number} options.depth The depth value to clear the depth buffer to in the range 0.0 to 1.0.
    * @param {Number} options.flags The buffers to clear (the types being color, depth and stencil). Can be any bitwise
    * combination of:
    * <ul>
    *     <li>pc.CLEARFLAG_COLOR</li>
    *     <li>pc.CLEARFLAG_DEPTH</li>
    *     <li>pc.CLEARFLAG_STENCIL</li>
    * </ul>
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
    *     depth: 1.0,
    *     flags: pc.CLEARFLAG_COLOR | pc.CLEARFLAG_DEPTH
    * });
    */
  def clear(options: Anon_Color): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#clearShaderCache
    * @description Frees memory from all shaders ever allocated with this device
    */
  def clearShaderCache(): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#draw
    * @description Submits a graphical primitive to the hardware for immediate rendering.
    * @param {Object} primitive Primitive object describing how to submit current vertex/index buffers defined as follows:
    * @param {Number} primitive.type The type of primitive to render. Can be:
    * <ul>
    *     <li>{@link pc.PRIMITIVE_POINTS}</li>
    *     <li>{@link pc.PRIMITIVE_LINES}</li>
    *     <li>{@link pc.PRIMITIVE_LINELOOP}</li>
    *     <li>{@link pc.PRIMITIVE_LINESTRIP}</li>
    *     <li>{@link pc.PRIMITIVE_TRIANGLES}</li>
    *     <li>{@link pc.PRIMITIVE_TRISTRIP}</li>
    *     <li>{@link pc.PRIMITIVE_TRIFAN}</li>
    * </ul>
    * @param {Number} primitive.base The offset of the first index or vertex to dispatch in the draw call.
    * @param {Number} primitive.count The number of indices or vertices to dispatch in the draw call.
    * @param {Boolean} [primitive.indexed] True to interpret the primitive as indexed, thereby using the currently set index buffer and false otherwise.
    * @param {Number} [numInstances=1] The number of instances to render when using ANGLE_instanced_arrays. Defaults to 1.
    * @example
    * // Render a single, unindexed triangle
    * device.draw({
    *     type: pc.PRIMITIVE_TRIANGLES,
    *     base: 0,
    *     count: 3,
    *     indexed: false
    * )};
    */
  def draw(primitive: Anon_Base): Unit = js.native
  def draw(primitive: Anon_Base, numInstances: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#getBlending
    * @description Queries whether blending is enabled.
    * @returns {Boolean} True if blending is enabled and false otherwise.
    */
  def getBlending(): Boolean = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#getDepthTest
    * @description Queries whether depth testing is enabled.
    * @returns {Boolean} true if depth testing is enabled and false otherwise.
    * @example
    * var depthTest = device.getDepthTest();
    * console.log('Depth testing is ' + depthTest ? 'enabled' : 'disabled');
    */
  def getDepthTest(): Boolean = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#getDepthWrite
    * @description Queries whether writes to the depth buffer are enabled.
    * @returns {Boolean} true if depth writing is enabled and false otherwise.
    * @example
    * var depthWrite = device.getDepthWrite();
    * console.log('Depth writing is ' + depthWrite ? 'enabled' : 'disabled');
    */
  def getDepthWrite(): Boolean = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#getRenderTarget
    * @description Queries the currently set render target on the device.
    * @returns {pc.RenderTarget} The current render target.
    * @example
    * // Get the current render target
    * var renderTarget = device.getRenderTarget();
    */
  def getRenderTarget(): RenderTarget = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#resizeCanvas
    * @description Sets the width and height of the canvas, then fires the 'resizecanvas' event.
    * Note that the specified width and height values will be multiplied by the value of
    * {@link pc.GraphicsDevice#maxPixelRatio} to give the final resultant width and height for
    * the canvas.
    * @param {Number} width The new width of the canvas.
    * @param {Number} height The new height of the canvas.
    */
  def resizeCanvas(width: Double, height: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setBlendEquation
    * @description Configures the blending equation. The default blend equation is
    * pc.BLENDEQUATION_ADD.
    * @param {Number} blendEquation The blend equation. Can be:
    * <ul>
    *     <li>pc.BLENDEQUATION_ADD</li>
    *     <li>pc.BLENDEQUATION_SUBTRACT</li>
    *     <li>pc.BLENDEQUATION_REVERSE_SUBTRACT</li>
    *     <li>pc.BLENDEQUATION_MIN</li>
    *     <li>pc.BLENDEQUATION_MAX</li>
    * Note that MIN and MAX modes require either EXT_blend_minmax or WebGL2 to work (check device.extBlendMinmax).
    * </ul>
    */
  def setBlendEquation(blendEquation: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setBlendEquationSeparate
    * @description Configures the blending equation. The default blend equation is
    * pc.BLENDEQUATION_ADD.
    * @param {Number} blendEquation The blend equation. Can be:
    * <ul>
    *     <li>pc.BLENDEQUATION_ADD</li>
    *     <li>pc.BLENDEQUATION_SUBTRACT</li>
    *     <li>pc.BLENDEQUATION_REVERSE_SUBTRACT</li>
    *     <li>pc.BLENDEQUATION_MIN</li>
    *     <li>pc.BLENDEQUATION_MAX</li>
    * Note that MIN and MAX modes require either EXT_blend_minmax or WebGL2 to work (check device.extBlendMinmax).
    * @param {Number} blendAlphaEquation A separate blend equation for the alpha channel. Accepts same values as blendEquation.
    * </ul>
    */
  def setBlendEquationSeparate(blendEquation: Double, blendAlphaEquation: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setBlendFunction
    * @description Configures blending operations. Both source and destination
    * blend modes can take the following values:
    * <ul>
    *     <li>pc.BLENDMODE_ZERO</li>
    *     <li>pc.BLENDMODE_ONE</li>
    *     <li>pc.BLENDMODE_SRC_COLOR</li>
    *     <li>pc.BLENDMODE_ONE_MINUS_SRC_COLOR</li>
    *     <li>pc.BLENDMODE_DST_COLOR</li>
    *     <li>pc.BLENDMODE_ONE_MINUS_DST_COLOR</li>
    *     <li>pc.BLENDMODE_SRC_ALPHA</li>
    *     <li>pc.BLENDMODE_SRC_ALPHA_SATURATE</li>
    *     <li>pc.BLENDMODE_ONE_MINUS_SRC_ALPHA</li>
    *     <li>pc.BLENDMODE_DST_ALPHA</li>
    *     <li>pc.BLENDMODE_ONE_MINUS_DST_ALPHA</li>
    * </ul>
    * @param {Number} blendSrc The source blend function.
    * @param {Number} blendDst The destination blend function.
    */
  def setBlendFunction(blendSrc: Double, blendDst: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setBlendFunctionSeparate
    * @description Configures blending operations. Both source and destination
    * blend modes can take the following values:
    * <ul>
    *     <li>pc.BLENDMODE_ZERO</li>
    *     <li>pc.BLENDMODE_ONE</li>
    *     <li>pc.BLENDMODE_SRC_COLOR</li>
    *     <li>pc.BLENDMODE_ONE_MINUS_SRC_COLOR</li>
    *     <li>pc.BLENDMODE_DST_COLOR</li>
    *     <li>pc.BLENDMODE_ONE_MINUS_DST_COLOR</li>
    *     <li>pc.BLENDMODE_SRC_ALPHA</li>
    *     <li>pc.BLENDMODE_SRC_ALPHA_SATURATE</li>
    *     <li>pc.BLENDMODE_ONE_MINUS_SRC_ALPHA</li>
    *     <li>pc.BLENDMODE_DST_ALPHA</li>
    *     <li>pc.BLENDMODE_ONE_MINUS_DST_ALPHA</li>
    * </ul>
    * @param {Number} blendSrc The source blend function.
    * @param {Number} blendDst The destination blend function.
    * @param {Number} blendSrcAlpha The separate source blend function for the alpha channel.
    * @param {Number} blendDstAlpha The separate destination blend function for the alpha channel.
    */
  def setBlendFunctionSeparate(blendSrc: Double, blendDst: Double, blendSrcAlpha: Double, blendDstAlpha: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setBlending
    * @description Enables or disables blending.
    * @param {Boolean} blending True to enable blending and false to disable it.
    */
  def setBlending(blending: Boolean): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setColorWrite
    * @description Enables or disables writes to the color buffer. Once this state
    * is set, it persists until it is changed. By default, color writes are enabled
    * for all color channels.
    * @param {Boolean} writeRed true to enable writing of the red channel and false otherwise.
    * @param {Boolean} writeGreen true to enable writing of the green channel and false otherwise.
    * @param {Boolean} writeBlue true to enable writing of the blue channel and false otherwise.
    * @param {Boolean} writeAlpha true to enable writing of the alpha channel and false otherwise.
    * @example
    * // Just write alpha into the frame buffer
    * device.setColorWrite(false, false, false, true);
    */
  def setColorWrite(writeRed: Boolean, writeGreen: Boolean, writeBlue: Boolean, writeAlpha: Boolean): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setCullMode
    * @description Controls how triangles are culled based on their face direction.
    * The default cull mode is pc.CULLFACE_BACK.
    * @param {Number} cullMode The cull mode to set. Can be:
    * <ul>
    *     <li>pc.CULLFACE_NONE</li>
    *     <li>pc.CULLFACE_BACK</li>
    *     <li>pc.CULLFACE_FRONT</li>
    *     <li>pc.CULLFACE_FRONTANDBACK</li>
    * </ul>
    */
  def setCullMode(cullMode: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setDepthFunc
    * @description Configures the depth test.
    * @param {Number} func A function to compare a new depth value with an existing z-buffer value and decide if to write a pixel. Can be:
    * <ul>
    *     <li>pc.FUNC_NEVER: don't draw</li>
    *     <li>pc.FUNC_LESS: draw if new depth < depth buffer</li>
    *     <li>pc.FUNC_EQUAL: draw if new depth == depth buffer</li>
    *     <li>pc.FUNC_LESSEQUAL: draw if new depth <= depth buffer</li>
    *     <li>pc.FUNC_GREATER: draw if new depth > depth buffer</li>
    *     <li>pc.FUNC_NOTEQUAL: draw if new depth != depth buffer</li>
    *     <li>pc.FUNC_GREATEREQUAL: draw if new depth >= depth buffer</li>
    *     <li>pc.FUNC_ALWAYS: always draw</li>
    * </ul>
    */
  def setDepthFunc(func: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setDepthTest
    * @description Enables or disables depth testing of fragments. Once this state
    * is set, it persists until it is changed. By default, depth testing is enabled.
    * @param {Boolean} depthTest true to enable depth testing and false otherwise.
    * @example
    * device.setDepthTest(true);
    */
  def setDepthTest(depthTest: Boolean): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setDepthWrite
    * @description Enables or disables writes to the depth buffer. Once this state
    * is set, it persists until it is changed. By default, depth writes are enabled.
    * @param {Boolean} writeDepth true to enable depth writing and false otherwise.
    * @example
    * device.setDepthWrite(true);
    */
  def setDepthWrite(writeDepth: Boolean): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setIndexBuffer
    * @description Sets the current index buffer on the graphics device. On subsequent
    * calls to pc.GraphicsDevice#draw, the specified index buffer will be used to provide
    * index data for any indexed primitives.
    * @param {pc.IndexBuffer} indexBuffer The index buffer to assign to the device.
    */
  def setIndexBuffer(indexBuffer: IndexBuffer): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setRenderTarget
    * @description Sets the specified render target on the device. If null
    * is passed as a parameter, the back buffer becomes the current target
    * for all rendering operations.
    * @param {pc.RenderTarget} renderTarget The render target to activate.
    * @example
    * // Set a render target to receive all rendering output
    * device.setRenderTarget(renderTarget);
    *
    * // Set the back buffer to receive all rendering output
    * device.setRenderTarget(null);
    */
  def setRenderTarget(renderTarget: RenderTarget): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setScissor
    * @description Set the active scissor rectangle on the specified device.
    * @param {Number} x The pixel space x-coordinate of the bottom left corner of the scissor rectangle.
    * @param {Number} y The pixel space y-coordinate of the bottom left corner of the scissor rectangle.
    * @param {Number} w The width of the scissor rectangle in pixels.
    * @param {Number} h The height of the scissor rectangle in pixels.
    */
  def setScissor(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setShader
    * @description Sets the active shader to be used during subsequent draw calls.
    * @param {pc.Shader} shader The shader to set to assign to the device.
    * @returns {Boolean} true if the shader was successfully set, false otherwise.
    */
  def setShader(shader: Shader): Boolean = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setStencilFunc
    * @description Configures stencil test for both front and back faces.
    * @param {Number} func A comparison function that decides if the pixel should be written, based on the current stencil buffer value,
    * reference value, and mask value. Can be:
    * <ul>
    *     <li>pc.FUNC_NEVER: never pass</li>
    *     <li>pc.FUNC_LESS: pass if (ref & mask) < (stencil & mask)</li>
    *     <li>pc.FUNC_EQUAL: pass if (ref & mask) == (stencil & mask)</li>
    *     <li>pc.FUNC_LESSEQUAL: pass if (ref & mask) <= (stencil & mask)</li>
    *     <li>pc.FUNC_GREATER: pass if (ref & mask) > (stencil & mask)</li>
    *     <li>pc.FUNC_NOTEQUAL: pass if (ref & mask) != (stencil & mask)</li>
    *     <li>pc.FUNC_GREATEREQUAL: pass if (ref & mask) >= (stencil & mask)</li>
    *     <li>pc.FUNC_ALWAYS: always pass</li>
    * </ul>
    * @param {Number} ref Reference value used in comparison.
    * @param {Number} mask Mask applied to stencil buffer value and reference value before comparison.
    */
  def setStencilFunc(func: Double, ref: Double, mask: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setStencilFuncBack
    * @description Configures stencil test for back faces.
    * @param {Number} func A comparison function that decides if the pixel should be written,
    * based on the current stencil buffer value, reference value, and mask value. Can be:
    * <ul>
    *     <li>pc.FUNC_NEVER: never pass</li>
    *     <li>pc.FUNC_LESS: pass if (ref & mask) < (stencil & mask)</li>
    *     <li>pc.FUNC_EQUAL: pass if (ref & mask) == (stencil & mask)</li>
    *     <li>pc.FUNC_LESSEQUAL: pass if (ref & mask) <= (stencil & mask)</li>
    *     <li>pc.FUNC_GREATER: pass if (ref & mask) > (stencil & mask)</li>
    *     <li>pc.FUNC_NOTEQUAL: pass if (ref & mask) != (stencil & mask)</li>
    *     <li>pc.FUNC_GREATEREQUAL: pass if (ref & mask) >= (stencil & mask)</li>
    *     <li>pc.FUNC_ALWAYS: always pass</li>
    * </ul>
    * @param {Number} ref Reference value used in comparison.
    * @param {Number} mask Mask applied to stencil buffer value and reference value before comparison.
    */
  def setStencilFuncBack(func: Double, ref: Double, mask: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setStencilFuncFront
    * @description Configures stencil test for front faces.
    * @param {Number} func A comparison function that decides if the pixel should be written,
    * based on the current stencil buffer value, reference value, and mask value. Can be:
    * <ul>
    *     <li>pc.FUNC_NEVER: never pass</li>
    *     <li>pc.FUNC_LESS: pass if (ref & mask) < (stencil & mask)</li>
    *     <li>pc.FUNC_EQUAL: pass if (ref & mask) == (stencil & mask)</li>
    *     <li>pc.FUNC_LESSEQUAL: pass if (ref & mask) <= (stencil & mask)</li>
    *     <li>pc.FUNC_GREATER: pass if (ref & mask) > (stencil & mask)</li>
    *     <li>pc.FUNC_NOTEQUAL: pass if (ref & mask) != (stencil & mask)</li>
    *     <li>pc.FUNC_GREATEREQUAL: pass if (ref & mask) >= (stencil & mask)</li>
    *     <li>pc.FUNC_ALWAYS: always pass</li>
    * </ul>
    * @param {Number} ref Reference value used in comparison.
    * @param {Number} mask Mask applied to stencil buffer value and reference value before comparison.
    */
  def setStencilFuncFront(func: Double, ref: Double, mask: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setStencilOperation
    * @description Configures how stencil buffer values should be modified based on the result
    * of depth/stencil tests. Works for both front and back faces.
    * @param {Number} fail Action to take if stencil test is failed
    * @param {Number} zfail Action to take if depth test is failed
    * @param {Number} zpass Action to take if both depth and stencil test are passed
    * All arguments can be:
    * <ul>
    *     <li>pc.STENCILOP_KEEP: don't change the stencil buffer value</li>
    *     <li>pc.STENCILOP_ZERO: set value to zero</li>
    *     <li>pc.STENCILOP_REPLACE: replace value with the reference value (see {@link pc.GraphicsDevice#setStencilFunc})</li>
    *     <li>pc.STENCILOP_INCREMENT: increment the value</li>
    *     <li>pc.STENCILOP_INCREMENTWRAP: increment the value, but wrap it to zero when it's larger than a maximum representable value</li>
    *     <li>pc.STENCILOP_DECREMENT: decrement the value</li>
    *     <li>pc.STENCILOP_DECREMENTWRAP: decrement the value, but wrap it to a maximum representable value, if the current value is 0</li>
    *     <li>pc.STENCILOP_INVERT: invert the value bitwise</li>
    * </ul>
    * @param {Number} writeMask A bit mask applied to the reference value, when written.
    */
  def setStencilOperation(fail: Double, zfail: Double, zpass: Double, writeMask: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setStencilOperationBack
    * @description Configures how stencil buffer values should be modified based on the result
    * of depth/stencil tests. Works for back faces.
    * @param {Number} fail Action to take if stencil test is failed
    * @param {Number} zfail Action to take if depth test is failed
    * @param {Number} zpass Action to take if both depth and stencil test are passed
    * All arguments can be:
    * <ul>
    *     <li>pc.STENCILOP_KEEP: don't change the stencil buffer value</li>
    *     <li>pc.STENCILOP_ZERO: set value to zero</li>
    *     <li>pc.STENCILOP_REPLACE: replace value with the reference value (see {@link pc.GraphicsDevice#setStencilFunc})</li>
    *     <li>pc.STENCILOP_INCREMENT: increment the value</li>
    *     <li>pc.STENCILOP_INCREMENTWRAP: increment the value, but wrap it to zero when it's larger than a maximum representable value</li>
    *     <li>pc.STENCILOP_DECREMENT: decrement the value</li>
    *     <li>pc.STENCILOP_DECREMENTWRAP: decrement the value, but wrap it to a maximum representable value, if the current value is 0</li>
    *     <li>pc.STENCILOP_INVERT: invert the value bitwise</li>
    * </ul>
    * @param {Number} writeMask A bit mask applied to the reference value, when written.
    */
  def setStencilOperationBack(fail: Double, zfail: Double, zpass: Double, writeMask: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setStencilOperationFront
    * @description Configures how stencil buffer values should be modified based on the result
    * of depth/stencil tests. Works for front faces.
    * @param {Number} fail Action to take if stencil test is failed
    * @param {Number} zfail Action to take if depth test is failed
    * @param {Number} zpass Action to take if both depth and stencil test are passed
    * All arguments can be:
    * <ul>
    *     <li>pc.STENCILOP_KEEP: don't change the stencil buffer value</li>
    *     <li>pc.STENCILOP_ZERO: set value to zero</li>
    *     <li>pc.STENCILOP_REPLACE: replace value with the reference value (see {@link pc.GraphicsDevice#setStencilFunc})</li>
    *     <li>pc.STENCILOP_INCREMENT: increment the value</li>
    *     <li>pc.STENCILOP_INCREMENTWRAP: increment the value, but wrap it to zero when it's larger than a maximum representable value</li>
    *     <li>pc.STENCILOP_DECREMENT: decrement the value</li>
    *     <li>pc.STENCILOP_DECREMENTWRAP: decrement the value, but wrap it to a maximum representable value, if the current value is 0</li>
    *     <li>pc.STENCILOP_INVERT: invert the value bitwise</li>
    * </ul>
    * @param {Number} writeMask A bit mask applied to the reference value, when written.
    */
  def setStencilOperationFront(fail: Double, zfail: Double, zpass: Double, writeMask: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setStencilTest
    * @description Enables or disables stencil test.
    * @param {Boolean} enable True to enable stencil test and false to disable it.
    */
  def setStencilTest(enable: Boolean): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setVertexBuffer
    * @description Sets the current vertex buffer for a specific stream index on the graphics
    * device. On subsequent calls to pc.GraphicsDevice#draw, the specified vertex buffer will be
    * used to provide vertex data for any primitives.
    * @param {pc.VertexBuffer} vertexBuffer The vertex buffer to assign to the device.
    * @param {Number} stream The stream index for the vertex buffer, indexed from 0 upwards.
    * @param {Number} [vbOffset=0] The byte offset into the vertex buffer data. Defaults to 0.
    */
  def setVertexBuffer(vertexBuffer: VertexBuffer, stream: Double): Unit = js.native
  def setVertexBuffer(vertexBuffer: VertexBuffer, stream: Double, vbOffset: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#setViewport
    * @description Set the active rectangle for rendering on the specified device.
    * @param {Number} x The pixel space x-coordinate of the bottom left corner of the viewport.
    * @param {Number} y The pixel space y-coordinate of the bottom left corner of the viewport.
    * @param {Number} w The width of the viewport in pixels.
    * @param {Number} h The height of the viewport in pixels.
    */
  def setViewport(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#updateBegin
    * @description Marks the beginning of a block of rendering. Internally, this function
    * binds the render target currently set on the device. This function should be matched
    * with a call to pc.GraphicsDevice#updateEnd. Calls to pc.GraphicsDevice#updateBegin
    * and pc.GraphicsDevice#updateEnd must not be nested.
    */
  def updateBegin(): Unit = js.native
  /**
    * @function
    * @name pc.GraphicsDevice#updateEnd
    * @description Marks the end of a block of rendering. This function should be called
    * after a matching call to pc.GraphicsDevice#updateBegin. Calls to pc.GraphicsDevice#updateBegin
    * and pc.GraphicsDevice#updateEnd must not be nested.
    */
  def updateEnd(): Unit = js.native
}

