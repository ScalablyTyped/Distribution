package typings.pixiCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pixiConstants.mod.MSAA_QUALITY
import typings.pixiMath.mod.Matrix
import typings.pixiMath.mod.Rectangle
import typings.pixiRunner.mod.Runner
import typings.pixiUtils.mod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "Renderer")
@js.native
/**
  * @param [options] - The optional renderer parameters.
  * @param {number} [options.width=800] - The width of the screen.
  * @param {number} [options.height=600] - The height of the screen.
  * @param {HTMLCanvasElement} [options.view] - The canvas to use as a view, optional.
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
  *  enable this if you need to call toDataUrl on the WebGL context.
  * @param {number} [options.backgroundColor=0x000000] - The background color of the rendered area
  *  (shown if not transparent).
  * @param {number} [options.backgroundAlpha=1] - Value from 0 (fully transparent) to 1 (fully opaque).
  * @param {string} [options.powerPreference] - Parameter passed to WebGL context, set to "high-performance"
  *  for devices with dual graphics card.
  * @param {object} [options.context] - If WebGL context already exists, all parameters must be taken from it.
  */
open class Renderer () extends AbstractRenderer {
  def this(options: IRendererOptions) = this()
  
  /** Unique UID assigned to the renderer's WebGL context. */
  var CONTEXT_UID: Double = js.native
  
  /**
    * Batch system instance
    * @readonly
    */
  var batch: BatchSystem = js.native
  
  /**
    * Buffer system instance
    * @readonly
    */
  var buffer: BufferSystem = js.native
  
  /** Clear the frame buffer. */
  def clear(): Unit = js.native
  
  /**
    * Context system instance
    * @readonly
    */
  var context: ContextSystem = js.native
  
  /* protected */ def contextChange(): Unit = js.native
  
  /**
    * Please use `plugins.extract` instead.
    * @member {PIXI.Extract} extract
    * @deprecated since 6.0.0
    * @readonly
    */
  def extract: Any = js.native
  
  /**
    * Filter system instance
    * @readonly
    */
  var filter: FilterSystem = js.native
  
  /**
    * Framebuffer system instance
    * @readonly
    */
  var framebuffer: FramebufferSystem = js.native
  
  def generateTexture(displayObject: IRenderableObject, options: IGenerateTextureOptions, resolution: Double): RenderTexture = js.native
  def generateTexture(
    displayObject: IRenderableObject,
    options: IGenerateTextureOptions,
    resolution: Double,
    region: Rectangle
  ): RenderTexture = js.native
  def generateTexture(
    displayObject: IRenderableObject,
    options: IGenerateTextureOptions,
    resolution: Unit,
    region: Rectangle
  ): RenderTexture = js.native
  
  /**
    * Geometry system instance
    * @readonly
    */
  var geometry: GeometrySystem = js.native
  
  /**
    * WebGL context, set by {@link PIXI.ContextSystem this.context}.
    * @readonly
    * @member {WebGLRenderingContext}
    */
  var gl: IRenderingContext = js.native
  
  /** Global uniforms */
  var globalUniforms: UniformGroup[Dict[Any]] = js.native
  
  /**
    * Mask system instance
    * @readonly
    */
  var mask: MaskSystem = js.native
  
  /**
    * The number of msaa samples of the canvas.
    * @readonly
    */
  var multisample: MSAA_QUALITY = js.native
  
  /**
    * Projection system instance
    * @readonly
    */
  var projection: ProjectionSystem = js.native
  
  def render(displayObject: IRenderableObject, renderTexture: Unit, clear: Boolean): Unit = js.native
  def render(
    displayObject: IRenderableObject,
    renderTexture: Unit,
    clear: Boolean,
    transform: Unit,
    skipUpdateTransform: Boolean
  ): Unit = js.native
  def render(displayObject: IRenderableObject, renderTexture: Unit, clear: Boolean, transform: Matrix): Unit = js.native
  def render(
    displayObject: IRenderableObject,
    renderTexture: Unit,
    clear: Boolean,
    transform: Matrix,
    skipUpdateTransform: Boolean
  ): Unit = js.native
  def render(
    displayObject: IRenderableObject,
    renderTexture: Unit,
    clear: Unit,
    transform: Unit,
    skipUpdateTransform: Boolean
  ): Unit = js.native
  def render(displayObject: IRenderableObject, renderTexture: Unit, clear: Unit, transform: Matrix): Unit = js.native
  def render(
    displayObject: IRenderableObject,
    renderTexture: Unit,
    clear: Unit,
    transform: Matrix,
    skipUpdateTransform: Boolean
  ): Unit = js.native
  def render(displayObject: IRenderableObject, renderTexture: RenderTexture): Unit = js.native
  def render(displayObject: IRenderableObject, renderTexture: RenderTexture, clear: Boolean): Unit = js.native
  def render(
    displayObject: IRenderableObject,
    renderTexture: RenderTexture,
    clear: Boolean,
    transform: Unit,
    skipUpdateTransform: Boolean
  ): Unit = js.native
  def render(displayObject: IRenderableObject, renderTexture: RenderTexture, clear: Boolean, transform: Matrix): Unit = js.native
  def render(
    displayObject: IRenderableObject,
    renderTexture: RenderTexture,
    clear: Boolean,
    transform: Matrix,
    skipUpdateTransform: Boolean
  ): Unit = js.native
  def render(
    displayObject: IRenderableObject,
    renderTexture: RenderTexture,
    clear: Unit,
    transform: Unit,
    skipUpdateTransform: Boolean
  ): Unit = js.native
  def render(displayObject: IRenderableObject, renderTexture: RenderTexture, clear: Unit, transform: Matrix): Unit = js.native
  def render(
    displayObject: IRenderableObject,
    renderTexture: RenderTexture,
    clear: Unit,
    transform: Matrix,
    skipUpdateTransform: Boolean
  ): Unit = js.native
  
  /**
    * RenderTexture system instance
    * @readonly
    */
  var renderTexture: RenderTextureSystem = js.native
  
  /**
    * Flag if we are rendering to the screen vs renderTexture
    * @readonly
    * @default true
    */
  var renderingToScreen: Boolean = js.native
  
  /**
    * Resets the WebGL state so you can render things however you fancy!
    * @returns Returns itself.
    */
  def reset(): this.type = js.native
  
  /**
    * Internal signal instances of **runner**, these
    * are assigned to each system created.
    * @see PIXI.Runner
    * @name runners
    * @private
    * @type {object}
    * @readonly
    * @property {PIXI.Runner} destroy - Destroy runner
    * @property {PIXI.Runner} contextChange - Context change runner
    * @property {PIXI.Runner} reset - Reset runner
    * @property {PIXI.Runner} update - Update runner
    * @property {PIXI.Runner} postrender - Post-render runner
    * @property {PIXI.Runner} prerender - Pre-render runner
    * @property {PIXI.Runner} resize - Resize runner
    */
  var runners: StringDictionary[Runner] = js.native
  
  /**
    * Scissor system instance
    * @readonly
    */
  var scissor: ScissorSystem = js.native
  
  /**
    * Shader system instance
    * @readonly
    */
  var shader: ShaderSystem = js.native
  
  /**
    * State system instance
    * @readonly
    */
  var state: StateSystem = js.native
  
  /**
    * Stencil system instance
    * @readonly
    */
  var stencil: StencilSystem = js.native
  
  /**
    * Texture system instance
    * @readonly
    */
  var texture: TextureSystem = js.native
  
  /**
    * Texture garbage collector system instance
    * @readonly
    */
  var textureGC: TextureGCSystem = js.native
}
/* static members */
object Renderer {
  
  @JSImport("@pixi/core", "Renderer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Collection of installed plugins. These are included by default in PIXI, but can be excluded
    * by creating a custom build. Consult the README for more information about creating custom
    * builds and excluding plugins.
    * @readonly
    * @property {PIXI.AccessibilityManager} accessibility Support tabbing interactive elements.
    * @property {PIXI.Extract} extract Extract image data from renderer.
    * @property {PIXI.InteractionManager} interaction Handles mouse, touch and pointer events.
    * @property {PIXI.ParticleRenderer} particle Renderer for ParticleContainer objects.
    * @property {PIXI.Prepare} prepare Pre-render display objects.
    * @property {PIXI.BatchRenderer} batch Batching of Sprite, Graphics and Mesh objects.
    * @property {PIXI.TilingSpriteRenderer} tilingSprite Renderer for TilingSprite objects.
    */
  @JSImport("@pixi/core", "Renderer.__plugins")
  @js.native
  def __plugins: IRendererPlugins = js.native
  inline def __plugins_=(x: IRendererPlugins): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__plugins")(x.asInstanceOf[js.Any])
  
  /**
    * Create renderer if WebGL is available. Overrideable
    * by the **@pixi/canvas-renderer** package to allow fallback.
    * throws error if WebGL is not available.
    * @param options
    * @private
    */
  inline def create(): AbstractRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[AbstractRenderer]
  inline def create(options: IRendererOptions): AbstractRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[AbstractRenderer]
  
  /**
    * Use the {@link PIXI.extensions.add} API to register plugins.
    * @deprecated since 6.5.0
    * @param pluginName - The name of the plugin.
    * @param ctor - The constructor function or class for the plugin.
    */
  inline def registerPlugin(pluginName: String, ctor: IRendererPluginConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(pluginName.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
