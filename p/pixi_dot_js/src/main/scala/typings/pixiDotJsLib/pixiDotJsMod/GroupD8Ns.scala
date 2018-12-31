package typings
package pixiDotJsLib.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// math
@JSImport("pixi.js", "GroupD8")
@js.native
object GroupD8Ns extends js.Object {
  val E: scala.Double = js.native
  val MIRROR_HORIZONTAL: scala.Double = js.native
  val MIRROR_VERTICAL: scala.Double = js.native
  val N: scala.Double = js.native
  val NE: scala.Double = js.native
  val NW: scala.Double = js.native
  val S: scala.Double = js.native
  val SE: scala.Double = js.native
  val SW: scala.Double = js.native
  val W: scala.Double = js.native
  def add(rotationSecond: scala.Double, rotationFirst: scala.Double): scala.Double = js.native
  def byDirection(dx: scala.Double, dy: scala.Double): scala.Double = js.native
  def inv(rotation: scala.Double): scala.Double = js.native
  /**
    * @name PIXI.GroupD8.isSwapWidthHeight
    * @see PIXI.GroupD8.isVertical
    * @deprecated since version 4.6.0
    */
  def isSwapWidthHeight(rotation: scala.Double): scala.Boolean = js.native
  def isVertical(rotation: scala.Double): scala.Boolean = js.native
  def matrixAppendRotationInv(matrix: pixiDotJsLib.PIXINs.Matrix, rotation: scala.Double, tx: scala.Double, ty: scala.Double): scala.Unit = js.native
  def rotate180(rotation: scala.Double): scala.Double = js.native
  def sub(rotationSecond: scala.Double, rotationFirst: scala.Double): scala.Double = js.native
  def uX(ind: scala.Double): scala.Double = js.native
  def uY(ind: scala.Double): scala.Double = js.native
  def vX(ind: scala.Double): scala.Double = js.native
  def vY(ind: scala.Double): scala.Double = js.native
}

