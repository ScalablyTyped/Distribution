package typings
package phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcadeWorldTreeMinMax extends js.Object {
  /**
    * The maximum x value used in RTree searches.
    */
  var maxX: scala.Double
  /**
    * The maximum y value used in RTree searches.
    */
  var maxY: scala.Double
  /**
    * The minimum x value used in RTree searches.
    */
  var minX: scala.Double
  /**
    * The minimum y value used in RTree searches.
    */
  var minY: scala.Double
}

object ArcadeWorldTreeMinMax {
  @scala.inline
  def apply(maxX: scala.Double, maxY: scala.Double, minX: scala.Double, minY: scala.Double): ArcadeWorldTreeMinMax = {
    val __obj = js.Dynamic.literal(maxX = maxX, maxY = maxY, minX = minX, minY = minY)
  
    __obj.asInstanceOf[ArcadeWorldTreeMinMax]
  }
}

