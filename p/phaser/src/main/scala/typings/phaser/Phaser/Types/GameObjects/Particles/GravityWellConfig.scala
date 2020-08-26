package typings.phaser.Phaser.Types.GameObjects.Particles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GravityWellConfig extends js.Object {
  /**
    * The minimum distance for which the gravity force is calculated.
    */
  var epsilon: js.UndefOr[Double] = js.native
  /**
    * The gravitational force of this Gravity Well.
    */
  var gravity: js.UndefOr[Double] = js.native
  /**
    * The strength of the gravity force - larger numbers produce a stronger force.
    */
  var power: js.UndefOr[Double] = js.native
  /**
    * The x coordinate of the Gravity Well, in world space.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The y coordinate of the Gravity Well, in world space.
    */
  var y: js.UndefOr[Double] = js.native
}

object GravityWellConfig {
  @scala.inline
  def apply(): GravityWellConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GravityWellConfig]
  }
  @scala.inline
  implicit class GravityWellConfigOps[Self <: GravityWellConfig] (val x: Self) extends AnyVal {
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
    def setEpsilon(value: Double): Self = this.set("epsilon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEpsilon: Self = this.set("epsilon", js.undefined)
    @scala.inline
    def setGravity(value: Double): Self = this.set("gravity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGravity: Self = this.set("gravity", js.undefined)
    @scala.inline
    def setPower(value: Double): Self = this.set("power", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePower: Self = this.set("power", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

