package typings.pixiCore

import typings.pixiConstants.mod.CLEAR_MODES
import typings.pixiConstants.mod.MSAA_QUALITY
import typings.pixiCore.libFiltersFilterMod.Filter
import typings.pixiCore.libFiltersFilterStateMod.FilterState
import typings.pixiCore.libFiltersIfiltertargetMod.IFilterTarget
import typings.pixiCore.libFiltersSpriteMaskSpriteMaskFilterMod.ISpriteMaskTarget
import typings.pixiCore.libRenderTextureRenderTextureMod.RenderTexture
import typings.pixiCore.libRenderTextureRenderTexturePoolMod.RenderTexturePool
import typings.pixiCore.libRendererMod.Renderer
import typings.pixiCore.libShaderUniformGroupMod.UniformGroup
import typings.pixiCore.libSystemIsystemMod.ISystem
import typings.pixiCore.libUtilsQuadMod.Quad
import typings.pixiCore.libUtilsQuadUvMod.QuadUv
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiMath.mod.Matrix
import typings.pixiUtils.libTypesMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFiltersFilterSystemMod {
  
  @JSImport("@pixi/core/lib/filters/FilterSystem", "FilterSystem")
  @js.native
  open class FilterSystem protected ()
    extends StObject
       with ISystem[Null, Null] {
    /**
      * @param renderer - The renderer this System works for.
      */
    def this(renderer: Renderer) = this()
    
    /**
      * Active state
      * @member {object}
      */
    /* protected */ var activeState: FilterState = js.native
    
    /**
      * Draws a filter using the default rendering process.
      *
      * This should be called only by {@link Filter#apply}.
      * @param filter - The filter to draw.
      * @param input - The input render target.
      * @param output - The target to output to.
      * @param clearMode - Should the output be cleared before rendering to it
      */
    def applyFilter(filter: Filter, input: RenderTexture, output: RenderTexture): Unit = js.native
    def applyFilter(filter: Filter, input: RenderTexture, output: RenderTexture, clearMode: CLEAR_MODES): Unit = js.native
    
    /**
      * Binds a renderTexture with corresponding `filterFrame`, clears it if mode corresponds.
      * @param filterTexture - renderTexture to bind, should belong to filter pool or filter stack
      * @param clearMode - clearMode, by default its CLEAR/YES. See {@link PIXI.CLEAR_MODES}
      */
    def bindAndClear(filterTexture: RenderTexture): Unit = js.native
    def bindAndClear(filterTexture: RenderTexture, clearMode: CLEAR_MODES): Unit = js.native
    
    /**
      * Multiply _input normalized coordinates_ to this matrix to get _sprite texture normalized coordinates_.
      *
      * Use `outputMatrix * vTextureCoord` in the shader.
      * @param outputMatrix - The matrix to output to.
      * @param {PIXI.Sprite} sprite - The sprite to map to.
      * @returns The mapped matrix.
      */
    def calculateSpriteMatrix(outputMatrix: Matrix, sprite: ISpriteMaskTarget): Matrix = js.native
    
    /**
      * List of filters for the FilterSystem
      * @member {object[]}
      */
    val defaultFilterStack: js.Array[FilterState] = js.native
    
    /** Destroys this Filter System. */
    @JSName("destroy")
    def destroy_MFilterSystem(): Unit = js.native
    
    /** Empties the texture pool. */
    def emptyPool(): Unit = js.native
    
    /** Whether to clear output renderTexture in AUTO/BLIT mode. See {@link PIXI.CLEAR_MODES}. */
    var forceClear: Boolean = js.native
    
    /**
      * Gets extra render texture to use inside current filter
      * To be compliant with older filters, you can use params in any order
      * @param input - renderTexture from which size and resolution will be copied
      * @param resolution - override resolution of the renderTexture
      * @param multisample - number of samples of the renderTexture
      */
    def getFilterTexture(): RenderTexture = js.native
    def getFilterTexture(input: Unit, resolution: Double): RenderTexture = js.native
    def getFilterTexture(input: Unit, resolution: Double, multisample: MSAA_QUALITY): RenderTexture = js.native
    def getFilterTexture(input: Unit, resolution: Unit, multisample: MSAA_QUALITY): RenderTexture = js.native
    def getFilterTexture(input: RenderTexture): RenderTexture = js.native
    def getFilterTexture(input: RenderTexture, resolution: Double): RenderTexture = js.native
    def getFilterTexture(input: RenderTexture, resolution: Double, multisample: MSAA_QUALITY): RenderTexture = js.native
    def getFilterTexture(input: RenderTexture, resolution: Unit, multisample: MSAA_QUALITY): RenderTexture = js.native
    
    /**
      * Gets a Power-of-Two render texture or fullScreen texture
      * @param minWidth - The minimum width of the render texture in real pixels.
      * @param minHeight - The minimum height of the render texture in real pixels.
      * @param resolution - The resolution of the render texture.
      * @param multisample - Number of samples of the render texture.
      * @returns - The new render texture.
      */
    /* protected */ def getOptimalFilterTexture(minWidth: Double, minHeight: Double): RenderTexture = js.native
    /* protected */ def getOptimalFilterTexture(minWidth: Double, minHeight: Double, resolution: Double): RenderTexture = js.native
    /* protected */ def getOptimalFilterTexture(minWidth: Double, minHeight: Double, resolution: Double, multisample: MSAA_QUALITY): RenderTexture = js.native
    /* protected */ def getOptimalFilterTexture(minWidth: Double, minHeight: Double, resolution: Unit, multisample: MSAA_QUALITY): RenderTexture = js.native
    
    /**
      * This uniform group is attached to filter uniforms when used.
      * @property {PIXI.Rectangle} outputFrame -
      * @property {Float32Array} inputSize -
      * @property {Float32Array} inputPixel -
      * @property {Float32Array} inputClamp -
      * @property {number} resolution -
      * @property {Float32Array} filterArea -
      * @property {Float32Array} filterClamp -
      */
    /* protected */ var globalUniforms: UniformGroup[Dict[Any]] = js.native
    
    @JSName("init")
    def init_MFilterSystem(): Unit = js.native
    
    /** Pops off the filter and applies it. */
    def pop(): Unit = js.native
    
    /**
      * Pushes a set of filters to be applied later to the system. This will redirect further rendering into an
      * input render-texture for the rest of the filtering pipeline.
      * @param {PIXI.DisplayObject} target - The target of the filter to render.
      * @param filters - The filters to apply.
      */
    def push(target: IFilterTarget, filters: js.Array[Filter]): Unit = js.native
    
    /** A very simple geometry used when drawing a filter effect to the screen. */
    /* protected */ var quad: Quad = js.native
    
    /** Quad UVs */
    /* protected */ var quadUv: QuadUv = js.native
    
    var renderer: Renderer = js.native
    
    /** Calls `texturePool.resize()`, affects fullScreen renderTextures. */
    def resize(): Unit = js.native
    
    /**
      * Frees a render texture back into the pool.
      * @param renderTexture - The renderTarget to free
      */
    def returnFilterTexture(renderTexture: RenderTexture): Unit = js.native
    
    /* private */ var roundFrame: Any = js.native
    
    /** A pool for storing filter states, save us creating new ones each tick. */
    var statePool: js.Array[FilterState] = js.native
    
    /** Temporary rect for math. */
    /* private */ var tempRect: Any = js.native
    
    /** Stores a bunch of POT textures used for filtering. */
    var texturePool: RenderTexturePool = js.native
    
    /**
      * @param matrix - first param
      * @param rect - second param
      */
    /* private */ var transformAABB: Any = js.native
    
    /**
      * Old padding behavior is to use the max amount instead of sum padding.
      * Use this flag if you need the old behavior.
      * @default false
      */
    var useMaxPadding: Boolean = js.native
  }
  /* static members */
  object FilterSystem {
    
    /** @ignore */
    @JSImport("@pixi/core/lib/filters/FilterSystem", "FilterSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
}
