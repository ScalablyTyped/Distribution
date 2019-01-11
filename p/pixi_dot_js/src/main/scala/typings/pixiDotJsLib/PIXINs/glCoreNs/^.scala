package typings
package pixiDotJsLib.PIXINs.glCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.glCore")
@js.native
object ^ extends js.Object {
  def createContext(view: stdLib.HTMLCanvasElement): stdLib.WebGLRenderingContext = js.native
  def createContext(view: stdLib.HTMLCanvasElement, options: pixiDotJsLib.PIXINs.glCoreNs.ContextOptions): stdLib.WebGLRenderingContext = js.native
  def setVertexAttribArrays(gl: stdLib.WebGLRenderingContext, attribs: js.Array[pixiDotJsLib.PIXINs.glCoreNs.Attrib]): js.UndefOr[stdLib.WebGLRenderingContext] = js.native
  def setVertexAttribArrays(
    gl: stdLib.WebGLRenderingContext,
    attribs: js.Array[pixiDotJsLib.PIXINs.glCoreNs.Attrib],
    state: pixiDotJsLib.PIXINs.WebGLState
  ): js.UndefOr[stdLib.WebGLRenderingContext] = js.native
}

