package typings.playcanvas.pc

import typings.playcanvas.anon.Base
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new graphics device.
  * @property canvas - The canvas DOM element that provides the underlying WebGL context used by the graphics device.
  * @property textureFloatRenderable - Determines if 32-bit floating-point textures can be used as frame buffer. [read only].
  * @property textureHalfFloatRenderable - Determines if 16-bit floating-point textures can be used as frame buffer. [read only].
  * @property scope - The scope namespace for shader attributes and variables. [read only].
  * @param canvas - The canvas to which the graphics device will render.
  * @param [options] - Options passed when creating the WebGL context. More info {@link https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext here}.
  */
@js.native
trait GraphicsDevice extends EventHandler {
  
  /**
    * The canvas DOM element that provides the underlying WebGL context used by the graphics device.
    */
  var canvas: HTMLCanvasElement = js.native
  
  /**
    * Clears the frame buffer of the currently set render target.
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
    * @param options - Optional options object that controls the behavior of the clear operation defined as follows:
    * @param options.color - The color to clear the color buffer to in the range 0.0 to 1.0 for each component.
    * @param options.depth - The depth value to clear the depth buffer to in the range 0.0 to 1.0.
    * @param options.flags - The buffers to clear (the types being color, depth and stencil). Can be any bitwise
    * combination of:
    * * pc.CLEARFLAG_COLOR
    * * pc.CLEARFLAG_DEPTH
    * * pc.CLEARFLAG_STENCIL
    */
  def clear(options: typings.playcanvas.anon.Color): Unit = js.native
  
  /**
    * Frees memory from all shaders ever allocated with this device.
    */
  def clearShaderCache(): Unit = js.native
  
  /**
    * Frees memory from all vertex array objects ever allocated with this device.
    */
  def clearVertexArrayObjectCache(): Unit = js.native
  
  /**
    * Copies source render target into destination render target. Mostly used by post-effects.
    * @param source - The source render target.
    * @param [dest] - The destination render target. Defaults to frame buffer.
    * @param [color] - If true will copy the color buffer. Defaults to false.
    * @param [depth] - If true will copy the depth buffer. Defaults to false.
    * @returns True if the copy was successful, false otherwise.
    */
  def copyRenderTarget(source: RenderTarget): Boolean = js.native
  def copyRenderTarget(
    source: RenderTarget,
    dest: js.UndefOr[scala.Nothing],
    color: js.UndefOr[scala.Nothing],
    depth: Boolean
  ): Boolean = js.native
  def copyRenderTarget(source: RenderTarget, dest: js.UndefOr[scala.Nothing], color: Boolean): Boolean = js.native
  def copyRenderTarget(source: RenderTarget, dest: js.UndefOr[scala.Nothing], color: Boolean, depth: Boolean): Boolean = js.native
  def copyRenderTarget(source: RenderTarget, dest: RenderTarget): Boolean = js.native
  def copyRenderTarget(source: RenderTarget, dest: RenderTarget, color: js.UndefOr[scala.Nothing], depth: Boolean): Boolean = js.native
  def copyRenderTarget(source: RenderTarget, dest: RenderTarget, color: Boolean): Boolean = js.native
  def copyRenderTarget(source: RenderTarget, dest: RenderTarget, color: Boolean, depth: Boolean): Boolean = js.native
  
  /**
    * Submits a graphical primitive to the hardware for immediate rendering.
    * @example
    * // Render a single, unindexed triangle
    * device.draw({
    *     type: pc.PRIMITIVE_TRIANGLES,
    *     base: 0,
    *     count: 3,
    *     indexed: false
    * });
    * @param primitive - Primitive object describing how to submit current vertex/index buffers defined as follows:
    * @param primitive.type - The type of primitive to render. Can be:
    * * {@link pc.PRIMITIVE_POINTS}
    * * {@link pc.PRIMITIVE_LINES}
    * * {@link pc.PRIMITIVE_LINELOOP}
    * * {@link pc.PRIMITIVE_LINESTRIP}
    * * {@link pc.PRIMITIVE_TRIANGLES}
    * * {@link pc.PRIMITIVE_TRISTRIP}
    * * {@link pc.PRIMITIVE_TRIFAN}
    * @param primitive.base - The offset of the first index or vertex to dispatch in the draw call.
    * @param primitive.count - The number of indices or vertices to dispatch in the draw call.
    * @param [primitive.indexed] - True to interpret the primitive as indexed, thereby using the currently set index buffer and false otherwise.
    * @param [numInstances = 1] - The number of instances to render when using ANGLE_instanced_arrays. Defaults to 1.
    * @param [keepBuffers] - Optionally keep the current set of vertex / index buffers / VAO. This is used when rendering of
    * multiple views, for example under WebXR.
    */
  def draw(primitive: Base): Unit = js.native
  def draw(primitive: Base, numInstances: js.UndefOr[scala.Nothing], keepBuffers: Boolean): Unit = js.native
  def draw(primitive: Base, numInstances: Double): Unit = js.native
  def draw(primitive: Base, numInstances: Double, keepBuffers: Boolean): Unit = js.native
  
  /**
    * Fullscreen mode.
    */
  var fullscreen: Boolean = js.native
  
  /**
    * Queries whether blending is enabled.
    * @returns True if blending is enabled and false otherwise.
    */
  def getBlending(): Boolean = js.native
  
  /**
    * Queries whether depth testing is enabled.
    * @example
    * var depthTest = device.getDepthTest();
    * console.log('Depth testing is ' + depthTest ? 'enabled' : 'disabled');
    * @returns True if depth testing is enabled and false otherwise.
    */
  def getDepthTest(): Boolean = js.native
  
  /**
    * Queries whether writes to the depth buffer are enabled.
    * @example
    * var depthWrite = device.getDepthWrite();
    * console.log('Depth writing is ' + depthWrite ? 'enabled' : 'disabled');
    * @returns True if depth writing is enabled and false otherwise.
    */
  def getDepthWrite(): Boolean = js.native
  
  /**
    * Queries the currently set render target on the device.
    * @example
    * // Get the current render target
    * var renderTarget = device.getRenderTarget();
    * @returns The current render target.
    */
  def getRenderTarget(): RenderTarget = js.native
  
  /**
    * Height of the back buffer in pixels.
    */
  val height: Double = js.native
  
  /**
    * The maximum supported texture anisotropy setting.
    */
  val maxAnisotropy: Double = js.native
  
  /**
    * The maximum supported dimension of a cube map.
    */
  val maxCubeMapSize: Double = js.native
  
  /**
    * Maximum pixel ratio.
    */
  var maxPixelRatio: Double = js.native
  
  /**
    * The maximum supported dimension of a texture.
    */
  val maxTextureSize: Double = js.native
  
  /**
    * The maximum supported dimension of a 3D texture (any axis).
    */
  val maxVolumeSize: Double = js.native
  
  /**
    * The highest shader precision supported by this graphics device. Can be 'hiphp', 'mediump' or 'lowp'.
    */
  val precision: String = js.native
  
  /**
    * Sets the width and height of the canvas, then fires the 'resizecanvas' event.
    * Note that the specified width and height values will be multiplied by the value of
    * {@link pc.GraphicsDevice#maxPixelRatio} to give the final resultant width and height for
    * the canvas.
    * @param width - The new width of the canvas.
    * @param height - The new height of the canvas.
    */
  def resizeCanvas(width: Double, height: Double): Unit = js.native
  
  /**
    * The scope namespace for shader attributes and variables. [read only].
    */
  var scope: ScopeSpace = js.native
  
  /**
    * Configures the blending equation. The default blend equation is
    * pc.BLENDEQUATION_ADD.
    * @param blendEquation - The blend equation. Can be:
    * * {@link pc.BLENDEQUATION_ADD}
    * * {@link pc.BLENDEQUATION_SUBTRACT}
    * * {@link pc.BLENDEQUATION_REVERSE_SUBTRACT}
    * * {@link pc.BLENDEQUATION_MIN}
    * * {@link pc.BLENDEQUATION_MAX}
    *
    * Note that MIN and MAX modes require either EXT_blend_minmax or WebGL2 to work (check device.extBlendMinmax).
    */
  def setBlendEquation(blendEquation: Double): Unit = js.native
  
  /**
    * Configures the blending equation. The default blend equation is
    * pc.BLENDEQUATION_ADD.
    * @param blendEquation - The blend equation. Can be:
    * * {@link pc.BLENDEQUATION_ADD}
    * * {@link pc.BLENDEQUATION_SUBTRACT}
    * * {@link pc.BLENDEQUATION_REVERSE_SUBTRACT}
    * * {@link pc.BLENDEQUATION_MIN}
    * * {@link pc.BLENDEQUATION_MAX}
    *
    * Note that MIN and MAX modes require either EXT_blend_minmax or WebGL2 to work (check device.extBlendMinmax).
    * @param blendAlphaEquation - A separate blend equation for the alpha channel. Accepts same values as blendEquation.
    */
  def setBlendEquationSeparate(blendEquation: Double, blendAlphaEquation: Double): Unit = js.native
  
  /**
    * Configures blending operations. Both source and destination
    * blend modes can take the following values:
    * * {@link pc.BLENDMODE_ZERO}
    * * {@link pc.BLENDMODE_ONE}
    * * {@link pc.BLENDMODE_SRC_COLOR}
    * * {@link pc.BLENDMODE_ONE_MINUS_SRC_COLOR}
    * * {@link pc.BLENDMODE_DST_COLOR}
    * * {@link pc.BLENDMODE_ONE_MINUS_DST_COLOR}
    * * {@link pc.BLENDMODE_SRC_ALPHA}
    * * {@link pc.BLENDMODE_SRC_ALPHA_SATURATE}
    * * {@link pc.BLENDMODE_ONE_MINUS_SRC_ALPHA}
    * * {@link pc.BLENDMODE_DST_ALPHA}
    * * {@link pc.BLENDMODE_ONE_MINUS_DST_ALPHA}
    * @param blendSrc - The source blend function.
    * @param blendDst - The destination blend function.
    */
  def setBlendFunction(blendSrc: Double, blendDst: Double): Unit = js.native
  
  /**
    * Configures blending operations. Both source and destination
    * blend modes can take the following values:
    * * {@link pc.BLENDMODE_ZERO}
    * * {@link pc.BLENDMODE_ONE}
    * * {@link pc.BLENDMODE_SRC_COLOR}
    * * {@link pc.BLENDMODE_ONE_MINUS_SRC_COLOR}
    * * {@link pc.BLENDMODE_DST_COLOR}
    * * {@link pc.BLENDMODE_ONE_MINUS_DST_COLOR}
    * * {@link pc.BLENDMODE_SRC_ALPHA}
    * * {@link pc.BLENDMODE_SRC_ALPHA_SATURATE}
    * * {@link pc.BLENDMODE_ONE_MINUS_SRC_ALPHA}
    * * {@link pc.BLENDMODE_DST_ALPHA}
    * * {@link pc.BLENDMODE_ONE_MINUS_DST_ALPHA}
    * @param blendSrc - The source blend function.
    * @param blendDst - The destination blend function.
    * @param blendSrcAlpha - The separate source blend function for the alpha channel.
    * @param blendDstAlpha - The separate destination blend function for the alpha channel.
    */
  def setBlendFunctionSeparate(blendSrc: Double, blendDst: Double, blendSrcAlpha: Double, blendDstAlpha: Double): Unit = js.native
  
  /**
    * Enables or disables blending.
    * @param blending - True to enable blending and false to disable it.
    */
  def setBlending(blending: Boolean): Unit = js.native
  
  /**
    * Enables or disables writes to the color buffer. Once this state
    * is set, it persists until it is changed. By default, color writes are enabled
    * for all color channels.
    * @example
    * // Just write alpha into the frame buffer
    * device.setColorWrite(false, false, false, true);
    * @param writeRed - True to enable writing of the red channel and false otherwise.
    * @param writeGreen - True to enable writing of the green channel and false otherwise.
    * @param writeBlue - True to enable writing of the blue channel and false otherwise.
    * @param writeAlpha - True to enable writing of the alpha channel and false otherwise.
    */
  def setColorWrite(writeRed: Boolean, writeGreen: Boolean, writeBlue: Boolean, writeAlpha: Boolean): Unit = js.native
  
  /**
    * Controls how triangles are culled based on their face direction.
    * The default cull mode is pc.CULLFACE_BACK.
    * @param cullMode - The cull mode to set. Can be:
    * * {@link pc.CULLFACE_NONE}
    * * {@link pc.CULLFACE_BACK}
    * * {@link pc.CULLFACE_FRONT}
    * * {@link pc.CULLFACE_FRONTANDBACK}
    */
  def setCullMode(cullMode: Double): Unit = js.native
  
  /**
    * Configures the depth test.
    * @param func - A function to compare a new depth value with an existing z-buffer value and decide if to write a pixel. Can be:
    * * {@link pc.FUNC_NEVER}: don't draw
    * * {@link pc.FUNC_LESS}: draw if new depth < depth buffer
    * * {@link pc.FUNC_EQUAL}: draw if new depth == depth buffer
    * * {@link pc.FUNC_LESSEQUAL}: draw if new depth <= depth buffer
    * * {@link pc.FUNC_GREATER}: draw if new depth > depth buffer
    * * {@link pc.FUNC_NOTEQUAL}: draw if new depth != depth buffer
    * * {@link pc.FUNC_GREATEREQUAL}: draw if new depth >= depth buffer
    * * {@link pc.FUNC_ALWAYS}: always draw
    */
  def setDepthFunc(func: Double): Unit = js.native
  
  /**
    * Enables or disables depth testing of fragments. Once this state
    * is set, it persists until it is changed. By default, depth testing is enabled.
    * @example
    * device.setDepthTest(true);
    * @param depthTest - True to enable depth testing and false otherwise.
    */
  def setDepthTest(depthTest: Boolean): Unit = js.native
  
  /**
    * Enables or disables writes to the depth buffer. Once this state
    * is set, it persists until it is changed. By default, depth writes are enabled.
    * @example
    * device.setDepthWrite(true);
    * @param writeDepth - True to enable depth writing and false otherwise.
    */
  def setDepthWrite(writeDepth: Boolean): Unit = js.native
  
  /**
    * Sets the current index buffer on the graphics device. On subsequent
    * calls to pc.GraphicsDevice#draw, the specified index buffer will be used to provide
    * index data for any indexed primitives.
    * @param indexBuffer - The index buffer to assign to the device.
    */
  def setIndexBuffer(indexBuffer: IndexBuffer): Unit = js.native
  
  /**
    * Sets the specified render target on the device. If null
    * is passed as a parameter, the back buffer becomes the current target
    * for all rendering operations.
    * @example
    * // Set a render target to receive all rendering output
    * device.setRenderTarget(renderTarget);
    *
    * // Set the back buffer to receive all rendering output
    * device.setRenderTarget(null);
    * @param renderTarget - The render target to activate.
    */
  def setRenderTarget(renderTarget: RenderTarget): Unit = js.native
  
  /**
    * Set the active scissor rectangle on the specified device.
    * @param x - The pixel space x-coordinate of the bottom left corner of the scissor rectangle.
    * @param y - The pixel space y-coordinate of the bottom left corner of the scissor rectangle.
    * @param w - The width of the scissor rectangle in pixels.
    * @param h - The height of the scissor rectangle in pixels.
    */
  def setScissor(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /**
    * Sets the active shader to be used during subsequent draw calls.
    * @param shader - The shader to set to assign to the device.
    * @returns True if the shader was successfully set, false otherwise.
    */
  def setShader(shader: Shader): Boolean = js.native
  
  /**
    * Configures stencil test for both front and back faces.
    * @param func - A comparison function that decides if the pixel should be written, based on the current stencil buffer value,
    * reference value, and mask value. Can be:
    * * {@link pc.FUNC_NEVER}: never pass
    * * {@link pc.FUNC_LESS}: pass if (ref & mask) < (stencil & mask)
    * * {@link pc.FUNC_EQUAL}: pass if (ref & mask) == (stencil & mask)
    * * {@link pc.FUNC_LESSEQUAL}: pass if (ref & mask) <= (stencil & mask)
    * * {@link pc.FUNC_GREATER}: pass if (ref & mask) > (stencil & mask)
    * * {@link pc.FUNC_NOTEQUAL}: pass if (ref & mask) != (stencil & mask)
    * * {@link pc.FUNC_GREATEREQUAL}: pass if (ref & mask) >= (stencil & mask)
    * * {@link pc.FUNC_ALWAYS}: always pass
    * @param ref - Reference value used in comparison.
    * @param mask - Mask applied to stencil buffer value and reference value before comparison.
    */
  def setStencilFunc(func: Double, ref: Double, mask: Double): Unit = js.native
  
  /**
    * Configures stencil test for back faces.
    * @param func - A comparison function that decides if the pixel should be written,
    * based on the current stencil buffer value, reference value, and mask value. Can be:
    * * {@link pc.FUNC_NEVER}: never pass
    * * {@link pc.FUNC_LESS}: pass if (ref & mask) < (stencil & mask)
    * * {@link pc.FUNC_EQUAL}: pass if (ref & mask) == (stencil & mask)
    * * {@link pc.FUNC_LESSEQUAL}: pass if (ref & mask) <= (stencil & mask)
    * * {@link pc.FUNC_GREATER}: pass if (ref & mask) > (stencil & mask)
    * * {@link pc.FUNC_NOTEQUAL}: pass if (ref & mask) != (stencil & mask)
    * * {@link pc.FUNC_GREATEREQUAL}: pass if (ref & mask) >= (stencil & mask)
    * * {@link pc.FUNC_ALWAYS}: always pass
    * @param ref - Reference value used in comparison.
    * @param mask - Mask applied to stencil buffer value and reference value before comparison.
    */
  def setStencilFuncBack(func: Double, ref: Double, mask: Double): Unit = js.native
  
  /**
    * Configures stencil test for front faces.
    * @param func - A comparison function that decides if the pixel should be written,
    * based on the current stencil buffer value, reference value, and mask value. Can be:
    * * {@link pc.FUNC_NEVER}: never pass
    * * {@link pc.FUNC_LESS}: pass if (ref & mask) < (stencil & mask)
    * * {@link pc.FUNC_EQUAL}: pass if (ref & mask) == (stencil & mask)
    * * {@link pc.FUNC_LESSEQUAL}: pass if (ref & mask) <= (stencil & mask)
    * * {@link pc.FUNC_GREATER}: pass if (ref & mask) > (stencil & mask)
    * * {@link pc.FUNC_NOTEQUAL}: pass if (ref & mask) != (stencil & mask)
    * * {@link pc.FUNC_GREATEREQUAL}: pass if (ref & mask) >= (stencil & mask)
    * * {@link pc.FUNC_ALWAYS}: always pass
    * @param ref - Reference value used in comparison.
    * @param mask - Mask applied to stencil buffer value and reference value before comparison.
    */
  def setStencilFuncFront(func: Double, ref: Double, mask: Double): Unit = js.native
  
  /**
    * Configures how stencil buffer values should be modified based on the result
    * of depth/stencil tests. Works for both front and back faces.
    * @param fail - Action to take if stencil test is failed.
    * @param zfail - Action to take if depth test is failed.
    * @param zpass - Action to take if both depth and stencil test are passed
    * All arguments can be:
    * * {@link pc.STENCILOP_KEEP}: don't change the stencil buffer value
    * * {@link pc.STENCILOP_ZERO}: set value to zero
    * * {@link pc.STENCILOP_REPLACE}: replace value with the reference value (see {@link pc.GraphicsDevice#setStencilFunc})
    * * {@link pc.STENCILOP_INCREMENT}: increment the value
    * * {@link pc.STENCILOP_INCREMENTWRAP}: increment the value, but wrap it to zero when it's larger than a maximum representable value
    * * {@link pc.STENCILOP_DECREMENT}: decrement the value
    * * {@link pc.STENCILOP_DECREMENTWRAP}: decrement the value, but wrap it to a maximum representable value, if the current value is 0
    * * {@link pc.STENCILOP_INVERT}: invert the value bitwise
    * @param writeMask - A bit mask applied to the reference value, when written.
    */
  def setStencilOperation(fail: Double, zfail: Double, zpass: Double, writeMask: Double): Unit = js.native
  
  /**
    * Configures how stencil buffer values should be modified based on the result
    * of depth/stencil tests. Works for back faces.
    * @param fail - Action to take if stencil test is failed.
    * @param zfail - Action to take if depth test is failed.
    * @param zpass - Action to take if both depth and stencil test are passed
    * All arguments can be:
    * * {@link pc.STENCILOP_KEEP}: don't change the stencil buffer value
    * * {@link pc.STENCILOP_ZERO}: set value to zero
    * * {@link pc.STENCILOP_REPLACE}: replace value with the reference value (see {@link pc.GraphicsDevice#setStencilFunc})
    * * {@link pc.STENCILOP_INCREMENT}: increment the value
    * * {@link pc.STENCILOP_INCREMENTWRAP}: increment the value, but wrap it to zero when it's larger than a maximum representable value
    * * {@link pc.STENCILOP_DECREMENT}: decrement the value
    * * {@link pc.STENCILOP_DECREMENTWRAP}: decrement the value, but wrap it to a maximum representable value, if the current value is 0
    * * {@link pc.STENCILOP_INVERT}: invert the value bitwise
    * @param writeMask - A bit mask applied to the reference value, when written.
    */
  def setStencilOperationBack(fail: Double, zfail: Double, zpass: Double, writeMask: Double): Unit = js.native
  
  /**
    * Configures how stencil buffer values should be modified based on the result
    * of depth/stencil tests. Works for front faces.
    * @param fail - Action to take if stencil test is failed.
    * @param zfail - Action to take if depth test is failed.
    * @param zpass - Action to take if both depth and stencil test are passed
    * All arguments can be:
    * * {@link pc.STENCILOP_KEEP}: don't change the stencil buffer value
    * * {@link pc.STENCILOP_ZERO}: set value to zero
    * * {@link pc.STENCILOP_REPLACE}: replace value with the reference value (see {@link pc.GraphicsDevice#setStencilFunc})
    * * {@link pc.STENCILOP_INCREMENT}: increment the value
    * * {@link pc.STENCILOP_INCREMENTWRAP}: increment the value, but wrap it to zero when it's larger than a maximum representable value
    * * {@link pc.STENCILOP_DECREMENT}: decrement the value
    * * {@link pc.STENCILOP_DECREMENTWRAP}: decrement the value, but wrap it to a maximum representable value, if the current value is 0
    * * {@link pc.STENCILOP_INVERT}: invert the value bitwise
    * @param writeMask - A bit mask applied to the reference value, when written.
    */
  def setStencilOperationFront(fail: Double, zfail: Double, zpass: Double, writeMask: Double): Unit = js.native
  
  /**
    * Enables or disables stencil test.
    * @param enable - True to enable stencil test and false to disable it.
    */
  def setStencilTest(enable: Boolean): Unit = js.native
  
  /**
    * Sets the current vertex buffer on the graphics device. On subsequent calls to
    * {@link pc.GraphicsDevice#draw}, the specified vertex buffer(s) will be used to provide vertex data for any primitives.
    * @param vertexBuffer - The vertex buffer to assign to the device.
    */
  def setVertexBuffer(vertexBuffer: VertexBuffer): Unit = js.native
  
  /**
    * Set the active rectangle for rendering on the specified device.
    * @param x - The pixel space x-coordinate of the bottom left corner of the viewport.
    * @param y - The pixel space y-coordinate of the bottom left corner of the viewport.
    * @param w - The width of the viewport in pixels.
    * @param h - The height of the viewport in pixels.
    */
  def setViewport(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /**
    * True if hardware instancing is supported.
    */
  val supportsInstancing: Boolean = js.native
  
  /**
    * Check if high precision floating-point textures are supported.
    */
  val textureFloatHighPrecision: Double = js.native
  
  /**
    * Determines if 32-bit floating-point textures can be used as frame buffer. [read only].
    */
  var textureFloatRenderable: Boolean = js.native
  
  /**
    * Determines if 16-bit floating-point textures can be used as frame buffer. [read only].
    */
  var textureHalfFloatRenderable: Boolean = js.native
  
  /**
    * Check if texture with half float format can be updated with data.
    */
  val textureHalfFloatUpdatable: Double = js.native
  
  /**
    * Marks the beginning of a block of rendering. Internally, this function
    * binds the render target currently set on the device. This function should be matched
    * with a call to pc.GraphicsDevice#updateEnd. Calls to pc.GraphicsDevice#updateBegin
    * and pc.GraphicsDevice#updateEnd must not be nested.
    */
  def updateBegin(): Unit = js.native
  
  /**
    * Marks the end of a block of rendering. This function should be called
    * after a matching call to pc.GraphicsDevice#updateBegin. Calls to pc.GraphicsDevice#updateBegin
    * and pc.GraphicsDevice#updateEnd must not be nested.
    */
  def updateEnd(): Unit = js.native
  
  /**
    * Width of the back buffer in pixels.
    */
  val width: Double = js.native
}
