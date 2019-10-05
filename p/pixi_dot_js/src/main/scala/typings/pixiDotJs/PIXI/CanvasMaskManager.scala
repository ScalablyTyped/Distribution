package typings.pixiDotJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of functions used to handle masking.
  */
@JSGlobal("PIXI.CanvasMaskManager")
@js.native
class CanvasMaskManager protected () extends js.Object {
  def this(renderer: CanvasRenderer) = this()
  def destroy(): Unit = js.native
  def popMask(renderer: CanvasRenderer): Unit = js.native
  def popMask(renderer: WebGLRenderer): Unit = js.native
  def pushMask(maskData: js.Any): Unit = js.native
  /* protected */ def renderGraphicsShape(graphics: Graphics): Unit = js.native
}

