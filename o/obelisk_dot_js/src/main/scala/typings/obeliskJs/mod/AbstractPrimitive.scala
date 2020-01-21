package typings.obeliskJs.mod

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obelisk.js", "AbstractPrimitive")
@js.native
class AbstractPrimitive () extends js.Object {
  var bitmapData: BitmapData = js.native
  var border: Boolean = js.native
  var canvas: HTMLCanvasElement = js.native
  var color: AbstractColor = js.native
  var dimension: AbstractDimension = js.native
  var h: Double = js.native
  var matrix: Matrix = js.native
  var useDefaultCanvas: Boolean = js.native
  var w: Double = js.native
}

