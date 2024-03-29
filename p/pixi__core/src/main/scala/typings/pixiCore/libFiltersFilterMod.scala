package typings.pixiCore

import typings.pixiConstants.mod.BLEND_MODES
import typings.pixiConstants.mod.CLEAR_MODES
import typings.pixiConstants.mod.MSAA_QUALITY
import typings.pixiCore.libFiltersFilterStateMod.FilterState
import typings.pixiCore.libFiltersFilterSystemMod.FilterSystem
import typings.pixiCore.libRenderTextureRenderTextureMod.RenderTexture
import typings.pixiCore.libShaderShaderMod.Shader
import typings.pixiCore.libStateStateMod.State
import typings.pixiUtils.libTypesMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFiltersFilterMod {
  
  @JSImport("@pixi/core/lib/filters/Filter", "Filter")
  @js.native
  /**
    * @param vertexSrc - The source of the vertex shader.
    * @param fragmentSrc - The source of the fragment shader.
    * @param uniforms - Custom uniforms to use to augment the built-in ones.
    */
  open class Filter () extends Shader {
    def this(vertexSrc: String) = this()
    def this(vertexSrc: String, fragmentSrc: String) = this()
    def this(vertexSrc: Unit, fragmentSrc: String) = this()
    def this(vertexSrc: String, fragmentSrc: String, uniforms: Dict[Any]) = this()
    def this(vertexSrc: String, fragmentSrc: Unit, uniforms: Dict[Any]) = this()
    def this(vertexSrc: Unit, fragmentSrc: String, uniforms: Dict[Any]) = this()
    def this(vertexSrc: Unit, fragmentSrc: Unit, uniforms: Dict[Any]) = this()
    
    /* protected */ var _resolution: Double = js.native
    
    /**
      * Applies the filter
      * @param {PIXI.FilterSystem} filterManager - The renderer to retrieve the filter from
      * @param {PIXI.RenderTexture} input - The input render target.
      * @param {PIXI.RenderTexture} output - The target to output to.
      * @param {PIXI.CLEAR_MODES} [clearMode] - Should the output be cleared before rendering to it.
      * @param {object} [_currentState] - It's current state of filter.
      *        There are some useful properties in the currentState :
      *        target, filters, sourceFrame, destinationFrame, renderTarget, resolution
      */
    @JSName("apply")
    def apply(filterManager: FilterSystem, input: RenderTexture, output: RenderTexture): Unit = js.native
    @JSName("apply")
    def apply(
      filterManager: FilterSystem,
      input: RenderTexture,
      output: RenderTexture,
      clearMode: Unit,
      _currentState: FilterState
    ): Unit = js.native
    @JSName("apply")
    def apply(filterManager: FilterSystem, input: RenderTexture, output: RenderTexture, clearMode: CLEAR_MODES): Unit = js.native
    @JSName("apply")
    def apply(
      filterManager: FilterSystem,
      input: RenderTexture,
      output: RenderTexture,
      clearMode: CLEAR_MODES,
      _currentState: FilterState
    ): Unit = js.native
    
    /**
      * If enabled, PixiJS will fit the filter area into boundaries for better performance.
      * Switch it off if it does not work for specific shader.
      * @default true
      */
    var autoFit: Boolean = js.native
    
    /**
      * Sets the blend mode of the filter.
      * @default PIXI.BLEND_MODES.NORMAL
      */
    def blendMode: BLEND_MODES = js.native
    def blendMode_=(value: BLEND_MODES): Unit = js.native
    
    /** If enabled is true the filter is applied, if false it will not. */
    var enabled: Boolean = js.native
    
    /**
      * Legacy filters use position and uvs from attributes (set by filter system)
      * @readonly
      */
    var legacy: Boolean = js.native
    
    /** The samples override of the filter instance. */
    var multisample: MSAA_QUALITY = js.native
    
    /**
      * The padding of the filter. Some filters require extra space to breath such as a blur.
      * Increasing this will add extra width and height to the bounds of the object that the
      * filter is applied to.
      */
    var padding: Double = js.native
    
    /**
      * The resolution of the filter. Setting this to be lower will lower the quality but
      * increase the performance of the filter.
      */
    def resolution: Double = js.native
    def resolution_=(value: Double): Unit = js.native
    
    /** The WebGL state the filter requires to render. */
    var state: State = js.native
  }
  /* static members */
  object Filter {
    
    @JSImport("@pixi/core/lib/filters/Filter", "Filter")
    @js.native
    val ^ : js.Any = js.native
    
    /** Used for caching shader IDs. */
    @JSImport("@pixi/core/lib/filters/Filter", "Filter.SOURCE_KEY_MAP")
    @js.native
    def SOURCE_KEY_MAP: Dict[String] = js.native
    inline def SOURCE_KEY_MAP_=(x: Dict[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SOURCE_KEY_MAP")(x.asInstanceOf[js.Any])
    
    /**
      * Default filter samples for any filter.
      * @static
      * @type {PIXI.MSAA_QUALITY}
      * @default PIXI.MSAA_QUALITY.NONE
      */
    @JSImport("@pixi/core/lib/filters/Filter", "Filter.defaultMultisample")
    @js.native
    def defaultMultisample: MSAA_QUALITY = js.native
    inline def defaultMultisample_=(x: MSAA_QUALITY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMultisample")(x.asInstanceOf[js.Any])
    
    /**
      * Default filter resolution for any filter.
      * @static
      */
    @JSImport("@pixi/core/lib/filters/Filter", "Filter.defaultResolution")
    @js.native
    def defaultResolution: Double = js.native
    inline def defaultResolution_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultResolution")(x.asInstanceOf[js.Any])
  }
}
