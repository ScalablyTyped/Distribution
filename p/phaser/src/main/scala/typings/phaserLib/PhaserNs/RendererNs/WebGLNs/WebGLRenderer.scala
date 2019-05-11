package typings
package phaserLib.PhaserNs.RendererNs.WebGLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WebGLRenderer is a class that contains the needed functionality to keep the
  * WebGLRenderingContext state clean. The main idea of the WebGLRenderer is to keep track of
  * any context change that happens for WebGL rendering inside of Phaser. This means
  * if raw webgl functions are called outside the WebGLRenderer of the Phaser WebGL
  * rendering ecosystem they might pollute the current WebGLRenderingContext state producing
  * unexpected behavior. It's recommended that WebGL interaction is done through
  * WebGLRenderer and/or WebGLPipeline.
  */
@JSGlobal("Phaser.Renderer.WebGL.WebGLRenderer")
@js.native
class WebGLRenderer protected () extends js.Object {
  /**
    * 
    * @param game The Game instance which owns this WebGL Renderer.
    */
  def this(game: phaserLib.PhaserNs.Game) = this()
  /**
    * A blank 32x32 transparent texture, as used by the Graphics system where needed.
    * This is set in the `boot` method.
    */
  val blankTexture: stdLib.WebGLTexture = js.native
  /**
    * An array of blend modes supported by the WebGL Renderer.
    * 
    * This array includes the default blend modes as well as any custom blend modes added through {@link #addBlendMode}.
    */
  var blendModes: js.Array[_] = js.native
  /**
    * The canvas which this WebGL Renderer draws to.
    */
  var canvas: stdLib.HTMLCanvasElement = js.native
  /**
    * Stores the supported WebGL texture compression formats.
    */
  var compression: js.Array[_] = js.native
  /**
    * The local configuration settings of this WebGL Renderer.
    */
  var config: js.Object = js.native
  /**
    * Set to `true` if the WebGL context of the renderer is lost.
    */
  var contextLost: scala.Boolean = js.native
  /**
    * Cached value for the last texture unit that was used
    */
  var currentActiveTextureUnit: phaserLib.integer = js.native
  /**
    * Current blend mode in use
    */
  var currentBlendMode: phaserLib.integer = js.native
  /**
    * Internal property that tracks the currently set camera mask.
    */
  var currentCameraMask: js.Any = js.native
  /**
    * Current framebuffer in use
    */
  var currentFramebuffer: stdLib.WebGLFramebuffer = js.native
  /**
    * Current WebGLBuffer (Index buffer) in use
    */
  var currentIndexBuffer: stdLib.WebGLBuffer = js.native
  /**
    * Internal property that tracks the currently set mask.
    */
  var currentMask: js.Any = js.native
  /**
    * Current WebGLPipeline in use
    */
  var currentPipeline: WebGLPipeline = js.native
  /**
    * Current WebGLProgram in use
    */
  var currentProgram: stdLib.WebGLProgram = js.native
  /**
    * Stores the current scissor data
    */
  var currentScissor: stdLib.Uint32Array = js.native
  /**
    * Indicates if the the scissor state is enabled in WebGLRenderingContext
    */
  var currentScissorEnabled: scala.Boolean = js.native
  /**
    * An array of the last texture handles that were bound to the WebGLRenderingContext
    */
  var currentTextures: js.Array[_] = js.native
  /**
    * Current WebGLBuffer (Vertex buffer) in use
    */
  var currentVertexBuffer: stdLib.WebGLBuffer = js.native
  /**
    * A default Camera used in calls when no other camera has been provided.
    */
  var defaultCamera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.BaseCamera = js.native
  /**
    * Cached drawing buffer height to reduce gl calls.
    */
  val drawingBufferHeight: scala.Double = js.native
  /**
    * Extensions loaded into the current context
    */
  var extensions: js.Object = js.native
  /**
    * The Game instance which owns this WebGL Renderer.
    */
  var game: phaserLib.PhaserNs.Game = js.native
  /**
    * The underlying WebGL context of the renderer.
    */
  var gl: stdLib.WebGLRenderingContext = js.native
  /**
    * Stores the current WebGL component formats for further use
    */
  var glFormats: js.Array[_] = js.native
  /**
    * Internal gl function mapping for uniform look-up.
    * https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/uniform
    */
  var glFuncMap: js.Any = js.native
  /**
    * The height of the canvas being rendered to.
    * This is populated in the onResize event handler.
    */
  var height: phaserLib.integer = js.native
  /**
    * An array of functions to invoke if the WebGL context is lost.
    */
  var lostContextCallbacks: js.Array[phaserLib.WebGLContextCallback] = js.native
  /**
    * The total number of masks currently stacked.
    */
  var maskCount: phaserLib.integer = js.native
  /**
    * The mask stack.
    */
  var maskStack: js.Array[phaserLib.PhaserNs.DisplayNs.MasksNs.GeometryMask] = js.native
  /**
    * Keeps track of any WebGLTexture created with the current WebGLRenderingContext
    */
  var nativeTextures: js.Array[_] = js.native
  /**
    * This object will store all pipelines created through addPipeline
    */
  var pipelines: js.Object = js.native
  /**
    * An array of functions to invoke if the WebGL context is restored.
    */
  var restoredContextCallbacks: js.Array[phaserLib.WebGLContextCallback] = js.native
  /**
    * Stack of scissor data
    */
  var scissorStack: stdLib.Uint32Array = js.native
  /**
    * Details about the currently scheduled snapshot.
    * 
    * If a non-null `callback` is set in this object, a snapshot of the canvas will be taken after the current frame is fully rendered.
    */
  var snapshotState: phaserLib.PhaserNs.TypesNs.RendererNs.SnapshotNs.SnapshotState = js.native
  /**
    * Array of strings that indicate which WebGL extensions are supported by the browser
    */
  var supportedExtensions: js.Object = js.native
  /**
    * A constant which allows the renderer to be easily identified as a WebGL Renderer.
    */
  var `type`: phaserLib.integer = js.native
  /**
    * The width of the canvas being rendered to.
    * This is populated in the onResize event handler.
    */
  var width: phaserLib.integer = js.native
  /**
    * Creates a new custom blend mode for the renderer.
    * @param func An array containing the WebGL functions to use for the source and the destination blending factors, respectively. See the possible constants for {@link WebGLRenderingContext#blendFunc()}.
    * @param equation The equation to use for combining the RGB and alpha components of a new pixel with a rendered one. See the possible constants for {@link WebGLRenderingContext#blendEquation()}.
    */
  def addBlendMode(func: js.Function, equation: js.Function): phaserLib.integer = js.native
  /**
    * Adds a pipeline instance into the collection of pipelines
    * @param pipelineName A unique string-based key for the pipeline.
    * @param pipelineInstance A pipeline instance which must extend WebGLPipeline.
    */
  def addPipeline(pipelineName: java.lang.String, pipelineInstance: WebGLPipeline): WebGLPipeline = js.native
  /**
    * Creates a WebGL Texture based on the given canvas element.
    * @param srcCanvas The Canvas element that will be used to populate the texture.
    * @param dstTexture Is this going to replace an existing texture? If so, pass it here.
    * @param noRepeat Should this canvas never be allowed to set REPEAT? (such as for Text objects) Default false.
    */
  def canvasToTexture(srcCanvas: stdLib.HTMLCanvasElement): stdLib.WebGLTexture = js.native
  def canvasToTexture(srcCanvas: stdLib.HTMLCanvasElement, dstTexture: stdLib.WebGLTexture): stdLib.WebGLTexture = js.native
  def canvasToTexture(srcCanvas: stdLib.HTMLCanvasElement, dstTexture: stdLib.WebGLTexture, noRepeat: scala.Boolean): stdLib.WebGLTexture = js.native
  /**
    * Flushes the current WebGLPipeline being used and then clears it, along with the
    * the current shader program and vertex buffer. Then resets the blend mode to NORMAL.
    * Call this before jumping to your own gl context handler, and then call `rebindPipeline` when
    * you wish to return control to Phaser again.
    */
  def clearPipeline(): scala.Unit = js.native
  /**
    * Wrapper for creating WebGLFramebuffer.
    * @param width Width in pixels of the framebuffer
    * @param height Height in pixels of the framebuffer
    * @param renderTexture The color texture to where the color pixels are written
    * @param addDepthStencilBuffer Indicates if the current framebuffer support depth and stencil buffers
    */
  def createFramebuffer(
    width: phaserLib.integer,
    height: phaserLib.integer,
    renderTexture: stdLib.WebGLTexture,
    addDepthStencilBuffer: scala.Boolean
  ): stdLib.WebGLFramebuffer = js.native
  /**
    * Wrapper for creating a vertex buffer.
    * @param initialDataOrSize Either ArrayBuffer or an integer indicating the size of the vbo.
    * @param bufferUsage How the buffer is used. gl.DYNAMIC_DRAW, gl.STATIC_DRAW or gl.STREAM_DRAW.
    */
  def createIndexBuffer(initialDataOrSize: stdLib.ArrayBuffer, bufferUsage: phaserLib.integer): stdLib.WebGLBuffer = js.native
  /**
    * Wrapper for creating a WebGLProgram
    * @param vertexShader Source to the vertex shader
    * @param fragmentShader Source to the fragment shader
    */
  def createProgram(vertexShader: java.lang.String, fragmentShader: java.lang.String): stdLib.WebGLProgram = js.native
  /**
    * A wrapper for creating a WebGLTexture. If no pixel data is passed it will create an empty texture.
    * @param mipLevel Mip level of the texture.
    * @param minFilter Filtering of the texture.
    * @param magFilter Filtering of the texture.
    * @param wrapT Wrapping mode of the texture.
    * @param wrapS Wrapping mode of the texture.
    * @param format Which format does the texture use.
    * @param pixels pixel data.
    * @param width Width of the texture in pixels.
    * @param height Height of the texture in pixels.
    * @param pma Does the texture have premultiplied alpha?
    */
  def createTexture2D(
    mipLevel: phaserLib.integer,
    minFilter: phaserLib.integer,
    magFilter: phaserLib.integer,
    wrapT: phaserLib.integer,
    wrapS: phaserLib.integer,
    format: phaserLib.integer,
    pixels: js.Object,
    width: phaserLib.integer,
    height: phaserLib.integer,
    pma: scala.Boolean
  ): stdLib.WebGLTexture = js.native
  /**
    * Creates a texture from an image source. If the source is not valid it creates an empty texture.
    * @param source The source of the texture.
    * @param width The width of the texture.
    * @param height The height of the texture.
    * @param scaleMode The scale mode to be used by the texture.
    */
  def createTextureFromSource(
    source: js.Object,
    width: phaserLib.integer,
    height: phaserLib.integer,
    scaleMode: phaserLib.integer
  ): stdLib.WebGLTexture = js.native
  /**
    * Wrapper for creating a vertex buffer.
    * @param initialDataOrSize It's either ArrayBuffer or an integer indicating the size of the vbo
    * @param bufferUsage How the buffer is used. gl.DYNAMIC_DRAW, gl.STATIC_DRAW or gl.STREAM_DRAW
    */
  def createVertexBuffer(initialDataOrSize: stdLib.ArrayBuffer, bufferUsage: phaserLib.integer): stdLib.WebGLBuffer = js.native
  /**
    * Deletes a WebGLBuffer from the GL instance.
    * @param vertexBuffer The WebGLBuffer to be deleted.
    */
  def deleteBuffer(vertexBuffer: stdLib.WebGLBuffer): this.type = js.native
  /**
    * Deletes a WebGLFramebuffer from the GL instance.
    * @param framebuffer The Framebuffer to be deleted.
    */
  def deleteFramebuffer(framebuffer: stdLib.WebGLFramebuffer): this.type = js.native
  /**
    * Deletes a WebGLProgram from the GL instance.
    * @param program The shader program to be deleted.
    */
  def deleteProgram(program: stdLib.WebGLProgram): this.type = js.native
  /**
    * Removes the given texture from the nativeTextures array and then deletes it from the GPU.
    * @param texture The WebGL Texture to be deleted.
    */
  def deleteTexture(texture: stdLib.WebGLTexture): this.type = js.native
  /**
    * Destroy this WebGLRenderer, cleaning up all related resources such as pipelines, native textures, etc.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Flushes the current pipeline if the pipeline is bound
    */
  def flush(): scala.Unit = js.native
  /**
    * Loads a WebGL extension
    * @param extensionName The name of the extension to load.
    */
  def getExtension(extensionName: java.lang.String): js.Object = js.native
  /**
    * Returns the largest texture size (either width or height) that can be created.
    * Note that VRAM may not allow a texture of any given size, it just expresses
    * hardware / driver support for a given size.
    */
  def getMaxTextureSize(): phaserLib.integer = js.native
  /**
    * Returns the maximum number of texture units that can be used in a fragment shader.
    */
  def getMaxTextures(): phaserLib.integer = js.native
  /**
    * Returns the pipeline by name if the pipeline exists
    * @param pipelineName The name of the pipeline.
    */
  def getPipeline(pipelineName: java.lang.String): WebGLPipeline = js.native
  /**
    * Is there an active stencil mask?
    */
  def hasActiveStencilMask(): scala.Boolean = js.native
  /**
    * Checks if a WebGL extension is supported
    * @param extensionName Name of the WebGL extension
    */
  def hasExtension(extensionName: java.lang.String): scala.Boolean = js.native
  /**
    * Checks if a pipeline is present in the current WebGLRenderer
    * @param pipelineName The name of the pipeline.
    */
  def hasPipeline(pipelineName: java.lang.String): scala.Boolean = js.native
  /**
    * Creates a new WebGLRenderingContext and initializes all internal state.
    * @param config The configuration object for the renderer.
    */
  def init(config: js.Object): this.type = js.native
  /**
    * Adds a callback to be invoked when the WebGL context has been lost by the browser.
    * @param callback The callback to be invoked on context loss.
    * @param target The context of the callback.
    */
  def onContextLost(callback: phaserLib.WebGLContextCallback, target: js.Object): this.type = js.native
  /**
    * Adds a callback to be invoked when the WebGL context has been restored by the browser.
    * @param callback The callback to be invoked on context restoration.
    * @param target The context of the callback.
    */
  def onContextRestored(callback: phaserLib.WebGLContextCallback, target: js.Object): this.type = js.native
  /**
    * The event handler that manages the `resize` event dispatched by the Scale Manager.
    * @param gameSize The default Game Size object. This is the un-modified game dimensions.
    * @param baseSize The base Size object. The game dimensions multiplied by the resolution. The canvas width / height values match this.
    * @param displaySize The display Size object. The size of the canvas style width / height attributes.
    * @param resolution The Scale Manager resolution setting.
    */
  def onResize(
    gameSize: phaserLib.PhaserNs.StructsNs.Size,
    baseSize: phaserLib.PhaserNs.StructsNs.Size,
    displaySize: phaserLib.PhaserNs.StructsNs.Size
  ): scala.Unit = js.native
  def onResize(
    gameSize: phaserLib.PhaserNs.StructsNs.Size,
    baseSize: phaserLib.PhaserNs.StructsNs.Size,
    displaySize: phaserLib.PhaserNs.StructsNs.Size,
    resolution: scala.Double
  ): scala.Unit = js.native
  /**
    * Pops the last scissor state and sets it.
    */
  def popScissor(): scala.Unit = js.native
  /**
    * The post-render step happens after all Cameras in all Scenes have been rendered.
    */
  def postRender(): scala.Unit = js.native
  /**
    * Controls the post-render operations for the given camera.
    * Renders the foreground camera effects like flash and fading. It resets the current scissor state.
    * @param camera The Camera to post-render.
    */
  def postRenderCamera(camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera): scala.Unit = js.native
  /**
    * Clears the current vertex buffer and updates pipelines.
    */
  def preRender(): scala.Unit = js.native
  /**
    * Controls the pre-render operations for the given camera.
    * Handles any clipping needed by the camera and renders the background color if a color is visible.
    * @param camera The Camera to pre-render.
    */
  def preRenderCamera(camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera): scala.Unit = js.native
  /**
    * Pushes a new scissor state. This is used to set nested scissor states.
    * @param x The x position of the scissor.
    * @param y The y position of the scissor.
    * @param width The width of the scissor.
    * @param height The height of the scissor.
    * @param drawingBufferHeight Optional drawingBufferHeight override value.
    */
  def pushScissor(x: phaserLib.integer, y: phaserLib.integer, width: phaserLib.integer, height: phaserLib.integer): js.Array[phaserLib.integer] = js.native
  def pushScissor(
    x: phaserLib.integer,
    y: phaserLib.integer,
    width: phaserLib.integer,
    height: phaserLib.integer,
    drawingBufferHeight: phaserLib.integer
  ): js.Array[phaserLib.integer] = js.native
  /**
    * Use this to reset the gl context to the state that Phaser requires to continue rendering.
    * Calling this will:
    * 
    * * Disable `DEPTH_TEST`, `CULL_FACE` and `STENCIL_TEST`.
    * * Clear the depth buffer and stencil buffers.
    * * Reset the viewport size.
    * * Reset the blend mode.
    * * Bind a blank texture as the active texture on texture unit zero.
    * * Rebinds the given pipeline instance.
    * 
    * You should call this having previously called `clearPipeline` and then wishing to return
    * control to Phaser again.
    * @param pipelineInstance The pipeline instance to be activated.
    */
  def rebindPipeline(pipelineInstance: WebGLPipeline): scala.Unit = js.native
  /**
    * Removes a custom blend mode from the renderer.
    * Any Game Objects still using this blend mode will error, so be sure to clear them first.
    * @param index The index of the custom blend mode to be removed.
    */
  def removeBlendMode(index: phaserLib.integer): this.type = js.native
  /**
    * Removes a pipeline by name.
    * @param pipelineName The name of the pipeline to be removed.
    */
  def removePipeline(pipelineName: java.lang.String): this.type = js.native
  /**
    * The core render step for a Scene Camera.
    * 
    * Iterates through the given Game Object's array and renders them with the given Camera.
    * 
    * This is called by the `CameraManager.render` method. The Camera Manager instance belongs to a Scene, and is invoked
    * by the Scene Systems.render method.
    * 
    * This method is not called if `Camera.visible` is `false`, or `Camera.alpha` is zero.
    * @param scene The Scene to render.
    * @param children The Game Object's within the Scene to be rendered.
    * @param interpolationPercentage The interpolation percentage to apply. Currently un-used.
    * @param camera The Scene Camera to render with.
    */
  def render(
    scene: phaserLib.PhaserNs.Scene,
    children: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    interpolationPercentage: scala.Double,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera
  ): scala.Unit = js.native
  /**
    * Resizes the drawing buffer to match that required by the Scale Manager.
    * @param width The new width of the renderer.
    * @param height The new height of the renderer.
    * @param resolution The new resolution of the renderer.
    */
  def resize(): this.type = js.native
  def resize(width: scala.Double): this.type = js.native
  def resize(width: scala.Double, height: scala.Double): this.type = js.native
  def resize(width: scala.Double, height: scala.Double, resolution: scala.Double): this.type = js.native
  /**
    * Sets the blend mode to the value given.
    * 
    * If the current blend mode is different from the one given, the pipeline is flushed and the new
    * blend mode is enabled.
    * @param blendModeId The blend mode to be set. Can be a `BlendModes` const or an integer value.
    * @param force Force the blend mode to be set, regardless of the currently set blend mode. Default false.
    */
  def setBlendMode(blendModeId: phaserLib.integer): scala.Boolean = js.native
  def setBlendMode(blendModeId: phaserLib.integer, force: scala.Boolean): scala.Boolean = js.native
  /**
    * [description]
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param x [description]
    */
  def setFloat1(program: stdLib.WebGLProgram, name: java.lang.String, x: scala.Double): this.type = js.native
  /**
    * Sets the value of a uniform variable in the given WebGLProgram.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param arr The new value to be used for the uniform variable.
    */
  def setFloat1v(program: stdLib.WebGLProgram, name: java.lang.String, arr: stdLib.Float32Array): this.type = js.native
  /**
    * [description]
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param x [description]
    * @param y [description]
    */
  def setFloat2(program: stdLib.WebGLProgram, name: java.lang.String, x: scala.Double, y: scala.Double): this.type = js.native
  /**
    * Sets the value of a uniform variable in the given WebGLProgram.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param arr The new value to be used for the uniform variable.
    */
  def setFloat2v(program: stdLib.WebGLProgram, name: java.lang.String, arr: stdLib.Float32Array): this.type = js.native
  /**
    * [description]
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param x [description]
    * @param y [description]
    * @param z [description]
    */
  def setFloat3(
    program: stdLib.WebGLProgram,
    name: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    z: scala.Double
  ): this.type = js.native
  /**
    * Sets the value of a uniform variable in the given WebGLProgram.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param arr The new value to be used for the uniform variable.
    */
  def setFloat3v(program: stdLib.WebGLProgram, name: java.lang.String, arr: stdLib.Float32Array): this.type = js.native
  /**
    * Sets uniform of a WebGLProgram
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param x X component
    * @param y Y component
    * @param z Z component
    * @param w W component
    */
  def setFloat4(
    program: stdLib.WebGLProgram,
    name: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    w: scala.Double
  ): this.type = js.native
  /**
    * Sets the value of a uniform variable in the given WebGLProgram.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param arr The new value to be used for the uniform variable.
    */
  def setFloat4v(program: stdLib.WebGLProgram, name: java.lang.String, arr: stdLib.Float32Array): this.type = js.native
  /**
    * Binds a framebuffer. If there was another framebuffer already bound it will force a pipeline flush.
    * @param framebuffer The framebuffer that needs to be bound.
    * @param updateScissor If a framebuffer is given, set the gl scissor to match the frame buffer size? Or, if `null` given, pop the scissor from the stack. Default false.
    */
  def setFramebuffer(framebuffer: stdLib.WebGLFramebuffer): this.type = js.native
  def setFramebuffer(framebuffer: stdLib.WebGLFramebuffer, updateScissor: scala.Boolean): this.type = js.native
  /**
    * Bounds a index buffer. If there is a index buffer already bound it'll force a pipeline flush.
    * @param indexBuffer The buffer the needs to be bound.
    */
  def setIndexBuffer(indexBuffer: stdLib.WebGLBuffer): this.type = js.native
  /**
    * Sets the value of a uniform variable in the given WebGLProgram.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param x [description]
    */
  def setInt1(program: stdLib.WebGLProgram, name: java.lang.String, x: phaserLib.integer): this.type = js.native
  /**
    * Sets the value of a uniform variable in the given WebGLProgram.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param x The new X component
    * @param y The new Y component
    */
  def setInt2(program: stdLib.WebGLProgram, name: java.lang.String, x: phaserLib.integer, y: phaserLib.integer): this.type = js.native
  /**
    * Sets the value of a uniform variable in the given WebGLProgram.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param x The new X component
    * @param y The new Y component
    * @param z The new Z component
    */
  def setInt3(
    program: stdLib.WebGLProgram,
    name: java.lang.String,
    x: phaserLib.integer,
    y: phaserLib.integer,
    z: phaserLib.integer
  ): this.type = js.native
  /**
    * Sets the value of a uniform variable in the given WebGLProgram.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param x X component
    * @param y Y component
    * @param z Z component
    * @param w W component
    */
  def setInt4(
    program: stdLib.WebGLProgram,
    name: java.lang.String,
    x: phaserLib.integer,
    y: phaserLib.integer,
    z: phaserLib.integer,
    w: phaserLib.integer
  ): this.type = js.native
  /**
    * Sets the value of a 2x2 matrix uniform variable in the given WebGLProgram.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param transpose The value indicating whether to transpose the matrix. Must be false.
    * @param matrix The new matrix value.
    */
  def setMatrix2(
    program: stdLib.WebGLProgram,
    name: java.lang.String,
    transpose: scala.Boolean,
    matrix: stdLib.Float32Array
  ): this.type = js.native
  /**
    * [description]
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param transpose [description]
    * @param matrix [description]
    */
  def setMatrix3(
    program: stdLib.WebGLProgram,
    name: java.lang.String,
    transpose: scala.Boolean,
    matrix: stdLib.Float32Array
  ): this.type = js.native
  /**
    * Sets uniform of a WebGLProgram
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param transpose Is the matrix transposed
    * @param matrix Matrix data
    */
  def setMatrix4(
    program: stdLib.WebGLProgram,
    name: java.lang.String,
    transpose: scala.Boolean,
    matrix: stdLib.Float32Array
  ): this.type = js.native
  /**
    * Binds a WebGLPipeline and sets it as the current pipeline to be used.
    * @param pipelineInstance The pipeline instance to be activated.
    * @param gameObject The Game Object that invoked this pipeline, if any.
    */
  def setPipeline(pipelineInstance: WebGLPipeline): WebGLPipeline = js.native
  def setPipeline(pipelineInstance: WebGLPipeline, gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject): WebGLPipeline = js.native
  /**
    * Binds a program. If there was another program already bound it will force a pipeline flush.
    * @param program The program that needs to be bound.
    */
  def setProgram(program: stdLib.WebGLProgram): this.type = js.native
  /**
    * Sets the current scissor state.
    * @param x The x position of the scissor.
    * @param y The y position of the scissor.
    * @param width The width of the scissor.
    * @param height The height of the scissor.
    * @param drawingBufferHeight Optional drawingBufferHeight override value.
    */
  def setScissor(x: phaserLib.integer, y: phaserLib.integer, width: phaserLib.integer, height: phaserLib.integer): scala.Unit = js.native
  def setScissor(
    x: phaserLib.integer,
    y: phaserLib.integer,
    width: phaserLib.integer,
    height: phaserLib.integer,
    drawingBufferHeight: phaserLib.integer
  ): scala.Unit = js.native
  /**
    * Binds a texture at a texture unit. If a texture is already
    * bound to that unit it will force a flush on the current pipeline.
    * @param texture The WebGL texture that needs to be bound.
    * @param textureUnit The texture unit to which the texture will be bound.
    * @param flush Will the current pipeline be flushed if this is a new texture, or not? Default true.
    */
  def setTexture2D(texture: stdLib.WebGLTexture, textureUnit: phaserLib.integer): this.type = js.native
  def setTexture2D(texture: stdLib.WebGLTexture, textureUnit: phaserLib.integer, flush: scala.Boolean): this.type = js.native
  /**
    * Sets the minification and magnification filter for a texture.
    * @param texture The texture to set the filter for.
    * @param filter The filter to set. 0 for linear filtering, 1 for nearest neighbor (blocky) filtering.
    */
  def setTextureFilter(texture: phaserLib.integer, filter: phaserLib.integer): this.type = js.native
  /**
    * Bounds a vertex buffer. If there is a vertex buffer already bound it'll force a pipeline flush.
    * @param vertexBuffer The buffer that needs to be bound.
    */
  def setVertexBuffer(vertexBuffer: stdLib.WebGLBuffer): this.type = js.native
  /**
    * Schedules a snapshot of the entire game viewport to be taken after the current frame is rendered.
    * 
    * To capture a specific area see the `snapshotArea` method. To capture a specific pixel, see `snapshotPixel`.
    * 
    * Only one snapshot can be active _per frame_. If you have already called `snapshotPixel`, for example, then
    * calling this method will override it.
    * 
    * Snapshots work by using the WebGL `readPixels` feature to grab every pixel from the frame buffer into an ArrayBufferView.
    * It then parses this, copying the contents to a temporary Canvas and finally creating an Image object from it,
    * which is the image returned to the callback provided. All in all, this is a computationally expensive and blocking process,
    * which gets more expensive the larger the canvas size gets, so please be careful how you employ this in your game.
    * @param callback The Function to invoke after the snapshot image is created.
    * @param type The format of the image to create, usually `image/png` or `image/jpeg`. Default 'image/png'.
    * @param encoderOptions The image quality, between 0 and 1. Used for image formats with lossy compression, such as `image/jpeg`. Default 0.92.
    */
  def snapshot(callback: phaserLib.PhaserNs.TypesNs.RendererNs.SnapshotNs.SnapshotCallback): this.type = js.native
  def snapshot(
    callback: phaserLib.PhaserNs.TypesNs.RendererNs.SnapshotNs.SnapshotCallback,
    `type`: java.lang.String
  ): this.type = js.native
  def snapshot(
    callback: phaserLib.PhaserNs.TypesNs.RendererNs.SnapshotNs.SnapshotCallback,
    `type`: java.lang.String,
    encoderOptions: scala.Double
  ): this.type = js.native
  /**
    * Schedules a snapshot of the given area of the game viewport to be taken after the current frame is rendered.
    * 
    * To capture the whole game viewport see the `snapshot` method. To capture a specific pixel, see `snapshotPixel`.
    * 
    * Only one snapshot can be active _per frame_. If you have already called `snapshotPixel`, for example, then
    * calling this method will override it.
    * 
    * Snapshots work by using the WebGL `readPixels` feature to grab every pixel from the frame buffer into an ArrayBufferView.
    * It then parses this, copying the contents to a temporary Canvas and finally creating an Image object from it,
    * which is the image returned to the callback provided. All in all, this is a computationally expensive and blocking process,
    * which gets more expensive the larger the canvas size gets, so please be careful how you employ this in your game.
    * @param x The x coordinate to grab from.
    * @param y The y coordinate to grab from.
    * @param width The width of the area to grab.
    * @param height The height of the area to grab.
    * @param callback The Function to invoke after the snapshot image is created.
    * @param type The format of the image to create, usually `image/png` or `image/jpeg`. Default 'image/png'.
    * @param encoderOptions The image quality, between 0 and 1. Used for image formats with lossy compression, such as `image/jpeg`. Default 0.92.
    */
  def snapshotArea(
    x: phaserLib.integer,
    y: phaserLib.integer,
    width: phaserLib.integer,
    height: phaserLib.integer,
    callback: phaserLib.PhaserNs.TypesNs.RendererNs.SnapshotNs.SnapshotCallback
  ): this.type = js.native
  def snapshotArea(
    x: phaserLib.integer,
    y: phaserLib.integer,
    width: phaserLib.integer,
    height: phaserLib.integer,
    callback: phaserLib.PhaserNs.TypesNs.RendererNs.SnapshotNs.SnapshotCallback,
    `type`: java.lang.String
  ): this.type = js.native
  def snapshotArea(
    x: phaserLib.integer,
    y: phaserLib.integer,
    width: phaserLib.integer,
    height: phaserLib.integer,
    callback: phaserLib.PhaserNs.TypesNs.RendererNs.SnapshotNs.SnapshotCallback,
    `type`: java.lang.String,
    encoderOptions: scala.Double
  ): this.type = js.native
  /**
    * Schedules a snapshot of the given pixel from the game viewport to be taken after the current frame is rendered.
    * 
    * To capture the whole game viewport see the `snapshot` method. To capture a specific area, see `snapshotArea`.
    * 
    * Only one snapshot can be active _per frame_. If you have already called `snapshotArea`, for example, then
    * calling this method will override it.
    * 
    * Unlike the other two snapshot methods, this one will return a `Color` object containing the color data for
    * the requested pixel. It doesn't need to create an internal Canvas or Image object, so is a lot faster to execute,
    * using less memory.
    * @param x The x coordinate of the pixel to get.
    * @param y The y coordinate of the pixel to get.
    * @param callback The Function to invoke after the snapshot pixel data is extracted.
    */
  def snapshotPixel(
    x: phaserLib.integer,
    y: phaserLib.integer,
    callback: phaserLib.PhaserNs.TypesNs.RendererNs.SnapshotNs.SnapshotCallback
  ): this.type = js.native
  /**
    * Updates the function bound to a given custom blend mode.
    * @param index The index of the custom blend mode.
    * @param func The function to use for the blend mode.
    * @param equation The equation to use for the blend mode.
    */
  def updateBlendMode(index: phaserLib.integer, func: js.Function, equation: js.Function): this.type = js.native
}

