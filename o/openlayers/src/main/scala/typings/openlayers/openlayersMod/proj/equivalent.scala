package typings.openlayers.openlayersMod.proj

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "proj.equivalent")
@js.native
object equivalent extends js.Object {
  /**
    * Checks if two projections are the same, that is every coordinate in one
    * projection does represent the same geographic point as the same coordinate in
    * the other projection.
    *
    * @param projection1 Projection 1.
    * @param projection2 Projection 2.
    * @return Equivalent.
    * @api
    */
  def apply(projection1: Projection, projection2: Projection): Boolean = js.native
}

