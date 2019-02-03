package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.WebGLRenderer")
@js.native
// plugintarget mixin end
class WebGLRenderer () extends SystemRenderer {
  def this(options: WebGLRendererOptions) = this()
  def this(screenWidth: scala.Double) = this()
  def this(screenWidth: scala.Double, screenHeight: scala.Double) = this()
  def this(screenWidth: scala.Double, screenHeight: scala.Double, options: WebGLRendererOptions) = this()
  var CONTEXT_UID: scala.Double = js.native
  var _activeRenderTarget: RenderTarget = js.native
  var _activeShader: Shader = js.native
  var _contextOptions: pixiDotJsLib.Anon_Alpha = js.native
  var boundTextures: js.Array[BaseTexture] = js.native
  var currentRenderer: ObjectRenderer = js.native
  var drawModes: js.Any = js.native
  var emptyRenderer: ObjectRenderer = js.native
  var extract: pixiDotJsLib.PIXINs.extractNs.WebGLExtract = js.native
  var filterManager: FilterManager = js.native
  var gl: stdLib.WebGLRenderingContext = js.native
  var maskManager: MaskManager = js.native
  var plugins: js.Any = js.native
  var renderingToScreen: scala.Boolean = js.native
  var state: js.UndefOr[WebGLState] = js.native
  var stencilManager: js.UndefOr[StencilManager] = js.native
  var textureGC: js.UndefOr[TextureGarbageCollector] = js.native
  var textureManager: js.UndefOr[TextureManager] = js.native
  /* protected */ def _initContext(): scala.Unit = js.native
  @JSName("addListener")
  def addListener_context(
    event: pixiDotJsLib.pixiDotJsLibStrings.context,
    fn: js.Function1[/* gl */ stdLib.WebGLRenderingContext, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_context(
    event: pixiDotJsLib.pixiDotJsLibStrings.context,
    fn: js.Function1[/* gl */ stdLib.WebGLRenderingContext, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("addListener")
  def addListener_postrender(event: pixiDotJsLib.pixiDotJsLibStrings.postrender, fn: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_postrender(event: pixiDotJsLib.pixiDotJsLibStrings.postrender, fn: js.Function0[scala.Unit], context: js.Any): this.type = js.native
  @JSName("addListener")
  def addListener_prerender(event: pixiDotJsLib.pixiDotJsLibStrings.prerender, fn: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_prerender(event: pixiDotJsLib.pixiDotJsLibStrings.prerender, fn: js.Function0[scala.Unit], context: js.Any): this.type = js.native
  def bindRenderTarget(renderTarget: RenderTarget): WebGLRenderer = js.native
  def bindRenderTexture(renderTexture: RenderTexture, transform: Matrix): WebGLRenderer = js.native
  def bindShader(shader: Shader): WebGLRenderer = js.native
  def bindShader(shader: Shader, autoProject: scala.Boolean): WebGLRenderer = js.native
  def bindTexture(texture: BaseTexture): scala.Double = js.native
  def bindTexture(texture: BaseTexture, location: scala.Double): scala.Double = js.native
  def bindTexture(texture: BaseTexture, location: scala.Double, forceLocation: scala.Boolean): scala.Double = js.native
  def bindTexture(texture: Texture): scala.Double = js.native
  def bindTexture(texture: Texture, location: scala.Double): scala.Double = js.native
  def bindTexture(texture: Texture, location: scala.Double, forceLocation: scala.Boolean): scala.Double = js.native
  def bindVao(vao: pixiDotJsLib.PIXINs.glCoreNs.VertexArrayObject): WebGLRenderer = js.native
  def clear(): scala.Unit = js.native
  def clear(clearColor: scala.Double): scala.Unit = js.native
  def clearRenderTexture(renderTexture: RenderTexture): WebGLRenderer = js.native
  def clearRenderTexture(renderTexture: RenderTexture, clearColor: scala.Double): WebGLRenderer = js.native
  def createVao(): pixiDotJsLib.PIXINs.glCoreNs.VertexArrayObject = js.native
  def destroyPlugins(): scala.Unit = js.native
  def flush(): scala.Unit = js.native
  def handleContextLost(event: stdLib.WebGLContextEvent): scala.Unit = js.native
  def handleContextRestored(): scala.Unit = js.native
  def initPlugins(): scala.Unit = js.native
  @JSName("off")
  def off_context(event: pixiDotJsLib.pixiDotJsLibStrings.context): this.type = js.native
  @JSName("off")
  def off_context(
    event: pixiDotJsLib.pixiDotJsLibStrings.context,
    fn: js.Function1[/* gl */ stdLib.WebGLRenderingContext, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_context(
    event: pixiDotJsLib.pixiDotJsLibStrings.context,
    fn: js.Function1[/* gl */ stdLib.WebGLRenderingContext, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("off")
  def off_postrender(event: pixiDotJsLib.pixiDotJsLibStrings.postrender): this.type = js.native
  @JSName("off")
  def off_postrender(event: pixiDotJsLib.pixiDotJsLibStrings.postrender, fn: js.Function0[scala.Unit]): this.type = js.native
  @JSName("off")
  def off_postrender(event: pixiDotJsLib.pixiDotJsLibStrings.postrender, fn: js.Function0[scala.Unit], context: js.Any): this.type = js.native
  @JSName("off")
  def off_prerender(event: pixiDotJsLib.pixiDotJsLibStrings.prerender): this.type = js.native
  @JSName("off")
  def off_prerender(event: pixiDotJsLib.pixiDotJsLibStrings.prerender, fn: js.Function0[scala.Unit]): this.type = js.native
  @JSName("off")
  def off_prerender(event: pixiDotJsLib.pixiDotJsLibStrings.prerender, fn: js.Function0[scala.Unit], context: js.Any): this.type = js.native
  @JSName("on")
  def on_context(
    event: pixiDotJsLib.pixiDotJsLibStrings.context,
    fn: js.Function1[/* gl */ stdLib.WebGLRenderingContext, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_context(
    event: pixiDotJsLib.pixiDotJsLibStrings.context,
    fn: js.Function1[/* gl */ stdLib.WebGLRenderingContext, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("on")
  def on_postrender(event: pixiDotJsLib.pixiDotJsLibStrings.postrender, fn: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_postrender(event: pixiDotJsLib.pixiDotJsLibStrings.postrender, fn: js.Function0[scala.Unit], context: js.Any): this.type = js.native
  @JSName("on")
  def on_prerender(event: pixiDotJsLib.pixiDotJsLibStrings.prerender, fn: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_prerender(event: pixiDotJsLib.pixiDotJsLibStrings.prerender, fn: js.Function0[scala.Unit], context: js.Any): this.type = js.native
  @JSName("once")
  def once_context(
    event: pixiDotJsLib.pixiDotJsLibStrings.context,
    fn: js.Function1[/* gl */ stdLib.WebGLRenderingContext, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_context(
    event: pixiDotJsLib.pixiDotJsLibStrings.context,
    fn: js.Function1[/* gl */ stdLib.WebGLRenderingContext, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("once")
  def once_postrender(event: pixiDotJsLib.pixiDotJsLibStrings.postrender, fn: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_postrender(event: pixiDotJsLib.pixiDotJsLibStrings.postrender, fn: js.Function0[scala.Unit], context: js.Any): this.type = js.native
  @JSName("once")
  def once_prerender(event: pixiDotJsLib.pixiDotJsLibStrings.prerender, fn: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_prerender(event: pixiDotJsLib.pixiDotJsLibStrings.prerender, fn: js.Function0[scala.Unit], context: js.Any): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_context(event: pixiDotJsLib.pixiDotJsLibStrings.context): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_postrender(event: pixiDotJsLib.pixiDotJsLibStrings.postrender): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_prerender(event: pixiDotJsLib.pixiDotJsLibStrings.prerender): this.type = js.native
  @JSName("removeListener")
  def removeListener_context(event: pixiDotJsLib.pixiDotJsLibStrings.context): this.type = js.native
  @JSName("removeListener")
  def removeListener_context(
    event: pixiDotJsLib.pixiDotJsLibStrings.context,
    fn: js.Function1[/* gl */ stdLib.WebGLRenderingContext, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_context(
    event: pixiDotJsLib.pixiDotJsLibStrings.context,
    fn: js.Function1[/* gl */ stdLib.WebGLRenderingContext, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_postrender(event: pixiDotJsLib.pixiDotJsLibStrings.postrender): this.type = js.native
  @JSName("removeListener")
  def removeListener_postrender(event: pixiDotJsLib.pixiDotJsLibStrings.postrender, fn: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_postrender(event: pixiDotJsLib.pixiDotJsLibStrings.postrender, fn: js.Function0[scala.Unit], context: js.Any): this.type = js.native
  @JSName("removeListener")
  def removeListener_prerender(event: pixiDotJsLib.pixiDotJsLibStrings.prerender): this.type = js.native
  @JSName("removeListener")
  def removeListener_prerender(event: pixiDotJsLib.pixiDotJsLibStrings.prerender, fn: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_prerender(event: pixiDotJsLib.pixiDotJsLibStrings.prerender, fn: js.Function0[scala.Unit], context: js.Any): this.type = js.native
  def render(displayObject: DisplayObject): scala.Unit = js.native
  def render(displayObject: DisplayObject, renderTexture: RenderTexture): scala.Unit = js.native
  def render(displayObject: DisplayObject, renderTexture: RenderTexture, clear: scala.Boolean): scala.Unit = js.native
  def render(
    displayObject: DisplayObject,
    renderTexture: RenderTexture,
    clear: scala.Boolean,
    transform: Matrix
  ): scala.Unit = js.native
  def render(
    displayObject: DisplayObject,
    renderTexture: RenderTexture,
    clear: scala.Boolean,
    transform: Matrix,
    skipUpdateTransform: scala.Boolean
  ): scala.Unit = js.native
  def reset(): WebGLRenderer = js.native
  def setBlendMode(blendMode: scala.Double): scala.Unit = js.native
  def setObjectRenderer(objectRenderer: ObjectRenderer): scala.Unit = js.native
  def setTransform(matrix: Matrix): scala.Unit = js.native
  def unbindTexture(texture: BaseTexture): js.UndefOr[WebGLRenderer] = js.native
  def unbindTexture(texture: Texture): js.UndefOr[WebGLRenderer] = js.native
}

/* static members */
@JSGlobal("PIXI.WebGLRenderer")
@js.native
object WebGLRenderer extends js.Object {
  //tslint:disable-next-line:ban-types forbidden-types
  // plugintarget mixin start
  var __plugins: org.scalablytyped.runtime.StringDictionary[pixiDotJsLib.Anon_RendererAny] = js.native
  def registerPlugin(pluginName: java.lang.String, ctor: pixiDotJsLib.Anon_RendererAny): scala.Unit = js.native
}

