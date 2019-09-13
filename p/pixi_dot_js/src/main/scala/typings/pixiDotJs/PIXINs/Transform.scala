package typings.pixiDotJs.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generic class to deal with traditional 2D matrix transforms
  * local transformation is calculated from position,scale,skew and rotation
  */
@JSGlobal("PIXI.Transform")
@js.native
class Transform () extends TransformBase {
  var _cr: js.UndefOr[Double] = js.native
  var _cx: js.UndefOr[Double] = js.native
  var _cy: js.UndefOr[Double] = js.native
  var _rotation: Double = js.native
  var _sr: js.UndefOr[Double] = js.native
  var _sx: js.UndefOr[Double] = js.native
  var _sy: js.UndefOr[Double] = js.native
  var pivot: Point = js.native
  var position: Point = js.native
  var rotation: Double = js.native
  var scale: Point = js.native
  var skew: ObservablePoint = js.native
  /**
    * Decomposes a matrix and sets the transforms properties based on it.
    *
    * @param matrix - The matrix to decompose
    */
  def setFromMatrix(matrix: Matrix): Unit = js.native
  def updateSkew(): Unit = js.native
}

