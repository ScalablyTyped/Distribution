package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.CanvasGraphicsRenderer")
@js.native
class CanvasGraphicsRenderer protected () extends js.Object {
  def this(renderer: SystemRenderer) = this()
  def destroy(): scala.Unit = js.native
  def render(graphics: Graphics): scala.Unit = js.native
  /* protected */ def renderPolygon(points: js.Array[Point], close: scala.Boolean, context: stdLib.CanvasRenderingContext2D): scala.Unit = js.native
  /* protected */ def updateGraphicsTint(graphics: Graphics): scala.Unit = js.native
}

