package typings.phaser.Phaser.Types.Physics.Arcade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcadeWorldTreeMinMax extends js.Object {
  /**
    * The maximum x value used in RTree searches.
    */
  var maxX: Double = js.native
  /**
    * The maximum y value used in RTree searches.
    */
  var maxY: Double = js.native
  /**
    * The minimum x value used in RTree searches.
    */
  var minX: Double = js.native
  /**
    * The minimum y value used in RTree searches.
    */
  var minY: Double = js.native
}

object ArcadeWorldTreeMinMax {
  @scala.inline
  def apply(maxX: Double, maxY: Double, minX: Double, minY: Double): ArcadeWorldTreeMinMax = {
    val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcadeWorldTreeMinMax]
  }
  @scala.inline
  implicit class ArcadeWorldTreeMinMaxOps[Self <: ArcadeWorldTreeMinMax] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxX(value: Double): Self = this.set("maxX", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxY(value: Double): Self = this.set("maxY", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinX(value: Double): Self = this.set("minX", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinY(value: Double): Self = this.set("minY", value.asInstanceOf[js.Any])
  }
  
}

