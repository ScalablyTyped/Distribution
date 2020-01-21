package typings.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry extends js.Object {
  /**
    *   Averages the vertex normals. Used in curved
    *   surfaces
    *   @chainable
    */
  def averageNormals(): Geometry
  /**
    *   Averages pole normals. Used in spherical
    *   primitives
    *   @chainable
    */
  def averagePoleNormals(): Geometry
  def computeFaces(): Geometry
  /**
    *   computes smooth normals per vertex as an average
    *   of each face.
    *   @chainable
    */
  def computeNormals(): Geometry
  /**
    *   Modifies all vertices to be centered within the
    *   range -100 to 100.
    *   @chainable
    */
  def normalize(): Geometry
}

object Geometry {
  @scala.inline
  def apply(
    averageNormals: () => Geometry,
    averagePoleNormals: () => Geometry,
    computeFaces: () => Geometry,
    computeNormals: () => Geometry,
    normalize: () => Geometry
  ): Geometry = {
    val __obj = js.Dynamic.literal(averageNormals = js.Any.fromFunction0(averageNormals), averagePoleNormals = js.Any.fromFunction0(averagePoleNormals), computeFaces = js.Any.fromFunction0(computeFaces), computeNormals = js.Any.fromFunction0(computeNormals), normalize = js.Any.fromFunction0(normalize))
  
    __obj.asInstanceOf[Geometry]
  }
}

