package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.CanvasRenderer")
@js.native
// plugintarget mixin end
class CanvasRenderer () extends SystemRenderer {
  def this(options: RendererOptions) = this()
  def this(screenWidth: scala.Double) = this()
  def this(screenWidth: scala.Double, screenHeight: scala.Double) = this()
  def this(screenWidth: scala.Double, screenHeight: scala.Double, options: RendererOptions) = this()
  var _activeBlendMode: scala.Double = js.native
  var context: stdLib.CanvasRenderingContext2D | scala.Null = js.native
  var extract: pixiDotJsLib.PIXINs.extractNs.CanvasExtract = js.native
  var maskManager: CanvasMaskManager = js.native
  var plugins: js.Any = js.native
  var refresh: scala.Boolean = js.native
  var rootContext: stdLib.CanvasRenderingContext2D = js.native
  var rootResolution: js.UndefOr[scala.Double] = js.native
  var smoothProperty: java.lang.String = js.native
  @JSName("addListener")
  def addListener_postrender(event: pixiDotJsLib.pixiDotJsLibStrings.postrender, fn: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_postrender(event: pixiDotJsLib.pixiDotJsLibStrings.postrender, fn: js.Function0[scala.Unit], context: js.Any): this.type = js.native
  @JSName("addListener")
  def addListener_prerender(event: pixiDotJsLib.pixiDotJsLibStrings.prerender, fn: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_prerender(event: pixiDotJsLib.pixiDotJsLibStrings.prerender, fn: js.Function0[scala.Unit], context: js.Any): this.type = js.native
  def clear(): scala.Unit = js.native
  def clear(clearColor: java.lang.String): scala.Unit = js.native
  def destroyPlugins(): scala.Unit = js.native
  def initPlugins(): scala.Unit = js.native
  def invalidateBlendMode(): scala.Unit = js.native
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
  def on_postrender(event: pixiDotJsLib.pixiDotJsLibStrings.postrender, fn: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_postrender(event: pixiDotJsLib.pixiDotJsLibStrings.postrender, fn: js.Function0[scala.Unit], context: js.Any): this.type = js.native
  @JSName("on")
  def on_prerender(event: pixiDotJsLib.pixiDotJsLibStrings.prerender, fn: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_prerender(event: pixiDotJsLib.pixiDotJsLibStrings.prerender, fn: js.Function0[scala.Unit], context: js.Any): this.type = js.native
  @JSName("once")
  def once_postrender(event: pixiDotJsLib.pixiDotJsLibStrings.postrender, fn: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_postrender(event: pixiDotJsLib.pixiDotJsLibStrings.postrender, fn: js.Function0[scala.Unit], context: js.Any): this.type = js.native
  @JSName("once")
  def once_prerender(event: pixiDotJsLib.pixiDotJsLibStrings.prerender, fn: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_prerender(event: pixiDotJsLib.pixiDotJsLibStrings.prerender, fn: js.Function0[scala.Unit], context: js.Any): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_postrender(event: pixiDotJsLib.pixiDotJsLibStrings.postrender): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_prerender(event: pixiDotJsLib.pixiDotJsLibStrings.prerender): this.type = js.native
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
  def setBlendMode(blendMode: scala.Double): scala.Unit = js.native
}

@JSGlobal("PIXI.CanvasRenderer")
@js.native
object CanvasRenderer extends js.Object {
  // plugintarget mixin start
  var __plugins: org.scalablytyped.runtime.StringDictionary[pixiDotJsLib.Anon_Renderer] = js.native
  def registerPlugin(pluginName: java.lang.String, ctor: pixiDotJsLib.Anon_Renderer): scala.Unit = js.native
}

