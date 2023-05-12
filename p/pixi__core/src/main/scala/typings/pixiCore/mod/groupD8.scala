package typings.pixiCore.mod

import typings.pixiMath.libGroupD8Mod.GD8Symmetry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupD8 {
  
  @JSImport("@pixi/core", "groupD8")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * | Rotation | Direction |
    * |----------|-----------|
    * | 0°       | East      |
    * @readonly
    */
  @JSImport("@pixi/core", "groupD8.E")
  @js.native
  def E: Double = js.native
  inline def E_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("E")(x.asInstanceOf[js.Any])
  
  /**
    * Reflection about the main diagonal.
    * @readonly
    */
  @JSImport("@pixi/core", "groupD8.MAIN_DIAGONAL")
  @js.native
  def MAIN_DIAGONAL: Double = js.native
  inline def MAIN_DIAGONAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAIN_DIAGONAL")(x.asInstanceOf[js.Any])
  
  /**
    * Reflection about X-axis.
    * @readonly
    */
  @JSImport("@pixi/core", "groupD8.MIRROR_HORIZONTAL")
  @js.native
  def MIRROR_HORIZONTAL: Double = js.native
  inline def MIRROR_HORIZONTAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIRROR_HORIZONTAL")(x.asInstanceOf[js.Any])
  
  /**
    * Reflection about Y-axis.
    * @readonly
    */
  @JSImport("@pixi/core", "groupD8.MIRROR_VERTICAL")
  @js.native
  def MIRROR_VERTICAL: Double = js.native
  inline def MIRROR_VERTICAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIRROR_VERTICAL")(x.asInstanceOf[js.Any])
  
  /**
    * | Rotation    | Direction    |
    * |-------------|--------------|
    * | -90°/270°↻  | North        |
    * @readonly
    */
  @JSImport("@pixi/core", "groupD8.N")
  @js.native
  def N: Double = js.native
  
  /**
    * | Rotation    | Direction    |
    * |-------------|--------------|
    * | -45°/315°↻  | Northeast    |
    * @readonly
    */
  @JSImport("@pixi/core", "groupD8.NE")
  @js.native
  def NE: Double = js.native
  inline def NE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NE")(x.asInstanceOf[js.Any])
  
  /**
    * | Rotation    | Direction    |
    * |-------------|--------------|
    * | -135°/225°↻ | Northwest    |
    * @readonly
    */
  @JSImport("@pixi/core", "groupD8.NW")
  @js.native
  def NW: Double = js.native
  inline def NW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NW")(x.asInstanceOf[js.Any])
  
  inline def N_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("N")(x.asInstanceOf[js.Any])
  
  /**
    * Reflection about reverse diagonal.
    * @readonly
    */
  @JSImport("@pixi/core", "groupD8.REVERSE_DIAGONAL")
  @js.native
  def REVERSE_DIAGONAL: Double = js.native
  inline def REVERSE_DIAGONAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REVERSE_DIAGONAL")(x.asInstanceOf[js.Any])
  
  /**
    * | Rotation | Direction |
    * |----------|-----------|
    * | 90°↻     | South     |
    * @readonly
    */
  @JSImport("@pixi/core", "groupD8.S")
  @js.native
  def S: Double = js.native
  
  /**
    * | Rotation | Direction |
    * |----------|-----------|
    * | 45°↻     | Southeast |
    * @readonly
    */
  @JSImport("@pixi/core", "groupD8.SE")
  @js.native
  def SE: Double = js.native
  inline def SE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SE")(x.asInstanceOf[js.Any])
  
  /**
    * | Rotation | Direction |
    * |----------|-----------|
    * | 135°↻    | Southwest |
    * @readonly
    */
  @JSImport("@pixi/core", "groupD8.SW")
  @js.native
  def SW: Double = js.native
  inline def SW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SW")(x.asInstanceOf[js.Any])
  
  inline def S_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("S")(x.asInstanceOf[js.Any])
  
  /**
    * | Rotation | Direction |
    * |----------|-----------|
    * | 180°     | West      |
    * @readonly
    */
  @JSImport("@pixi/core", "groupD8.W")
  @js.native
  def W: Double = js.native
  inline def W_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("W")(x.asInstanceOf[js.Any])
  
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
    * @param {PIXI.GD8Symmetry} rotationSecond - Second operation, which
    *   is the row in the above cayley table.
    * @param {PIXI.GD8Symmetry} rotationFirst - First operation, which
    *   is the column in the above cayley table.
    * @returns {PIXI.GD8Symmetry} Composed operation
    */
  inline def add(rotationSecond: GD8Symmetry, rotationFirst: GD8Symmetry): GD8Symmetry = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(rotationSecond.asInstanceOf[js.Any], rotationFirst.asInstanceOf[js.Any])).asInstanceOf[GD8Symmetry]
  
  /**
    * Approximates the vector `V(dx,dy)` into one of the
    * eight directions provided by `groupD8`.
    * @param {number} dx - X-component of the vector
    * @param {number} dy - Y-component of the vector
    * @returns {PIXI.GD8Symmetry} Approximation of the vector into
    *  one of the eight symmetries.
    */
  inline def byDirection(dx: Double, dy: Double): GD8Symmetry = (^.asInstanceOf[js.Dynamic].applyDynamic("byDirection")(dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any])).asInstanceOf[GD8Symmetry]
  
  /**
    * @param {PIXI.GD8Symmetry} rotation - symmetry whose opposite
    *   is needed. Only rotations have opposite symmetries while
    *   reflections don't.
    * @returns {PIXI.GD8Symmetry} The opposite symmetry of `rotation`
    */
  inline def inv(rotation: GD8Symmetry): GD8Symmetry = ^.asInstanceOf[js.Dynamic].applyDynamic("inv")(rotation.asInstanceOf[js.Any]).asInstanceOf[GD8Symmetry]
  
  /**
    * Checks if the rotation angle is vertical, i.e. south
    * or north. It doesn't work for reflections.
    * @param {PIXI.GD8Symmetry} rotation - The number to check.
    * @returns {boolean} Whether or not the direction is vertical
    */
  inline def isVertical(rotation: GD8Symmetry): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVertical")(rotation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Helps sprite to compensate texture packer rotation.
    * @param {PIXI.Matrix} matrix - sprite world matrix
    * @param {PIXI.GD8Symmetry} rotation - The rotation factor to use.
    * @param {number} tx - sprite anchoring
    * @param {number} ty - sprite anchoring
    */
  inline def matrixAppendRotationInv(matrix: typings.pixiMath.libMatrixMod.Matrix, rotation: GD8Symmetry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matrixAppendRotationInv")(matrix.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def matrixAppendRotationInv(matrix: typings.pixiMath.libMatrixMod.Matrix, rotation: GD8Symmetry, tx: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matrixAppendRotationInv")(matrix.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], tx.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def matrixAppendRotationInv(matrix: typings.pixiMath.libMatrixMod.Matrix, rotation: GD8Symmetry, tx: Double, ty: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matrixAppendRotationInv")(matrix.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], tx.asInstanceOf[js.Any], ty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def matrixAppendRotationInv(matrix: typings.pixiMath.libMatrixMod.Matrix, rotation: GD8Symmetry, tx: Unit, ty: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matrixAppendRotationInv")(matrix.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], tx.asInstanceOf[js.Any], ty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Adds 180 degrees to rotation, which is a commutative
    * operation.
    * @param {number} rotation - The number to rotate.
    * @returns {number} Rotated number
    */
  inline def rotate180(rotation: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rotate180")(rotation.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Reverse of `add`.
    * @param {PIXI.GD8Symmetry} rotationSecond - Second operation
    * @param {PIXI.GD8Symmetry} rotationFirst - First operation
    * @returns {PIXI.GD8Symmetry} Result
    */
  inline def sub(rotationSecond: GD8Symmetry, rotationFirst: GD8Symmetry): GD8Symmetry = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(rotationSecond.asInstanceOf[js.Any], rotationFirst.asInstanceOf[js.Any])).asInstanceOf[GD8Symmetry]
  
  /**
    * @param {PIXI.GD8Symmetry} ind - sprite rotation angle.
    * @returns {PIXI.GD8Symmetry} The X-component of the U-axis
    *    after rotating the axes.
    */
  inline def uX(ind: GD8Symmetry): GD8Symmetry = ^.asInstanceOf[js.Dynamic].applyDynamic("uX")(ind.asInstanceOf[js.Any]).asInstanceOf[GD8Symmetry]
  
  /**
    * @param {PIXI.GD8Symmetry} ind - sprite rotation angle.
    * @returns {PIXI.GD8Symmetry} The Y-component of the U-axis
    *    after rotating the axes.
    */
  inline def uY(ind: GD8Symmetry): GD8Symmetry = ^.asInstanceOf[js.Dynamic].applyDynamic("uY")(ind.asInstanceOf[js.Any]).asInstanceOf[GD8Symmetry]
  
  /**
    * @param {PIXI.GD8Symmetry} ind - sprite rotation angle.
    * @returns {PIXI.GD8Symmetry} The X-component of the V-axis
    *    after rotating the axes.
    */
  inline def vX(ind: GD8Symmetry): GD8Symmetry = ^.asInstanceOf[js.Dynamic].applyDynamic("vX")(ind.asInstanceOf[js.Any]).asInstanceOf[GD8Symmetry]
  
  /**
    * @param {PIXI.GD8Symmetry} ind - sprite rotation angle.
    * @returns {PIXI.GD8Symmetry} The Y-component of the V-axis
    *    after rotating the axes.
    */
  inline def vY(ind: GD8Symmetry): GD8Symmetry = ^.asInstanceOf[js.Dynamic].applyDynamic("vY")(ind.asInstanceOf[js.Any]).asInstanceOf[GD8Symmetry]
}
