package typings.pixiDotJs.PIXINs

import org.scalablytyped.runtime.StringDictionary
import typings.pixiDotJs.Anon_Alpha
import typings.pixiDotJs.Anon_RendererAny
import typings.pixiDotJs.PIXINs.extractNs.WebGLExtract
import typings.pixiDotJs.PIXINs.glCoreNs.VertexArrayObject
import typings.pixiDotJs.pixiDotJsStrings.context
import typings.pixiDotJs.pixiDotJsStrings.postrender
import typings.pixiDotJs.pixiDotJsStrings.prerender
import typings.std.WebGLContextEvent
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The WebGLRenderer draws the scene and all its content onto a webGL enabled canvas. This renderer
  * should be used for browsers that support webGL. This Render works by automatically managing webGLBatchs.
  * So no need for Sprite Batches or Sprite Clouds.
  * Don"t forget to add the view to your DOM or you will not see anything :)
  */
@JSGlobal("PIXI.WebGLRenderer")
@js.native
// plugintarget mixin end
class WebGLRenderer () extends SystemRenderer {
  def this(options: WebGLRendererOptions) = this()
  def this(screenWidth: Double) = this()
  def this(screenWidth: Double, screenHeight: Double) = this()
  def this(screenWidth: Double, screenHeight: Double, options: WebGLRendererOptions) = this()
  var CONTEXT_UID: Double = js.native
  var _activeRenderTarget: RenderTarget = js.native
  var _activeShader: Shader = js.native
  var _contextOptions: Anon_Alpha = js.native
  var _unknownBoundTextures: js.Array[BaseTexture] = js.native
  var boundTextures: js.Array[BaseTexture] = js.native
  var currentRenderer: ObjectRenderer = js.native
  var drawModes: js.Any = js.native
  var emptyRenderer: ObjectRenderer = js.native
  var emptyTextures: js.Array[BaseTexture] = js.native
  /**
    * Collection of methods for extracting data (image, pixels, etc.) from a display object or render texture
    */
  var extract: WebGLExtract = js.native
  var filterManager: FilterManager = js.native
  var gl: WebGLRenderingContext = js.native
  var maskManager: MaskManager = js.native
  /**
    * Collection of installed plugins. These are included by default in PIXI, but can be excluded
    * by creating a custom build. Consult the README for more information about creating custom
    * builds and excluding plugins.
    * @property {PIXI.accessibility.AccessibilityManager} accessibility Support tabbing interactive elements.
    * @property {PIXI.extract.WebGLExtract} extract Extract image data from renderer.
    * @property {PIXI.interaction.InteractionManager} interaction Handles mouse, touch and pointer events.
    * @property {PIXI.prepare.WebGLPrepare} prepare Pre-render display objects.
    */
  var plugins: js.Any = js.native
  var renderingToScreen: Boolean = js.native
  var state: js.UndefOr[WebGLState] = js.native
  var stencilManager: js.UndefOr[StencilManager] = js.native
  var textureGC: js.UndefOr[TextureGarbageCollector] = js.native
  var textureManager: js.UndefOr[TextureManager] = js.native
  /* protected */ def _initContext(): Unit = js.native
  @JSName("addListener")
  def addListener_context(event: context, fn: js.Function1[/* gl */ WebGLRenderingContext, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_context(event: context, fn: js.Function1[/* gl */ WebGLRenderingContext, Unit], context: js.Any): this.type = js.native
  @JSName("addListener")
  def addListener_postrender(event: postrender, fn: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_postrender(event: postrender, fn: js.Function0[Unit], context: js.Any): this.type = js.native
  @JSName("addListener")
  def addListener_prerender(event: prerender, fn: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_prerender(event: prerender, fn: js.Function0[Unit], context: js.Any): this.type = js.native
  def bindRenderTarget(renderTarget: RenderTarget): WebGLRenderer = js.native
  def bindRenderTexture(renderTexture: RenderTexture, transform: Matrix): WebGLRenderer = js.native
  def bindShader(shader: Shader): WebGLRenderer = js.native
  def bindShader(shader: Shader, autoProject: Boolean): WebGLRenderer = js.native
  def bindTexture(texture: BaseTexture): Double = js.native
  def bindTexture(texture: BaseTexture, location: Double): Double = js.native
  def bindTexture(texture: BaseTexture, location: Double, forceLocation: Boolean): Double = js.native
  def bindTexture(texture: Texture): Double = js.native
  def bindTexture(texture: Texture, location: Double): Double = js.native
  def bindTexture(texture: Texture, location: Double, forceLocation: Boolean): Double = js.native
  def bindVao(vao: VertexArrayObject): WebGLRenderer = js.native
  def clear(): Unit = js.native
  def clear(clearColor: Double): Unit = js.native
  def clearRenderTexture(renderTexture: RenderTexture): WebGLRenderer = js.native
  def clearRenderTexture(renderTexture: RenderTexture, clearColor: Double): WebGLRenderer = js.native
  def createVao(): VertexArrayObject = js.native
  def destroyPlugins(): Unit = js.native
  def flush(): Unit = js.native
  def handleContextLost(event: WebGLContextEvent): Unit = js.native
  def handleContextRestored(): Unit = js.native
  def initPlugins(): Unit = js.native
  @JSName("off")
  def off_context(event: context): this.type = js.native
  @JSName("off")
  def off_context(event: context, fn: js.Function1[/* gl */ WebGLRenderingContext, Unit]): this.type = js.native
  @JSName("off")
  def off_context(event: context, fn: js.Function1[/* gl */ WebGLRenderingContext, Unit], context: js.Any): this.type = js.native
  @JSName("off")
  def off_postrender(event: postrender): this.type = js.native
  @JSName("off")
  def off_postrender(event: postrender, fn: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_postrender(event: postrender, fn: js.Function0[Unit], context: js.Any): this.type = js.native
  @JSName("off")
  def off_prerender(event: prerender): this.type = js.native
  @JSName("off")
  def off_prerender(event: prerender, fn: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_prerender(event: prerender, fn: js.Function0[Unit], context: js.Any): this.type = js.native
  @JSName("on")
  def on_context(event: context, fn: js.Function1[/* gl */ WebGLRenderingContext, Unit]): this.type = js.native
  @JSName("on")
  def on_context(event: context, fn: js.Function1[/* gl */ WebGLRenderingContext, Unit], context: js.Any): this.type = js.native
  @JSName("on")
  def on_postrender(event: postrender, fn: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_postrender(event: postrender, fn: js.Function0[Unit], context: js.Any): this.type = js.native
  @JSName("on")
  def on_prerender(event: prerender, fn: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_prerender(event: prerender, fn: js.Function0[Unit], context: js.Any): this.type = js.native
  @JSName("once")
  def once_context(event: context, fn: js.Function1[/* gl */ WebGLRenderingContext, Unit]): this.type = js.native
  @JSName("once")
  def once_context(event: context, fn: js.Function1[/* gl */ WebGLRenderingContext, Unit], context: js.Any): this.type = js.native
  @JSName("once")
  def once_postrender(event: postrender, fn: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_postrender(event: postrender, fn: js.Function0[Unit], context: js.Any): this.type = js.native
  @JSName("once")
  def once_prerender(event: prerender, fn: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_prerender(event: prerender, fn: js.Function0[Unit], context: js.Any): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_context(event: context): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_postrender(event: postrender): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_prerender(event: prerender): this.type = js.native
  @JSName("removeListener")
  def removeListener_context(event: context): this.type = js.native
  @JSName("removeListener")
  def removeListener_context(event: context, fn: js.Function1[/* gl */ WebGLRenderingContext, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_context(event: context, fn: js.Function1[/* gl */ WebGLRenderingContext, Unit], context: js.Any): this.type = js.native
  @JSName("removeListener")
  def removeListener_postrender(event: postrender): this.type = js.native
  @JSName("removeListener")
  def removeListener_postrender(event: postrender, fn: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_postrender(event: postrender, fn: js.Function0[Unit], context: js.Any): this.type = js.native
  @JSName("removeListener")
  def removeListener_prerender(event: prerender): this.type = js.native
  @JSName("removeListener")
  def removeListener_prerender(event: prerender, fn: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_prerender(event: prerender, fn: js.Function0[Unit], context: js.Any): this.type = js.native
  def render(displayObject: DisplayObject): Unit = js.native
  def render(displayObject: DisplayObject, renderTexture: RenderTexture): Unit = js.native
  def render(displayObject: DisplayObject, renderTexture: RenderTexture, clear: Boolean): Unit = js.native
  def render(displayObject: DisplayObject, renderTexture: RenderTexture, clear: Boolean, transform: Matrix): Unit = js.native
  def render(
    displayObject: DisplayObject,
    renderTexture: RenderTexture,
    clear: Boolean,
    transform: Matrix,
    skipUpdateTransform: Boolean
  ): Unit = js.native
  def reset(): WebGLRenderer = js.native
  def setBlendMode(blendMode: Double): Unit = js.native
  def setObjectRenderer(objectRenderer: ObjectRenderer): Unit = js.native
  def setTransform(matrix: Matrix): Unit = js.native
  def unbindTexture(texture: BaseTexture): js.UndefOr[WebGLRenderer] = js.native
  def unbindTexture(texture: Texture): js.UndefOr[WebGLRenderer] = js.native
}

/* static members */
@JSGlobal("PIXI.WebGLRenderer")
@js.native
object WebGLRenderer extends js.Object {
  // plugintarget mixin start
  var __plugins: StringDictionary[Anon_RendererAny] = js.native
  /**
    * Adds a plugin to the renderer.
    */
  def registerPlugin(pluginName: String, ctor: Anon_RendererAny): Unit = js.native
}

