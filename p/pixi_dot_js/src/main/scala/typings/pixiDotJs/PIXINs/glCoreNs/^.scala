package typings.pixiDotJs.PIXINs.glCoreNs

import typings.pixiDotJs.PIXINs.WebGLState
import typings.std.HTMLCanvasElement
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.glCore")
@js.native
object ^ extends js.Object {
  def createContext(view: HTMLCanvasElement): WebGLRenderingContext = js.native
  def createContext(view: HTMLCanvasElement, options: ContextOptions): WebGLRenderingContext = js.native
  def setVertexAttribArrays(gl: WebGLRenderingContext, attribs: js.Array[Attrib]): js.UndefOr[WebGLRenderingContext] = js.native
  def setVertexAttribArrays(gl: WebGLRenderingContext, attribs: js.Array[Attrib], state: WebGLState): js.UndefOr[WebGLRenderingContext] = js.native
}

