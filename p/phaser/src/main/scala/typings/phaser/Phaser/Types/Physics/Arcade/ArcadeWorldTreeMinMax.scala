package typings.phaser.Phaser.Types.Physics.Arcade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcadeWorldTreeMinMax extends js.Object {
  /**
    * The maximum x value used in RTree searches.
    */
  var maxX: Double
  /**
    * The maximum y value used in RTree searches.
    */
  var maxY: Double
  /**
    * The minimum x value used in RTree searches.
    */
  var minX: Double
  /**
    * The minimum y value used in RTree searches.
    */
  var minY: Double
}

object ArcadeWorldTreeMinMax {
  @scala.inline
  def apply(maxX: Double, maxY: Double, minX: Double, minY: Double): ArcadeWorldTreeMinMax = {
    val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcadeWorldTreeMinMax]
  }
}

