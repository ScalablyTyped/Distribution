package typings.phaser.global.MatterJS

import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Vector` module contains methods for creating and manipulating vectors.
  * Vectors are the basis of all the geometry related operations in the engine.
  * A `Matter.Vector` object is of the form `{ x: 0, y: 0 }`.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class Vector
  */
@JSGlobal("MatterJS.Vector")
@js.native
class Vector ()
  extends typings.phaser.MatterJS.Vector
object Vector {
  
  /**
    * Adds the two vectors.
    * @method add
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} [output]
    * @return {vector} A new vector of vectorA and vectorB added
    */
  /* static member */
  @JSGlobal("MatterJS.Vector.add")
  @js.native
  def add(vectorA: typings.phaser.MatterJS.Vector, vectorB: typings.phaser.MatterJS.Vector): typings.phaser.MatterJS.Vector = js.native
  @JSGlobal("MatterJS.Vector.add")
  @js.native
  def add(
    vectorA: typings.phaser.MatterJS.Vector,
    vectorB: typings.phaser.MatterJS.Vector,
    output: typings.phaser.MatterJS.Vector
  ): typings.phaser.MatterJS.Vector = js.native
  
  /**
    * Returns the angle in radians between the two vectors relative to the x-axis.
    * @method angle
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The angle in radians
    */
  /* static member */
  @JSGlobal("MatterJS.Vector.angle")
  @js.native
  def angle(vectorA: typings.phaser.MatterJS.Vector, vectorB: typings.phaser.MatterJS.Vector): Double = js.native
  
  /**
    * Returns a new vector with `x` and `y` copied from the given `vector`.
    * @method clone
    * @param {vector} vector
    * @return {vector} A new cloned vector
    */
  /* static member */
  @JSGlobal("MatterJS.Vector.clone")
  @js.native
  def clone_(vector: typings.phaser.MatterJS.Vector): typings.phaser.MatterJS.Vector = js.native
  
  /**
    * Creates a new vector.
    * @method create
    * @param {number} x
    * @param {number} y
    * @return {vector} A new vector
    */
  /* static member */
  @JSGlobal("MatterJS.Vector.create")
  @js.native
  def create(): typings.phaser.MatterJS.Vector = js.native
  @JSGlobal("MatterJS.Vector.create")
  @js.native
  def create(x: js.UndefOr[scala.Nothing], y: Double): typings.phaser.MatterJS.Vector = js.native
  @JSGlobal("MatterJS.Vector.create")
  @js.native
  def create(x: Double): typings.phaser.MatterJS.Vector = js.native
  @JSGlobal("MatterJS.Vector.create")
  @js.native
  def create(x: Double, y: Double): typings.phaser.MatterJS.Vector = js.native
  
  /**
    * Returns the cross-product of two vectors.
    * @method cross
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The cross product of the two vectors
    */
  /* static member */
  @JSGlobal("MatterJS.Vector.cross")
  @js.native
  def cross(vectorA: typings.phaser.MatterJS.Vector, vectorB: typings.phaser.MatterJS.Vector): Double = js.native
  
  /**
    * Returns the cross-product of three vectors.
    * @method cross3
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} vectorC
    * @return {number} The cross product of the three vectors
    */
  /* static member */
  @JSGlobal("MatterJS.Vector.cross3")
  @js.native
  def cross3(
    vectorA: typings.phaser.MatterJS.Vector,
    vectorB: typings.phaser.MatterJS.Vector,
    vectorC: typings.phaser.MatterJS.Vector
  ): Double = js.native
  
  /**
    * Divides a vector and a scalar.
    * @method div
    * @param {vector} vector
    * @param {number} scalar
    * @return {vector} A new vector divided by scalar
    */
  /* static member */
  @JSGlobal("MatterJS.Vector.div")
  @js.native
  def div(vector: typings.phaser.MatterJS.Vector, scalar: Double): typings.phaser.MatterJS.Vector = js.native
  
  /**
    * Returns the dot-product of two vectors.
    * @method dot
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The dot product of the two vectors
    */
  /* static member */
  @JSGlobal("MatterJS.Vector.dot")
  @js.native
  def dot(vectorA: typings.phaser.MatterJS.Vector, vectorB: typings.phaser.MatterJS.Vector): Number = js.native
  
  /**
    * Returns the magnitude (length) of a vector.
    * @method magnitude
    * @param {vector} vector
    * @return {number} The magnitude of the vector
    */
  /* static member */
  @JSGlobal("MatterJS.Vector.magnitude")
  @js.native
  def magnitude(vector: typings.phaser.MatterJS.Vector): Double = js.native
  
  /**
    * Returns the magnitude (length) of a vector (therefore saving a `sqrt` operation).
    * @method magnitudeSquared
    * @param {vector} vector
    * @return {number} The squared magnitude of the vector
    */
  /* static member */
  @JSGlobal("MatterJS.Vector.magnitudeSquared")
  @js.native
  def magnitudeSquared(vector: typings.phaser.MatterJS.Vector): Double = js.native
  
  /**
    * Multiplies a vector and a scalar.
    * @method mult
    * @param {vector} vector
    * @param {number} scalar
    * @return {vector} A new vector multiplied by scalar
    */
  /* static member */
  @JSGlobal("MatterJS.Vector.mult")
  @js.native
  def mult(vector: typings.phaser.MatterJS.Vector, scalar: Double): typings.phaser.MatterJS.Vector = js.native
  
  /**
    * Negates both components of a vector such that it points in the opposite direction.
    * @method neg
    * @param {vector} vector
    * @return {vector} The negated vector
    */
  /* static member */
  @JSGlobal("MatterJS.Vector.neg")
  @js.native
  def neg(vector: typings.phaser.MatterJS.Vector): typings.phaser.MatterJS.Vector = js.native
  
  /**
    * Normalises a vector (such that its magnitude is `1`).
    * @method normalise
    * @param {vector} vector
    * @return {vector} A new vector normalised
    */
  /* static member */
  @JSGlobal("MatterJS.Vector.normalise")
  @js.native
  def normalise(vector: typings.phaser.MatterJS.Vector): typings.phaser.MatterJS.Vector = js.native
  
  /**
    * Returns the perpendicular vector. Set `negate` to true for the perpendicular in the opposite direction.
    * @method perp
    * @param {vector} vector
    * @param {bool} [negate=false]
    * @return {vector} The perpendicular vector
    */
  /* static member */
  @JSGlobal("MatterJS.Vector.perp")
  @js.native
  def perp(vector: typings.phaser.MatterJS.Vector): typings.phaser.MatterJS.Vector = js.native
  @JSGlobal("MatterJS.Vector.perp")
  @js.native
  def perp(vector: typings.phaser.MatterJS.Vector, negate: Boolean): typings.phaser.MatterJS.Vector = js.native
  
  /**
    * Rotates the vector about (0, 0) by specified angle.
    * @method rotate
    * @param {vector} vector
    * @param {number} angle
    * @return {vector} A new vector rotated about (0, 0)
    */
  /* static member */
  @JSGlobal("MatterJS.Vector.rotate")
  @js.native
  def rotate(vector: typings.phaser.MatterJS.Vector, angle: Double): typings.phaser.MatterJS.Vector = js.native
  
  /**
    * Rotates the vector about a specified point by specified angle.
    * @method rotateAbout
    * @param {vector} vector
    * @param {number} angle
    * @param {vector} point
    * @param {vector} [output]
    * @return {vector} A new vector rotated about the point
    */
  /* static member */
  @JSGlobal("MatterJS.Vector.rotateAbout")
  @js.native
  def rotateAbout(vector: typings.phaser.MatterJS.Vector, angle: Double, point: typings.phaser.MatterJS.Vector): typings.phaser.MatterJS.Vector = js.native
  @JSGlobal("MatterJS.Vector.rotateAbout")
  @js.native
  def rotateAbout(
    vector: typings.phaser.MatterJS.Vector,
    angle: Double,
    point: typings.phaser.MatterJS.Vector,
    output: typings.phaser.MatterJS.Vector
  ): typings.phaser.MatterJS.Vector = js.native
  
  /**
    * Subtracts the two vectors.
    * @method sub
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} [output]
    * @return {vector} A new vector of vectorA and vectorB subtracted
    */
  /* static member */
  @JSGlobal("MatterJS.Vector.sub")
  @js.native
  def sub(vectorA: typings.phaser.MatterJS.Vector, vectorB: typings.phaser.MatterJS.Vector): typings.phaser.MatterJS.Vector = js.native
  @JSGlobal("MatterJS.Vector.sub")
  @js.native
  def sub(
    vectorA: typings.phaser.MatterJS.Vector,
    vectorB: typings.phaser.MatterJS.Vector,
    optional: typings.phaser.MatterJS.Vector
  ): typings.phaser.MatterJS.Vector = js.native
}
