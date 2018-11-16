package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.StencilManager")
@js.native
class StencilManager protected () extends WebGLManager {
  def this(renderer: WebGLRenderer) = this()
  var stencilMaskStack: js.Array[Graphics] = js.native
  /* protected */ def _getBitwiseMask(): scala.Double = js.native
  /* protected */ def _useCurrent(): scala.Unit = js.native
  def popStencil(): scala.Unit = js.native
  def pushStencil(graphics: Graphics): scala.Unit = js.native
  def setMaskStack(stencilMasStack: js.Array[Graphics]): scala.Unit = js.native
}

