package typings.pixiDotJs.PIXI

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.CanvasGraphicsRenderer")
@js.native
class CanvasGraphicsRenderer protected () extends js.Object {
  def this(renderer: SystemRenderer) = this()
  def destroy(): Unit = js.native
  def render(graphics: Graphics): Unit = js.native
  /* protected */ def renderPolygon(points: js.Array[Point], close: Boolean, context: CanvasRenderingContext2D): Unit = js.native
  /* protected */ def updateGraphicsTint(graphics: Graphics): Unit = js.native
}

