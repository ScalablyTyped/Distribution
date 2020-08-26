package typings.phaser.Phaser.Types.GameObjects.Particles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParticleEmitterBounds extends js.Object {
  /**
    * The height of the rectangle.
    */
  var height: Double = js.native
  /**
    * The width of the rectangle.
    */
  var width: Double = js.native
  /**
    * The left edge of the rectangle.
    */
  var x: Double = js.native
  /**
    * The top edge of the rectangle.
    */
  var y: Double = js.native
}

object ParticleEmitterBounds {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): ParticleEmitterBounds = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticleEmitterBounds]
  }
  @scala.inline
  implicit class ParticleEmitterBoundsOps[Self <: ParticleEmitterBounds] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

