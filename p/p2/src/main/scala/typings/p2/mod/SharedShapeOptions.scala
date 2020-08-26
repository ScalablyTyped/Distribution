package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedShapeOptions extends js.Object {
  var angle: js.UndefOr[Double] = js.native
  var collisionGroup: js.UndefOr[Double] = js.native
  var collisionMask: js.UndefOr[Double] = js.native
  var collisionResponse: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var sensor: js.UndefOr[Boolean] = js.native
}

object SharedShapeOptions {
  @scala.inline
  def apply(): SharedShapeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedShapeOptions]
  }
  @scala.inline
  implicit class SharedShapeOptionsOps[Self <: SharedShapeOptions] (val x: Self) extends AnyVal {
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    @scala.inline
    def setCollisionGroup(value: Double): Self = this.set("collisionGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollisionGroup: Self = this.set("collisionGroup", js.undefined)
    @scala.inline
    def setCollisionMask(value: Double): Self = this.set("collisionMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollisionMask: Self = this.set("collisionMask", js.undefined)
    @scala.inline
    def setCollisionResponse(value: Boolean): Self = this.set("collisionResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollisionResponse: Self = this.set("collisionResponse", js.undefined)
    @scala.inline
    def setPosition(value: js.Tuple2[Double, Double]): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSensor(value: Boolean): Self = this.set("sensor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSensor: Self = this.set("sensor", js.undefined)
  }
  
}

