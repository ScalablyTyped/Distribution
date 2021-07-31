package typings.pixiJs.PIXI

import typings.pixiJs.anon.AnisotropicFiltering
import typings.std.HTMLCanvasElement
import typings.std.WebGLContextEvent
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Systems are individual components to the Renderer pipeline.
  * @namespace PIXI.systems
  */
object systems {
  
  /**
    * System plugin to the renderer to manage masks of certain type
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  trait AbstractMaskSystem
    extends StObject
       with System {
    
    /**
      * gets count of masks of certain type
      * @returns {number}
      */
    def getStackLength(): Double
    
    /**
      * The mask stack
      * @member {PIXI.MaskData[]} PIXI.systems.AbstractMaskSystem#maskStack
      */
    var maskStack: js.Array[MaskData]
    
    /**
      * Changes the mask stack that is used by this System.
      *
      * @param {PIXI.MaskData[]} maskStack - The mask stack
      */
    def setMaskStack(maskStack: js.Array[MaskData]): Unit
  }
  object AbstractMaskSystem {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      getStackLength: () => Double,
      maskStack: js.Array[MaskData],
      renderer: Renderer,
      setMaskStack: js.Array[MaskData] => Unit
    ): AbstractMaskSystem = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getStackLength = js.Any.fromFunction0(getStackLength), maskStack = maskStack.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], setMaskStack = js.Any.fromFunction1(setMaskStack))
      __obj.asInstanceOf[AbstractMaskSystem]
    }
    
    @scala.inline
    implicit class AbstractMaskSystemMutableBuilder[Self <: AbstractMaskSystem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetStackLength(value: () => Double): Self = StObject.set(x, "getStackLength", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMaskStack(value: js.Array[MaskData]): Self = StObject.set(x, "maskStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskStackVarargs(value: MaskData*): Self = StObject.set(x, "maskStack", js.Array(value :_*))
      
      @scala.inline
      def setSetMaskStack(value: js.Array[MaskData] => Unit): Self = StObject.set(x, "setMaskStack", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * System plugin to the renderer to manage batching.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  trait BatchSystem
    extends StObject
       with System {
    
    /**
      * Assigns batch locations to textures in array based on boundTextures state.
      * All textures in texArray should have `_batchEnabled = _batchId`,
      * and their count should be less than `maxTextures`.
      *
      * @param {PIXI.BatchTextureArray} texArray - textures to bound
      * @param {PIXI.BaseTexture[]} boundTextures - current state of bound textures
      * @param {number} batchId - marker for _batchEnabled param of textures in texArray
      * @param {number} maxTextures - number of texture locations to manipulate
      */
    def boundArray(
      texArray: BatchTextureArray,
      boundTextures: js.Array[BaseTexture],
      batchId: Double,
      maxTextures: Double
    ): Unit
    
    /**
      * Handy function for batch renderers: copies bound textures in first maxTextures locations to array
      * sets actual _batchLocation for them
      *
      * @param {PIXI.BaseTexture[]} - arr copy destination
      * @param {number} maxTextures - number of copied elements
      */
    def copyBoundTextures(arr: js.Array[BaseTexture], maxTextures: Double): Unit
    
    /**
      * The currently active ObjectRenderer.
      *
      * @member {PIXI.ObjectRenderer} PIXI.systems.BatchSystem#currentRenderer
      */
    var currentRenderer: ObjectRenderer
    
    /**
      * An empty renderer.
      *
      * @member {PIXI.ObjectRenderer} PIXI.systems.BatchSystem#emptyRenderer
      */
    var emptyRenderer: ObjectRenderer
    
    /**
      * This should be called if you wish to do some custom rendering
      * It will basically render anything that may be batched up such as sprites
      */
    def flush(): Unit
    
    /**
      * Reset the system to an empty renderer
      */
    def reset(): Unit
    
    /**
      * Changes the current renderer to the one given in parameter
      *
      * @param {PIXI.ObjectRenderer} objectRenderer - The object renderer to use.
      */
    def setObjectRenderer(objectRenderer: ObjectRenderer): Unit
  }
  object BatchSystem {
    
    @scala.inline
    def apply(
      boundArray: (BatchTextureArray, js.Array[BaseTexture], Double, Double) => Unit,
      copyBoundTextures: (js.Array[BaseTexture], Double) => Unit,
      currentRenderer: ObjectRenderer,
      destroy: () => Unit,
      emptyRenderer: ObjectRenderer,
      flush: () => Unit,
      renderer: Renderer,
      reset: () => Unit,
      setObjectRenderer: ObjectRenderer => Unit
    ): BatchSystem = {
      val __obj = js.Dynamic.literal(boundArray = js.Any.fromFunction4(boundArray), copyBoundTextures = js.Any.fromFunction2(copyBoundTextures), currentRenderer = currentRenderer.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), emptyRenderer = emptyRenderer.asInstanceOf[js.Any], flush = js.Any.fromFunction0(flush), renderer = renderer.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), setObjectRenderer = js.Any.fromFunction1(setObjectRenderer))
      __obj.asInstanceOf[BatchSystem]
    }
    
    @scala.inline
    implicit class BatchSystemMutableBuilder[Self <: BatchSystem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoundArray(value: (BatchTextureArray, js.Array[BaseTexture], Double, Double) => Unit): Self = StObject.set(x, "boundArray", js.Any.fromFunction4(value))
      
      @scala.inline
      def setCopyBoundTextures(value: (js.Array[BaseTexture], Double) => Unit): Self = StObject.set(x, "copyBoundTextures", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCurrentRenderer(value: ObjectRenderer): Self = StObject.set(x, "currentRenderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyRenderer(value: ObjectRenderer): Self = StObject.set(x, "emptyRenderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetObjectRenderer(value: ObjectRenderer => Unit): Self = StObject.set(x, "setObjectRenderer", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * System plugin to the renderer to manage the context.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  trait ContextSystem
    extends StObject
       with System {
    
    /**
      * Handle the context change event
      * @param {WebGLRenderingContext} gl - new webgl context
      */
    def contextChange(gl: WebGLRenderingContext): Unit
    
    /**
      * Helper class to create a WebGL Context
      *
      * @param canvas {HTMLCanvasElement} the canvas element that we will get the context from
      * @param options {object} An options object that gets passed in to the canvas element containing the context attributes
      * @see https://developer.mozilla.org/en/docs/Web/API/HTMLCanvasElement/getContext
      * @return {WebGLRenderingContext} the WebGL context
      */
    def createContext(canvas: HTMLCanvasElement, options: js.Any): WebGLRenderingContext
    
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
    val extensions: AnisotropicFiltering
    
    /**
      * Auto-populate the extensions
      *
      * @protected
      */
    /* protected */ def getExtensions(): Unit
    
    /**
      * Handles a lost webgl context
      *
      * @protected
      * @param {WebGLContextEvent} event - The context lost event.
      */
    /* protected */ def handleContextLost(event: WebGLContextEvent): Unit
    
    /**
      * Handles a restored webgl context
      *
      * @protected
      */
    /* protected */ def handleContextRestored(): Unit
    
    /**
      * Initialize the context
      *
      * @protected
      * @param {WebGLRenderingContext} gl - WebGL context
      */
    /* protected */ def initFromContext(gl: WebGLRenderingContext): Unit
    
    /**
      * Initialize from context options
      *
      * @protected
      * @see https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext
      * @param {object} options - context attributes
      */
    /* protected */ def initFromOptions(options: js.Any): Unit
    
    /**
      * `true` if the context is lost
      * @member {boolean}
      * @readonly
      */
    val isLost: Boolean
    
    /**
      * Handle the post-render runner event
      *
      * @protected
      */
    /* protected */ def postrender(): Unit
    
    /**
      * Validate context
      *
      * @protected
      * @param {WebGLRenderingContext} gl - Render context
      */
    /* protected */ def validateContext(gl: WebGLRenderingContext): Unit
    
    /**
      * Either 1 or 2 to reflect the WebGL version being used
      * @member {number} PIXI.systems.ContextSystem#webGLVersion
      * @readonly
      */
    val webGLVersion: Double
  }
  object ContextSystem {
    
    @scala.inline
    def apply(
      contextChange: WebGLRenderingContext => Unit,
      createContext: (HTMLCanvasElement, js.Any) => WebGLRenderingContext,
      destroy: () => Unit,
      extensions: AnisotropicFiltering,
      getExtensions: () => Unit,
      handleContextLost: WebGLContextEvent => Unit,
      handleContextRestored: () => Unit,
      initFromContext: WebGLRenderingContext => Unit,
      initFromOptions: js.Any => Unit,
      isLost: Boolean,
      postrender: () => Unit,
      renderer: Renderer,
      validateContext: WebGLRenderingContext => Unit,
      webGLVersion: Double
    ): ContextSystem = {
      val __obj = js.Dynamic.literal(contextChange = js.Any.fromFunction1(contextChange), createContext = js.Any.fromFunction2(createContext), destroy = js.Any.fromFunction0(destroy), extensions = extensions.asInstanceOf[js.Any], getExtensions = js.Any.fromFunction0(getExtensions), handleContextLost = js.Any.fromFunction1(handleContextLost), handleContextRestored = js.Any.fromFunction0(handleContextRestored), initFromContext = js.Any.fromFunction1(initFromContext), initFromOptions = js.Any.fromFunction1(initFromOptions), isLost = isLost.asInstanceOf[js.Any], postrender = js.Any.fromFunction0(postrender), renderer = renderer.asInstanceOf[js.Any], validateContext = js.Any.fromFunction1(validateContext), webGLVersion = webGLVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextSystem]
    }
    
    @scala.inline
    implicit class ContextSystemMutableBuilder[Self <: ContextSystem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContextChange(value: WebGLRenderingContext => Unit): Self = StObject.set(x, "contextChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateContext(value: (HTMLCanvasElement, js.Any) => WebGLRenderingContext): Self = StObject.set(x, "createContext", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExtensions(value: AnisotropicFiltering): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetExtensions(value: () => Unit): Self = StObject.set(x, "getExtensions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHandleContextLost(value: WebGLContextEvent => Unit): Self = StObject.set(x, "handleContextLost", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleContextRestored(value: () => Unit): Self = StObject.set(x, "handleContextRestored", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInitFromContext(value: WebGLRenderingContext => Unit): Self = StObject.set(x, "initFromContext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitFromOptions(value: js.Any => Unit): Self = StObject.set(x, "initFromOptions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsLost(value: Boolean): Self = StObject.set(x, "isLost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostrender(value: () => Unit): Self = StObject.set(x, "postrender", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValidateContext(value: WebGLRenderingContext => Unit): Self = StObject.set(x, "validateContext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWebGLVersion(value: Double): Self = StObject.set(x, "webGLVersion", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * System plugin to the renderer to manage the filters.
    *
    * @class
    * @memberof PIXI.systems
    * @extends PIXI.System
    */
  @js.native
  trait FilterSystem
    extends StObject
       with System {
    
    /**
      * Active state
      * @member {object} PIXI.systems.FilterSystem#activeState
      */
    var activeState: js.Any = js.native
    
    /**
      * Draws a filter.
      *
      * @param {PIXI.Filter} filter - The filter to draw.
      * @param {PIXI.RenderTexture} input - The input render target.
      * @param {PIXI.RenderTexture} output - The target to output to.
      * @param {PIXI.CLEAR_MODES} [clearMode] - Should the output be cleared before rendering to it
      */
    def applyFilter(filter: Filter, input: RenderTexture, output: RenderTexture): Unit = js.native
    def applyFilter(filter: Filter, input: RenderTexture, output: RenderTexture, clearMode: CLEAR_MODES): Unit = js.native
    
    /**
      * Binds a renderTexture with corresponding `filterFrame`, clears it if mode corresponds.
      * @param {PIXI.RenderTexture} filterTexture - renderTexture to bind, should belong to filter pool or filter stack
      * @param {PIXI.CLEAR_MODES} [clearMode] - clearMode, by default its CLEAR/YES. See {@link PIXI.CLEAR_MODES}
      */
    def bindAndClear(filterTexture: RenderTexture): Unit = js.native
    def bindAndClear(filterTexture: RenderTexture, clearMode: CLEAR_MODES): Unit = js.native
    
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
      * List of filters for the FilterSystem
      * @member {Object[]} PIXI.systems.FilterSystem#defaultFilterStack
      * @readonly
      */
    val defaultFilterStack: js.Array[js.Any] = js.native
    
    /**
      * Empties the texture pool.
      */
    def emptyPool(): Unit = js.native
    
    /**
      * Whether to clear output renderTexture in AUTO/BLIT mode. See {@link PIXI.CLEAR_MODES}
      * @member {boolean} PIXI.systems.FilterSystem#forceClear
      */
    var forceClear: Boolean = js.native
    
    /**
      * Gets extra render texture to use inside current filter
      * To be compliant with older filters, you can use params in any order
      *
      * @param {PIXI.RenderTexture} [input] - renderTexture from which size and resolution will be copied
      * @param {number} [resolution] - override resolution of the renderTexture
      * @returns {PIXI.RenderTexture}
      */
    def getFilterTexture(): RenderTexture = js.native
    def getFilterTexture(input: Unit, resolution: Double): RenderTexture = js.native
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
      * calls `texturePool.resize()`, affects fullScreen renderTextures
      */
    def resize(): Unit = js.native
    
    /**
      * Frees a render texture back into the pool.
      *
      * @param {PIXI.RenderTexture} renderTexture - The renderTarget to free
      */
    def returnFilterTexture(renderTexture: RenderTexture): Unit = js.native
    
    /**
      * a pool for storing filter states, save us creating new ones each tick
      * @member {Object[]} PIXI.systems.FilterSystem#statePool
      */
    var statePool: js.Array[js.Any] = js.native
    
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
      * Old padding behavior is to use the max amount instead of sum padding.
      * Use this flag if you need the old behavior.
      * @member {boolean} PIXI.systems.FilterSystem#useMaxPadding
      * @default false
      */
    var useMaxPadding: Boolean = js.native
  }
  
  /**
    * System plugin to the renderer to manage framebuffers.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @js.native
  trait FramebufferSystem
    extends StObject
       with System {
    
    /**
      * Bind a framebuffer
      *
      * @param {PIXI.Framebuffer} framebuffer
      * @param {PIXI.Rectangle} [frame] frame, default is framebuffer size
      */
    def bind(framebuffer: Framebuffer): Unit = js.native
    def bind(framebuffer: Framebuffer, frame: Rectangle): Unit = js.native
    
    /**
      * Only works with WebGL2
      *
      * blits framebuffer to another of the same or bigger size
      * after that target framebuffer is bound
      *
      * Fails with WebGL warning if blits multisample framebuffer to different size
      *
      * @param {PIXI.Framebuffer} [framebuffer] - by default it blits "into itself", from renderBuffer to texture.
      * @param {PIXI.Rectangle} [sourcePixels] - source rectangle in pixels
      * @param {PIXI.Rectangle} [destPixels] - dest rectangle in pixels, assumed to be the same as sourcePixels
      */
    def blit(): Unit = js.native
    def blit(framebuffer: Unit, sourcePixels: Unit, destPixels: Rectangle): Unit = js.native
    def blit(framebuffer: Unit, sourcePixels: Rectangle): Unit = js.native
    def blit(framebuffer: Unit, sourcePixels: Rectangle, destPixels: Rectangle): Unit = js.native
    def blit(framebuffer: Framebuffer): Unit = js.native
    def blit(framebuffer: Framebuffer, sourcePixels: Unit, destPixels: Rectangle): Unit = js.native
    def blit(framebuffer: Framebuffer, sourcePixels: Rectangle): Unit = js.native
    def blit(framebuffer: Framebuffer, sourcePixels: Rectangle, destPixels: Rectangle): Unit = js.native
    
    /**
      * Clear the color of the context
      *
      * @param {Number} r - Red value from 0 to 1
      * @param {Number} g - Green value from 0 to 1
      * @param {Number} b - Blue value from 0 to 1
      * @param {Number} a - Alpha value from 0 to 1
      * @param {PIXI.BUFFER_BITS} [mask=BUFFER_BITS.COLOR | BUFFER_BITS.DEPTH] - Bitwise OR of masks
      *  that indicate the buffers to be cleared, by default COLOR and DEPTH buffers.
      */
    def clear(r: Double, g: Double, b: Double, a: Double): Unit = js.native
    def clear(r: Double, g: Double, b: Double, a: Double, mask: BUFFER_BITS): Unit = js.native
    
    /**
      * Sets up the renderer context and necessary buffers.
      */
    def contextChange(): Unit = js.native
    
    /**
      * Detects number of samples that is not more than a param but as close to it as possible
      *
      * @param {PIXI.MSAA_QUALITY} samples - number of samples
      * @returns {PIXI.MSAA_QUALITY} - recommended number of samples
      */
    def detectSamples(samples: MSAA_QUALITY): MSAA_QUALITY = js.native
    
    /**
      * Disposes all framebuffers, but not textures bound to them
      * @param {boolean} [contextLost=false] - If context was lost, we suppress all delete function calls
      */
    def disposeAll(): Unit = js.native
    def disposeAll(contextLost: Boolean): Unit = js.native
    
    /**
      * Disposes framebuffer
      * @param {PIXI.Framebuffer} framebuffer - framebuffer that has to be disposed of
      * @param {boolean} [contextLost=false] - If context was lost, we suppress all delete function calls
      */
    def disposeFramebuffer(framebuffer: Framebuffer): Unit = js.native
    def disposeFramebuffer(framebuffer: Framebuffer, contextLost: Boolean): Unit = js.native
    
    /**
      * Initialize framebuffer for this context
      *
      * @protected
      * @param {PIXI.Framebuffer} framebuffer
      * @returns {PIXI.GLFramebuffer} created GLFramebuffer
      */
    /* protected */ def initFramebuffer(framebuffer: Framebuffer): GLFramebuffer = js.native
    
    /**
      * A list of managed framebuffers
      * @member {PIXI.Framebuffer[]} PIXI.systems.FramebufferSystem#managedFramebuffers
      * @readonly
      */
    val managedFramebuffers: js.Array[Framebuffer] = js.native
    
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
  trait GeometrySystem
    extends StObject
       with System {
    
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
      * @param {PIXI.Geometry} geometry - instance of geometry to bind
      * @param {PIXI.Shader} [shader] - instance of shader to use vao for
      */
    def bind(geometry: Geometry): Unit = js.native
    def bind(geometry: Geometry, shader: Shader): Unit = js.native
    
    /**
      * `true` if support `gl.UNSIGNED_INT` in `gl.drawElements` or `gl.drawElementsInstanced`
      * @member {boolean} PIXI.systems.GeometrySystem#canUseUInt32ElementIndex
      * @readonly
      */
    val canUseUInt32ElementIndex: Boolean = js.native
    
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
      * @param {boolean} [contextLost=false] - If context was lost, we suppress `gl.delete` calls
      */
    def disposeAll(): Unit = js.native
    def disposeAll(contextLost: Boolean): Unit = js.native
    
    /**
      * Disposes buffer
      * @param {PIXI.Buffer} buffer - buffer with data
      * @param {boolean} [contextLost=false] - If context was lost, we suppress deleteVertexArray
      */
    def disposeBuffer(buffer: Buffer): Unit = js.native
    def disposeBuffer(buffer: Buffer, contextLost: Boolean): Unit = js.native
    
    /**
      * Disposes geometry
      * @param {PIXI.Geometry} geometry - Geometry with buffers. Only VAO will be disposed
      * @param {boolean} [contextLost=false] - If context was lost, we suppress deleteVertexArray
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
    def draw(`type`: Double, size: Double, start: Unit, instanceCount: Double): Unit = js.native
    def draw(`type`: Double, size: Unit, start: Double): Unit = js.native
    def draw(`type`: Double, size: Unit, start: Double, instanceCount: Double): Unit = js.native
    def draw(`type`: Double, size: Unit, start: Unit, instanceCount: Double): Unit = js.native
    
    /**
      * Takes a geometry and program and generates a unique signature for them.
      *
      * @param {PIXI.Geometry} geometry - to get signature from
      * @param {PIXI.Program} program - to test geometry against
      * @returns {String} Unique signature of the geometry and program
      * @protected
      */
    /* protected */ def getSignature(geometry: Geometry, program: Program): String = js.native
    
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
      * Creates or gets Vao with the same structure as the geometry and stores it on the geometry.
      * If vao is created, it is bound automatically.
      *
      * @protected
      * @param {PIXI.Geometry} geometry - Instance of geometry to to generate Vao for
      * @param {PIXI.Program} program - Instance of program
      */
    /* protected */ def initGeometryVao(geometry: Geometry, program: Program): Unit = js.native
    
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
  trait MaskSystem
    extends StObject
       with System {
    
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
      * Sets type of MaskData based on its maskObject
      * @param {PIXI.MaskData} maskData
      */
    def detect(maskData: MaskData): Unit = js.native
    
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
  trait ProjectionSystem
    extends StObject
       with System {
    
    /**
      * Updates the projection matrix based on a projection frame (which is a rectangle)
      *
      * @param {PIXI.Rectangle} destinationFrame - The destination frame.
      * @param {PIXI.Rectangle} sourceFrame - The source frame.
      * @param {Number} resolution - Resolution
      * @param {boolean} root - If is root
      */
    def calculateProjection(destinationFrame: Rectangle, sourceFrame: Rectangle, resolution: Double, root: Boolean): Unit
    
    /**
      * Default destination frame
      * @member {PIXI.Rectangle} PIXI.systems.ProjectionSystem#defaultFrame
      * @readonly
      */
    val defaultFrame: Rectangle
    
    /**
      * Destination frame
      * @member {PIXI.Rectangle} PIXI.systems.ProjectionSystem#destinationFrame
      * @readonly
      */
    val destinationFrame: Rectangle
    
    /**
      * Project matrix
      * @member {PIXI.Matrix} PIXI.systems.ProjectionSystem#projectionMatrix
      * @readonly
      */
    val projectionMatrix: Matrix
    
    /**
      * Sets the transform of the active render target to the given matrix
      *
      * @param {PIXI.Matrix} matrix - The transformation matrix
      */
    def setTransform(matrix: Matrix): Unit
    
    /**
      * Source frame
      * @member {PIXI.Rectangle} PIXI.systems.ProjectionSystem#sourceFrame
      * @readonly
      */
    val sourceFrame: Rectangle
    
    /**
      * A transform that will be appended to the projection matrix
      * if null, nothing will be applied
      * @member {PIXI.Matrix} PIXI.systems.ProjectionSystem#transform
      */
    var transform: Matrix
    
    /**
      * Updates the projection matrix based on a projection frame (which is a rectangle).
      *
      * Make sure to run `renderer.framebuffer.setViewport(destinationFrame)` after calling this.
      *
      * @param {PIXI.Rectangle} destinationFrame - The destination frame.
      * @param {PIXI.Rectangle} sourceFrame - The source frame.
      * @param {Number} resolution - Resolution
      * @param {boolean} root - If is root
      */
    def update(destinationFrame: Rectangle, sourceFrame: Rectangle, resolution: Double, root: Boolean): Unit
  }
  object ProjectionSystem {
    
    @scala.inline
    def apply(
      calculateProjection: (Rectangle, Rectangle, Double, Boolean) => Unit,
      defaultFrame: Rectangle,
      destinationFrame: Rectangle,
      destroy: () => Unit,
      projectionMatrix: Matrix,
      renderer: Renderer,
      setTransform: Matrix => Unit,
      sourceFrame: Rectangle,
      transform: Matrix,
      update: (Rectangle, Rectangle, Double, Boolean) => Unit
    ): ProjectionSystem = {
      val __obj = js.Dynamic.literal(calculateProjection = js.Any.fromFunction4(calculateProjection), defaultFrame = defaultFrame.asInstanceOf[js.Any], destinationFrame = destinationFrame.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), projectionMatrix = projectionMatrix.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], setTransform = js.Any.fromFunction1(setTransform), sourceFrame = sourceFrame.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], update = js.Any.fromFunction4(update))
      __obj.asInstanceOf[ProjectionSystem]
    }
    
    @scala.inline
    implicit class ProjectionSystemMutableBuilder[Self <: ProjectionSystem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalculateProjection(value: (Rectangle, Rectangle, Double, Boolean) => Unit): Self = StObject.set(x, "calculateProjection", js.Any.fromFunction4(value))
      
      @scala.inline
      def setDefaultFrame(value: Rectangle): Self = StObject.set(x, "defaultFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationFrame(value: Rectangle): Self = StObject.set(x, "destinationFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionMatrix(value: Matrix): Self = StObject.set(x, "projectionMatrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetTransform(value: Matrix => Unit): Self = StObject.set(x, "setTransform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSourceFrame(value: Rectangle): Self = StObject.set(x, "sourceFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: Matrix): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: (Rectangle, Rectangle, Double, Boolean) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
    }
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
  trait RenderTextureSystem
    extends StObject
       with System {
    
    /**
      * Bind the current render texture
      *
      * @param {PIXI.RenderTexture} [renderTexture] - RenderTexture to bind, by default its `null`, the screen
      * @param {PIXI.Rectangle} [sourceFrame] - part of screen that is mapped to the renderTexture
      * @param {PIXI.Rectangle} [destinationFrame] - part of renderTexture, by default it has the same size as sourceFrame
      */
    def bind(): Unit = js.native
    def bind(renderTexture: Unit, sourceFrame: Unit, destinationFrame: Rectangle): Unit = js.native
    def bind(renderTexture: Unit, sourceFrame: Rectangle): Unit = js.native
    def bind(renderTexture: Unit, sourceFrame: Rectangle, destinationFrame: Rectangle): Unit = js.native
    def bind(renderTexture: RenderTexture): Unit = js.native
    def bind(renderTexture: RenderTexture, sourceFrame: Unit, destinationFrame: Rectangle): Unit = js.native
    def bind(renderTexture: RenderTexture, sourceFrame: Rectangle): Unit = js.native
    def bind(renderTexture: RenderTexture, sourceFrame: Rectangle, destinationFrame: Rectangle): Unit = js.native
    
    /**
      * Erases the render texture and fills the drawing area with a colour
      *
      * @param {number[]} [clearColor] - The color as rgba, default to use the renderer backgroundColor
      * @param {PIXI.BUFFER_BITS} [mask=BUFFER_BITS.COLOR | BUFFER_BITS.DEPTH] - Bitwise OR of masks
      *  that indicate the buffers to be cleared, by default COLOR and DEPTH buffers.
      * @return {PIXI.Renderer} Returns itself.
      */
    def clear(): Renderer = js.native
    def clear(clearColor: js.Array[Double]): Renderer = js.native
    def clear(clearColor: js.Array[Double], mask: BUFFER_BITS): Renderer = js.native
    def clear(clearColor: Unit, mask: BUFFER_BITS): Renderer = js.native
    
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
      * Resets renderTexture state
      */
    def reset(): Unit = js.native
    
    /**
      * Source frame
      * @member {PIXI.Rectangle} PIXI.systems.RenderTextureSystem#sourceFrame
      * @readonly
      */
    val sourceFrame: Rectangle = js.native
  }
  
  /**
    * System plugin to the renderer to manage scissor rects (used for masks).
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  trait ScissorSystem
    extends StObject
       with System {
    
    /**
      * Pops scissor mask. MaskData is already removed from stack
      */
    def pop(): Unit
    
    /**
      * Applies the Mask and adds it to the current stencil stack. @alvin
      *
      * @param {PIXI.MaskData} maskData - The mask data
      */
    def push(maskData: MaskData): Unit
  }
  object ScissorSystem {
    
    @scala.inline
    def apply(destroy: () => Unit, pop: () => Unit, push: MaskData => Unit, renderer: Renderer): ScissorSystem = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), renderer = renderer.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScissorSystem]
    }
    
    @scala.inline
    implicit class ScissorSystemMutableBuilder[Self <: ScissorSystem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPop(value: () => Unit): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPush(value: MaskData => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * System plugin to the renderer to manage shaders.
    *
    * @class
    * @memberof PIXI.systems
    * @extends PIXI.System
    */
  @js.native
  trait ShaderSystem
    extends StObject
       with System {
    
    /**
      * Changes the current shader to the one given in parameter
      *
      * @param {PIXI.Shader} shader - the new shader
      * @param {boolean} [dontSync] - false if the shader should automatically sync its uniforms.
      * @returns {PIXI.GLProgram} the glProgram that belongs to the shader.
      */
    def bind(shader: Shader): GLProgram = js.native
    def bind(shader: Shader, dontSync: Boolean): GLProgram = js.native
    
    /**
      * Returns the underlying GLShade rof the currently bound shader.
      * This can be handy for when you to have a little more control over the setting of your uniforms.
      *
      * @return {PIXI.GLProgram} the glProgram for the currently bound Shader for this context
      */
    def getglProgram(): GLProgram = js.native
    
    /**
      * The current WebGL rendering context
      *
      * @member {WebGLRenderingContext} PIXI.systems.ShaderSystem#gl
      */
    var gl: WebGLRenderingContext = js.native
    
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
      * @param {*} group - the uniform group to sync
      * @param {*} [syncData] - this is data that is passed to the sync function and any nested sync functions
      */
    def syncUniformGroup(group: js.Any): Unit = js.native
    def syncUniformGroup(group: js.Any, syncData: js.Any): Unit = js.native
  }
  
  /**
    * System plugin to the renderer to manage WebGL state machines.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  trait StateSystem
    extends StObject
       with System {
    
    /**
      * Whether current blend equation is different
      * @member {boolean} PIXI.systems.StateSystem#_blendEq
      * @protected
      */
    var _blendEq: Boolean
    
    /**
      * Blend mode
      * @member {number} PIXI.systems.StateSystem#blendMode
      * @default PIXI.BLEND_MODES.NONE
      * @readonly
      */
    val blendMode: Double
    
    /**
      * Collection of check calls
      * @member {function[]} PIXI.systems.StateSystem#checks
      * @readonly
      */
    val checks: js.Array[js.Function1[/* repeated */ js.Any, js.Any]]
    
    /**
      * Default WebGL State
      * @member {PIXI.State} PIXI.systems.StateSystem#defaultState
      * @readonly
      */
    val defaultState: State
    
    /**
      * Sets the state, when previous state is unknown
      *
      * @param {*} state - The state to set
      */
    def forceState(state: js.Any): Unit
    
    /**
      * GL context
      * @member {WebGLRenderingContext} PIXI.systems.StateSystem#gl
      * @readonly
      */
    val gl: WebGLRenderingContext
    
    /**
      * Collection of calls
      * @member {function[]} PIXI.systems.StateSystem#map
      * @readonly
      */
    val map: js.Array[js.Function1[/* repeated */ js.Any, js.Any]]
    
    /**
      * Polygon offset
      * @member {number} PIXI.systems.StateSystem#polygonOffset
      * @readonly
      */
    val polygonOffset: Double
    
    /**
      * Resets all the logic and disables the vaos
      */
    def reset(): Unit
    
    /**
      * Sets the current state
      *
      * @param {*} state - The state to set.
      */
    def set(state: js.Any): Unit
    
    /**
      * Enables or disabled blending.
      *
      * @param {boolean} value - Turn on or off webgl blending.
      */
    def setBlend(value: Boolean): Unit
    
    /**
      * Sets the blend mode.
      *
      * @param {number} value - The blend mode to set to.
      */
    def setBlendMode(value: Double): Unit
    
    /**
      * Sets whether to enable or disable cull face.
      *
      * @param {boolean} value - Turn on or off webgl cull face.
      */
    def setCullFace(value: Boolean): Unit
    
    /**
      * Sets whether to enable or disable depth test.
      *
      * @param {boolean} value - Turn on or off webgl depth testing.
      */
    def setDepthTest(value: Boolean): Unit
    
    /**
      * Sets the gl front face.
      *
      * @param {boolean} value - true is clockwise and false is counter-clockwise
      */
    def setFrontFace(value: Boolean): Unit
    
    /**
      * Enables or disable polygon offset fill
      *
      * @param {boolean} value - Turn on or off webgl polygon offset testing.
      */
    def setOffset(value: Boolean): Unit
    
    /**
      * Sets the polygon offset.
      *
      * @param {number} value - the polygon offset
      * @param {number} scale - the polygon offset scale
      */
    def setPolygonOffset(value: Double, scale: Double): Unit
    
    /**
      * State ID
      * @member {number} PIXI.systems.StateSystem#stateId
      * @readonly
      */
    val stateId: Double
    
    /**
      * checks to see which updates should be checked based on which settings have been activated.
      * For example, if blend is enabled then we should check the blend modes each time the state is changed
      * or if polygon fill is activated then we need to check if the polygon offset changes.
      * The idea is that we only check what we have too.
      *
      * @param {Function} func - the checking function to add or remove
      * @param {boolean} value - should the check function be added or removed.
      */
    def updateCheck(func: js.Function1[/* repeated */ js.Any, js.Any], value: Boolean): Unit
  }
  object StateSystem {
    
    @scala.inline
    def apply(
      _blendEq: Boolean,
      blendMode: Double,
      checks: js.Array[js.Function1[/* repeated */ js.Any, js.Any]],
      defaultState: State,
      destroy: () => Unit,
      forceState: js.Any => Unit,
      gl: WebGLRenderingContext,
      map: js.Array[js.Function1[/* repeated */ js.Any, js.Any]],
      polygonOffset: Double,
      renderer: Renderer,
      reset: () => Unit,
      set: js.Any => Unit,
      setBlend: Boolean => Unit,
      setBlendMode: Double => Unit,
      setCullFace: Boolean => Unit,
      setDepthTest: Boolean => Unit,
      setFrontFace: Boolean => Unit,
      setOffset: Boolean => Unit,
      setPolygonOffset: (Double, Double) => Unit,
      stateId: Double,
      updateCheck: (js.Function1[/* repeated */ js.Any, js.Any], Boolean) => Unit
    ): StateSystem = {
      val __obj = js.Dynamic.literal(_blendEq = _blendEq.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], defaultState = defaultState.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), forceState = js.Any.fromFunction1(forceState), gl = gl.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], polygonOffset = polygonOffset.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction1(set), setBlend = js.Any.fromFunction1(setBlend), setBlendMode = js.Any.fromFunction1(setBlendMode), setCullFace = js.Any.fromFunction1(setCullFace), setDepthTest = js.Any.fromFunction1(setDepthTest), setFrontFace = js.Any.fromFunction1(setFrontFace), setOffset = js.Any.fromFunction1(setOffset), setPolygonOffset = js.Any.fromFunction2(setPolygonOffset), stateId = stateId.asInstanceOf[js.Any], updateCheck = js.Any.fromFunction2(updateCheck))
      __obj.asInstanceOf[StateSystem]
    }
    
    @scala.inline
    implicit class StateSystemMutableBuilder[Self <: StateSystem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlendMode(value: Double): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChecks(value: js.Array[js.Function1[/* repeated */ js.Any, js.Any]]): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChecksVarargs(value: (js.Function1[/* repeated */ js.Any, js.Any])*): Self = StObject.set(x, "checks", js.Array(value :_*))
      
      @scala.inline
      def setDefaultState(value: State): Self = StObject.set(x, "defaultState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceState(value: js.Any => Unit): Self = StObject.set(x, "forceState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGl(value: WebGLRenderingContext): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: js.Array[js.Function1[/* repeated */ js.Any, js.Any]]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapVarargs(value: (js.Function1[/* repeated */ js.Any, js.Any])*): Self = StObject.set(x, "map", js.Array(value :_*))
      
      @scala.inline
      def setPolygonOffset(value: Double): Self = StObject.set(x, "polygonOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet(value: js.Any => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetBlend(value: Boolean => Unit): Self = StObject.set(x, "setBlend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetBlendMode(value: Double => Unit): Self = StObject.set(x, "setBlendMode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetCullFace(value: Boolean => Unit): Self = StObject.set(x, "setCullFace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDepthTest(value: Boolean => Unit): Self = StObject.set(x, "setDepthTest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFrontFace(value: Boolean => Unit): Self = StObject.set(x, "setFrontFace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetOffset(value: Boolean => Unit): Self = StObject.set(x, "setOffset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPolygonOffset(value: (Double, Double) => Unit): Self = StObject.set(x, "setPolygonOffset", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStateId(value: Double): Self = StObject.set(x, "stateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateCheck(value: (js.Function1[/* repeated */ js.Any, js.Any], Boolean) => Unit): Self = StObject.set(x, "updateCheck", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_blendEq(value: Boolean): Self = StObject.set(x, "_blendEq", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * System plugin to the renderer to manage stencils (used for masks).
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  trait StencilSystem
    extends StObject
       with System {
    
    /**
      * Pops stencil mask. MaskData is already removed from stack
      *
      * @param {PIXI.DisplayObject} maskObject - object of popped mask data
      */
    def pop(maskObject: DisplayObject): Unit
    
    /**
      * Applies the Mask and adds it to the current stencil stack.
      *
      * @param {PIXI.MaskData} maskData - The mask data
      */
    def push(maskData: MaskData): Unit
  }
  object StencilSystem {
    
    @scala.inline
    def apply(destroy: () => Unit, pop: DisplayObject => Unit, push: MaskData => Unit, renderer: Renderer): StencilSystem = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), pop = js.Any.fromFunction1(pop), push = js.Any.fromFunction1(push), renderer = renderer.asInstanceOf[js.Any])
      __obj.asInstanceOf[StencilSystem]
    }
    
    @scala.inline
    implicit class StencilSystemMutableBuilder[Self <: StencilSystem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPop(value: DisplayObject => Unit): Self = StObject.set(x, "pop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPush(value: MaskData => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * System plugin to the renderer to manage texture garbage collection on the GPU,
    * ensuring that it does not get clogged up with textures that are no longer being used.
    *
    * @class
    * @memberof PIXI.systems
    * @extends PIXI.System
    */
  trait TextureGCSystem
    extends StObject
       with System {
    
    /**
      * Check count
      * @member {number} PIXI.systems.TextureGCSystem#checkCount
      * @readonly
      */
    val checkCount: Double
    
    /**
      * Maximum number of item to check
      * @member {number} PIXI.systems.TextureGCSystem#checkCountMax
      * @see PIXI.settings.GC_MAX_CHECK_COUNT
      */
    var checkCountMax: Double
    
    /**
      * Count
      * @member {number} PIXI.systems.TextureGCSystem#count
      * @readonly
      */
    val count: Double
    
    /**
      * Maximum idle time, in seconds
      * @member {number} PIXI.systems.TextureGCSystem#maxIdle
      * @see PIXI.settings.GC_MAX_IDLE
      */
    var maxIdle: Double
    
    /**
      * Current garabage collection mode
      * @member {PIXI.GC_MODES} PIXI.systems.TextureGCSystem#mode
      * @see PIXI.settings.GC_MODE
      */
    var mode: GC_MODES
    
    /**
      * Checks to see when the last time a texture was used
      * if the texture has not been used for a specified amount of time it will be removed from the GPU
      */
    def postrender(): Unit
    
    /**
      * Checks to see when the last time a texture was used
      * if the texture has not been used for a specified amount of time it will be removed from the GPU
      */
    def run(): Unit
    
    /**
      * Removes all the textures within the specified displayObject and its children from the GPU
      *
      * @param {PIXI.DisplayObject} displayObject - the displayObject to remove the textures from.
      */
    def unload(displayObject: DisplayObject): Unit
  }
  object TextureGCSystem {
    
    @scala.inline
    def apply(
      checkCount: Double,
      checkCountMax: Double,
      count: Double,
      destroy: () => Unit,
      maxIdle: Double,
      mode: GC_MODES,
      postrender: () => Unit,
      renderer: Renderer,
      run: () => Unit,
      unload: DisplayObject => Unit
    ): TextureGCSystem = {
      val __obj = js.Dynamic.literal(checkCount = checkCount.asInstanceOf[js.Any], checkCountMax = checkCountMax.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), maxIdle = maxIdle.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], postrender = js.Any.fromFunction0(postrender), renderer = renderer.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), unload = js.Any.fromFunction1(unload))
      __obj.asInstanceOf[TextureGCSystem]
    }
    
    @scala.inline
    implicit class TextureGCSystemMutableBuilder[Self <: TextureGCSystem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckCount(value: Double): Self = StObject.set(x, "checkCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckCountMax(value: Double): Self = StObject.set(x, "checkCountMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxIdle(value: Double): Self = StObject.set(x, "maxIdle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: GC_MODES): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostrender(value: () => Unit): Self = StObject.set(x, "postrender", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRun(value: () => Unit): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnload(value: DisplayObject => Unit): Self = StObject.set(x, "unload", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * System plugin to the renderer to manage textures.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @js.native
  trait TextureSystem
    extends StObject
       with System {
    
    def bind(texture_ : BaseTexture): Unit = js.native
    def bind(texture_ : BaseTexture, location: Double): Unit = js.native
    /**
      * Bind a texture to a specific location
      *
      * If you want to unbind something, please use `unbind(texture)` instead of `bind(null, textureLocation)`
      *
      * @param {PIXI.Texture|PIXI.BaseTexture} texture_ - Texture to bind
      * @param {number} [location=0] - Location to bind at
      */
    def bind(texture_ : Texture): Unit = js.native
    def bind(texture_ : Texture, location: Double): Unit = js.native
    
    /**
      * Bound textures
      * @member {PIXI.BaseTexture[]} PIXI.systems.TextureSystem#boundTextures
      * @readonly
      */
    val boundTextures: js.Array[BaseTexture] = js.native
    
    /**
      * Sets up the renderer context and necessary buffers.
      */
    def contextChange(): Unit = js.native
    
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
      * Resets texture location and bound textures
      *
      * Actual `bind(null, i)` calls will be performed at next `unbind()` call
      */
    def reset(): Unit = js.native
    
    /**
      * Unbind a texture
      * @param {PIXI.BaseTexture} texture - Texture to bind
      */
    def unbind(texture: BaseTexture): Unit = js.native
    
    /**
      * BaseTexture value that shows that we don't know what is bound
      * @member {PIXI.BaseTexture} PIXI.systems.TextureSystem#unknownTexture
      * @readonly
      */
    val unknownTexture: BaseTexture = js.native
  }
}
