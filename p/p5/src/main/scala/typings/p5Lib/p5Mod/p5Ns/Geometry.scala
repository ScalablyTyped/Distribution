package typings
package p5Lib.p5Mod.p5Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry extends js.Object {
  /**
    *   Averages the vertex normals. Used in curved
    *   surfaces
    *   @chainable
    */
  def averageNormals(): p5Lib.p5Mod.Geometry
  /**
    *   Averages pole normals. Used in spherical
    *   primitives
    *   @chainable
    */
  def averagePoleNormals(): p5Lib.p5Mod.Geometry
  def computeFaces(): p5Lib.p5Mod.Geometry
  /**
    *   computes smooth normals per vertex as an average
    *   of each face.
    *   @chainable
    */
  def computeNormals(): p5Lib.p5Mod.Geometry
  /**
    *   Modifies all vertices to be centered within the
    *   range -100 to 100.
    *   @chainable
    */
  def normalize(): p5Lib.p5Mod.Geometry
}

