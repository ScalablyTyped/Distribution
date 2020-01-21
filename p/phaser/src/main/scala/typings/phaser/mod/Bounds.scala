package typings.phaser.mod

import typings.phaser.MatterJS.IBound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Matter.Bounds` module contains methods for creating and manipulating axis-aligned bounding boxes (AABB).
  *
  * @class Bounds
  */
@JSImport("matter", "Bounds")
@js.native
class Bounds ()
  extends typings.phaser.MatterJS.Bounds

/* static members */
@JSImport("matter", "Bounds")
@js.native
object Bounds extends js.Object {
  /**
    * Returns true if the bounds contains the given point.
    * @method contains
    * @param {IBound} bounds
    * @param {vector} point
    * @return {boolean} True if the bounds contain the point, otherwise false
    */
  def contains(bounds: IBound, point: typings.phaser.MatterJS.Vector): Boolean = js.native
  /**
    * Creates a new axis-aligned bounding box (AABB) for the given vertices.
    * @method create
    * @param {vertices} vertices
    * @return {IBound} A new bounds object
    */
  def create(vertices: typings.phaser.MatterJS.Vertices): IBound = js.native
  /**
    * Returns true if the two bounds intersect.
    * @method overlaps
    * @param {IBound} boundsA
    * @param {IBound} boundsB
    * @return {boolean} True if the bounds overlap, otherwise false
    */
  def overlaps(boundsA: IBound, boundsB: IBound): Boolean = js.native
  /**
    * Shifts the bounds to the given position.
    * @method shift
    * @param {IBound} bounds
    * @param {vector} position
    */
  def shift(bounds: IBound, position: typings.phaser.MatterJS.Vector): Unit = js.native
  /**
    * Translates the bounds by the given vector.
    * @method translate
    * @param {IBound} bounds
    * @param {vector} vector
    */
  def translate(bounds: IBound, vector: typings.phaser.MatterJS.Vector): Unit = js.native
  /**
    * Updates bounds using the given vertices and extends the bounds given a velocity.
    * @method update
    * @param {IBound} bounds
    * @param {vertices} vertices
    * @param {vector} velocity
    */
  def update(
    bounds: IBound,
    vertices: typings.phaser.MatterJS.Vertices,
    velocity: typings.phaser.MatterJS.Vector
  ): Unit = js.native
}

