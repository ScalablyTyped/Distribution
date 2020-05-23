package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundsFactory extends js.Object {
  /**
    * Returns true if the bounds contains the given point.
    * @method contains
    * @param {IBound} bounds
    * @param {vector} point
    * @return {boolean} True if the bounds contain the point, otherwise false
    */
  def contains(bounds: IBound, point: Vector): Boolean
  /**
    * Creates a new axis-aligned bounding box (AABB) for the given vertices.
    * @method create
    * @param {vertices} vertices
    * @return {IBound} A new bounds object
    */
  def create(vertices: Vertices): IBound
  /**
    * Returns true if the two bounds intersect.
    * @method overlaps
    * @param {IBound} boundsA
    * @param {IBound} boundsB
    * @return {boolean} True if the bounds overlap, otherwise false
    */
  def overlaps(boundsA: IBound, boundsB: IBound): Boolean
  /**
    * Shifts the bounds to the given position.
    * @method shift
    * @param {IBound} bounds
    * @param {vector} position
    */
  def shift(bounds: IBound, position: Vector): Unit
  /**
    * Translates the bounds by the given vector.
    * @method translate
    * @param {IBound} bounds
    * @param {vector} vector
    */
  def translate(bounds: IBound, vector: Vector): Unit
  /**
    * Updates bounds using the given vertices and extends the bounds given a velocity.
    * @method update
    * @param {IBound} bounds
    * @param {vertices} vertices
    * @param {vector} velocity
    */
  def update(bounds: IBound, vertices: Vertices, velocity: Vector): Unit
}

object BoundsFactory {
  @scala.inline
  def apply(
    contains: (IBound, Vector) => Boolean,
    create: Vertices => IBound,
    overlaps: (IBound, IBound) => Boolean,
    shift: (IBound, Vector) => Unit,
    translate: (IBound, Vector) => Unit,
    update: (IBound, Vertices, Vector) => Unit
  ): BoundsFactory = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains), create = js.Any.fromFunction1(create), overlaps = js.Any.fromFunction2(overlaps), shift = js.Any.fromFunction2(shift), translate = js.Any.fromFunction2(translate), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[BoundsFactory]
  }
}

