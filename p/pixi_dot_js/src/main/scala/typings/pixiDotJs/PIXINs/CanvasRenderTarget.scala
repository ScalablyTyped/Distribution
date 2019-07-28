package typings.pixiDotJs.PIXINs

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.CanvasRenderTarget")
@js.native
class CanvasRenderTarget protected () extends js.Object {
  def this(width: Double, height: Double, resolution: Double) = this()
  var canvas: HTMLCanvasElement = js.native
  var context: CanvasRenderingContext2D = js.native
  var height: Double = js.native
  var resolution: Double = js.native
  var width: Double = js.native
  def clear(): Unit = js.native
  def destroy(): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
}

