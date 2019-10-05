package typings.pixiDotJs.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// math
/**
  * Implements Dihedral Group D_8, see [group D4]{@link http://mathworld.wolfram.com/DihedralGroupD4.html},
  * D8 is the same but with diagonals. Used for texture rotations.
  *
  * Vector xX(i), xY(i) is U-axis of sprite with rotation i
  * Vector yY(i), yY(i) is V-axis of sprite with rotation i
  * Rotations: 0 grad (0), 90 grad (2), 180 grad (4), 270 grad (6)
  * Mirrors: vertical (8), main diagonal (10), horizontal (12), reverse diagonal (14)
  * This is the small part of gameofbombs.com portal system. It works.
  *
  * @author Ivan @ivanpopelyshev
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "GroupD8")
@js.native
object GroupD8 extends js.Object {
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
  /**
    * @param dx - TODO
    * @param dy - TODO
    *
    * @return TODO
    */
  def byDirection(dx: Double, dy: Double): Double = js.native
  def inv(rotation: Double): Double = js.native
  /**
    * @name PIXI.GroupD8.isSwapWidthHeight
    * @see PIXI.GroupD8.isVertical
    * @param rotation - The number to check.
    * @returns Whether or not the direction is vertical
    * @deprecated since version 4.6.0
    */
  def isSwapWidthHeight(rotation: Double): Boolean = js.native
  /**
    * Direction of main vector can be horizontal, vertical or diagonal.
    * Some objects work with vertical directions different.
    *
    * @param rotation - The number to check.
    * @returns Whether or not the direction is vertical
    */
  def isVertical(rotation: Double): Boolean = js.native
  /**
    * Helps sprite to compensate texture packer rotation.
    *
    * @param matrix - sprite world matrix
    * @param rotation - The rotation factor to use.
    * @param tx - sprite anchoring
    * @param ty - sprite anchoring
    */
  def matrixAppendRotationInv(matrix: typings.pixiDotJs.PIXI.Matrix, rotation: Double, tx: Double, ty: Double): Unit = js.native
  /**
    * Adds 180 degrees to rotation. Commutative operation.
    *
    * @param rotation - The number to rotate.
    * @returns rotated number
    */
  def rotate180(rotation: Double): Double = js.native
  def sub(rotationSecond: Double, rotationFirst: Double): Double = js.native
  def uX(ind: Double): Double = js.native
  def uY(ind: Double): Double = js.native
  def vX(ind: Double): Double = js.native
  def vY(ind: Double): Double = js.native
}

