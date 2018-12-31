package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "Kinetic")
@js.native
class Kinetic protected () extends js.Object {
  /**
    * @classdesc
    * Implementation of inertial deceleration for map movement.
    *
    * @param decay Rate of decay (must be negative).
    * @param minVelocity Minimum velocity (pixels/millisecond).
    * @param delay Delay to consider to calculate the kinetic
    *     initial values (milliseconds).
    * @struct
    * @api
    */
  def this(decay: scala.Double, minVelocity: scala.Double, delay: scala.Double) = this()
}

