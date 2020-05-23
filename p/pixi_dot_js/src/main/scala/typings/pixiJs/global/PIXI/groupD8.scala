package typings.pixiJs.global.PIXI

import typings.pixiJs.PIXI.GD8Symmetry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implements the dihedral group D8, which is similar to
  * [group D4]{@link http://mathworld.wolfram.com/DihedralGroupD4.html};
  * D8 is the same but with diagonals, and it is used for texture
  * rotations.
  *
  * The directions the U- and V- axes after rotation
  * of an angle of `a: GD8Constant` are the vectors `(uX(a), uY(a))`
  * and `(vX(a), vY(a))`. These aren't necessarily unit vectors.
  *
  * **Origin:**<br>
  *  This is the small part of gameofbombs.com portal system. It works.
  *
  * @see PIXI.groupD8.E
  * @see PIXI.groupD8.SE
  * @see PIXI.groupD8.S
  * @see PIXI.groupD8.SW
  * @see PIXI.groupD8.W
  * @see PIXI.groupD8.NW
  * @see PIXI.groupD8.N
  * @see PIXI.groupD8.NE
  * @author Ivan @ivanpopelyshev
  * @namespace PIXI.groupD8
  * @memberof PIXI
  */
@JSGlobal("PIXI.groupD8")
@js.native
object groupD8 extends js.Object {
  /**
    * | Rotation | Direction |
    * |----------|-----------|
    * | 0°       | East      |
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  var E: GD8Symmetry = js.native
  /**
    * Reflection about the main diagonal.
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  var MAIN_DIAGONAL: GD8Symmetry = js.native
  /**
    * Reflection about X-axis.
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  var MIRROR_HORIZONTAL: GD8Symmetry = js.native
  /**
    * Reflection about Y-axis.
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  var MIRROR_VERTICAL: GD8Symmetry = js.native
  /**
    * | Rotation    | Direction    |
    * |-------------|--------------|
    * | -90°/270°↻  | North        |
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  var N: GD8Symmetry = js.native
  /**
    * | Rotation    | Direction    |
    * |-------------|--------------|
    * | -45°/315°↻  | Northeast    |
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  var NE: GD8Symmetry = js.native
  /**
    * | Rotation    | Direction    |
    * |-------------|--------------|
    * | -135°/225°↻ | Northwest    |
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  var NW: GD8Symmetry = js.native
  /**
    * Reflection about reverse diagonal.
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  var REVERSE_DIAGONAL: GD8Symmetry = js.native
  /**
    * | Rotation | Direction |
    * |----------|-----------|
    * | 90°↻     | South     |
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  var S: GD8Symmetry = js.native
  /**
    * | Rotation | Direction |
    * |----------|-----------|
    * | 45°↻     | Southeast |
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  var SE: GD8Symmetry = js.native
  /**
    * | Rotation | Direction |
    * |----------|-----------|
    * | 135°↻    | Southwest |
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  var SW: GD8Symmetry = js.native
  /**
    * | Rotation | Direction |
    * |----------|-----------|
    * | 180°     | West      |
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  var W: GD8Symmetry = js.native
  /**
    * Composes the two D8 operations.
    *
    * Taking `^` as reflection:
    *
    * |       | E=0 | S=2 | W=4 | N=6 | E^=8 | S^=10 | W^=12 | N^=14 |
    * |-------|-----|-----|-----|-----|------|-------|-------|-------|
    * | E=0   | E   | S   | W   | N   | E^   | S^    | W^    | N^    |
    * | S=2   | S   | W   | N   | E   | S^   | W^    | N^    | E^    |
    * | W=4   | W   | N   | E   | S   | W^   | N^    | E^    | S^    |
    * | N=6   | N   | E   | S   | W   | N^   | E^    | S^    | W^    |
    * | E^=8  | E^  | N^  | W^  | S^  | E    | N     | W     | S     |
    * | S^=10 | S^  | E^  | N^  | W^  | S    | E     | N     | W     |
    * | W^=12 | W^  | S^  | E^  | N^  | W    | S     | E     | N     |
    * | N^=14 | N^  | W^  | S^  | E^  | N    | W     | S     | E     |
    *
    * [This is a Cayley table]{@link https://en.wikipedia.org/wiki/Cayley_table}
    * @memberof PIXI.groupD8
    * @param {PIXI.GD8Symmetry} rotationSecond - Second operation, which
    *   is the row in the above cayley table.
    * @param {PIXI.GD8Symmetry} rotationFirst - First operation, which
    *   is the column in the above cayley table.
    * @return {PIXI.GD8Symmetry} Composed operation
    */
  def add(rotationSecond: GD8Symmetry, rotationFirst: GD8Symmetry): GD8Symmetry = js.native
  /**
    * Approximates the vector `V(dx,dy)` into one of the
    * eight directions provided by `groupD8`.
    *
    * @memberof PIXI.groupD8
    * @param {number} dx - X-component of the vector
    * @param {number} dy - Y-component of the vector
    * @return {PIXI.GD8Symmetry} Approximation of the vector into
    *  one of the eight symmetries.
    */
  def byDirection(dx: Double, dy: Double): GD8Symmetry = js.native
  /**
    * @memberof PIXI.groupD8
    * @param {PIXI.GD8Symmetry} rotation - symmetry whose opposite
    *   is needed. Only rotations have opposite symmetries while
    *   reflections don't.
    * @return {PIXI.GD8Symmetry} The opposite symmetry of `rotation`
    */
  def inv(rotation: GD8Symmetry): GD8Symmetry = js.native
  /**
    * Checks if the rotation angle is vertical, i.e. south
    * or north. It doesn't work for reflections.
    *
    * @memberof PIXI.groupD8
    * @param {PIXI.GD8Symmetry} rotation - The number to check.
    * @returns {boolean} Whether or not the direction is vertical
    */
  def isVertical(rotation: GD8Symmetry): Boolean = js.native
  /**
    * Helps sprite to compensate texture packer rotation.
    *
    * @memberof PIXI.groupD8
    * @param {PIXI.Matrix} matrix - sprite world matrix
    * @param {PIXI.GD8Symmetry} rotation - The rotation factor to use.
    * @param {number} tx - sprite anchoring
    * @param {number} ty - sprite anchoring
    */
  def matrixAppendRotationInv(matrix: typings.pixiJs.PIXI.Matrix, rotation: GD8Symmetry, tx: Double, ty: Double): Unit = js.native
  /**
    * Adds 180 degrees to rotation, which is a commutative
    * operation.
    *
    * @memberof PIXI.groupD8
    * @param {number} rotation - The number to rotate.
    * @returns {number} Rotated number
    */
  def rotate180(rotation: Double): Double = js.native
  /**
    * Reverse of `add`.
    *
    * @memberof PIXI.groupD8
    * @param {PIXI.GD8Symmetry} rotationSecond - Second operation
    * @param {PIXI.GD8Symmetry} rotationFirst - First operation
    * @return {PIXI.GD8Symmetry} Result
    */
  def sub(rotationSecond: GD8Symmetry, rotationFirst: GD8Symmetry): GD8Symmetry = js.native
  /**
    * @memberof PIXI.groupD8
    * @param {PIXI.GD8Symmetry} ind - sprite rotation angle.
    * @return {PIXI.GD8Symmetry} The X-component of the U-axis
    *    after rotating the axes.
    */
  def uX(ind: GD8Symmetry): GD8Symmetry = js.native
  /**
    * @memberof PIXI.groupD8
    * @param {PIXI.GD8Symmetry} ind - sprite rotation angle.
    * @return {PIXI.GD8Symmetry} The Y-component of the U-axis
    *    after rotating the axes.
    */
  def uY(ind: GD8Symmetry): GD8Symmetry = js.native
  /**
    * @memberof PIXI.groupD8
    * @param {PIXI.GD8Symmetry} ind - sprite rotation angle.
    * @return {PIXI.GD8Symmetry} The X-component of the V-axis
    *    after rotating the axes.
    */
  def vX(ind: GD8Symmetry): GD8Symmetry = js.native
  /**
    * @memberof PIXI.groupD8
    * @param {PIXI.GD8Symmetry} ind - sprite rotation angle.
    * @return {PIXI.GD8Symmetry} The Y-component of the V-axis
    *    after rotating the axes.
    */
  def vY(ind: GD8Symmetry): GD8Symmetry = js.native
}

