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

object Geometry {
  @scala.inline
  def apply(
    averageNormals: js.Function0[p5Lib.p5Mod.Geometry],
    averagePoleNormals: js.Function0[p5Lib.p5Mod.Geometry],
    computeFaces: js.Function0[p5Lib.p5Mod.Geometry],
    computeNormals: js.Function0[p5Lib.p5Mod.Geometry],
    normalize: js.Function0[p5Lib.p5Mod.Geometry]
  ): Geometry = {
    val __obj = js.Dynamic.literal(averageNormals = averageNormals, averagePoleNormals = averagePoleNormals, computeFaces = computeFaces, computeNormals = computeNormals, normalize = normalize)
  
    __obj.asInstanceOf[Geometry]
  }
}

