package typings.pixiDotJs.PIXI

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.BatchBuffer")
@js.native
class BatchBuffer () extends js.Object {
  var float32View: js.Array[Double] = js.native
  var uint32View: js.Array[Double] = js.native
  var vertices: ArrayBuffer = js.native
  def destroy(): Unit = js.native
}

