package typings.pixiDotJs.PIXI

import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Renders the graphics object.
  */
@JSGlobal("PIXI.GraphicsRenderer")
@js.native
class GraphicsRenderer protected () extends ObjectRenderer {
  def this(renderer: CanvasRenderer) = this()
  var CONTEXT_UID: Double = js.native
  var gl: WebGLRenderingContext = js.native
  var graphicsDataPool: js.Array[GraphicsData] = js.native
  var primitiveShader: PrimitiveShader = js.native
  def getWebGLData(webGL: WebGLRenderingContext, `type`: Double, nativeLines: Double): WebGLGraphicsData = js.native
  /**
    * Renders a graphics object.
    *
    * @param graphics - The graphics object to render.
    */
  def render(graphics: Graphics): Unit = js.native
  /* protected */ def updateGraphics(graphics: Graphics): Unit = js.native
}

