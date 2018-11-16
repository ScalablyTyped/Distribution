package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.GraphicsRenderer")
@js.native
class GraphicsRenderer protected () extends ObjectRenderer {
  def this(renderer: CanvasRenderer) = this()
  var CONTEXT_UID: scala.Double = js.native
  var gl: stdLib.WebGLRenderingContext = js.native
  var graphicsDataPool: js.Array[GraphicsData] = js.native
  var primitiveShader: PrimitiveShader = js.native
  def getWebGLData(webGL: stdLib.WebGLRenderingContext, `type`: scala.Double, nativeLines: scala.Double): WebGLGraphicsData = js.native
  def render(graphics: Graphics): scala.Unit = js.native
  /* protected */ def updateGraphics(graphics: Graphics): scala.Unit = js.native
}

