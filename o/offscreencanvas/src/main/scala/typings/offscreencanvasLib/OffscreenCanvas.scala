package typings
package offscreencanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://html.spec.whatwg.org/multipage/canvas.html#the-offscreencanvas-interface
// Possible contextId values are defined by the enum OffscreenRenderingContextId { "2d", "bitmaprenderer", "webgl", "webgl2" }
// See also description: https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext
@js.native
trait OffscreenCanvas
  extends stdLib.EventTarget {
  var height: scala.Double = js.native
  var width: scala.Double = js.native
  def convertToBlob(): js.Promise[stdLib.Blob] = js.native
  def convertToBlob(options: Anon_Quality): js.Promise[stdLib.Blob] = js.native
  @JSName("getContext")
  def getContext_2d(contextId: offscreencanvasLib.offscreencanvasLibStrings.`2d`): OffscreenCanvasRenderingContext2D | scala.Null = js.native
  @JSName("getContext")
  def getContext_2d(
    contextId: offscreencanvasLib.offscreencanvasLibStrings.`2d`,
    contextAttributes: stdLib.CanvasRenderingContext2DSettings
  ): OffscreenCanvasRenderingContext2D | scala.Null = js.native
  @JSName("getContext")
  def getContext_bitmaprenderer(contextId: offscreencanvasLib.offscreencanvasLibStrings.bitmaprenderer): stdLib.ImageBitmapRenderingContext | scala.Null = js.native
  @JSName("getContext")
  def getContext_bitmaprenderer(
    contextId: offscreencanvasLib.offscreencanvasLibStrings.bitmaprenderer,
    contextAttributes: stdLib.WebGLContextAttributes
  ): stdLib.ImageBitmapRenderingContext | scala.Null = js.native
  @JSName("getContext")
  def getContext_webgl(contextId: offscreencanvasLib.offscreencanvasLibStrings.webgl): stdLib.WebGLRenderingContext | scala.Null = js.native
  @JSName("getContext")
  def getContext_webgl(
    contextId: offscreencanvasLib.offscreencanvasLibStrings.webgl,
    contextAttributes: stdLib.WebGLContextAttributes
  ): stdLib.WebGLRenderingContext | scala.Null = js.native
  @JSName("getContext")
  def getContext_webgl2(contextId: offscreencanvasLib.offscreencanvasLibStrings.webgl2): webgl2Lib.WebGL2RenderingContext | scala.Null = js.native
  @JSName("getContext")
  def getContext_webgl2(
    contextId: offscreencanvasLib.offscreencanvasLibStrings.webgl2,
    contextAttributes: stdLib.WebGLContextAttributes
  ): webgl2Lib.WebGL2RenderingContext | scala.Null = js.native
  def transferToImageBitmap(): stdLib.ImageBitmap = js.native
}

@JSGlobal("OffscreenCanvas")
@js.native
class OffscreenCanvasCls protected () extends OffscreenCanvas {
  def this(width: scala.Double, height: scala.Double) = this()
}

@JSGlobal("OffscreenCanvas")
@js.native
object OffscreenCanvas
  extends org.scalablytyped.runtime.Instantiable2[/* width */ scala.Double, /* height */ scala.Double, OffscreenCanvas]

