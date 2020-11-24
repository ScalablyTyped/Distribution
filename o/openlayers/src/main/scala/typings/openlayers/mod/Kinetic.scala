package typings.openlayers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def this(decay: Double, minVelocity: Double, delay: Double) = this()
}
