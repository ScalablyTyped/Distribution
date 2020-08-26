package typings.phaser.Phaser.Types.GameObjects.Particles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParticleEmitterBoundsAlt extends js.Object {
  /**
    * The height of the rectangle.
    */
  var h: Double = js.native
  /**
    * The width of the rectangle.
    */
  var w: Double = js.native
  /**
    * The left edge of the rectangle.
    */
  var x: Double = js.native
  /**
    * The top edge of the rectangle.
    */
  var y: Double = js.native
}

object ParticleEmitterBoundsAlt {
  @scala.inline
  def apply(h: Double, w: Double, x: Double, y: Double): ParticleEmitterBoundsAlt = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticleEmitterBoundsAlt]
  }
  @scala.inline
  implicit class ParticleEmitterBoundsAltOps[Self <: ParticleEmitterBoundsAlt] (val x: Self) extends AnyVal {
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
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

