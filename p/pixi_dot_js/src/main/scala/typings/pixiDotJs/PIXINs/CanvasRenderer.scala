package typings.pixiDotJs.PIXINs

import org.scalablytyped.runtime.StringDictionary
import typings.pixiDotJs.Anon_Renderer
import typings.pixiDotJs.PIXINs.extractNs.CanvasExtract
import typings.pixiDotJs.pixiDotJsStrings.postrender
import typings.pixiDotJs.pixiDotJsStrings.prerender
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.CanvasRenderer")
@js.native
// plugintarget mixin end
class CanvasRenderer () extends SystemRenderer {
  def this(options: RendererOptions) = this()
  def this(screenWidth: Double) = this()
  def this(screenWidth: Double, screenHeight: Double) = this()
  def this(screenWidth: Double, screenHeight: Double, options: RendererOptions) = this()
  var _activeBlendMode: Double = js.native
  var context: CanvasRenderingContext2D | Null = js.native
  var extract: CanvasExtract = js.native
  var maskManager: CanvasMaskManager = js.native
  var plugins: js.Any = js.native
  var refresh: Boolean = js.native
  var rootContext: CanvasRenderingContext2D = js.native
  var rootResolution: js.UndefOr[Double] = js.native
  var smoothProperty: String = js.native
  @JSName("addListener")
  def addListener_postrender(event: postrender, fn: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_postrender(event: postrender, fn: js.Function0[Unit], context: js.Any): this.type = js.native
  @JSName("addListener")
  def addListener_prerender(event: prerender, fn: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_prerender(event: prerender, fn: js.Function0[Unit], context: js.Any): this.type = js.native
  def clear(): Unit = js.native
  def clear(clearColor: String): Unit = js.native
  def destroyPlugins(): Unit = js.native
  def initPlugins(): Unit = js.native
  def invalidateBlendMode(): Unit = js.native
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
  def on_postrender(event: postrender, fn: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_postrender(event: postrender, fn: js.Function0[Unit], context: js.Any): this.type = js.native
  @JSName("on")
  def on_prerender(event: prerender, fn: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_prerender(event: prerender, fn: js.Function0[Unit], context: js.Any): this.type = js.native
  @JSName("once")
  def once_postrender(event: postrender, fn: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_postrender(event: postrender, fn: js.Function0[Unit], context: js.Any): this.type = js.native
  @JSName("once")
  def once_prerender(event: prerender, fn: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_prerender(event: prerender, fn: js.Function0[Unit], context: js.Any): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_postrender(event: postrender): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_prerender(event: prerender): this.type = js.native
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
  def setBlendMode(blendMode: Double): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.CanvasRenderer")
@js.native
object CanvasRenderer extends js.Object {
  // plugintarget mixin start
  var __plugins: StringDictionary[Anon_Renderer] = js.native
  def registerPlugin(pluginName: String, ctor: Anon_Renderer): Unit = js.native
}

