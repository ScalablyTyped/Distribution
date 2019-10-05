package typings.phaser.Phaser.Types.GameObjects.Particles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParticleEmitterBoundsAlt extends js.Object {
  /**
    * The height of the rectangle.
    */
  var h: Double
  /**
    * The width of the rectangle.
    */
  var w: Double
  /**
    * The left edge of the rectangle.
    */
  var x: Double
  /**
    * The top edge of the rectangle.
    */
  var y: Double
}

object ParticleEmitterBoundsAlt {
  @scala.inline
  def apply(h: Double, w: Double, x: Double, y: Double): ParticleEmitterBoundsAlt = {
    val __obj = js.Dynamic.literal(h = h, w = w, x = x, y = y)
  
    __obj.asInstanceOf[ParticleEmitterBoundsAlt]
  }
}

