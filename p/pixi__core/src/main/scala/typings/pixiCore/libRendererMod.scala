package typings.pixiCore

import typings.pixiConstants.mod.MSAA_QUALITY
import typings.pixiConstants.mod.RENDERER_TYPE.WEBGL
import typings.pixiCore.libBackgroundBackgroundSystemMod.BackgroundSystem
import typings.pixiCore.libBatchBatchSystemMod.BatchSystem
import typings.pixiCore.libContextContextSystemMod.ContextSystem
import typings.pixiCore.libFiltersFilterSystemMod.FilterSystem
import typings.pixiCore.libFramebufferFramebufferSystemMod.FramebufferSystem
import typings.pixiCore.libFramebufferMultisampleSystemMod.MultisampleSystem
import typings.pixiCore.libGeometryBufferSystemMod.BufferSystem
import typings.pixiCore.libGeometryGeometrySystemMod.GeometrySystem
import typings.pixiCore.libIrendererMod.IRenderableObject
import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiCore.libIrendererMod.IRendererOptions
import typings.pixiCore.libIrendererMod.IRenderingContext
import typings.pixiCore.libMaskMaskSystemMod.MaskSystem
import typings.pixiCore.libMaskScissorSystemMod.ScissorSystem
import typings.pixiCore.libMaskStencilSystemMod.StencilSystem
import typings.pixiCore.libPluginPluginSystemMod.IRendererPlugins
import typings.pixiCore.libPluginPluginSystemMod.PluginSystem
import typings.pixiCore.libProjectionProjectionSystemMod.ProjectionSystem
import typings.pixiCore.libRenderObjectRendererSystemMod.ObjectRendererSystem
import typings.pixiCore.libRenderTextureGenerateTextureSystemMod.GenerateTextureSystem
import typings.pixiCore.libRenderTextureRenderTextureSystemMod.RenderTextureSystem
import typings.pixiCore.libShaderShaderSystemMod.ShaderSystem
import typings.pixiCore.libShaderUniformGroupMod.UniformGroup
import typings.pixiCore.libStartupStartupSystemMod.StartupSystem
import typings.pixiCore.libStateStateSystemMod.StateSystem
import typings.pixiCore.libTexturesTextureGCSystemMod.TextureGCSystem
import typings.pixiCore.libTexturesTextureSystemMod.TextureSystem
import typings.pixiCore.libTransformFeedbackTransformFeedbackSystemMod.TransformFeedbackSystem
import typings.pixiCore.libViewViewSystemMod.ViewSystem
import typings.pixiCore.pixiCoreStrings.notMultiplied
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiMath.mod.Rectangle
import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.pixiUtils.libTypesMod.Dict
import typings.std.Record
import typings.std.WebGLPowerPreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRendererMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.Renderer * / any */ @JSImport("@pixi/core/lib/Renderer", "Renderer")
  @js.native
  /**
    * @param [options] - The optional renderer parameters.
    * @param {number} [options.width=800] - The width of the screen.
    * @param {number} [options.height=600] - The height of the screen.
    * @param {PIXI.ICanvas} [options.view] - The canvas to use as a view, optional.
    * @param {boolean} [options.useContextAlpha=true] - Pass-through value for canvas' context `alpha` property.
    *   If you want to set transparency, please use `backgroundAlpha`. This option is for cases where the
    *   canvas needs to be opaque, possibly for performance reasons on some older devices.
    * @param {boolean} [options.autoDensity=false] - Resizes renderer view in CSS pixels to allow for
    *   resolutions other than 1.
    * @param {boolean} [options.antialias=false] - Sets antialias. If not available natively then FXAA
    *  antialiasing is used.
    * @param {number} [options.resolution=PIXI.settings.RESOLUTION] - The resolution / device pixel ratio of the renderer.
    * @param {boolean} [options.clearBeforeRender=true] - This sets if the renderer will clear
    *  the canvas or not before the new render pass. If you wish to set this to false, you *must* set
    *  preserveDrawingBuffer to `true`.
    * @param {boolean} [options.preserveDrawingBuffer=false] - Enables drawing buffer preservation,
    *  enable this if you need to call toDataURL on the WebGL context.
    * @param {number|string} [options.backgroundColor=0x000000] - The background color of the rendered area
    *  (shown if not transparent). Also, accepts hex strings or color names (e.g., 'white').
    * @param {number|string} [options.background] - Alias for `options.backgroundColor`.
    * @param {number} [options.backgroundAlpha=1] - Value from 0 (fully transparent) to 1 (fully opaque).
    * @param {string} [options.powerPreference] - Parameter passed to WebGL context, set to "high-performance"
    *  for devices with dual graphics card.
    * @param {object} [options.context] - If WebGL context already exists, all parameters must be taken from it.
    * @param {object} [options.blit] - if rendering to a renderTexture, set to true if you want to run blit after
    * the render. defaults to false.
    * @param {boolean} [options.hello=false] - Logs renderer type and version.
    */
  open class Renderer () extends IRenderer {
    def this(options: IRendererOptions) = this()
    
    /** Unique UID assigned to the renderer's WebGL context. */
    var CONTEXT_UID: Double = js.native
    
    /**
      * _multisample system instance
      * @readonly
      */
    val _multisample: MultisampleSystem = js.native
    
    /**
      * plugin system instance
      * @readonly
      */
    val _plugin: PluginSystem = js.native
    
    /**
      * _view system instance
      * @readonly
      */
    val _view: ViewSystem = js.native
    
    /** Whether CSS dimensions of canvas view should be resized to screen dimensions automatically. */
    def autoDensity: Boolean = js.native
    
    /**
      * background system instance
      * @readonly
      */
    val background: BackgroundSystem = js.native
    
    /**
      * The background color alpha. Setting this to 0 will make the canvas transparent.
      * @member {number}
      * @deprecated since 7.0.0
      */
    def backgroundAlpha: Double = js.native
    /**
      * @deprecated since 7.0.0
      */
    def backgroundAlpha_=(value: Double): Unit = js.native
    
    /**
      * The background color to fill if not transparent
      * @member {number}
      * @deprecated since 7.0.0
      */
    def backgroundColor: Double = js.native
    def backgroundColor_=(value: Double): Unit = js.native
    
    /**
      * Batch system instance
      * @readonly
      */
    val batch: BatchSystem = js.native
    
    /**
      * Buffer system instance
      * @readonly
      */
    val buffer: BufferSystem = js.native
    
    /**
      * This sets weather the screen is totally cleared between each frame withthe background color and alpha
      * @deprecated since 7.0.0
      */
    def clearBeforeRender: Boolean = js.native
    
    /**
      * Context system instance
      * @readonly
      */
    val context: ContextSystem = js.native
    
    /**
      * Filter system instance
      * @readonly
      */
    val filter: FilterSystem = js.native
    
    /**
      * Framebuffer system instance
      * @readonly
      */
    val framebuffer: FramebufferSystem = js.native
    
    /**
      * Geometry system instance
      * @readonly
      */
    val geometry: GeometrySystem = js.native
    
    /**
      * WebGL context, set by {@link PIXI.ContextSystem this.context}.
      * @readonly
      * @member {WebGLRenderingContext}
      */
    var gl: IRenderingContext = js.native
    
    /**
      * Global uniforms
      * Add any uniforms you want shared across your shaders.
      * the must be added before the scene is rendered for the first time
      * as we dynamically buildcode to handle all global var per shader
      *
      */
    var globalUniforms: UniformGroup[Dict[Any]] = js.native
    
    /**
      * Same as view.height, actual number of pixels in the canvas by vertical.
      * @default 600
      */
    @JSName("height")
    def height_MRenderer: Double = js.native
    
    /** the last object rendered by the renderer. Useful for other plugins like interaction managers */
    @JSName("lastObjectRendered")
    def lastObjectRendered_MRenderer: IRenderableObject = js.native
    
    /**
      * Mask system instance
      * @readonly
      */
    val mask: MaskSystem = js.native
    
    /** The number of msaa samples of the canvas. */
    def multisample: MSAA_QUALITY = js.native
    
    /**
      * _render system instance
      * @readonly
      */
    val objectRenderer: ObjectRendererSystem = js.native
    
    /** Collection of plugins */
    @JSName("plugins")
    def plugins_MRenderer: IRendererPlugins = js.native
    
    /**
      * @deprecated since 7.0.0
      */
    def powerPreference: WebGLPowerPreference = js.native
    
    /**
      * readonly drawing buffer preservation
      * we can only know this if Pixi created the context
      * @deprecated since 7.0.0
      */
    def preserveDrawingBuffer: Boolean = js.native
    
    /**
      * Projection system instance
      * @readonly
      */
    val projection: ProjectionSystem = js.native
    
    /**
      * RenderTexture system instance
      * @readonly
      */
    val renderTexture: RenderTextureSystem = js.native
    
    /** When logging Pixi to the console, this is the name we will show */
    @JSName("rendererLogId")
    def rendererLogId_MRenderer: String = js.native
    
    /** Flag if we are rendering to the screen vs renderTexture */
    @JSName("renderingToScreen")
    def renderingToScreen_MRenderer: Boolean = js.native
    
    /** The resolution / device pixel ratio of the renderer. */
    @JSName("resolution")
    def resolution_MRenderer: Double = js.native
    
    /**
      * Scissor system instance
      * @readonly
      */
    val scissor: ScissorSystem = js.native
    
    /**
      * Measurements of the screen. (0, 0, screenWidth, screenHeight).
      *
      * Its safe to use as filterArea or hitArea for the whole stage.
      * @member {PIXI.Rectangle}
      */
    @JSName("screen")
    def screen_MRenderer: Rectangle = js.native
    
    /**
      * Shader system instance
      * @readonly
      */
    val shader: ShaderSystem = js.native
    
    /**
      * startup system instance
      * @readonly
      */
    val startup: StartupSystem = js.native
    
    /**
      * State system instance
      * @readonly
      */
    val state: StateSystem = js.native
    
    /**
      * Stencil system instance
      * @readonly
      */
    val stencil: StencilSystem = js.native
    
    /**
      * Texture system instance
      * @readonly
      */
    val texture: TextureSystem = js.native
    
    /**
      * Texture garbage collector system instance
      * @readonly
      */
    val textureGC: TextureGCSystem = js.native
    
    /**
      * textureGenerator system instance
      * @readonly
      */
    val textureGenerator: GenerateTextureSystem = js.native
    
    /**
      * TransformFeedback system instance
      * @readonly
      */
    var transformFeedback: TransformFeedbackSystem = js.native
    
    /**
      * The type of the renderer. will be PIXI.RENDERER_TYPE.CANVAS
      * @member {number}
      * @see PIXI.RENDERER_TYPE
      */
    @JSName("type")
    val type_Renderer: WEBGL = js.native
    
    /**
      * Pass-thru setting for the canvas' context `alpha` property. This is typically
      * not something you need to fiddle with. If you want transparency, use `backgroundAlpha`.
      * @deprecated since 7.0.0
      * @member {boolean}
      */
    def useContextAlpha: Boolean | notMultiplied = js.native
    
    /** The canvas element that everything is drawn to.*/
    @JSName("view")
    def view_MRenderer: ICanvas = js.native
    
    /**
      * Same as view.width, actual number of pixels in the canvas by horizontal.
      * @member {number}
      * @readonly
      * @default 800
      */
    @JSName("width")
    def width_MRenderer: Double = js.native
  }
  /* static members */
  object Renderer {
    
    @JSImport("@pixi/core/lib/Renderer", "Renderer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Collection of installed plugins. These are included by default in PIXI, but can be excluded
      * by creating a custom build. Consult the README for more information about creating custom
      * builds and excluding plugins.
      * @private
      */
    @JSImport("@pixi/core/lib/Renderer", "Renderer.__plugins")
    @js.native
    val __plugins: IRendererPlugins = js.native
    
    /**
      * The collection of installed systems.
      * @private
      */
    @JSImport("@pixi/core/lib/Renderer", "Renderer.__systems")
    @js.native
    val __systems: Record[String, Any] = js.native
    
    /** @ignore */
    @JSImport("@pixi/core/lib/Renderer", "Renderer.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
    
    /**
      * Create renderer if WebGL is available. Overrideable
      * by the **@pixi/canvas-renderer** package to allow fallback.
      * throws error if WebGL is not available.
      * @param options
      * @private
      */
    inline def test(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")().asInstanceOf[Boolean]
    inline def test(options: IRendererOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
