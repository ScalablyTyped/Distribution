package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MatterJS.VectorFactory")
@js.native
class VectorFactory () extends js.Object {
  /**
    * Adds the two vectors.
    * @method add
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} [output]
    * @return {vector} A new vector of vectorA and vectorB added
    */
  def add(vectorA: Vector, vectorB: Vector): Vector = js.native
  def add(vectorA: Vector, vectorB: Vector, output: Vector): Vector = js.native
  /**
    * Returns the angle in radians between the two vectors relative to the x-axis.
    * @method angle
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The angle in radians
    */
  def angle(vectorA: Vector, vectorB: Vector): Double = js.native
  /**
    * Returns a new vector with `x` and `y` copied from the given `vector`.
    * @method clone
    * @param {vector} vector
    * @return {vector} A new cloned vector
    */
  def clone(vector: Vector): Vector = js.native
  /**
    * Creates a new vector.
    * @method create
    * @param {number} x
    * @param {number} y
    * @return {vector} A new vector
    */
  def create(): Vector = js.native
  def create(x: Double): Vector = js.native
  def create(x: Double, y: Double): Vector = js.native
  /**
    * Returns the cross-product of two vectors.
    * @method cross
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The cross product of the two vectors
    */
  def cross(vectorA: Vector, vectorB: Vector): Double = js.native
  /**
    * Returns the cross-product of three vectors.
    * @method cross3
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} vectorC
    * @return {number} The cross product of the three vectors
    */
  def cross3(vectorA: Vector, vectorB: Vector, vectorC: Vector): Double = js.native
  /**
    * Divides a vector and a scalar.
    * @method div
    * @param {vector} vector
    * @param {number} scalar
    * @return {vector} A new vector divided by scalar
    */
  def div(vector: Vector, scalar: Double): Vector = js.native
  /**
    * Returns the dot-product of two vectors.
    * @method dot
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The dot product of the two vectors
    */
  def dot(vectorA: Vector, vectorB: Vector): Double = js.native
  /**
    * Returns the magnitude (length) of a vector.
    * @method magnitude
    * @param {vector} vector
    * @return {number} The magnitude of the vector
    */
  def magnitude(vector: Vector): Double = js.native
  /**
    * Returns the magnitude (length) of a vector (therefore saving a `sqrt` operation).
    * @method magnitudeSquared
    * @param {vector} vector
    * @return {number} The squared magnitude of the vector
    */
  def magnitudeSquared(vector: Vector): Double = js.native
  /**
    * Multiplies a vector and a scalar.
    * @method mult
    * @param {vector} vector
    * @param {number} scalar
    * @return {vector} A new vector multiplied by scalar
    */
  def mult(vector: Vector, scalar: Double): Vector = js.native
  /**
    * Negates both components of a vector such that it points in the opposite direction.
    * @method neg
    * @param {vector} vector
    * @return {vector} The negated vector
    */
  def neg(vector: Vector): Vector = js.native
  /**
    * Normalises a vector (such that its magnitude is `1`).
    * @method normalise
    * @param {vector} vector
    * @return {vector} A new vector normalised
    */
  def normalise(vector: Vector): Vector = js.native
  /**
    * Returns the perpendicular vector. Set `negate` to true for the perpendicular in the opposite direction.
    * @method perp
    * @param {vector} vector
    * @param {bool} [negate=false]
    * @return {vector} The perpendicular vector
    */
  def perp(vector: Vector): Vector = js.native
  def perp(vector: Vector, negate: Boolean): Vector = js.native
  /**
    * Rotates the vector about (0, 0) by specified angle.
    * @method rotate
    * @param {vector} vector
    * @param {number} angle
    * @return {vector} A new vector rotated about (0, 0)
    */
  def rotate(vector: Vector, angle: Double): Vector = js.native
  /**
    * Rotates the vector about a specified point by specified angle.
    * @method rotateAbout
    * @param {vector} vector
    * @param {number} angle
    * @param {vector} point
    * @param {vector} [output]
    * @return {vector} A new vector rotated about the point
    */
  def rotateAbout(vector: Vector, angle: Double, point: Vector): Vector = js.native
  def rotateAbout(vector: Vector, angle: Double, point: Vector, output: Vector): Vector = js.native
  /**
    * Subtracts the two vectors.
    * @method sub
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} [output]
    * @return {vector} A new vector of vectorA and vectorB subtracted
    */
  def sub(vectorA: Vector, vectorB: Vector): Vector = js.native
  def sub(vectorA: Vector, vectorB: Vector, optional: Vector): Vector = js.native
}

