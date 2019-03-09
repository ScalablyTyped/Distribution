package typings
package offscreencanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://html.spec.whatwg.org/multipage/canvas.html#the-offscreencanvas-interface
@js.native
trait OffscreenCanvas
  extends stdLib.EventTarget {
  var height: scala.Double = js.native
  var width: scala.Double = js.native
  def convertToBlob(): js.Promise[stdLib.Blob] = js.native
  def convertToBlob(options: Anon_Quality): js.Promise[stdLib.Blob] = js.native
  def getContext(contextId: java.lang.String): OffscreenCanvasRenderingContext2D | stdLib.WebGLRenderingContext | scala.Null = js.native
  def getContext(contextId: java.lang.String, contextAttributes: js.Object): OffscreenCanvasRenderingContext2D | stdLib.WebGLRenderingContext | scala.Null = js.native
  @JSName("getContext")
  def getContext_2d(contextId: offscreencanvasLib.offscreencanvasLibStrings.`2d`): OffscreenCanvasRenderingContext2D | scala.Null = js.native
  @JSName("getContext")
  def getContext_2d(
    contextId: offscreencanvasLib.offscreencanvasLibStrings.`2d`,
    contextAttributes: stdLib.CanvasRenderingContext2DSettings
  ): OffscreenCanvasRenderingContext2D | scala.Null = js.native
  @JSName("getContext")
  def getContext_webgl(contextId: offscreencanvasLib.offscreencanvasLibStrings.webgl): stdLib.WebGLRenderingContext | scala.Null = js.native
  @JSName("getContext")
  def getContext_webgl(
    contextId: offscreencanvasLib.offscreencanvasLibStrings.webgl,
    contextAttributes: stdLib.WebGLContextAttributes
  ): stdLib.WebGLRenderingContext | scala.Null = js.native
  def transferToImageBitmap(): stdLib.ImageBitmap = js.native
}

@JSGlobal("OffscreenCanvas")
@js.native
object OffscreenCanvas
  extends org.scalablytyped.runtime.Instantiable2[/* width */ scala.Double, /* height */ scala.Double, OffscreenCanvas]

