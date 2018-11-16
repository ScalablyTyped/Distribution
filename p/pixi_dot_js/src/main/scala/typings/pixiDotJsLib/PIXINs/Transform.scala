package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Transform")
@js.native
class Transform () extends TransformBase {
  var _cr: js.UndefOr[scala.Double] = js.native
  var _cx: js.UndefOr[scala.Double] = js.native
  var _cy: js.UndefOr[scala.Double] = js.native
  var _rotation: scala.Double = js.native
  var _sr: js.UndefOr[scala.Double] = js.native
  var _sx: js.UndefOr[scala.Double] = js.native
  var _sy: js.UndefOr[scala.Double] = js.native
  var pivot: Point = js.native
  var position: Point = js.native
  var rotation: scala.Double = js.native
  var scale: Point = js.native
  var skew: ObservablePoint = js.native
  def setFromMatrix(matrix: Matrix): scala.Unit = js.native
  def updateSkew(): scala.Unit = js.native
}

