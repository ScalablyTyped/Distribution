package typings.pixiDotJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.StencilManager")
@js.native
class StencilManager protected () extends WebGLManager {
  def this(renderer: WebGLRenderer) = this()
  var stencilMaskStack: js.Array[Graphics] = js.native
  /* protected */ def _getBitwiseMask(): Double = js.native
  /* protected */ def _useCurrent(): Unit = js.native
  def popStencil(): Unit = js.native
  def pushStencil(graphics: Graphics): Unit = js.native
  def setMaskStack(stencilMasStack: js.Array[Graphics]): Unit = js.native
}

