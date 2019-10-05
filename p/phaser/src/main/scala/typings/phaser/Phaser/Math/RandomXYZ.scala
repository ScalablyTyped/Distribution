package typings.phaser.Phaser.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Math.RandomXYZ")
@js.native
object RandomXYZ extends js.Object {
  /**
    * Compute a random position vector in a spherical area, optionally defined by the given radius.
    * @param vec3 The Vector to compute random values for.
    * @param radius The radius. Default 1.
    */
  def apply(vec3: Vector3): Vector3 = js.native
  def apply(vec3: Vector3, radius: Double): Vector3 = js.native
}

