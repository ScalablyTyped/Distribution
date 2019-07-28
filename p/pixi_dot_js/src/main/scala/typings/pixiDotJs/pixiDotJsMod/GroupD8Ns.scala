package typings.pixiDotJs.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// math
@JSImport("pixi.js", "GroupD8")
@js.native
object GroupD8Ns extends js.Object {
  val E: Double = js.native
  val MIRROR_HORIZONTAL: Double = js.native
  val MIRROR_VERTICAL: Double = js.native
  val N: Double = js.native
  val NE: Double = js.native
  val NW: Double = js.native
  val S: Double = js.native
  val SE: Double = js.native
  val SW: Double = js.native
  val W: Double = js.native
  def add(rotationSecond: Double, rotationFirst: Double): Double = js.native
  def byDirection(dx: Double, dy: Double): Double = js.native
  def inv(rotation: Double): Double = js.native
  /**
    * @name PIXI.GroupD8.isSwapWidthHeight
    * @see PIXI.GroupD8.isVertical
    * @deprecated since version 4.6.0
    */
  def isSwapWidthHeight(rotation: Double): Boolean = js.native
  def isVertical(rotation: Double): Boolean = js.native
  def matrixAppendRotationInv(matrix: typings.pixiDotJs.PIXINs.Matrix, rotation: Double, tx: Double, ty: Double): Unit = js.native
  def rotate180(rotation: Double): Double = js.native
  def sub(rotationSecond: Double, rotationFirst: Double): Double = js.native
  def uX(ind: Double): Double = js.native
  def uY(ind: Double): Double = js.native
  def vX(ind: Double): Double = js.native
  def vY(ind: Double): Double = js.native
}

