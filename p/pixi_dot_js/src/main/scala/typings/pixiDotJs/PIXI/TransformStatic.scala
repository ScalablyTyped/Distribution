package typings.pixiDotJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transform that takes care about its versions
  */
@JSGlobal("PIXI.TransformStatic")
@js.native
class TransformStatic () extends TransformBase {
  var _cr: js.UndefOr[Double] = js.native
  var _currentLocalID: Double = js.native
  var _cx: js.UndefOr[Double] = js.native
  var _cy: js.UndefOr[Double] = js.native
  var _localID: Double = js.native
  var _rotation: Double = js.native
  var _sr: js.UndefOr[Double] = js.native
  var _sx: js.UndefOr[Double] = js.native
  var _sy: js.UndefOr[Double] = js.native
  var pivot: ObservablePoint = js.native
  var position: ObservablePoint = js.native
  var rotation: Double = js.native
  var scale: ObservablePoint = js.native
  var skew: ObservablePoint = js.native
  /* protected */ def onChange(): Unit = js.native
  /**
    * Decomposes a matrix and sets the transforms properties based on it.
    *
    * @param matrix - The matrix to decompose
    */
  def setFromMatrix(matrix: Matrix): Unit = js.native
  def updateSkew(): Unit = js.native
}

