package typings.pixiJs.PIXI

import org.scalablytyped.runtime.NumberDictionary
import typings.pixiJs.AnonAnisotropicFiltering
import typings.std.HTMLCanvasElement
import typings.std.WebGLContextEvent
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Systems are individual components to the Renderer pipeline.
  * @namespace PIXI.systems
  */
@JSGlobal("PIXI.systems")
@js.native
object systems extends js.Object {
  /**
    * System plugin to the renderer to manage masks of certain type
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @js.native
  class AbstractMaskSystem protected () extends System {
    def this(renderer: Renderer) = this()
    /**
      * The mask stack
      * @member {PIXI.MaskData[]} PIXI.systems.AbstractMaskSystem#maskStack
      */
    var maskStack: js.Array[MaskData] = js.native
    /**
      * gets count of masks of certain type
      * @returns {number}
      */
    def getStackLength(): Double = js.native
    /**
      * Changes the mask stack that is used by this System.
      *
      * @param {PIXI.MaskData[]} maskStack - The mask stack
      */
    def setMaskStack(maskStack: js.Array[MaskData]): Unit = js.native
  }
  
  /**
    * System plugin to the renderer to manage batching.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @js.native
  class BatchSystem protected () extends System {
    def this(renderer: Renderer) = this()
    /**
      * The currently active ObjectRenderer.
      *
      * @member {PIXI.ObjectRenderer} PIXI.systems.BatchSystem#currentRenderer
      */
    var currentRenderer: ObjectRenderer = js.native
    /**
      * An empty renderer.
      *
      * @member {PIXI.ObjectRenderer} PIXI.systems.BatchSystem#emptyRenderer
      */
    var emptyRenderer: ObjectRenderer = js.native
    /**
      * Assigns batch locations to textures in array based on boundTextures state.
      * All textures in texArray should have `_batchEnabled = _batchId`,
      * and their count should be less than `maxTextures`.
      *
      * @param {PIXI.BatchTextureArray} texArray textures to bound
      * @param {PIXI.BaseTexture[]} boundTextures current state of bound textures
      * @param {number} batchId marker for _batchEnabled param of textures in texArray
      * @param {number} maxTextures number of texture locations to manipulate
      */
    def boundArray(
      texArray: BatchTextureArray,
      boundTextures: js.Array[BaseTexture],
      batchId: Double,
      maxTextures: Double
    ): Unit = js.native
    /**
      * Handy function for batch renderers: copies bound textures in first maxTextures locations to array
      * sets actual _batchLocation for them
      *
      * @param arr
      * @param maxTextures
      */
    def copyBoundTextures(arr: js.Any, maxTextures: js.Any): Unit = js.native
    /**
      * This should be called if you wish to do some custom rendering
      * It will basically render anything that may be batched up such as sprites
      */
    def flush(): Unit = js.native
    /**
      * Reset the system to an empty renderer
      */
    def reset(): Unit = js.native
    /**
      * Changes the current renderer to the one given in parameter
      *
      * @param {PIXI.ObjectRenderer} objectRenderer - The object renderer to use.
      */
    def setObjectRenderer(objectRenderer: ObjectRenderer): Unit = js.native
  }
  
  /**
    * System plugin to the renderer to manage the context.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @js.native
  class ContextSystem protected () extends System {
    def this(renderer: Renderer) = this()
    /**
      * Extensions being used
      * @member {object} PIXI.systems.ContextSystem#extensions
      * @readonly
      * @property {WEBGL_draw_buffers} drawBuffers - WebGL v1 extension
      * @property {WEBGL_depth_texture} depthTexture - WebGL v1 extension
      * @property {OES_texture_float} floatTexture - WebGL v1 extension
      * @property {WEBGL_lose_context} loseContext - WebGL v1 extension
      * @property {OES_vertex_array_object} vertexArrayObject - WebGL v1 extension
      * @property {EXT_texture_filter_anisotropic} anisotropicFiltering - WebGL v1 and v2 extension
      */
    val extensions: AnonAnisotropicFiltering = js.native
    /**
      * `true` if the context is lost
      * @member {boolean}
      * @readonly
      */
    val isLost: Boolean = js.native
    /**
      * Either 1 or 2 to reflect the WebGL version being used
      * @member {number} PIXI.systems.ContextSystem#webGLVersion
      * @readonly
      */
    val webGLVersion: Double = js.native
    /**
      * Handle the context change event
      * @param {WebGLRenderingContext} gl new webgl context
      */
    def contextChange(gl: WebGLRenderingContext): Unit = js.native
    /**
      * Helper class to create a WebGL Context
      *
      * @param canvas {HTMLCanvasElement} the canvas element that we will get the context from
      * @param options {object} An options object that gets passed in to the canvas element containing the context attributes
      * @see https://developer.mozilla.org/en/docs/Web/API/HTMLCanvasElement/getContext
      * @return {WebGLRenderingContext} the WebGL context
      */
    def createContext(canvas: HTMLCanvasElement, options: js.Any): WebGLRenderingContext = js.native
    /**
      * Auto-populate the extensions
      *
      * @protected
      */
    /* protected */ def getExtensions(): Unit = js.native
    /**
      * Handles a lost webgl context
      *
      * @protected
      * @param {WebGLContextEvent} event - The context lost event.
      */
    /* protected */ def handleContextLost(event: WebGLContextEvent): Unit = js.native
    /**
      * Handles a restored webgl context
      *
      * @protected
      */
    /* protected */ def handleContextRestored(): Unit = js.native
    /**
      * Initialize the context
      *
      * @protected
      * @param {WebGLRenderingContext} gl - WebGL context
      */
    /* protected */ def initFromContext(gl: WebGLRenderingContext): Unit = js.native
    /**
      * Initialize from context options
      *
      * @protected
      * @see https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext
      * @param {object} options - context attributes
      */
    /* protected */ def initFromOptions(options: js.Any): Unit = js.native
    /**
      * Handle the post-render runner event
      *
      * @protected
      */
    /* protected */ def postrender(): Unit = js.native
    /**
      * Validate context
      *
      * @protected
      * @param {WebGLRenderingContext} gl - Render context
      */
    /* protected */ def validateContext(gl: WebGLRenderingContext): Unit = js.native
  }
  
  /**
    * System plugin to the renderer to manage the filters.
    *
    * @class
    * @memberof PIXI.systems
    * @extends PIXI.System
    */
  @js.native
  class FilterSystem protected () extends System {
    def this(renderer: Renderer) = this()
    /**
      * Active state
      * @member {object} PIXI.systems.FilterSystem#activeState
      */
    var activeState: js.Any = js.native
    /**
      * List of filters for the FilterSystem
      * @member {Object[]} PIXI.systems.FilterSystem#defaultFilterStack
      * @readonly
      */
    val defaultFilterStack: js.Array[_] = js.native
    /**
      * This uniform group is attached to filter uniforms when used
      * @member {PIXI.UniformGroup} PIXI.systems.FilterSystem#globalUniforms
      * @property {PIXI.Rectangle} outputFrame
      * @property {Float32Array} inputSize
      * @property {Float32Array} inputPixel
      * @property {Float32Array} inputClamp
      * @property {Number} resolution
      * @property {Float32Array} filterArea
      * @property {Fload32Array} filterClamp
      */
    var globalUniforms: UniformGroup = js.native
    /**
      * A very simple geometry used when drawing a filter effect to the screen
      * @member {PIXI.Quad} PIXI.systems.FilterSystem#quad
      */
    var quad: Quad = js.native
    /**
      * Quad UVs
      * @member {PIXI.QuadUv} PIXI.systems.FilterSystem#quadUv
      */
    var quadUv: QuadUv = js.native
    /**
      * a pool for storing filter states, save us creating new ones each tick
      * @member {Object[]} PIXI.systems.FilterSystem#statePool
      */
    var statePool: js.Array[_] = js.native
    /**
      * Temporary rect for maths
      * @type {PIXI.Rectangle}
      */
    var tempRect: Rectangle = js.native
    /**
      * stores a bunch of PO2 textures used for filtering
      * @member {Object} PIXI.systems.FilterSystem#texturePool
      */
    var texturePool: js.Any = js.native
    /**
      * Draws a filter.
      *
      * @param {PIXI.Filter} filter - The filter to draw.
      * @param {PIXI.RenderTexture} input - The input render target.
      * @param {PIXI.RenderTexture} output - The target to output to.
      * @param {boolean} clear - Should the output be cleared before rendering to it
      */
    def applyFilter(filter: Filter, input: RenderTexture, output: RenderTexture, clear: Boolean): Unit = js.native
    /**
      * Multiply _input normalized coordinates_ to this matrix to get _sprite texture normalized coordinates_.
      *
      * Use `outputMatrix * vTextureCoord` in the shader.
      *
      * @param {PIXI.Matrix} outputMatrix - The matrix to output to.
      * @param {PIXI.Sprite} sprite - The sprite to map to.
      * @return {PIXI.Matrix} The mapped matrix.
      */
    def calculateSpriteMatrix(outputMatrix: Matrix, sprite: Sprite): Matrix = js.native
    /**
      * Empties the texture pool.
      */
    def emptyPool(): Unit = js.native
    /**
      * Gets extra render texture to use inside current filter
      * To be compliant with older filters, you can use params in any order
      *
      * @param {PIXI.RenderTexture} [input] renderTexture from which size and resolution will be copied
      * @param {number} [resolution] override resolution of the renderTexture
      * @returns {PIXI.RenderTexture}
      */
    def getFilterTexture(): RenderTexture = js.native
    def getFilterTexture(input: RenderTexture): RenderTexture = js.native
    def getFilterTexture(input: RenderTexture, resolution: Double): RenderTexture = js.native
    /**
      * Gets a Power-of-Two render texture or fullScreen texture
      *
      * @protected
      * @param {number} minWidth - The minimum width of the render texture in real pixels.
      * @param {number} minHeight - The minimum height of the render texture in real pixels.
      * @param {number} [resolution=1] - The resolution of the render texture.
      * @return {PIXI.RenderTexture} The new render texture.
      */
    /* protected */ def getOptimalFilterTexture(minWidth: Double, minHeight: Double): RenderTexture = js.native
    /* protected */ def getOptimalFilterTexture(minWidth: Double, minHeight: Double, resolution: Double): RenderTexture = js.native
    /**
      * Pops off the filter and applies it.
      *
      */
    def pop(): Unit = js.native
    /**
      * Adds a new filter to the System.
      *
      * @param {PIXI.DisplayObject} target - The target of the filter to render.
      * @param {PIXI.Filter[]} filters - The filters to apply.
      */
    def push(target: DisplayObject, filters: js.Array[Filter]): Unit = js.native
    /**
      * calls `texturePool.resize()`, affects fullScreen renderTextures
      */
    def resize(): Unit = js.native
    /**
      * Frees a render texture back into the pool.
      *
      * @param {PIXI.RenderTexture} renderTexture - The renderTarget to free
      */
    def returnFilterTexture(renderTexture: RenderTexture): Unit = js.native
  }
  
  /**
    * System plugin to the renderer to manage framebuffers.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @js.native
  class FramebufferSystem protected () extends System {
    def this(renderer: Renderer) = this()
    /**
      * A list of managed framebuffers
      * @member {PIXI.Framebuffer[]} PIXI.systems.FramebufferSystem#managedFramebuffers
      * @readonly
      */
    val managedFramebuffers: js.Array[Framebuffer] = js.native
    /**
      * Get the size of the current width and height. Returns object with `width` and `height` values.
      *
      * @member {object}
      * @readonly
      */
    val size: js.Any = js.native
    /**
      * Framebuffer value that shows that we don't know what is bound
      * @member {Framebuffer} PIXI.systems.FramebufferSystem#unknownFramebuffer
      * @readonly
      */
    val unknownFramebuffer: Framebuffer = js.native
    /**
      * Bind a framebuffer
      *
      * @param {PIXI.Framebuffer} framebuffer
      * @param {PIXI.Rectangle} [frame] frame, default is framebuffer size
      */
    def bind(framebuffer: Framebuffer): Unit = js.native
    def bind(framebuffer: Framebuffer, frame: Rectangle): Unit = js.native
    /**
      * Clear the color of the context
      *
      * @param {Number} r - Red value from 0 to 1
      * @param {Number} g - Green value from 0 to 1
      * @param {Number} b - Blue value from 0 to 1
      * @param {Number} a - Alpha value from 0 to 1
      */
    def clear(r: Double, g: Double, b: Double, a: Double): Unit = js.native
    /**
      * Sets up the renderer context and necessary buffers.
      */
    def contextChange(): Unit = js.native
    /**
      * Disposes all framebuffers, but not textures bound to them
      * @param {boolean} [contextLost=false] If context was lost, we suppress all delete function calls
      */
    def disposeAll(): Unit = js.native
    def disposeAll(contextLost: Boolean): Unit = js.native
    /**
      * Disposes framebuffer
      * @param {PIXI.Framebuffer} framebuffer framebuffer that has to be disposed of
      * @param {boolean} [contextLost=false] If context was lost, we suppress all delete function calls
      */
    def disposeFramebuffer(framebuffer: Framebuffer): Unit = js.native
    def disposeFramebuffer(framebuffer: Framebuffer, contextLost: Boolean): Unit = js.native
    /**
      * Initialize framebuffer
      *
      * @protected
      * @param {PIXI.Framebuffer} framebuffer
      */
    /* protected */ def initFramebuffer(framebuffer: Framebuffer): Unit = js.native
    /**
      * resets framebuffer stored state, binds screen framebuffer
      *
      * should be called before renderTexture reset()
      */
    def reset(): Unit = js.native
    /**
      * Resize the framebuffer
      *
      * @protected
      * @param {PIXI.Framebuffer} framebuffer
      */
    /* protected */ def resizeFramebuffer(framebuffer: Framebuffer): Unit = js.native
    /**
      * Set the WebGLRenderingContext's viewport.
      *
      * @param {Number} x - X position of viewport
      * @param {Number} y - Y position of viewport
      * @param {Number} width - Width of viewport
      * @param {Number} height - Height of viewport
      */
    def setViewport(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    /**
      * Update the framebuffer
      *
      * @protected
      * @param {PIXI.Framebuffer} framebuffer
      */
    /* protected */ def updateFramebuffer(framebuffer: Framebuffer): Unit = js.native
  }
  
  /**
    * System plugin to the renderer to manage geometry.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @js.native
  class GeometrySystem protected () extends System {
    def this(renderer: Renderer) = this()
    /**
      * A cache of currently bound buffer,
      * contains only two members with keys ARRAY_BUFFER and ELEMENT_ARRAY_BUFFER
      * @member {Object.<number, PIXI.Buffer>} PIXI.systems.GeometrySystem#boundBuffers
      * @readonly
      */
    val boundBuffers: NumberDictionary[Buffer] = js.native
    /**
      * `true` if support `gl.UNSIGNED_INT` in `gl.drawElements` or `gl.drawElementsInstanced`
      * @member {boolean} PIXI.systems.GeometrySystem#canUseUInt32ElementIndex
      * @readonly
      */
    val canUseUInt32ElementIndex: Boolean = js.native
    /**
      * `true` if has `ANGLE_instanced_arrays` extension
      * @member {boolean} PIXI.systems.GeometrySystem#hasInstance
      * @readonly
      */
    val hasInstance: Boolean = js.native
    /**
      * `true` if we has `*_vertex_array_object` extension
      * @member {boolean} PIXI.systems.GeometrySystem#hasVao
      * @readonly
      */
    val hasVao: Boolean = js.native
    /**
      * Cache for all buffers by id, used in case renderer gets destroyed or for profiling
      * @member {object} PIXI.systems.GeometrySystem#managedBuffers
      * @readonly
      */
    val managedBuffers: js.Any = js.native
    /**
      * Cache for all geometries by id, used in case renderer gets destroyed or for profiling
      * @member {object} PIXI.systems.GeometrySystem#managedGeometries
      * @readonly
      */
    val managedGeometries: js.Any = js.native
    /**
      * Activate vertex array object
      *
      * @protected
      * @param {PIXI.Geometry} geometry - Geometry instance
      * @param {PIXI.Program} program - Shader program instance
      */
    /* protected */ def activateVao(geometry: Geometry, program: Program): Unit = js.native
    /**
      * Binds geometry so that is can be drawn. Creating a Vao if required
      *
      * @param {PIXI.Geometry} geometry instance of geometry to bind
      * @param {PIXI.Shader} [shader] instance of shader to use vao for
      */
    def bind(geometry: Geometry): Unit = js.native
    def bind(geometry: Geometry, shader: Shader): Unit = js.native
    /**
      * Check compability between a geometry and a program
      * @protected
      * @param {PIXI.Geometry} geometry - Geometry instance
      * @param {PIXI.Program} program - Program instance
      */
    /* protected */ def checkCompatibility(geometry: Geometry, program: Program): Unit = js.native
    /**
      * Sets up the renderer context and necessary buffers.
      */
    def contextChange(): Unit = js.native
    /**
      * dispose all WebGL resources of all managed geometries and buffers
      * @param {boolean} [contextLost=false] If context was lost, we suppress `gl.delete` calls
      */
    def disposeAll(): Unit = js.native
    def disposeAll(contextLost: Boolean): Unit = js.native
    /**
      * Disposes buffer
      * @param {PIXI.Buffer} buffer buffer with data
      * @param {boolean} [contextLost=false] If context was lost, we suppress deleteVertexArray
      */
    def disposeBuffer(buffer: Buffer): Unit = js.native
    def disposeBuffer(buffer: Buffer, contextLost: Boolean): Unit = js.native
    /**
      * Disposes geometry
      * @param {PIXI.Geometry} geometry Geometry with buffers. Only VAO will be disposed
      * @param {boolean} [contextLost=false] If context was lost, we suppress deleteVertexArray
      */
    def disposeGeometry(geometry: Geometry): Unit = js.native
    def disposeGeometry(geometry: Geometry, contextLost: Boolean): Unit = js.native
    /**
      * Draw the geometry
      *
      * @param {Number} type - the type primitive to render
      * @param {Number} [size] - the number of elements to be rendered
      * @param {Number} [start] - Starting index
      * @param {Number} [instanceCount] - the number of instances of the set of elements to execute
      */
    def draw(`type`: Double): Unit = js.native
    def draw(`type`: Double, size: Double): Unit = js.native
    def draw(`type`: Double, size: Double, start: Double): Unit = js.native
    def draw(`type`: Double, size: Double, start: Double, instanceCount: Double): Unit = js.native
    /**
      * Takes a geometry and program and generates a unique signature for them.
      *
      * @param {PIXI.Geometry} geometry to get signature from
      * @param {PIXI.Program} program to test geometry against
      * @returns {String} Unique signature of the geometry and program
      * @protected
      */
    /* protected */ def getSignature(geometry: Geometry, program: Program): String = js.native
    /**
      * Creates or gets Vao with the same structure as the geometry and stores it on the geometry.
      * If vao is created, it is bound automatically.
      *
      * @protected
      * @param {PIXI.Geometry} geometry - Instance of geometry to to generate Vao for
      * @param {PIXI.Program} program - Instance of program
      */
    /* protected */ def initGeometryVao(geometry: Geometry, program: Program): Unit = js.native
    /**
      * Reset and unbind any active VAO and geometry
      */
    def reset(): Unit = js.native
    /**
      * Unbind/reset everything
      * @protected
      */
    /* protected */ def unbind(): Unit = js.native
    /**
      * Update buffers
      * @protected
      */
    /* protected */ def updateBuffers(): Unit = js.native
  }
  
  /**
    * System plugin to the renderer to manage masks.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @js.native
  class MaskSystem protected () extends System {
    def this(renderer: Renderer) = this()
    /**
      * Current index of alpha mask pool
      * @member {number} PIXI.systems.MaskSystem#alphaMaskIndex
      * @default 0
      * @readonly
      */
    val alphaMaskIndex: Double = js.native
    /**
      * Pool of used sprite mask filters
      * @member {PIXI.SpriteMaskFilter[]} PIXI.systems.MaskSystem#alphaMaskPool
      * @readonly
      */
    val alphaMaskPool: js.Array[SpriteMaskFilter] = js.native
    /**
      * Enable scissor
      * @member {boolean} PIXI.systems.MaskSystem#enableScissor
      * @readonly
      */
    val enableScissor: Boolean = js.native
    /**
      * Pool of mask data
      * @member {PIXI.MaskData[]} PIXI.systems.MaskSystem#maskDataPool
      * @readonly
      */
    val maskDataPool: js.Array[MaskData] = js.native
    /**
      * Target to mask
      * @member {PIXI.DisplayObject} PIXI.systems.MaskSystem#scissorRenderTarget
      * @readonly
      */
    val scissorRenderTarget: DisplayObject = js.native
    /**
      * Sets type of MaskData based on its maskObject
      * @param {PIXI.MaskData} maskData
      */
    def detect(maskData: MaskData): Unit = js.native
    /**
      * Removes the last mask from the mask stack and doesn't return it.
      * Renderer batch must be flushed beforehand.
      *
      * @param {PIXI.DisplayObject} target - Display Object to pop the mask from
      */
    def pop(target: DisplayObject): Unit = js.native
    /**
      * Removes the last filter from the filter stack and doesn't return it.
      */
    def popSpriteMask(): Unit = js.native
    def push(target: DisplayObject, maskData: DisplayObject): Unit = js.native
    def push(target: DisplayObject, maskData: Graphics): Unit = js.native
    /**
      * Applies the Mask and adds it to the current filter stack.
      * Renderer batch must be flushed beforehand.
      *
      * @param {PIXI.DisplayObject} target - Display Object to push the mask to
      * @param {PIXI.MaskData|PIXI.Sprite|PIXI.Graphics|PIXI.DisplayObject} maskData - The masking data.
      */
    def push(target: DisplayObject, maskData: MaskData): Unit = js.native
    def push(target: DisplayObject, maskData: Sprite): Unit = js.native
    /**
      * Applies the Mask and adds it to the current filter stack.
      *
      * @param {PIXI.MaskData} maskData - Sprite to be used as the mask
      */
    def pushSpriteMask(maskData: MaskData): Unit = js.native
    /**
      * Changes the mask stack that is used by this System.
      *
      * @param {PIXI.MaskData[]} maskStack - The mask stack
      */
    def setMaskStack(maskStack: js.Array[MaskData]): Unit = js.native
  }
  
  /**
    * System plugin to the renderer to manage the projection matrix.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @js.native
  class ProjectionSystem protected () extends System {
    def this(renderer: Renderer) = this()
    /**
      * Default destination frame
      * @member {PIXI.Rectangle} PIXI.systems.ProjectionSystem#defaultFrame
      * @readonly
      */
    val defaultFrame: Rectangle = js.native
    /**
      * Destination frame
      * @member {PIXI.Rectangle} PIXI.systems.ProjectionSystem#destinationFrame
      * @readonly
      */
    val destinationFrame: Rectangle = js.native
    /**
      * Project matrix
      * @member {PIXI.Matrix} PIXI.systems.ProjectionSystem#projectionMatrix
      * @readonly
      */
    val projectionMatrix: Matrix = js.native
    /**
      * Source frame
      * @member {PIXI.Rectangle} PIXI.systems.ProjectionSystem#sourceFrame
      * @readonly
      */
    val sourceFrame: Rectangle = js.native
    /**
      * A transform that will be appended to the projection matrix
      * if null, nothing will be applied
      * @member {PIXI.Matrix} PIXI.systems.ProjectionSystem#transform
      */
    var transform: Matrix = js.native
    /**
      * Updates the projection matrix based on a projection frame (which is a rectangle)
      *
      * @param {PIXI.Rectangle} destinationFrame - The destination frame.
      * @param {PIXI.Rectangle} sourceFrame - The source frame.
      * @param {Number} resolution - Resolution
      * @param {boolean} root - If is root
      */
    def calculateProjection(destinationFrame: Rectangle, sourceFrame: Rectangle, resolution: Double, root: Boolean): Unit = js.native
    /**
      * Sets the transform of the active render target to the given matrix
      *
      * @param {PIXI.Matrix} matrix - The transformation matrix
      */
    def setTransform(matrix: Matrix): Unit = js.native
    /**
      * Updates the projection matrix based on a projection frame (which is a rectangle)
      *
      * @param {PIXI.Rectangle} destinationFrame - The destination frame.
      * @param {PIXI.Rectangle} sourceFrame - The source frame.
      * @param {Number} resolution - Resolution
      * @param {boolean} root - If is root
      */
    def update(destinationFrame: Rectangle, sourceFrame: Rectangle, resolution: Double, root: Boolean): Unit = js.native
  }
  
  /**
    * System plugin to the renderer to manage render textures.
    *
    * Should be added after FramebufferSystem
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @js.native
  class RenderTextureSystem protected () extends System {
    def this(renderer: Renderer) = this()
    /**
      * The clear background color as rgba
      * @member {number[]} PIXI.systems.RenderTextureSystem#clearColor
      */
    var clearColor: js.Array[Double] = js.native
    /**
      * Render texture
      * @member {PIXI.RenderTexture} PIXI.systems.RenderTextureSystem#current
      * @readonly
      */
    val current: RenderTexture = js.native
    /**
      * List of masks for the StencilSystem
      * @member {PIXI.Graphics[]} PIXI.systems.RenderTextureSystem#defaultMaskStack
      * @readonly
      */
    val defaultMaskStack: js.Array[Graphics] = js.native
    /**
      * Destination frame
      * @member {PIXI.Rectangle} PIXI.systems.RenderTextureSystem#destinationFrame
      * @readonly
      */
    val destinationFrame: Rectangle = js.native
    /**
      * Source frame
      * @member {PIXI.Rectangle} PIXI.systems.RenderTextureSystem#sourceFrame
      * @readonly
      */
    val sourceFrame: Rectangle = js.native
    /**
      * Bind the current render texture
      * @param {PIXI.RenderTexture} [renderTexture] - RenderTexture to bind, by default its `null`, the screen
      * @param {PIXI.Rectangle} [sourceFrame] - part of screen that is mapped to the renderTexture
      * @param {PIXI.Rectangle} [destinationFrame] - part of renderTexture, by default it has the same size as sourceFrame
      */
    def bind(): Unit = js.native
    def bind(renderTexture: RenderTexture): Unit = js.native
    def bind(renderTexture: RenderTexture, sourceFrame: Rectangle): Unit = js.native
    def bind(renderTexture: RenderTexture, sourceFrame: Rectangle, destinationFrame: Rectangle): Unit = js.native
    /**
      * Erases the render texture and fills the drawing area with a colour
      *
      * @param {number[]} [clearColor] - The color as rgba, default to use the renderer backgroundColor
      * @return {PIXI.Renderer} Returns itself.
      */
    def clear(): Renderer = js.native
    def clear(clearColor: js.Array[Double]): Renderer = js.native
    /**
      * Resets renderTexture state
      */
    def reset(): Unit = js.native
  }
  
  /**
    * System plugin to the renderer to manage scissor rects (used for masks).
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @js.native
  class ScissorSystem protected () extends System {
    def this(renderer: Renderer) = this()
    /**
      * Pops scissor mask. MaskData is already removed from stack
      */
    def pop(): Unit = js.native
    /**
      * Applies the Mask and adds it to the current stencil stack. @alvin
      *
      * @param {PIXI.MaskData} maskData - The mask data
      */
    def push(maskData: MaskData): Unit = js.native
  }
  
  /**
    * System plugin to the renderer to manage shaders.
    *
    * @class
    * @memberof PIXI.systems
    * @extends PIXI.System
    */
  @js.native
  class ShaderSystem protected () extends System {
    def this(renderer: Renderer) = this()
    /**
      * The current WebGL rendering context
      *
      * @member {WebGLRenderingContext} PIXI.systems.ShaderSystem#gl
      */
    var gl: WebGLRenderingContext = js.native
    /**
      * Changes the current shader to the one given in parameter
      *
      * @param {PIXI.Shader} shader - the new shader
      * @param {boolean} dontSync - false if the shader should automatically sync its uniforms.
      * @returns {PIXI.GLProgram} the glProgram that belongs to the shader.
      */
    def bind(shader: Shader, dontSync: Boolean): GLProgram = js.native
    /**
      * Returns the underlying GLShade rof the currently bound shader.
      * This can be handy for when you to have a little more control over the setting of your uniforms.
      *
      * @return {PIXI.GLProgram} the glProgram for the currently bound Shader for this context
      */
    def getglProgram(): GLProgram = js.native
    /**
      * Resets ShaderSystem state, does not affect WebGL state
      */
    def reset(): Unit = js.native
    /**
      * Uploads the uniforms values to the currently bound shader.
      *
      * @param {object} uniforms - the uniforms values that be applied to the current shader
      */
    def setUniforms(uniforms: js.Any): Unit = js.native
    /**
      *
      * syncs uniforms on the group
      * @param {*} group the uniform group to sync
      * @param {*} syncData this is data that is passed to the sync function and any nested sync functions
      */
    def syncUniformGroup(group: js.Any, syncData: js.Any): Unit = js.native
  }
  
  /**
    * System plugin to the renderer to manage WebGL state machines.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @js.native
  class StateSystem protected () extends System {
    def this(renderer: Renderer) = this()
    /**
      * Whether current blend equation is different
      * @member {boolean} PIXI.systems.StateSystem#_blendEq
      * @protected
      */
    var _blendEq: Boolean = js.native
    /**
      * Blend mode
      * @member {number} PIXI.systems.StateSystem#blendMode
      * @default PIXI.BLEND_MODES.NONE
      * @readonly
      */
    val blendMode: Double = js.native
    /**
      * Collection of check calls
      * @member {function[]} PIXI.systems.StateSystem#checks
      * @readonly
      */
    val checks: js.Array[js.Function1[/* repeated */ _, _]] = js.native
    /**
      * Default WebGL State
      * @member {PIXI.State} PIXI.systems.StateSystem#defaultState
      * @readonly
      */
    val defaultState: State = js.native
    /**
      * GL context
      * @member {WebGLRenderingContext} PIXI.systems.StateSystem#gl
      * @readonly
      */
    val gl: WebGLRenderingContext = js.native
    /**
      * Collection of calls
      * @member {function[]} PIXI.systems.StateSystem#map
      * @readonly
      */
    val map: js.Array[js.Function1[/* repeated */ _, _]] = js.native
    /**
      * Polygon offset
      * @member {number} PIXI.systems.StateSystem#polygonOffset
      * @readonly
      */
    val polygonOffset: Double = js.native
    /**
      * State ID
      * @member {number} PIXI.systems.StateSystem#stateId
      * @readonly
      */
    val stateId: Double = js.native
    /**
      * Sets the state, when previous state is unknown
      *
      * @param {*} state - The state to set
      */
    def forceState(state: js.Any): Unit = js.native
    /**
      * Resets all the logic and disables the vaos
      */
    def reset(): Unit = js.native
    /**
      * Sets the current state
      *
      * @param {*} state - The state to set.
      */
    def set(state: js.Any): Unit = js.native
    /**
      * Enables or disabled blending.
      *
      * @param {boolean} value - Turn on or off webgl blending.
      */
    def setBlend(value: Boolean): Unit = js.native
    /**
      * Sets the blend mode.
      *
      * @param {number} value - The blend mode to set to.
      */
    def setBlendMode(value: Double): Unit = js.native
    /**
      * Sets whether to enable or disable cull face.
      *
      * @param {boolean} value - Turn on or off webgl cull face.
      */
    def setCullFace(value: Boolean): Unit = js.native
    /**
      * Sets whether to enable or disable depth test.
      *
      * @param {boolean} value - Turn on or off webgl depth testing.
      */
    def setDepthTest(value: Boolean): Unit = js.native
    /**
      * Sets the gl front face.
      *
      * @param {boolean} value - true is clockwise and false is counter-clockwise
      */
    def setFrontFace(value: Boolean): Unit = js.native
    /**
      * Enables or disable polygon offset fill
      *
      * @param {boolean} value - Turn on or off webgl polygon offset testing.
      */
    def setOffset(value: Boolean): Unit = js.native
    /**
      * Sets the polygon offset.
      *
      * @param {number} value - the polygon offset
      * @param {number} scale - the polygon offset scale
      */
    def setPolygonOffset(value: Double, scale: Double): Unit = js.native
    /**
      * checks to see which updates should be checked based on which settings have been activated.
      * For example, if blend is enabled then we should check the blend modes each time the state is changed
      * or if polygon fill is activated then we need to check if the polygon offset changes.
      * The idea is that we only check what we have too.
      *
      * @param {Function} func  the checking function to add or remove
      * @param {boolean} value  should the check function be added or removed.
      */
    def updateCheck(func: js.Function1[/* repeated */ js.Any, _], value: Boolean): Unit = js.native
  }
  
  /**
    * System plugin to the renderer to manage stencils (used for masks).
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @js.native
  class StencilSystem protected () extends System {
    def this(renderer: Renderer) = this()
    /**
      * Pops stencil mask. MaskData is already removed from stack
      *
      * @param {PIXI.DisplayObject} maskObject - object of popped mask data
      */
    def pop(maskObject: DisplayObject): Unit = js.native
    /**
      * Applies the Mask and adds it to the current stencil stack.
      *
      * @param {PIXI.MaskData} maskData - The mask data
      */
    def push(maskData: MaskData): Unit = js.native
  }
  
  /**
    * System plugin to the renderer to manage texture garbage collection on the GPU,
    * ensuring that it does not get clogged up with textures that are no longer being used.
    *
    * @class
    * @memberof PIXI.systems
    * @extends PIXI.System
    */
  @js.native
  class TextureGCSystem protected () extends System {
    def this(renderer: Renderer) = this()
    /**
      * Check count
      * @member {number} PIXI.systems.TextureGCSystem#checkCount
      * @readonly
      */
    val checkCount: Double = js.native
    /**
      * Maximum number of item to check
      * @member {number} PIXI.systems.TextureGCSystem#checkCountMax
      * @see PIXI.settings.GC_MAX_CHECK_COUNT
      */
    var checkCountMax: Double = js.native
    /**
      * Count
      * @member {number} PIXI.systems.TextureGCSystem#count
      * @readonly
      */
    val count: Double = js.native
    /**
      * Maximum idle time, in seconds
      * @member {number} PIXI.systems.TextureGCSystem#maxIdle
      * @see PIXI.settings.GC_MAX_IDLE
      */
    var maxIdle: Double = js.native
    /**
      * Current garabage collection mode
      * @member {PIXI.GC_MODES} PIXI.systems.TextureGCSystem#mode
      * @see PIXI.settings.GC_MODE
      */
    var mode: GC_MODES = js.native
    /**
      * Checks to see when the last time a texture was used
      * if the texture has not been used for a specified amount of time it will be removed from the GPU
      */
    def postrender(): Unit = js.native
    /**
      * Checks to see when the last time a texture was used
      * if the texture has not been used for a specified amount of time it will be removed from the GPU
      */
    def run(): Unit = js.native
    /**
      * Removes all the textures within the specified displayObject and its children from the GPU
      *
      * @param {PIXI.DisplayObject} displayObject - the displayObject to remove the textures from.
      */
    def unload(displayObject: DisplayObject): Unit = js.native
  }
  
  /**
    * System plugin to the renderer to manage textures.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @js.native
  class TextureSystem protected () extends System {
    def this(renderer: Renderer) = this()
    /**
      * Bound textures
      * @member {PIXI.BaseTexture[]} PIXI.systems.TextureSystem#boundTextures
      * @readonly
      */
    val boundTextures: js.Array[BaseTexture] = js.native
    /**
      * Current location
      * @member {number} PIXI.systems.TextureSystem#currentLocation
      * @readonly
      */
    val currentLocation: Double = js.native
    /**
      * List of managed textures
      * @member {PIXI.BaseTexture[]} PIXI.systems.TextureSystem#managedTextures
      * @readonly
      */
    val managedTextures: js.Array[BaseTexture] = js.native
    /**
      * BaseTexture value that shows that we don't know what is bound
      * @member {PIXI.BaseTexture} PIXI.systems.TextureSystem#unknownTexture
      * @readonly
      */
    val unknownTexture: BaseTexture = js.native
    def bind(texture: BaseTexture): Unit = js.native
    def bind(texture: BaseTexture, location: Double): Unit = js.native
    /**
      * Bind a texture to a specific location
      *
      * If you want to unbind something, please use `unbind(texture)` instead of `bind(null, textureLocation)`
      *
      * @param {PIXI.Texture|PIXI.BaseTexture} texture - Texture to bind
      * @param {number} [location=0] - Location to bind at
      */
    def bind(texture: Texture): Unit = js.native
    def bind(texture: Texture, location: Double): Unit = js.native
    /**
      * Sets up the renderer context and necessary buffers.
      */
    def contextChange(): Unit = js.native
    /**
      * Resets texture location and bound textures
      *
      * Actual `bind(null, i)` calls will be performed at next `unbind()` call
      */
    def reset(): Unit = js.native
    def unbind(texture: BaseTexture): Unit = js.native
    /**
      * Unbind a texture
      * @param {PIXI.Texture|PIXI.BaseTexture} texture - Texture to bind
      */
    def unbind(texture: Texture): Unit = js.native
  }
  
}

