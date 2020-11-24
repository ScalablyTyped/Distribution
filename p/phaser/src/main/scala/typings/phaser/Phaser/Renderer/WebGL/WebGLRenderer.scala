package typings.phaser.Phaser.Renderer.WebGL

import typings.phaser.Phaser.Cameras.Scene2D.BaseCamera
import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.Display.Masks.GeometryMask
import typings.phaser.Phaser.Game
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Structs.Size
import typings.phaser.Phaser.Types.Renderer.Snapshot.SnapshotCallback
import typings.phaser.Phaser.Types.Renderer.Snapshot.SnapshotState
import typings.phaser.integer
import typings.std.ArrayBuffer
import typings.std.Float32Array
import typings.std.GLenum
import typings.std.HTMLCanvasElement
import typings.std.HTMLVideoElement
import typings.std.Uint32Array
import typings.std.WebGLBuffer
import typings.std.WebGLFramebuffer
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WebGLRenderer is a class that contains the needed functionality to keep the
  * WebGLRenderingContext state clean. The main idea of the WebGLRenderer is to keep track of
  * any context change that happens for WebGL rendering inside of Phaser. This means
  * if raw webgl functions are called outside the WebGLRenderer of the Phaser WebGL
  * rendering ecosystem they might pollute the current WebGLRenderingContext state producing
  * unexpected behavior. It's recommended that WebGL interaction is done through
  * WebGLRenderer and/or WebGLPipeline.
  */
@js.native
trait WebGLRenderer extends js.Object {
  
  /**
    * Creates a new custom blend mode for the renderer.
    * 
    * See https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#Blending_modes
    * @param func An array containing the WebGL functions to use for the source and the destination blending factors, respectively. See the possible constants for {@link WebGLRenderingContext#blendFunc()}.
    * @param equation The equation to use for combining the RGB and alpha components of a new pixel with a rendered one. See the possible constants for {@link WebGLRenderingContext#blendEquation()}.
    */
  def addBlendMode(func: js.Array[GLenum], equation: GLenum): integer = js.native
  
  /**
    * Adds a pipeline instance into the collection of pipelines
    * @param pipelineName A unique string-based key for the pipeline.
    * @param pipelineInstance A pipeline instance which must extend WebGLPipeline.
    */
  def addPipeline(pipelineName: String, pipelineInstance: WebGLPipeline): WebGLPipeline = js.native
  
  /**
    * A blank 32x32 transparent texture, as used by the Graphics system where needed.
    * This is set in the `boot` method.
    */
  val blankTexture: WebGLTexture = js.native
  
  /**
    * An array of blend modes supported by the WebGL Renderer.
    * 
    * This array includes the default blend modes as well as any custom blend modes added through {@link #addBlendMode}.
    */
  var blendModes: js.Array[_] = js.native
  
  /**
    * The canvas which this WebGL Renderer draws to.
    */
  var canvas: HTMLCanvasElement = js.native
  
  /**
    * Creates a new WebGL Texture based on the given Canvas Element.
    * 
    * If the `dstTexture` parameter is given, the WebGL Texture is updated, rather than created fresh.
    * @param srcCanvas The Canvas to create the WebGL Texture from
    * @param dstTexture The destination WebGL Texture to set.
    * @param noRepeat Should this canvas be allowed to set `REPEAT` (such as for Text objects?) Default false.
    * @param flipY Should the WebGL Texture set `UNPACK_MULTIPLY_FLIP_Y`? Default false.
    */
  def canvasToTexture(srcCanvas: HTMLCanvasElement): WebGLTexture = js.native
  def canvasToTexture(
    srcCanvas: HTMLCanvasElement,
    dstTexture: js.UndefOr[scala.Nothing],
    noRepeat: js.UndefOr[scala.Nothing],
    flipY: Boolean
  ): WebGLTexture = js.native
  def canvasToTexture(srcCanvas: HTMLCanvasElement, dstTexture: js.UndefOr[scala.Nothing], noRepeat: Boolean): WebGLTexture = js.native
  def canvasToTexture(
    srcCanvas: HTMLCanvasElement,
    dstTexture: js.UndefOr[scala.Nothing],
    noRepeat: Boolean,
    flipY: Boolean
  ): WebGLTexture = js.native
  def canvasToTexture(srcCanvas: HTMLCanvasElement, dstTexture: WebGLTexture): WebGLTexture = js.native
  def canvasToTexture(
    srcCanvas: HTMLCanvasElement,
    dstTexture: WebGLTexture,
    noRepeat: js.UndefOr[scala.Nothing],
    flipY: Boolean
  ): WebGLTexture = js.native
  def canvasToTexture(srcCanvas: HTMLCanvasElement, dstTexture: WebGLTexture, noRepeat: Boolean): WebGLTexture = js.native
  def canvasToTexture(srcCanvas: HTMLCanvasElement, dstTexture: WebGLTexture, noRepeat: Boolean, flipY: Boolean): WebGLTexture = js.native
  
  /**
    * Flushes the current WebGLPipeline being used and then clears it, along with the
    * the current shader program and vertex buffer. Then resets the blend mode to NORMAL.
    * Call this before jumping to your own gl context handler, and then call `rebindPipeline` when
    * you wish to return control to Phaser again.
    */
  def clearPipeline(): Unit = js.native
  
  /**
    * Stores the supported WebGL texture compression formats.
    */
  var compression: js.Array[_] = js.native
  
  /**
    * The local configuration settings of this WebGL Renderer.
    */
  var config: js.Object = js.native
  
  /**
    * This property is set to `true` if the WebGL context of the renderer is lost.
    */
  var contextLost: Boolean = js.native
  
  /**
    * The handler to invoke when the context is lost.
    * This should not be changed and is set in the boot method.
    */
  var contextLostHandler: js.Function = js.native
  
  /**
    * The handler to invoke when the context is restored.
    * This should not be changed and is set in the boot method.
    */
  var contextRestoredHandler: js.Function = js.native
  
  /**
    * Creates a new WebGL Texture based on the given Canvas Element.
    * @param srcCanvas The Canvas to create the WebGL Texture from
    * @param noRepeat Should this canvas be allowed to set `REPEAT` (such as for Text objects?) Default false.
    * @param flipY Should the WebGL Texture set `UNPACK_MULTIPLY_FLIP_Y`? Default false.
    */
  def createCanvasTexture(srcCanvas: HTMLCanvasElement): WebGLTexture = js.native
  def createCanvasTexture(srcCanvas: HTMLCanvasElement, noRepeat: js.UndefOr[scala.Nothing], flipY: Boolean): WebGLTexture = js.native
  def createCanvasTexture(srcCanvas: HTMLCanvasElement, noRepeat: Boolean): WebGLTexture = js.native
  def createCanvasTexture(srcCanvas: HTMLCanvasElement, noRepeat: Boolean, flipY: Boolean): WebGLTexture = js.native
  
  /**
    * Wrapper for creating WebGLFramebuffer.
    * @param width Width in pixels of the framebuffer
    * @param height Height in pixels of the framebuffer
    * @param renderTexture The color texture to where the color pixels are written
    * @param addDepthStencilBuffer Indicates if the current framebuffer support depth and stencil buffers
    */
  def createFramebuffer(width: integer, height: integer, renderTexture: WebGLTexture, addDepthStencilBuffer: Boolean): WebGLFramebuffer = js.native
  
  /**
    * Wrapper for creating a vertex buffer.
    * @param initialDataOrSize Either ArrayBuffer or an integer indicating the size of the vbo.
    * @param bufferUsage How the buffer is used. gl.DYNAMIC_DRAW, gl.STATIC_DRAW or gl.STREAM_DRAW.
    */
  def createIndexBuffer(initialDataOrSize: ArrayBuffer, bufferUsage: integer): WebGLBuffer = js.native
  
  /**
    * Wrapper for creating a WebGLProgram
    * @param vertexShader Source to the vertex shader
    * @param fragmentShader Source to the fragment shader
    */
  def createProgram(vertexShader: String, fragmentShader: String): WebGLProgram = js.native
  
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
    * @param pma Does the texture have premultiplied alpha? Default true.
    * @param forceSize If `true` it will use the width and height passed to this method, regardless of the pixels dimension. Default false.
    * @param flipY Sets the `UNPACK_FLIP_Y_WEBGL` flag the WebGL Texture uses during upload. Default false.
    */
  def createTexture2D(
    mipLevel: integer,
    minFilter: integer,
    magFilter: integer,
    wrapT: integer,
    wrapS: integer,
    format: integer,
    pixels: js.Object,
    width: integer,
    height: integer
  ): WebGLTexture = js.native
  def createTexture2D(
    mipLevel: integer,
    minFilter: integer,
    magFilter: integer,
    wrapT: integer,
    wrapS: integer,
    format: integer,
    pixels: js.Object,
    width: integer,
    height: integer,
    pma: js.UndefOr[scala.Nothing],
    forceSize: js.UndefOr[scala.Nothing],
    flipY: Boolean
  ): WebGLTexture = js.native
  def createTexture2D(
    mipLevel: integer,
    minFilter: integer,
    magFilter: integer,
    wrapT: integer,
    wrapS: integer,
    format: integer,
    pixels: js.Object,
    width: integer,
    height: integer,
    pma: js.UndefOr[scala.Nothing],
    forceSize: Boolean
  ): WebGLTexture = js.native
  def createTexture2D(
    mipLevel: integer,
    minFilter: integer,
    magFilter: integer,
    wrapT: integer,
    wrapS: integer,
    format: integer,
    pixels: js.Object,
    width: integer,
    height: integer,
    pma: js.UndefOr[scala.Nothing],
    forceSize: Boolean,
    flipY: Boolean
  ): WebGLTexture = js.native
  def createTexture2D(
    mipLevel: integer,
    minFilter: integer,
    magFilter: integer,
    wrapT: integer,
    wrapS: integer,
    format: integer,
    pixels: js.Object,
    width: integer,
    height: integer,
    pma: Boolean
  ): WebGLTexture = js.native
  def createTexture2D(
    mipLevel: integer,
    minFilter: integer,
    magFilter: integer,
    wrapT: integer,
    wrapS: integer,
    format: integer,
    pixels: js.Object,
    width: integer,
    height: integer,
    pma: Boolean,
    forceSize: js.UndefOr[scala.Nothing],
    flipY: Boolean
  ): WebGLTexture = js.native
  def createTexture2D(
    mipLevel: integer,
    minFilter: integer,
    magFilter: integer,
    wrapT: integer,
    wrapS: integer,
    format: integer,
    pixels: js.Object,
    width: integer,
    height: integer,
    pma: Boolean,
    forceSize: Boolean
  ): WebGLTexture = js.native
  def createTexture2D(
    mipLevel: integer,
    minFilter: integer,
    magFilter: integer,
    wrapT: integer,
    wrapS: integer,
    format: integer,
    pixels: js.Object,
    width: integer,
    height: integer,
    pma: Boolean,
    forceSize: Boolean,
    flipY: Boolean
  ): WebGLTexture = js.native
  
  /**
    * Creates a texture from an image source. If the source is not valid it creates an empty texture.
    * @param source The source of the texture.
    * @param width The width of the texture.
    * @param height The height of the texture.
    * @param scaleMode The scale mode to be used by the texture.
    */
  def createTextureFromSource(source: js.Object, width: integer, height: integer, scaleMode: integer): WebGLTexture = js.native
  
  /**
    * Wrapper for creating a vertex buffer.
    * @param initialDataOrSize It's either ArrayBuffer or an integer indicating the size of the vbo
    * @param bufferUsage How the buffer is used. gl.DYNAMIC_DRAW, gl.STATIC_DRAW or gl.STREAM_DRAW
    */
  def createVertexBuffer(initialDataOrSize: ArrayBuffer, bufferUsage: integer): WebGLBuffer = js.native
  
  /**
    * Creates a new WebGL Texture based on the given HTML Video Element.
    * @param srcVideo The Video to create the WebGL Texture from
    * @param noRepeat Should this canvas be allowed to set `REPEAT`? Default false.
    * @param flipY Should the WebGL Texture set `UNPACK_MULTIPLY_FLIP_Y`? Default false.
    */
  def createVideoTexture(srcVideo: HTMLVideoElement): WebGLTexture = js.native
  def createVideoTexture(srcVideo: HTMLVideoElement, noRepeat: js.UndefOr[scala.Nothing], flipY: Boolean): WebGLTexture = js.native
  def createVideoTexture(srcVideo: HTMLVideoElement, noRepeat: Boolean): WebGLTexture = js.native
  def createVideoTexture(srcVideo: HTMLVideoElement, noRepeat: Boolean, flipY: Boolean): WebGLTexture = js.native
  
  /**
    * Cached value for the last texture unit that was used
    */
  var currentActiveTextureUnit: integer = js.native
  
  /**
    * Current blend mode in use
    */
  var currentBlendMode: integer = js.native
  
  /**
    * Internal property that tracks the currently set camera mask.
    */
  var currentCameraMask: js.Any = js.native
  
  /**
    * Current framebuffer in use
    */
  var currentFramebuffer: WebGLFramebuffer = js.native
  
  /**
    * Current WebGLBuffer (Index buffer) in use
    */
  var currentIndexBuffer: WebGLBuffer = js.native
  
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
  var currentProgram: WebGLProgram = js.native
  
  /**
    * Stores the current scissor data
    */
  var currentScissor: Uint32Array = js.native
  
  /**
    * Indicates if the the scissor state is enabled in WebGLRenderingContext
    */
  var currentScissorEnabled: Boolean = js.native
  
  /**
    * An array of the last texture handles that were bound to the WebGLRenderingContext
    */
  var currentTextures: js.Array[_] = js.native
  
  /**
    * The `type` of the Game Object being currently rendered.
    * This can be used by advanced render functions for batching look-ahead.
    */
  var currentType: String = js.native
  
  /**
    * Current WebGLBuffer (Vertex buffer) in use
    */
  var currentVertexBuffer: WebGLBuffer = js.native
  
  /**
    * A default Camera used in calls when no other camera has been provided.
    */
  var defaultCamera: BaseCamera = js.native
  
  /**
    * Deletes a WebGLBuffer from the GL instance.
    * @param vertexBuffer The WebGLBuffer to be deleted.
    */
  def deleteBuffer(vertexBuffer: WebGLBuffer): this.type = js.native
  
  /**
    * Deletes a WebGLFramebuffer from the GL instance.
    * @param framebuffer The Framebuffer to be deleted.
    */
  def deleteFramebuffer(framebuffer: WebGLFramebuffer): this.type = js.native
  
  /**
    * Deletes a WebGLProgram from the GL instance.
    * @param program The shader program to be deleted.
    */
  def deleteProgram(program: WebGLProgram): this.type = js.native
  
  /**
    * Removes the given texture from the nativeTextures array and then deletes it from the GPU.
    * @param texture The WebGL Texture to be deleted.
    */
  def deleteTexture(texture: WebGLTexture): this.type = js.native
  
  /**
    * Destroy this WebGLRenderer, cleaning up all related resources such as pipelines, native textures, etc.
    */
  def destroy(): Unit = js.native
  
  /**
    * Cached drawing buffer height to reduce gl calls.
    */
  val drawingBufferHeight: Double = js.native
  
  /**
    * Extensions loaded into the current context
    */
  var extensions: js.Object = js.native
  
  /**
    * Flushes the current pipeline if the pipeline is bound
    */
  def flush(): Unit = js.native
  
  /**
    * The Game instance which owns this WebGL Renderer.
    */
  var game: Game = js.native
  
  /**
    * Loads a WebGL extension
    * @param extensionName The name of the extension to load.
    */
  def getExtension(extensionName: String): js.Object = js.native
  
  /**
    * Returns the largest texture size (either width or height) that can be created.
    * Note that VRAM may not allow a texture of any given size, it just expresses
    * hardware / driver support for a given size.
    */
  def getMaxTextureSize(): integer = js.native
  
  /**
    * Returns the maximum number of texture units that can be used in a fragment shader.
    */
  def getMaxTextures(): integer = js.native
  
  /**
    * Returns the pipeline by name if the pipeline exists
    * @param pipelineName The name of the pipeline.
    */
  def getPipeline(pipelineName: String): WebGLPipeline = js.native
  
  /**
    * The underlying WebGL context of the renderer.
    */
  var gl: WebGLRenderingContext = js.native
  
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
    * Is there an active stencil mask?
    */
  def hasActiveStencilMask(): Boolean = js.native
  
  /**
    * Checks if a WebGL extension is supported
    * @param extensionName Name of the WebGL extension
    */
  def hasExtension(extensionName: String): Boolean = js.native
  
  /**
    * Checks if a pipeline is present in the current WebGLRenderer
    * @param pipelineName The name of the pipeline.
    */
  def hasPipeline(pipelineName: String): Boolean = js.native
  
  /**
    * The height of the canvas being rendered to.
    * This is populated in the onResize event handler.
    */
  var height: integer = js.native
  
  /**
    * Creates a new WebGLRenderingContext and initializes all internal state.
    * @param config The configuration object for the renderer.
    */
  def init(config: js.Object): this.type = js.native
  
  /**
    * The total number of masks currently stacked.
    */
  var maskCount: integer = js.native
  
  /**
    * The mask stack.
    */
  var maskStack: js.Array[GeometryMask] = js.native
  
  /**
    * The mipmap magFilter to be used when creating textures.
    * 
    * You can specify this as a string in the game config, i.e.:
    * 
    * `renderer: { mipmapFilter: 'NEAREST_MIPMAP_LINEAR' }`
    * 
    * The 6 options for WebGL1 are, in order from least to most computationally expensive:
    * 
    * NEAREST (for pixel art)
    * LINEAR (the default)
    * NEAREST_MIPMAP_NEAREST
    * LINEAR_MIPMAP_NEAREST
    * NEAREST_MIPMAP_LINEAR
    * LINEAR_MIPMAP_LINEAR
    * 
    * Mipmaps only work with textures that are fully power-of-two in size.
    * 
    * For more details see https://webglfundamentals.org/webgl/lessons/webgl-3d-textures.html
    */
  var mipmapFilter: GLenum = js.native
  
  /**
    * Keeps track of any WebGLTexture created with the current WebGLRenderingContext
    */
  var nativeTextures: js.Array[_] = js.native
  
  /**
    * Is the `type` of the Game Object being currently rendered different than the
    * type of the object before it in the display list? I.e. it's a 'new' type.
    */
  var newType: Boolean = js.native
  
  /**
    * Does the `type` of the next Game Object in the display list match that
    * of the object being currently rendered?
    */
  var nextTypeMatch: Boolean = js.native
  
  /**
    * The event handler that manages the `resize` event dispatched by the Scale Manager.
    * @param gameSize The default Game Size object. This is the un-modified game dimensions.
    * @param baseSize The base Size object. The game dimensions multiplied by the resolution. The canvas width / height values match this.
    * @param displaySize The display Size object. The size of the canvas style width / height attributes.
    * @param resolution The Scale Manager resolution setting.
    */
  def onResize(gameSize: Size, baseSize: Size, displaySize: Size): Unit = js.native
  def onResize(gameSize: Size, baseSize: Size, displaySize: Size, resolution: Double): Unit = js.native
  
  /**
    * This object will store all pipelines created through addPipeline
    */
  var pipelines: js.Object = js.native
  
  /**
    * Pops the last scissor state and sets it.
    */
  def popScissor(): Unit = js.native
  
  /**
    * The post-render step happens after all Cameras in all Scenes have been rendered.
    */
  def postRender(): Unit = js.native
  
  /**
    * Controls the post-render operations for the given camera.
    * Renders the foreground camera effects like flash and fading. It resets the current scissor state.
    * @param camera The Camera to post-render.
    */
  def postRenderCamera(camera: Camera): Unit = js.native
  
  /**
    * Clears the current vertex buffer and updates pipelines.
    */
  def preRender(): Unit = js.native
  
  /**
    * Controls the pre-render operations for the given camera.
    * Handles any clipping needed by the camera and renders the background color if a color is visible.
    * @param camera The Camera to pre-render.
    */
  def preRenderCamera(camera: Camera): Unit = js.native
  
  /**
    * Pushes a new scissor state. This is used to set nested scissor states.
    * @param x The x position of the scissor.
    * @param y The y position of the scissor.
    * @param width The width of the scissor.
    * @param height The height of the scissor.
    * @param drawingBufferHeight Optional drawingBufferHeight override value.
    */
  def pushScissor(x: integer, y: integer, width: integer, height: integer): js.Array[integer] = js.native
  def pushScissor(x: integer, y: integer, width: integer, height: integer, drawingBufferHeight: integer): js.Array[integer] = js.native
  
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
  def rebindPipeline(pipelineInstance: WebGLPipeline): Unit = js.native
  
  /**
    * Removes a custom blend mode from the renderer.
    * Any Game Objects still using this blend mode will error, so be sure to clear them first.
    * @param index The index of the custom blend mode to be removed.
    */
  def removeBlendMode(index: integer): this.type = js.native
  
  /**
    * Removes a pipeline by name.
    * @param pipelineName The name of the pipeline to be removed.
    */
  def removePipeline(pipelineName: String): this.type = js.native
  
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
  def render(scene: Scene, children: GameObject, interpolationPercentage: Double, camera: Camera): Unit = js.native
  
  /**
    * Resizes the drawing buffer to match that required by the Scale Manager.
    * @param width The new width of the renderer.
    * @param height The new height of the renderer.
    * @param resolution The new resolution of the renderer.
    */
  def resize(): this.type = js.native
  def resize(width: js.UndefOr[scala.Nothing], height: js.UndefOr[scala.Nothing], resolution: Double): this.type = js.native
  def resize(width: js.UndefOr[scala.Nothing], height: Double): this.type = js.native
  def resize(width: js.UndefOr[scala.Nothing], height: Double, resolution: Double): this.type = js.native
  def resize(width: Double): this.type = js.native
  def resize(width: Double, height: js.UndefOr[scala.Nothing], resolution: Double): this.type = js.native
  def resize(width: Double, height: Double): this.type = js.native
  def resize(width: Double, height: Double, resolution: Double): this.type = js.native
  
  /**
    * Stack of scissor data
    */
  var scissorStack: Uint32Array = js.native
  
  /**
    * Sets the blend mode to the value given.
    * 
    * If the current blend mode is different from the one given, the pipeline is flushed and the new
    * blend mode is enabled.
    * @param blendModeId The blend mode to be set. Can be a `BlendModes` const or an integer value.
    * @param force Force the blend mode to be set, regardless of the currently set blend mode. Default false.
    */
  def setBlendMode(blendModeId: integer): Boolean = js.native
  def setBlendMode(blendModeId: integer, force: Boolean): Boolean = js.native
  
  /**
    * Sets a 1f uniform value on the given shader.
    * 
    * If the shader is not currently active, it is made active first.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param x The 1f value to set on the named uniform.
    */
  def setFloat1(program: WebGLProgram, name: String, x: Double): this.type = js.native
  
  /**
    * Sets the value of a 1fv uniform variable in the given WebGLProgram.
    * 
    * If the shader is not currently active, it is made active first.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param arr The new value to be used for the uniform variable.
    */
  def setFloat1v(program: WebGLProgram, name: String, arr: Float32Array): this.type = js.native
  
  /**
    * Sets the 2f uniform values on the given shader.
    * 
    * If the shader is not currently active, it is made active first.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param x The 2f x value to set on the named uniform.
    * @param y The 2f y value to set on the named uniform.
    */
  def setFloat2(program: WebGLProgram, name: String, x: Double, y: Double): this.type = js.native
  
  /**
    * Sets the value of a 2fv uniform variable in the given WebGLProgram.
    * 
    * If the shader is not currently active, it is made active first.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param arr The new value to be used for the uniform variable.
    */
  def setFloat2v(program: WebGLProgram, name: String, arr: Float32Array): this.type = js.native
  
  /**
    * Sets the 3f uniform values on the given shader.
    * 
    * If the shader is not currently active, it is made active first.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param x The 3f x value to set on the named uniform.
    * @param y The 3f y value to set on the named uniform.
    * @param z The 3f z value to set on the named uniform.
    */
  def setFloat3(program: WebGLProgram, name: String, x: Double, y: Double, z: Double): this.type = js.native
  
  /**
    * Sets the value of a 3fv uniform variable in the given WebGLProgram.
    * 
    * If the shader is not currently active, it is made active first.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param arr The new value to be used for the uniform variable.
    */
  def setFloat3v(program: WebGLProgram, name: String, arr: Float32Array): this.type = js.native
  
  /**
    * Sets the 4f uniform values on the given shader.
    * 
    * If the shader is not currently active, it is made active first.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param x The 4f x value to set on the named uniform.
    * @param y The 4f y value to set on the named uniform.
    * @param z The 4f z value to set on the named uniform.
    * @param w The 4f w value to set on the named uniform.
    */
  def setFloat4(program: WebGLProgram, name: String, x: Double, y: Double, z: Double, w: Double): this.type = js.native
  
  /**
    * Sets the value of a 4fv uniform variable in the given WebGLProgram.
    * 
    * If the shader is not currently active, it is made active first.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param arr The new value to be used for the uniform variable.
    */
  def setFloat4v(program: WebGLProgram, name: String, arr: Float32Array): this.type = js.native
  
  /**
    * Binds a framebuffer. If there was another framebuffer already bound it will force a pipeline flush.
    * @param framebuffer The framebuffer that needs to be bound.
    * @param updateScissor If a framebuffer is given, set the gl scissor to match the frame buffer size? Or, if `null` given, pop the scissor from the stack. Default false.
    */
  def setFramebuffer(framebuffer: WebGLFramebuffer): this.type = js.native
  def setFramebuffer(framebuffer: WebGLFramebuffer, updateScissor: Boolean): this.type = js.native
  
  /**
    * Bounds a index buffer. If there is a index buffer already bound it'll force a pipeline flush.
    * @param indexBuffer The buffer the needs to be bound.
    */
  def setIndexBuffer(indexBuffer: WebGLBuffer): this.type = js.native
  
  /**
    * Sets a 1i uniform value on the given shader.
    * 
    * If the shader is not currently active, it is made active first.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param x The 1i value to set on the named uniform.
    */
  def setInt1(program: WebGLProgram, name: String, x: integer): this.type = js.native
  
  /**
    * Sets the 2i uniform values on the given shader.
    * 
    * If the shader is not currently active, it is made active first.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param x The 2i x value to set on the named uniform.
    * @param y The 2i y value to set on the named uniform.
    */
  def setInt2(program: WebGLProgram, name: String, x: integer, y: integer): this.type = js.native
  
  /**
    * Sets the 3i uniform values on the given shader.
    * 
    * If the shader is not currently active, it is made active first.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param x The 3i x value to set on the named uniform.
    * @param y The 3i y value to set on the named uniform.
    * @param z The 3i z value to set on the named uniform.
    */
  def setInt3(program: WebGLProgram, name: String, x: integer, y: integer, z: integer): this.type = js.native
  
  /**
    * Sets the 4i uniform values on the given shader.
    * 
    * If the shader is not currently active, it is made active first.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param x The 4i x value to set on the named uniform.
    * @param y The 4i y value to set on the named uniform.
    * @param z The 4i z value to set on the named uniform.
    * @param w The 4i w value to set on the named uniform.
    */
  def setInt4(program: WebGLProgram, name: String, x: integer, y: integer, z: integer, w: integer): this.type = js.native
  
  /**
    * Sets the value of a matrix 2fv uniform variable in the given WebGLProgram.
    * 
    * If the shader is not currently active, it is made active first.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param transpose The value indicating whether to transpose the matrix. Must be false.
    * @param matrix A Float32Array or sequence of 4 float values.
    */
  def setMatrix2(program: WebGLProgram, name: String, transpose: Boolean, matrix: Float32Array): this.type = js.native
  
  /**
    * Sets the value of a matrix 3fv uniform variable in the given WebGLProgram.
    * 
    * If the shader is not currently active, it is made active first.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param transpose The value indicating whether to transpose the matrix. Must be false.
    * @param matrix A Float32Array or sequence of 9 float values.
    */
  def setMatrix3(program: WebGLProgram, name: String, transpose: Boolean, matrix: Float32Array): this.type = js.native
  
  /**
    * Sets the value of a matrix 4fv uniform variable in the given WebGLProgram.
    * 
    * If the shader is not currently active, it is made active first.
    * @param program The target WebGLProgram from which the uniform location will be looked-up.
    * @param name The name of the uniform to look-up and modify.
    * @param transpose The value indicating whether to transpose the matrix. Must be false.
    * @param matrix A Float32Array or sequence of 16 float values.
    */
  def setMatrix4(program: WebGLProgram, name: String, transpose: Boolean, matrix: Float32Array): this.type = js.native
  
  /**
    * Binds a WebGLPipeline and sets it as the current pipeline to be used.
    * @param pipelineInstance The pipeline instance to be activated.
    * @param gameObject The Game Object that invoked this pipeline, if any.
    */
  def setPipeline(pipelineInstance: WebGLPipeline): WebGLPipeline = js.native
  def setPipeline(pipelineInstance: WebGLPipeline, gameObject: GameObject): WebGLPipeline = js.native
  
  /**
    * Binds a program. If there was another program already bound it will force a pipeline flush.
    * @param program The program that needs to be bound.
    */
  def setProgram(program: WebGLProgram): this.type = js.native
  
  /**
    * Sets the current scissor state.
    * @param x The x position of the scissor.
    * @param y The y position of the scissor.
    * @param width The width of the scissor.
    * @param height The height of the scissor.
    * @param drawingBufferHeight Optional drawingBufferHeight override value.
    */
  def setScissor(x: integer, y: integer, width: integer, height: integer): Unit = js.native
  def setScissor(x: integer, y: integer, width: integer, height: integer, drawingBufferHeight: integer): Unit = js.native
  
  /**
    * Binds a texture at a texture unit. If a texture is already
    * bound to that unit it will force a flush on the current pipeline.
    * @param texture The WebGL texture that needs to be bound.
    * @param textureUnit The texture unit to which the texture will be bound.
    * @param flush Will the current pipeline be flushed if this is a new texture, or not? Default true.
    */
  def setTexture2D(texture: WebGLTexture, textureUnit: integer): this.type = js.native
  def setTexture2D(texture: WebGLTexture, textureUnit: integer, flush: Boolean): this.type = js.native
  
  /**
    * Sets the minification and magnification filter for a texture.
    * @param texture The texture to set the filter for.
    * @param filter The filter to set. 0 for linear filtering, 1 for nearest neighbor (blocky) filtering.
    */
  def setTextureFilter(texture: integer, filter: integer): this.type = js.native
  
  /**
    * Bounds a vertex buffer. If there is a vertex buffer already bound it'll force a pipeline flush.
    * @param vertexBuffer The buffer that needs to be bound.
    */
  def setVertexBuffer(vertexBuffer: WebGLBuffer): this.type = js.native
  
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
  def snapshot(callback: SnapshotCallback): this.type = js.native
  def snapshot(callback: SnapshotCallback, `type`: js.UndefOr[scala.Nothing], encoderOptions: Double): this.type = js.native
  def snapshot(callback: SnapshotCallback, `type`: String): this.type = js.native
  def snapshot(callback: SnapshotCallback, `type`: String, encoderOptions: Double): this.type = js.native
  
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
  def snapshotArea(x: integer, y: integer, width: integer, height: integer, callback: SnapshotCallback): this.type = js.native
  def snapshotArea(
    x: integer,
    y: integer,
    width: integer,
    height: integer,
    callback: SnapshotCallback,
    `type`: js.UndefOr[scala.Nothing],
    encoderOptions: Double
  ): this.type = js.native
  def snapshotArea(
    x: integer,
    y: integer,
    width: integer,
    height: integer,
    callback: SnapshotCallback,
    `type`: String
  ): this.type = js.native
  def snapshotArea(
    x: integer,
    y: integer,
    width: integer,
    height: integer,
    callback: SnapshotCallback,
    `type`: String,
    encoderOptions: Double
  ): this.type = js.native
  
  /**
    * Takes a snapshot of the given area of the given frame buffer.
    * 
    * Unlike the other snapshot methods, this one is processed immediately and doesn't wait for the next render.
    * 
    * Snapshots work by using the WebGL `readPixels` feature to grab every pixel from the frame buffer into an ArrayBufferView.
    * It then parses this, copying the contents to a temporary Canvas and finally creating an Image object from it,
    * which is the image returned to the callback provided. All in all, this is a computationally expensive and blocking process,
    * which gets more expensive the larger the canvas size gets, so please be careful how you employ this in your game.
    * @param framebuffer The framebuffer to grab from.
    * @param bufferWidth The width of the framebuffer.
    * @param bufferHeight The height of the framebuffer.
    * @param callback The Function to invoke after the snapshot image is created.
    * @param getPixel Grab a single pixel as a Color object, or an area as an Image object? Default false.
    * @param x The x coordinate to grab from. Default 0.
    * @param y The y coordinate to grab from. Default 0.
    * @param width The width of the area to grab. Default bufferWidth.
    * @param height The height of the area to grab. Default bufferHeight.
    * @param type The format of the image to create, usually `image/png` or `image/jpeg`. Default 'image/png'.
    * @param encoderOptions The image quality, between 0 and 1. Used for image formats with lossy compression, such as `image/jpeg`. Default 0.92.
    */
  def snapshotFramebuffer(
    framebuffer: WebGLFramebuffer,
    bufferWidth: integer,
    bufferHeight: integer,
    callback: SnapshotCallback,
    getPixel: js.UndefOr[Boolean],
    x: js.UndefOr[integer],
    y: js.UndefOr[integer],
    width: js.UndefOr[integer],
    height: js.UndefOr[integer],
    `type`: js.UndefOr[String],
    encoderOptions: js.UndefOr[Double]
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
  def snapshotPixel(x: integer, y: integer, callback: SnapshotCallback): this.type = js.native
  
  /**
    * Details about the currently scheduled snapshot.
    * 
    * If a non-null `callback` is set in this object, a snapshot of the canvas will be taken after the current frame is fully rendered.
    */
  var snapshotState: SnapshotState = js.native
  
  /**
    * Array of strings that indicate which WebGL extensions are supported by the browser
    */
  var supportedExtensions: js.Object = js.native
  
  /**
    * A constant which allows the renderer to be easily identified as a WebGL Renderer.
    */
  var `type`: integer = js.native
  
  /**
    * Updates the function bound to a given custom blend mode.
    * @param index The index of the custom blend mode.
    * @param func The function to use for the blend mode.
    * @param equation The equation to use for the blend mode.
    */
  def updateBlendMode(index: integer, func: js.Function, equation: js.Function): this.type = js.native
  
  /**
    * Updates a WebGL Texture based on the given Canvas Element.
    * @param srcCanvas The Canvas to update the WebGL Texture from.
    * @param dstTexture The destination WebGL Texture to update.
    * @param flipY Should the WebGL Texture set `UNPACK_MULTIPLY_FLIP_Y`? Default false.
    */
  def updateCanvasTexture(srcCanvas: HTMLCanvasElement, dstTexture: WebGLTexture): WebGLTexture = js.native
  def updateCanvasTexture(srcCanvas: HTMLCanvasElement, dstTexture: WebGLTexture, flipY: Boolean): WebGLTexture = js.native
  
  /**
    * Updates a WebGL Texture based on the given HTML Video Element.
    * @param srcVideo The Video to update the WebGL Texture with.
    * @param dstTexture The destination WebGL Texture to update.
    * @param flipY Should the WebGL Texture set `UNPACK_MULTIPLY_FLIP_Y`? Default false.
    */
  def updateVideoTexture(srcVideo: HTMLVideoElement, dstTexture: WebGLTexture): WebGLTexture = js.native
  def updateVideoTexture(srcVideo: HTMLVideoElement, dstTexture: WebGLTexture, flipY: Boolean): WebGLTexture = js.native
  
  /**
    * The width of the canvas being rendered to.
    * This is populated in the onResize event handler.
    */
  var width: integer = js.native
}
